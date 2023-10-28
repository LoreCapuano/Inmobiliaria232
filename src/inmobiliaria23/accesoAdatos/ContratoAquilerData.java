package inmobiliaria23.accesoAdatos;

import inmobiliaria23.entidades.ContratoAlquiler;
import inmobiliaria23.entidades.Inquilino;
import inmobiliaria23.entidades.PropiedadInmueble;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ContratoAquilerData {

    private Connection con = null;
    private PropiedadInmuebleData pid = new PropiedadInmuebleData();
    private InquilinoData id = new InquilinoData();

    public ContratoAquilerData() {
        con = Conexion.getConexion();
    }

    public void crearContrato(ContratoAlquiler contrato) {
        String sql = "INSERT INTO contrato_aquiler(FechaInicio, FechaFin, MontoAlquilerPesos, Detalles, Estado, IdInmueble, IdInquilino) VALUES (?,?,?,?,?,?,?) ";
//        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(2, Date.valueOf(contrato.getFechaFinal()));
            ps.setDouble(3, contrato.getMontoAlquilerPesos());
            ps.setString(4, contrato.getDetalles());
            ps.setString(5, contrato.getEstado());
            ps.setInt(6, contrato.getIdpropiedad().getIdInmueble());
            ps.setInt(7, contrato.getInquilino().getId_inquilino());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                contrato.setId_contrato(1);
                JOptionPane.showMessageDialog(null, "contrato creado correctamente");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al generar contrato" + ex.getMessage());
        }

    }

    public void rescindirContrato(int id) {
        String sql = "UPDATE contrato_aquiler SET Estado = 0 WHERE idContratoAlquiler = ? ";
        PreparedStatement ps;
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int actualizado = ps.executeUpdate();
            if (actualizado > 0) {
                JOptionPane.showMessageDialog(null, "contrato rescindido con el id especificado");
            } else {
                JOptionPane.showMessageDialog(null, "no se pudo encontrar contrato con el id especificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar con inmobiliaria23" + ex.getMessage());
        }

    }

    public void renovarContrato(LocalDate fechaInicio, LocalDate fechaFin, Double montoNuevo, int id) {

        String sql = "UPDATE contrato_aquiler SET Estado = 2,FechaInicio = ?, FechaFin= ?, MontoAlquilerPesos= ? WHERE idContratoAlquiler = ? AND FechaFin < NOW()  ";
        PreparedStatement ps;
        try {

            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ps.setDate(2, Date.valueOf(fechaFin));
            ps.setDouble(3, montoNuevo);
            ps.setInt(4, id);

            int actualizado = ps.executeUpdate();
            if (actualizado > 0) {
                JOptionPane.showMessageDialog(null, "contrato RENOVADO");
            } else {
                JOptionPane.showMessageDialog(null, "no se pudo encontrar contrato con el id especificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar con inmobiliaria23" + ex.getMessage());
        }

    }

    public List<ContratoAlquiler> listarContratosVigentes(int estado) {
        String sql = " SELECT * FROM contrato_aquiler WHERE Estado = 1  ";
        ArrayList<ContratoAlquiler> contratos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ContratoAlquiler ca = new ContratoAlquiler();
                ca.setId_contrato(rs.getInt("idContratoAlquiler"));
                Inquilino soloid = id.buscarInquilinoPorid(rs.getInt("IdInquilino"));
                ca.setInquilino(soloid);
                PropiedadInmueble idsolo = pid.buscarInmuebleXid(rs.getInt("IdInmueble"));
                ca.setIdpropiedad(idsolo);
                ca.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
                ca.setFechaFinal(rs.getDate("FechaFin").toLocalDate());
                ca.setMontoAlquilerPesos(rs.getDouble("MontoAlquilerPesos"));
                ca.setDetalles(rs.getString("Detalles"));
                ca.setEstado(rs.getString("Estado"));
                contratos.add(ca);
            }

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ContratoAquilerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contratos;
    }

    public ContratoAlquiler buscarcontratoporid(int idbuscador) {
        String qsl = " SELECT * FROM contrato_aquiler WHERE idContratoAlquiler = ? ;";
        ContratoAlquiler ca = null;
        try {

            PreparedStatement ps = con.prepareStatement(qsl);
            ps.setInt(1, idbuscador);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ca = new ContratoAlquiler();
                ca.setId_contrato(rs.getInt("idContratoAlquiler"));
                Inquilino soloid = id.buscarInquilinoPorid(rs.getInt("IntInquilino"));
                ca.setInquilino(soloid);
                PropiedadInmueble idsolo = pid.buscarInmuebleXid(rs.getInt("intInmueble"));
                ca.setIdpropiedad(idsolo);
                ca.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
                ca.setFechaFinal(rs.getDate("FechaFin").toLocalDate());
                ca.setMontoAlquilerPesos(rs.getDouble("MontoAlquilerPesos"));
                ca.setDetalles(rs.getString("Detalles"));
                ca.setEstado(rs.getString("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "no hay contratos con ese id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoAquilerData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ca;
    }

    public void listarcontratosxidinmuebel(int idinmueble) {

        try {

            String sql = "SELECT * FROM `contrato_aquiler` JOIN inmueble ON(contrato_aquiler.intInmueble = inmueble.idInmueble)  "
                    + "JOIN inquilino ON (contrato_aquiler.IntInquilino = inquilino.idInquilino) WHERE intInmueble = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idinmueble);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ContratoAlquiler idcontrato = new ContratoAlquiler();
                PropiedadInmueble inmueble = new PropiedadInmueble();

                Inquilino inqui = new Inquilino();
                idcontrato.setId_contrato(rs.getInt("idContratoAlquiler"));
                idcontrato.setFechaInicio(rs.getDate("FechaInicio").toLocalDate());
                idcontrato.setFechaFinal(rs.getDate("FechaFin").toLocalDate());
                idcontrato.setMontoAlquilerPesos(rs.getDouble("MontoAlquilerPesos"));
                idcontrato.setEstado(rs.getString("Estado"));
                inmueble.setIdInmueble(rs.getInt("intInmueble"));
                inmueble.setAccesibilidad(rs.getString("accesibilidad"));
                inmueble.setCaracteristicas(rs.getString("caracteristicas"));
                inmueble.setDireccion(rs.getString("Direccion"));
                inmueble.setEstado(rs.getBoolean("Estado"));
                inqui.setId_inquilino(rs.getInt("IntInquilino"));
                inqui.setApellido(rs.getString("Apellido"));
                inqui.setCUIL(rs.getString("CUIL"));
                inqui.setGarante(rs.getString("Garante"));
                System.out.println("idinmueble: : " + inmueble.getIdInmueble() + " " + inmueble.getCaracteristicas() + " DIRECCION:" + inmueble.getDireccion());
                System.out.println("idcontrato: " + idcontrato.getId_contrato() + " Fecha inicio: " + idcontrato.getFechaInicio() + " Fecha vencimiento: " + idcontrato.getFechaFinal() + " monto en $: " + idcontrato.getMontoAlquilerPesos() + " estado: " + idcontrato.getEstado());
                System.out.println("idinquilino: : " + inqui.getId_inquilino() + " Apellido: " + inqui.getApellido() + " CUIL: " + inqui.getCUIL() + " GARANTE: " + inqui.getGarante());
                System.out.println("*****************");
            }
            if (!rs.next()) {

                JOptionPane.showMessageDialog(null, "no se encotro propiedad asociado al id establecido");
            }
            ps.close();
        } catch (SQLException ex) {

        }

    }
}

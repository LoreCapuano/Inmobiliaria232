package inmobiliaria23.accesoAdatos;

import inmobiliaria23.entidades.PropiedadInmueble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PropiedadInmuebleData {

    private Connection con = null;

    public PropiedadInmuebleData() {
        con = Conexion.getConexion();
    }

    public void altaInmueble(PropiedadInmueble propiedadInmueble) {
String sql = "insert into inmueble (Propietario idPropietario,tipoDeLocal,zona, direccion,superficie,caracteristicas, accesibilidad,"
                + "precioTasado,estado)values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, propiedadInmueble.getIdPropietario().getId_propietario());
            ps.setString(2, propiedadInmueble.getTipoDeLocal());
            ps.setString(3, propiedadInmueble.getZona());
            ps.setString(4, propiedadInmueble.getDireccion());
            ps.setInt(5, propiedadInmueble.getSuperficie());
            ps.setString(6, propiedadInmueble.getCaracteristicas());
            ps.setString(7, propiedadInmueble.getAccesibilidad());
            ps.setFloat(8, propiedadInmueble.getPrecioTasado());
            ps.setBoolean(9, propiedadInmueble.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                propiedadInmueble.setIdInmueble(1);
                JOptionPane.showMessageDialog(null, "Inmueble creado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
        }
    }

    public void bajaLocal() {

    }

    public void fijarPrecios() {

    }

    public void listarInmueblesDisponibles() {

    }

    public List<PropiedadInmueble> ListarInmueblesPropios(int idPropietario) {//lista de las propiedades a su nombre
        String sql = "SELECT idInmueble, Tipo, Direccion,Zona, Superficie, PrecioBase,estado FROM inmueble WHERE idPropietario = ?";
        //ArrayList<PropiedadInmueble> PropiedadInmueble = new ArrayList<>();
        ArrayList<PropiedadInmueble> listaInmuebles = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPropietario);
            ResultSet rs = ps.executeQuery();
            //if (listaInmuebles != null) {
            while (rs.next()) {

                PropiedadInmueble propiedadInmueble = new PropiedadInmueble();
                propiedadInmueble.setIdInmueble(rs.getInt("idInmueble"));
                propiedadInmueble.setTipoDeLocal(rs.getString("Tipo"));
                propiedadInmueble.setDireccion(rs.getString("Direccion"));
                propiedadInmueble.setZona(rs.getString("Zona"));
                propiedadInmueble.setSuperficie(rs.getInt("Superficie"));
                propiedadInmueble.setPrecioTasado(rs.getInt("PrecioBase"));
                propiedadInmueble.setEstado(rs.getBoolean("Estado"));

                //PropiedadInmueble.add(propiedadInmueble);
                listaInmuebles.add(propiedadInmueble);
            }
            if (listaInmuebles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron propiedades para el dueño indicado");
               
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble");
        }

        return listaInmuebles;
    }

}

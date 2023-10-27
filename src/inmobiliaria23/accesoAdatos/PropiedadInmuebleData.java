package inmobiliaria23.accesoAdatos;

import inmobiliaria23.entidades.ContratoAlquiler;
import inmobiliaria23.entidades.Inquilino;
import inmobiliaria23.entidades.PropiedadInmueble;
import inmobiliaria23.entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PropiedadInmuebleData {

    private Connection con = null;

    public PropiedadInmuebleData() {
        con = Conexion.getConexion();
    }
    private InquilinoData id = new InquilinoData();

    public void altaInmueble(PropiedadInmueble propiedadInmueble) {
        String sql = "insert into inmueble (idPropietario,tipo,zona, direccion,superficie,caracteristicas, accesibilidad,"
                + "precioBase,estado)values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, propiedadInmueble.getPropietario().getId_propietario());
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

    public void bajaInmueble(int id) {
        String sql = "UPDATE inmueble SET estado=0 WHERE idInmueble=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inmueble eliminado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino"
                    + "" + ex.getMessage());
        }
    }

    public List<PropiedadInmueble> listarInmueblesDisponibles(Boolean estado) {
        String sql = "SELECT idInmueble,idPropietario, Tipo, Direccion, Zona, Superficie, Caracteristicas,"
                + " Accesibilidad,precioBase, estado FROM inmueble WHERE estado=1 ";
        ArrayList<PropiedadInmueble> listaInmuebles = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedadInmueble = new PropiedadInmueble();
                propiedadInmueble.setIdInmueble(rs.getInt("idInmueble"));
                propiedadInmueble.setPropietario(new Propietario(rs.getInt("idPropietario")));
                propiedadInmueble.setTipoDeLocal(rs.getString("Tipo"));
                propiedadInmueble.setDireccion(rs.getString("Direccion"));
                propiedadInmueble.setZona(rs.getString("Zona"));
                propiedadInmueble.setSuperficie(rs.getInt("Superficie"));
                propiedadInmueble.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedadInmueble.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedadInmueble.setPrecioTasado(rs.getInt("PrecioBase"));
                propiedadInmueble.setEstado(rs.getBoolean("Estado"));

                listaInmuebles.add(propiedadInmueble);
            }
            if (listaInmuebles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron propiedades disponibles");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble");
        }
        return listaInmuebles;
    }

    public void modificarInmueble(PropiedadInmueble propiedadInmueble) {
        String sql = "UPDATE propiedadInmueble SET idPropietario=?,Tipo = ?, Direccion = ?, "
                + "Zona = ?, Superficie = ?, Caracteristicas=?, Accesibilidad=?, precioBase=?,estado=? WHERE idInmueble=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, propiedadInmueble.getPropietario().getId_propietario());
            ps.setString(2, propiedadInmueble.getTipoDeLocal());
            ps.setString(3, propiedadInmueble.getDireccion());
            ps.setString(4, propiedadInmueble.getZona());
            ps.setInt(5, propiedadInmueble.getSuperficie());
            ps.setString(6, propiedadInmueble.getCaracteristicas());
            ps.setString(7, propiedadInmueble.getAccesibilidad());
            ps.setFloat(8, propiedadInmueble.getPrecioTasado());
            ps.setBoolean(9, propiedadInmueble.getEstado());
            ps.setInt(10, propiedadInmueble.getIdInmueble());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
    }

    public List<PropiedadInmueble> listarInmueblesDisponiblesYsuDueño(boolean estado) {

        String sql = "SELECT i.idInmueble,i.Tipo, i.zona, i.direccion, i.superficie, i.PrecioBase,i.estado,"
                + " o.nombre AS nombreDueno, o.apellido AS apellidoDueno, o.idPropietario AS idPropietario "
                + "FROM Inmueble i INNER JOIN Propietario o ON i.idPropietario = o.idPropietario WHERE i.Estado= ?";
        ArrayList<PropiedadInmueble> listaInmuebles = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("zona"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setSuperficie(rs.getInt("superficie"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("estado"));
                //propiedad.setPropietario(Propietario);
                // Crear un objeto Dueno con los datos del dueño

                PropietarioData pd = new PropietarioData();

                Propietario propietario = pd.buscarPropietarioPorId(rs.getInt("idPropietario"));
                //Asignar el propietario a la propiedad
                //System.out.println("id prop " +propietario.getId_propietario());
                propiedad.setPropietario(propietario);
//              
                // Agregar la propiedad a la lista
                listaInmuebles.add(propiedad);
//                System.out.println("Propiedad: "+propiedad.getPropietario().getNombre());    
            }
            if (listaInmuebles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron propiedades disponibles");
                ps.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, "error al acceder a la tabla");
        }
        return listaInmuebles;
    }

    public List<PropiedadInmueble> listarInmueblesDisponiblesXTipo(String tipoDeLocal) {
        String sql = "SELECT idInmueble, Tipo, Direccion, Zona, Superficie, Caracteristicas,"
                + " Accesibilidad,precioBase, estado FROM inmueble WHERE estado=1 and Tipo LIKE ?";
        ArrayList<PropiedadInmueble> listaInmuebles = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoDeLocal + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedadInmueble = new PropiedadInmueble();
                propiedadInmueble.setIdInmueble(rs.getInt("idInmueble"));
                propiedadInmueble.setTipoDeLocal(rs.getString("Tipo"));
                propiedadInmueble.setDireccion(rs.getString("Direccion"));
                propiedadInmueble.setZona(rs.getString("Zona"));
                propiedadInmueble.setSuperficie(rs.getInt("Superficie"));
                propiedadInmueble.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedadInmueble.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedadInmueble.setPrecioTasado(rs.getInt("PrecioBase"));
                propiedadInmueble.setEstado(rs.getBoolean("Estado"));

                listaInmuebles.add(propiedadInmueble);
            }
            if (listaInmuebles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron propiedades de ese tipo");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble");
        }
        return listaInmuebles;
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

    public PropiedadInmueble buscarInmuebleXid(int id) {
        String sql = "SELECT* FROM inmueble WHERE idInmueble=? ";
        PropiedadInmueble propiedad = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(id);
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un Inmueble con ese Id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propiedad;
    }

    public List<PropiedadInmueble> listarInmuebles() {//lista de las propiedades 
        String sql = "SELECT* FROM inmueble ";
        //ArrayList<PropiedadInmueble> PropiedadInmueble = new ArrayList<>();
        ArrayList<PropiedadInmueble> listaInmuebles = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

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

    public List<PropiedadInmueble> buscarInmueblesPorTipo(String tipo) {
        String sql = "SELECT * FROM inmueble WHERE Tipo=?";
        List<PropiedadInmueble> propiedades = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
                propiedades.add(propiedad);
            }

            if (propiedades.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen propiedades con ese tipo");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }

        return propiedades;
    }

    public List<PropiedadInmueble> buscarInmueblesPorZona(String zona) {
        String sql = "SELECT * FROM inmueble WHERE Zona=?";
        List<PropiedadInmueble> propiedades = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, zona);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
                propiedades.add(propiedad);
            }

            if (propiedades.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen propiedades con ese tipo");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }

        return propiedades;
    }

    public List<PropiedadInmueble> buscarInmueblesPorSuperficie(int superficie) {
        String sql = "SELECT * FROM inmueble WHERE Superficie=?";
        List<PropiedadInmueble> propiedades = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, superficie);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
                propiedades.add(propiedad);
            }

            if (propiedades.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen propiedades con ese tipo");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }

        return propiedades;
    }

//Buscar por varios criterios a la vez, segun lo prefieras
    public PropiedadInmueble buscarInmueblePorCriterios(String tipo, String zona, int superficie, float precioBase) {
        String sql = "SELECT * FROM inmueble WHERE Tipo = ? AND Zona = ? AND Superficie = ? AND PrecioBase = ?";
        PropiedadInmueble propiedad = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setString(2, zona);
            ps.setInt(3, superficie);
            ps.setFloat(4, precioBase);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro una propiedad inmueble con los criterios especificados.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble: " + ex.getMessage());
        }
        return propiedad;
    }

    public List<PropiedadInmueble> listarInmueblesPorCriterios(String tipo, String zona, int superficie, float precioBase, int idpropietario) {
        String sql = "SELECT * FROM inmueble WHERE Tipo = ? AND Zona = ? AND Superficie = ? AND PrecioBase = ? AND idPropietario =?";
        List<PropiedadInmueble> propiedadesEncontradas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setString(2, zona);
            ps.setInt(3, superficie);
            ps.setFloat(4, precioBase);
            ps.setInt(5, idpropietario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
                //propiedad.setPropietario(rs.getInt("idPropietario"));
                propiedadesEncontradas.add(propiedad);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble: " + ex.getMessage());
        }
        return propiedadesEncontradas;
    }

    public List<PropiedadInmueble> listarInmueblesPorPrecioBaseEnRango(float precioMin, float precioMax) {
        String sql = "SELECT * FROM inmueble WHERE PrecioBase BETWEEN ? AND ?";
        List<PropiedadInmueble> propiedadesEncontradas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, precioMin);
            ps.setFloat(2, precioMax);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PropiedadInmueble propiedad = new PropiedadInmueble();
                propiedad.setIdInmueble(rs.getInt("idInmueble"));
                propiedad.setTipoDeLocal(rs.getString("Tipo"));
                propiedad.setZona(rs.getString("Zona"));
                propiedad.setDireccion(rs.getString("Direccion"));
                propiedad.setSuperficie(rs.getInt("Superficie"));
                propiedad.setCaracteristicas(rs.getString("Caracteristicas"));
                propiedad.setAccesibilidad(rs.getString("Accesibilidad"));
                propiedad.setPrecioTasado(rs.getFloat("PrecioBase"));
                propiedad.setEstado(rs.getBoolean("Estado"));
                propiedadesEncontradas.add(propiedad);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble: " + ex.getMessage());
        }
        return propiedadesEncontradas;
    }

}

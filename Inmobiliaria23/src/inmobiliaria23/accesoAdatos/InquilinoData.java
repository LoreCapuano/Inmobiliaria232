package inmobiliaria23.accesoAdatos;

import inmobiliaria23.entidades.Inquilino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InquilinoData {

    private Connection con = null;

    public InquilinoData() {

        con = Conexion.getConexion();
        //Inquilino inquilino=new Inquilino();
    }

    public void nuevoInquilino(Inquilino inquilino) {
        String sql = "insert into inquilino (apellido,nombre,dni,CUIL,tel,"
                + "lugarDetrabajo,Garante,estado)values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, inquilino.getApellido());
            ps.setString(2, inquilino.getNombre());
            ps.setInt(3, inquilino.getDni());
            ps.setString(4, inquilino.getCUIL());
            ps.setInt(5, inquilino.getTel());
            ps.setString(6, inquilino.getLugarDetrabajo());
            ps.setString(7, inquilino.getGarante());
            ps.setBoolean(8, inquilino.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inquilino.setId_inquilino(1);
                JOptionPane.showMessageDialog(null, "Inquilino creado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino");
        }
    }

    public void bajaInquilino(int id) {
        String sql = "UPDATE inquilino SET estado=0 WHERE idInquilino=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inquilino eliminado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino"
                    + "" + ex.getMessage());
        }
    }

    public void modificarInquilino(Inquilino inquilino) {
        String sql = "UPDATE inquilino SET Apellido = ?, Nombre = ?, "
                + "Dni = ?, CUIL = ?, tel = ?, "
                + "lugarDetrabajo = ?,Garante= ?, estado = ? WHERE idInquilino = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inquilino.getApellido());
            ps.setString(2, inquilino.getNombre());
            ps.setInt(3, inquilino.getDni());
            ps.setString(4, inquilino.getCUIL());
            ps.setInt(5, inquilino.getTel());
            ps.setString(6, inquilino.getLugarDetrabajo());
            ps.setString(7, inquilino.getGarante());
           
            ps.setBoolean(8, inquilino.isEstado());
            ps.setInt(9, inquilino.getId_inquilino());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inquilino modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino" + ex.getMessage());
        }
    }

    public Inquilino buscarInquilinoPorid(int id) {
        String sql = "SELECT apellido,nombre, dni, CUIL,tel,lugarDetrabajo,Garante, estado FROM inquilino WHERE idInquilino=? ";
        Inquilino inquilino = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inquilino = new Inquilino();
                inquilino.setId_inquilino(id);
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCUIL(rs.getString("CUIL"));
                inquilino.setTel(rs.getInt("tel"));
                inquilino.setLugarDetrabajo(rs.getString("lugarDeTrabajo"));
                inquilino.setGarante(rs.getString("Garante"));
                
                inquilino.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese Id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino" + ex.getMessage());
        } 
        return inquilino;
    }

    public Inquilino buscarInquilinoPorDni(int dni) {
        String sql = "SELECT idInquilino,apellido,nombre, dni, CUIL,tel,lugarDetrabajo,Garante, estado FROM inquilino WHERE dni=? ";
        Inquilino inquilino = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inquilino = new Inquilino();
                inquilino.setId_inquilino(rs.getInt("idInquilino"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setDni(rs.getInt("dni"));
                inquilino.setCUIL(rs.getString("CUIL"));
                inquilino.setTel(rs.getInt("tel"));
                inquilino.setLugarDetrabajo(rs.getString("lugarDeTrabajo"));
                inquilino.setGarante(rs.getString("Garante"));
                inquilino.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un inquilino con ese DNI");
            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino" + ex.getMessage());
        }
        return inquilino;
    }
}

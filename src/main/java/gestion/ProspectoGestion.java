
package gestion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.Prospecto;


public class ProspectoGestion {
    
    private static final String SQL_INSERT_PROSPECTO= 
            "insert into prospecto (idProspecto,nombre,Apellido1,Apellido2,"
            + "fechaNacimiento,fechaGraduacionColegio,fechaPosibleIngreso,correo,celular) values"
            + "(?,?,?,?,?,?,?,?,?)";
    
    //Retorna verdadero si se logra insertar en base de datos, falso en caso contrario
    public static boolean insertar (Prospecto prospecto){
        
        
        try {
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(SQL_INSERT_PROSPECTO);
            
            sentencia.setString(1, prospecto.getCedula());
            sentencia.setString(2, prospecto.getNombre());
            sentencia.setString(3, prospecto.getApellido1());
            sentencia.setString(4, prospecto.getApellido2());
            sentencia.setObject(5, prospecto.getFechaNacimiento());
            sentencia.setObject(6, prospecto.getFechaGraduacionColegio());
            sentencia.setObject(7, prospecto.getFechaPosibleIngreso());
            sentencia.setString(8, prospecto.getCorreo());
            sentencia.setString(9, prospecto.getCelular());
            
            int fila = sentencia.executeUpdate();
            return fila>0; // Si es mayor que cero quiere decir que se insertó el registro en base de datos.
            
        } catch (SQLException ex) {
            Logger.getLogger(ProspectoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    
    
}

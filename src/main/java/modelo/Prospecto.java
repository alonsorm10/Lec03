
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

//POJO para prospecto
public class Prospecto {
    
    //Declaración de atributos
    private String cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private Date fechaGraduacionColegio;
    private Date fechaPosibleIngreso;
    private String correo;
    private String celular;

    //Constructores de la clase
    
    public Prospecto() {
    }

    public Prospecto(String cedula, String nombre, String apellido1, String apellido2, Date fechaNacimiento, Date fechaGraduacionColegio, Date fechaPosibleIngreso, String correo, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaGraduacionColegio = fechaGraduacionColegio;
        this.fechaPosibleIngreso = fechaPosibleIngreso;
        this.correo = correo;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaGraduacionColegio() {
        return fechaGraduacionColegio;
    }

    public void setFechaGraduacionColegio(Date fechaGraduacionColegio) {
        this.fechaGraduacionColegio = fechaGraduacionColegio;
    }

    public Date getFechaPosibleIngreso() {
        return fechaPosibleIngreso;
    }

    public void setFechaPosibleIngreso(Date fechaPosibleIngreso) {
        this.fechaPosibleIngreso = fechaPosibleIngreso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    //Sobreescribir el método para devolver los valores de los atributos en formato JSON 
    
    @Override
    public String toString() {
        
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
        
        String fecha1= format.format(fechaNacimiento);
        String fecha2= format.format(fechaGraduacionColegio);
        String fecha3= format.format(fechaPosibleIngreso);
        
        
        //Expresión JSON del objeto prospecto
        
        return "{\"Prospecto\":{\n"
                + "\"cedula\":\"" + cedula + "\",\n"
                + "\"nombre\":\"" + nombre + "\",\n"
                + "\"apellido1\":\"" + apellido1 + "\",\n"
                + "\"apellido2\":\"" + apellido2 + "\",\n"
                + "\"fechaNacimiento\":\"" + fechaNacimiento + "\",\n"
                + "\"fechaGraduacionColegio\":\"" + fechaGraduacionColegio + "\",\n"
                + "\"fechaPosibleIngreso\":\"" + fechaPosibleIngreso + "\",\n"
                + "\"correo\":\"" + correo + "\",\n"
                + "\"celular\":\"" + celular + "\"\n}\n}";
    }
    
    
    
    
    
    
}

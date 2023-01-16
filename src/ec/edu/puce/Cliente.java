package ec.edu.puce;

import javax.swing.JTable;

public class Cliente extends JTable {
	 private String Cedula;
	    private String Nombre;
	    private String Direccion;
	    private String Telefono;
	    private String Email;

	    public Cliente(String Cedula, String Nombre, String Direccion, String Telefono, String Email){
	        this.Cedula = Cedula;
	        this.Nombre = Nombre;
	        this.Direccion = Direccion;
	        this.Telefono = Telefono;
	        this.Email = Email;
	    }

	    public Cliente() {};

	    public String getCedula() {
	        return Cedula;
	    }

	    public void setCedula(String Cedula) {
	        this.Cedula = Cedula;
	    }

	    public String getNombre() {
	        return Nombre;
	    }

	    public void setNombre(String Nombre) {
	        this.Nombre = Nombre;
	    }

	    public String getDireccion() {
	        return Direccion;
	    }

	    public void setDireccion(String Direccion) {
	        this.Direccion = Direccion;
	    }

	    public String getTelefono() {
	        return Telefono;
	    }

	    public void setTelefono(String Telefono) {
	        this.Telefono = Telefono;
	    }

	    public String getEmail() {
	        return Email;
	    }

	    public void setEmail(String Email) {
	        this.Email = Email;
	    }
}

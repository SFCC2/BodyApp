package com.bodyapp.ws.rest.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class VOUsuario {

	private  @JsonProperty("correo") String correo;
	private  @JsonProperty("password") String password;
	private @JsonProperty("nombre") String nombre;
	private @JsonProperty("apellidos")String apellidos;
	private @JsonProperty("fecha_nacimiento")String fecha_nacimiento;
	private @JsonProperty("username")String username; 
	private @JsonProperty("tipo_sangre")String tipo_sangre; 
	private @JsonProperty("clasificacion")String clasificacion;
	private @JsonProperty("foto") String foto; 
	private @JsonProperty("genero") String genero; 
	private @JsonProperty("peso") int peso; 
	private @JsonProperty("altura") int altura; 
	

	public VOUsuario(String correo, String password, String nombre, String apellidos, String fecha_nacimiento,
			String username, String tipo_sangre, String clasificacion, String foto, String genero, int peso, int altura) {
		super();
		this.correo = correo;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.username = username;
		this.tipo_sangre = tipo_sangre;
		this.clasificacion = clasificacion;
		this.foto= foto;
		this.genero=genero;
		this.peso= peso;
		this.altura=altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public VOUsuario() {
		
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTipo_sangre() {
		return tipo_sangre;
	}

	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

package com.bodyapp.ws.mod.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bodyapp.ws.mod.conexion.Conexion;
import com.bodyapp.ws.rest.vo.VOUsuario;

public class DAOUsuario {
	public boolean addUser(VOUsuario t) throws SQLException {
		int result = 0;
		Connection connection = Conexion.getConenction();
		String query = "insert into usuario" + " values (?,?,?,?,?,?,?,?,'https://s3.console.aws.amazon.com/s3/object/bodyapp/User%2520Photo/imagen_defecto.png',?,?,?)";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, t.getCorreo());
			preparedStmt.setString(2, t.getPassword());
			preparedStmt.setString(3, t.getNombre());
			preparedStmt.setString(4, t.getApellidos());
			preparedStmt.setString(5, t.getFecha_nacimiento());
			preparedStmt.setString(6, t.getUsername());
			preparedStmt.setString(7, t.getTipo_sangre());
			preparedStmt.setString(8, t.getClasificacion());
			preparedStmt.setString(9, t.getGenero());
			preparedStmt.setInt(10, t.getPeso());
			preparedStmt.setInt(11, t.getAltura());

			result = preparedStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}
	public VOUsuario getUser(VOUsuario vo) {
		VOUsuario temp = null;
		PreparedStatement preparedStmt = null;
		String query = "SELECT * FROM usuario WHERE correo = ? AND password = ?";
		try {
			Connection connection = Conexion.getConenction();
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, vo.getCorreo());
			preparedStmt.setString(2, vo.getPassword());
			ResultSet rs = preparedStmt.executeQuery();
			String correo = null;
			String password = null;
			String nombre = null;
			String apellidos = null;
			String fecha_nacimiento = null;
			String username = null;
			String tipo_sangre = null;
			String clasificacion = null;
			String foto=null;
			String genero=null;
			int peso;
			int altura;
			if (rs.next()) {
				temp = new VOUsuario();

				correo = rs.getString("correo");
				temp.setCorreo(correo);

				password = rs.getString("password");
				temp.setPassword(password);
				
				nombre=rs.getString("nombres");
				temp.setNombre(nombre);
				
				apellidos=rs.getString("apellidos");
				temp.setApellidos(apellidos);
				
				fecha_nacimiento=rs.getString("fecha_nacimiento");
				temp.setFecha_nacimiento(fecha_nacimiento);
				
				username=rs.getString("username");
				temp.setUsername(username);
				
				tipo_sangre=rs.getString("tipo_sangre");
				temp.setTipo_sangre(tipo_sangre);
				
				clasificacion=rs.getString("clasificacion");
				temp.setClasificacion(clasificacion);
				
				foto=rs.getString("foto");
				temp.setFoto(foto);
				
				genero=rs.getString("genero");
				temp.setGenero(genero);
				
				peso=rs.getInt("peso");
				temp.setPeso(peso);
				
				altura=rs.getInt("altura");
				temp.setAltura(altura);

			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

	public boolean isUser(VOUsuario vo) {
		boolean temp = false;
		PreparedStatement preparedStmt = null;
		String query = "SELECT * FROM usuario WHERE correo = ? AND password = ?";
		try {
			Connection connection = Conexion.getConenction();
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, vo.getCorreo());
			preparedStmt.setString(2, vo.getPassword());
			ResultSet rs = preparedStmt.executeQuery();
			String usera = null;
			String password = null;
			String tipo = null;
			if (rs.next()) {
				temp = true;
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	public boolean addFoto(VOUsuario t) throws SQLException {
		int result = 0;
		Connection connection = Conexion.getConenction();
		String query = "update usuario set foto= ? where correo= ?";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, t.getFoto());
			preparedStmt.setString(2, t.getCorreo());
			
			result = preparedStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}
	public boolean changeUsername(VOUsuario t) throws SQLException {
		int result = 0;
		Connection connection = Conexion.getConenction();
		String query = "update usuario set username= ? where correo= ?";
		PreparedStatement preparedStmt = null;
		try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, t.getUsername());
			preparedStmt.setString(2, t.getCorreo());
			
			result = preparedStmt.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 0) {
			return false;
		} else {
			return true;
		}
	}
	
}

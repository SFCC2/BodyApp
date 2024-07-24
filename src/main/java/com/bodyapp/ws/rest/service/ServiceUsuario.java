package com.bodyapp.ws.rest.service;

import java.sql.SQLException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bodyapp.ws.mod.dao.DAOUsuario;
import com.bodyapp.ws.rest.vo.VOUsuario;

@Path("/Usuario")
public class ServiceUsuario {
	@POST
    @Path("/loginUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response loginUsuario(VOUsuario vo) {
        DAOUsuario dao = new DAOUsuario();        
        try {        	
			if(dao.isUser(vo) != false) {
				VOUsuario aux = dao.getUser(vo);			
				String correo= aux.getCorreo();
				String password = aux.getPassword();
				String nombre = aux.getNombre();
				String apellidos = aux.getApellidos();
				String fecha_nacimiento = aux.getFecha_nacimiento();
				String username = aux.getUsername();
				String tipo_sangre = aux.getTipo_sangre();
				String clasificacion = aux.getClasificacion();
				String foto= aux.getFoto();
				String genero= aux.getGenero();
				int peso= aux.getPeso();
				int altura= aux.getAltura();
				
				return Response.status(Response.Status.CREATED).entity("{\"correo\": \""+correo+"\",\"password\": \""+password+"\",\"nombre\":\""+nombre+"\",\"apellidos\":\""+apellidos+"\",\"fecha_nacimiento\":\""+fecha_nacimiento+"\",\"username\":\""+username+"\",\"tipo_sangre\":\""+tipo_sangre+"\",\"clasificacion\":\""+clasificacion+"\",\"status\":\"Correcto\",\"foto\":\""+foto+"\",\"genero\":\""+genero+"\",\"peso\":\""+peso+"\",\"altura\":\""+altura+"\"}").build();
			}else {
				return Response.status(Response.Status.CREATED).entity("{\"status\": \"401\"}").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        return Response.status(Response.Status.CREATED).entity("{\"status\": \"Error\"}").build();
    }
		@POST
	    @Path("/RegistrarUsuario")
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Produces({MediaType.APPLICATION_JSON})
	    public Response registrarUsuario(VOUsuario vo) {
	        DAOUsuario dao = new DAOUsuario();        
	        try {
				if(dao.addUser(vo)!=false) {
					return Response.status(Response.Status.CREATED).entity("{\"status\": \"hecho\"}").build();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        return Response.status(Response.Status.CREATED).entity("{\"status\": \"Error\"}").build();
	    }
		
	
		@POST
	    @Path("/CambiarFoto")
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Produces({MediaType.APPLICATION_JSON})
	    public Response foto(VOUsuario vo) {
	        DAOUsuario dao = new DAOUsuario();        
	        try {
				if(dao.addFoto(vo)!=false) {
					return Response.status(Response.Status.CREATED).entity("{\"status\": \"hecho\"}").build();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        return Response.status(Response.Status.CREATED).entity("{\"status\": \"Error\"}").build();
	    }
		@POST
	    @Path("/CambiarUsername")
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Produces({MediaType.APPLICATION_JSON})
	    public Response username(VOUsuario vo) {
	        DAOUsuario dao = new DAOUsuario();        
	        try {
				if(dao.changeUsername(vo)!=false) {
					return Response.status(Response.Status.CREATED).entity("{\"status\": \"hecho\"}").build();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        return Response.status(Response.Status.CREATED).entity("{\"status\": \"Error\"}").build();
	    }
}


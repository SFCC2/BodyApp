package com.bodyapp.ws.rest.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class VOejercicios {
	
	private @JsonProperty("nombre_ejercicio") String nombre_ejercicio;
	private @JsonProperty("descripcion_ejercicio") String descripcion_ejercicio;
	private @JsonProperty("media_ejercicio") String media_ejercicio;
	private @JsonProperty("clasificacion_ejercicio") String clasificacion_ejercicio;
	
	
	public VOejercicios(String nombre_ejercicio, String descripcion_ejercicio, String media_ejercicio,
			String clasificacion_ejercicio) {
		super();
		this.nombre_ejercicio = nombre_ejercicio;
		this.descripcion_ejercicio = descripcion_ejercicio;
		this.media_ejercicio = media_ejercicio;
		this.clasificacion_ejercicio = clasificacion_ejercicio;
	}
	
	public VOejercicios() {
		
	}

	public String getNombre_ejercicio() {
		return nombre_ejercicio;
	}

	public void setNombre_ejercicio(String nombre_ejercicio) {
		this.nombre_ejercicio = nombre_ejercicio;
	}

	public String getDescripcion_ejercicio() {
		return descripcion_ejercicio;
	}

	public void setDescripcion_ejercicio(String descripcion_ejercicio) {
		this.descripcion_ejercicio = descripcion_ejercicio;
	}

	public String getMedia_ejercicio() {
		return media_ejercicio;
	}

	public void setMedia_ejercicio(String media_ejercicio) {
		this.media_ejercicio = media_ejercicio;
	}

	public String getClasificacion_ejercicio() {
		return clasificacion_ejercicio;
	}

	public void setClasificacion_ejercicio(String clasificacion_ejercicio) {
		this.clasificacion_ejercicio = clasificacion_ejercicio;
	}

	
}

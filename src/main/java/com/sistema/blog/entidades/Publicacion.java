package com.sistema.blog.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo" ,nullable = false)
	private String titulo;
	
	@Column(name = "descripcion" ,nullable = false)
	private String descripcion;
	
	@Column(name = "contenido" ,nullable = false)
	private String contenido;
	
}

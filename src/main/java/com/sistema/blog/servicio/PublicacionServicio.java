package com.sistema.blog.servicio;

import java.util.List;

import com.sistema.blog.dto.PublicacionDTO;

public interface PublicacionServicio {

	public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);

	PublicacionDTO crearPublicacionDTO(PublicacionDTO publicacionDTO);
	
	public List<PublicacionDTO> obtenerTodasLasPublicaciones();
	
}

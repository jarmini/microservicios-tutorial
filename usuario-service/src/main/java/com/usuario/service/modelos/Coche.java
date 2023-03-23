package com.usuario.service.modelos;

import lombok.Getter;
import lombok.Setter;

public class Coche {
	
	@Getter @Setter
	private String marca;
	@Getter @Setter
	private String modelo;
	@Getter @Setter
	private int usuarioId;

}

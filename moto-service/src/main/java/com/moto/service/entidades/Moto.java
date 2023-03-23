package com.moto.service.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Moto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Getter @Setter
	private int id;
	
	@Getter @Setter
	private String marca;
	@Getter @Setter
	private String modelo;
	@Getter @Setter
	private int usuario;
	
	@Getter @Setter
	private int usuarioId;

}

package com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="times")
@Entity
public class Time {

	@Id
	@Column(name="codigo_time")
	private Integer codigoTime;
	
	@Column(name="nome_time")
	private String nomeTime;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="estadio")
	private String estadio;
	
	@Column(name="material_esportivo")
	private String materialEsportivo;
}

package com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classificacao {

	@JsonProperty
	private Time time;

	@JsonProperty
	private int numJogosDisputados;

	@JsonProperty
	private int vitorias;

	@JsonProperty
	private int empates;

	@JsonProperty
	private int derrotas;

	@JsonProperty
	private int golsMarcados;

	@JsonProperty
	private int golsSofridos;

	@JsonProperty
	private int saldoGols;

	@JsonProperty
	private int pontos;

	@JsonProperty
	private String riscoRebaixado;

	public Classificacao(Time time, int numJogosDisputados, int vitorias, int empates, int derrotas, int golsMarcados,
			int golsSofridos, int saldoGols, int pontos) {
		super();
		this.time = time;
		this.numJogosDisputados = numJogosDisputados;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.golsMarcados = golsMarcados;
		this.golsSofridos = golsSofridos;
		this.saldoGols = saldoGols;
		this.pontos = pontos;
	}
}

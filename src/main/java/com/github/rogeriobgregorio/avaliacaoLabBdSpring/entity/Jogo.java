package com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jogo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty
    private String codigoTimeA; 
    
    @JsonProperty
    private String codigoTimeB;
    
    @JsonProperty
    private int golsTimeA;
    
    @JsonProperty
    private int golsTimeB;
    
    @JsonProperty
    private String dia;
    
	public Jogo(String codigoTimeA, String codigoTimeB) {
		this.codigoTimeA = codigoTimeA;
		this.codigoTimeB = codigoTimeB;
	}
	
	public Jogo(String codigoTimeA, String codigoTimeB, int golsTimeA, int golsTimeB) {
		this.codigoTimeA = codigoTimeA;
		this.codigoTimeB = codigoTimeB;
		this.golsTimeA = golsTimeA;
		this.golsTimeB = golsTimeB;
	}
}

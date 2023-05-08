package com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuartasDeFinal {
	
	@JsonProperty
	private Time primeiroTime;
	
	@JsonProperty
    private Time segundoTime;
}

package com.teste.empresa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {


	private String nome;
	
	private String email;
	
	private String empresa;
	
	private String cnpj;

}

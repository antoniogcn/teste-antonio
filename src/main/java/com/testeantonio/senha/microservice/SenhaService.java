package com.testeantonio.senha.microservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testeantonio.senha.regrasenha.RegraSenha;

@Service
public class SenhaService {

	private List<RegraSenha> regras;
	
	public SenhaService(List<RegraSenha> listaRegras) {
		this.regras = listaRegras;
	}

	public boolean valida(String senha) {
		boolean retorno = true;
		/*
		 * 1 Valida ao menos 1 digito
		 * 2 Ao menos 1 letra minuscula
		 * 3 Ao menos 1 letra maiuscula
		 * 4 Ao menos um caractere especial
		 * 5 Não posuir caracteres repetidos
		 */
		for(RegraSenha regra: regras) {
			if(!regra.valida(senha)) {
				retorno = false;
				break;
			}
		}
		
		return retorno;
	}
	
}

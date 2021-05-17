package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class SemRepeticao implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		boolean retorno = true;
		for(int i = 0; i < senha.trim().length(); i++) {
			char caracter =  senha.charAt(i);
			for(int j = i + 1; j < senha.trim().length(); j++) {
				if(caracter == senha.charAt(j)) {
					retorno = false;
					break;
				}
			}
		}
		return retorno;
	}

}

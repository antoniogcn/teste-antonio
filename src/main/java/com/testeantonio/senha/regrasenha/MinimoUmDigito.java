package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class MinimoUmDigito implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		return senha.matches("(?=.*[0-9]).{1,}");
	}

}

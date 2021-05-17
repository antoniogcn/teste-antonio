package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class MinimoNoveCaracteres implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		return senha.trim().length() >= 9;
	}

}

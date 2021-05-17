package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class MinimoUmaLetraMinuscula implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		return senha.matches("(?=.*[a-z]).{1,}");
	}

}

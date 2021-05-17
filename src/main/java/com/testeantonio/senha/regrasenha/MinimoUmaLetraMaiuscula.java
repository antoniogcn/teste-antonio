package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class MinimoUmaLetraMaiuscula implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		return senha.matches("(?=.*[A-Z]).{1,}");
	}

}

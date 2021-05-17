package com.testeantonio.senha.regrasenha;

import org.springframework.stereotype.Component;

@Component
public class MinimoUmCaracterEspecial implements RegraSenha {

	@Override
	public boolean valida(String senha) {
		return senha.matches("(?=.*[!@#$%^&*()-+]).{1,}");
	}

}

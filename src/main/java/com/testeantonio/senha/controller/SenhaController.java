package com.testeantonio.senha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testeantonio.senha.microservice.SenhaService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SenhaController {
	
	@Autowired
	SenhaService senhaService;
	
	@GetMapping()
	@ApiOperation(value = "Valida Senha")
	@ResponseStatus(HttpStatus.OK)
	public Boolean valida(@RequestParam String senha) {			
		return senhaService.valida(senha);		
	}
	
}

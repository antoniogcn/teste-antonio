package com.testeantonio.senha.controller.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.testeantonio.senha.controller.SenhaController;
import com.testeantonio.senha.microservice.SenhaService;

@RunWith(SpringRunner.class)
@WebMvcTest(SenhaController.class)
public class SenhaControllerTest {

	@Autowired
	private MockMvc mock;

	@MockBean
	private SenhaService senhaService;

	@Test
	public void minimoNoveCaracteresFalseTest() {

		try {
			mock.perform(get("/").param("senha", "At!1bcdefg")).andExpect(status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
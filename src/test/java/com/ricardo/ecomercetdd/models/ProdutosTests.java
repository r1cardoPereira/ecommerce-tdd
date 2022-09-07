package com.ricardo.ecomercetdd.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

	@Test
	void validarPropriedadesProduto() {
		var produto = new Produto();
		produto.setId("mdks");
		produto.setNome("ricardo@teste.com");
		produto.setDescricao("peça");
		produto.setQuantidade("1100");
		produto.setValor("1.900");
		

		

		assertEquals("mdks", produto.getId());
		assertEquals("ricardo@teste.com", produto.getNome());
		assertEquals("peça", produto.getDescricao());
		assertEquals("1100", produto.getQuantidade());
		assertEquals("1.900", produto.getValor());
		

	}
}
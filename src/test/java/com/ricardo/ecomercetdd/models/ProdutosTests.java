package com.ricardo.ecomercetdd.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

	@Test
	void validarPropriedadesProduto() {
		var produto = new Produto();
		produto.setCodigo("mdks");
		produto.setNome("ricardo@teste.com");
		produto.setDescricao("peça");
		produto.setQuantidade("1100");
		produto.setValor("1.900");
		

		

		assertEquals("RIC-17", produto.getCodigo());
		assertEquals("ricardo@teste.com", produto.getNome());
		assertEquals("peça", produto.getDescricao());
		assertEquals("1100", produto.getQuantidade());
		assertEquals("1.900", produto.getValor());
		

	}

	@Test
	void aoSetarNomeGeraCodigoCasoCodigoVazio(){
		var produto = new Produto();
		produto.setNome("ricardo@teste.com");
		assertEquals("RIC-17", produto.getCodigo());

	}

	@Test
	void aoSetarNomeGeraCodigoCasoCodigoPreenchido(){
		var produto = new Produto();
		produto.setCodigo("RIC-16");
		produto.setNome("ricardo@teste.com");
		assertEquals("RIC-17", produto.getCodigo());

	}
}
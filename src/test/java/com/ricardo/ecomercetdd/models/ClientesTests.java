package com.ricardo.ecomercetdd.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		cliente.setNome("Ricardo");
		cliente.setEmail("ricardo@teste.com");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua sao jose");
		cliente.setNumero("52A");
		cliente.setBairro("Jardim Maria Lidia");
		cliente.setCidade("Sao Paulo");
		cliente.setEstado("SP");
		cliente.setCep("08370-400");
		cliente.setComplemento("casa 1");

		

		assertEquals("Ricardo", cliente.getNome());
		assertEquals("ricardo@teste.com", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua sao jose", cliente.getEndereco());
		assertEquals("52A", cliente.getNumero());
		assertEquals("Jardim Maria Lidia", cliente.getBairro());
		assertEquals("Sao Paulo", cliente.getCidade());
		assertEquals("SP", cliente.getEstado());
		assertEquals("08370-400", cliente.getCep());
		assertEquals("casa 1", cliente.getComplemento());

	}
}
package br.inf.linsper.treinamento.test;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.inf.linsper.treinamento.entity.ProdutoEntity;
import br.inf.linsper.treinamento.entity.ProdutoVendaEntity;
import br.inf.linsper.treinamento.service.ClienteService;
import br.inf.linsper.treinamento.service.ProdutoService;
import br.inf.linsper.treinamento.service.ProdutoVendaService;
import br.inf.linsper.treinamento.service.VendaService;
 
 
@RunWith(SpringRunner.class) 
@SpringBootTest
public class DesafioTest { 
	 
	@Autowired
	private ClienteService clienteService;
	
	@Autowired 
	private ProdutoService produtoService;
	
	@Autowired
	private VendaService vendaService;
	
	@Autowired
	private ProdutoVendaService produtoVendaService;	
	 
	@Test
	public void questao3Test() {
		new ProdutoEntity(UUID.randomUUID(), "NOME", 23.9);
	} 
	   
    @Test
    public void questao4Test() { 
    	
    	ProdutoEntity produto1 = produtoService.findById(UUID.fromString("f8435562-ec12-4321-99eb-2ab7a0748244"));
    	assertEquals("Amaciante", produto1.getNome());
    	
    	ProdutoEntity produto2 = produtoService.findById(UUID.fromString("e6a57196-4844-429e-9e3c-0a99be6b2271"));
    	assertEquals("Sabão em pó", produto2.getNome());
    	
    	double soma = produto1.getPreco() + produto2.getPreco();
    	assertEquals("14.45", soma + "");
    	
    	assertNotNull(clienteService.findById(UUID.fromString("fbae9349-d134-4a2c-828e-83cd5d50427c")));
    	
    	assertNotNull(clienteService.findById(UUID.fromString("36c07baa-1625-4374-8745-77f7d3896c96")));
    }
    
    @Test
    public void questao6Test() {
    	assertNotNull(produtoService.consultaProdutoPorNome("Amaciante"));
    }
    
    @Test
    public void questao7Test() {
    	List<ProdutoVendaEntity> resultado = produtoVendaService.buscaPorIdVenda(UUID.fromString("6c0af3d4-8017-4b9f-a89a-d890dea69047"));
    	assertFalse(resultado.isEmpty());
    }
    
    @Test
    public void questao8Test() {
    	int tamnho = produtoService.buscaMaiorQue10().size();
    	assertEquals(4, tamnho);
    }
	
}

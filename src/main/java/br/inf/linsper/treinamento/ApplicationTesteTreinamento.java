package br.inf.linsper.treinamento;

import java.time.LocalDateTime; 
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import br.inf.linsper.treinamento.entity.ClienteEntity;
import br.inf.linsper.treinamento.entity.ProdutoEntity;
import br.inf.linsper.treinamento.entity.ProdutoVendaEntity;
import br.inf.linsper.treinamento.entity.VendaEntity;
import br.inf.linsper.treinamento.service.ClienteService;
import br.inf.linsper.treinamento.service.ProdutoService;
import br.inf.linsper.treinamento.service.ProdutoVendaService;
import br.inf.linsper.treinamento.service.VendaService;
 
@SpringBootApplication 
@ComponentScan(basePackages = {"br.inf.linsper.treinamento.entity",  
		"br.inf.linsper.treinamento.repository",
		"br.inf.linsper.treinamento.service"})
@EnableAutoConfiguration      
public class ApplicationTesteTreinamento {  

	public static void main(String[] args) {
		SpringApplication.run(ApplicationTesteTreinamento.class, args);
	} 
	 
	@Bean
    public CommandLineRunner runProduto(ProdutoService produtoService) throws Exception {
		return (String[] args) -> {
            ProdutoEntity amaciante = new ProdutoEntity();
            amaciante.setId(UUID.fromString("f8435562-ec12-4321-99eb-2ab7a0748244"));
            amaciante.setNome("Amaciante");
            amaciante.setPreco(7.65);
            produtoService.insert(amaciante); 
            
            ProdutoEntity cafe = new ProdutoEntity(UUID.fromString("666cba71-3c1c-43a7-b14f-b7df29641f64"), "Café", 12.45);
            produtoService.insert(cafe);
            
            ProdutoEntity sabaoEmPo = new ProdutoEntity();
            sabaoEmPo.setId(UUID.fromString("e6a57196-4844-429e-9e3c-0a99be6b2271"));
            sabaoEmPo.setNome("Sabão em pó");
            sabaoEmPo.setPreco(6.80);
            produtoService.insert(sabaoEmPo);
            
            ProdutoEntity produto1 = new ProdutoEntity(UUID.fromString("e6a57196-4844-429e-9e3c-0a99be6b2272"), "produto1", 15.8);
            produtoService.insert(produto1);
            ProdutoEntity produto2 = new ProdutoEntity(UUID.fromString("56a57196-4844-429e-9e3c-0a99be6b2272"), "produto2", 9.3);
            produtoService.insert(produto2);
            ProdutoEntity produto3 = new ProdutoEntity(UUID.fromString("e7a57196-4844-429e-9e3c-0a99be6b2272"), "produto3", 22.4);
            produtoService.insert(produto3);
            ProdutoEntity produto4 = new ProdutoEntity(UUID.fromString("e6a57196-4854-429e-9e3c-0a99be6b2272"), "produto4", 8.3);
            produtoService.insert(produto4);
            ProdutoEntity produto5 = new ProdutoEntity(UUID.fromString("e6a57196-8844-429e-9e3c-0a99be6b2272"), "produto5", 72.4);
            produtoService.insert(produto5);
            ProdutoEntity produto6 = new ProdutoEntity(UUID.fromString("e5a57196-4844-429e-9e3c-0a99be6b2272"), "produto6", 7.45);
            produtoService.insert(produto6);
        };
	}
	
	@Bean
    public CommandLineRunner runCliente(ClienteService clienteService) throws Exception {
		return (String[] args) -> {
			ClienteEntity cliente1 = new ClienteEntity();
			cliente1.setId(UUID.fromString("36c07baa-1625-4374-8745-77f7d3896c96"));
			cliente1.setNome("Fulano Da Silva");
			clienteService.insert(cliente1);
			
			  
			ClienteEntity cliente2 = new ClienteEntity();
			cliente2.setId(UUID.fromString("fbae9349-d134-4a2c-828e-83cd5d50427c"));
			cliente2.setNome("Ciclano De Sousa");
			clienteService.insert(cliente2);
		};
	}
	
	@Bean
    public CommandLineRunner runVenda(VendaService vendaService) throws Exception {
		return (String[] args) -> {
			VendaEntity venda1 = new VendaEntity();
			ClienteEntity cliente1 = new ClienteEntity();
			cliente1.setId(UUID.fromString("fbae9349-d134-4a2c-828e-83cd5d50427c"));
			venda1.setId(UUID.fromString("6c0af3d4-8017-4b9f-a89a-d890dea69047"));
			venda1.setCliente(cliente1);
			venda1.setData(LocalDateTime.now());
			vendaService.insert(venda1);	
			
			ClienteEntity cliente2 = new ClienteEntity();
			cliente2.setId(UUID.fromString("36c07baa-1625-4374-8745-77f7d3896c96"));
			VendaEntity venda2 = new VendaEntity();
			venda2.setId(UUID.fromString("9b4c681a-4d07-45d0-adf1-ee0f48774ef5"));
			venda2.setData(LocalDateTime.now());
			venda2.setCliente(cliente2);
			vendaService.insert(venda2);
		};
	}
	
	@Bean
    public CommandLineRunner runProdutoVenda(ProdutoVendaService produtoVendaService) throws Exception {
		return (String[] args) -> {
			
			ProdutoEntity sabaoEmPo = new ProdutoEntity();
	        sabaoEmPo.setId(UUID.fromString("e6a57196-4844-429e-9e3c-0a99be6b2271"));
	        ProdutoEntity amaciante = new ProdutoEntity();
            amaciante.setId(UUID.fromString("f8435562-ec12-4321-99eb-2ab7a0748244"));
            ProdutoEntity cafe = new ProdutoEntity(UUID.fromString("666cba71-3c1c-43a7-b14f-b7df29641f64"), "Café", 2.45);
            
            VendaEntity venda1 = new VendaEntity();
			venda1.setId(UUID.fromString("6c0af3d4-8017-4b9f-a89a-d890dea69047"));

            VendaEntity venda2 = new VendaEntity();
			venda2.setId(UUID.fromString("9b4c681a-4d07-45d0-adf1-ee0f48774ef5"));
			
			ProdutoVendaEntity produto1Venda1 = new ProdutoVendaEntity();
			produto1Venda1.setId(UUID.fromString("de1e9ee6-c44e-453d-bcfd-d7b7be2ee178"));
			produto1Venda1.setProduto(amaciante);
			produto1Venda1.setQuantidade(2); // se você colocou o tipo como Long, mode o 2 para 2L
			produto1Venda1.setValor(10.5);
			produto1Venda1.setVenda(venda1);  
			produtoVendaService.insert(produto1Venda1);
			 
			ProdutoVendaEntity produto2Venda1 = new ProdutoVendaEntity();
			produto2Venda1.setId(UUID.fromString("a9db69c7-8eba-45bc-b458-c9c02fb38565"));
			produto2Venda1.setProduto(cafe);
			produto2Venda1.setQuantidade(3); // se você colocou o tipo como Long, mode o 2 para 2L
			produto2Venda1.setValor(15.5);
			produto2Venda1.setVenda(venda1);
			produtoVendaService.insert(produto2Venda1);
			
			ProdutoVendaEntity produto1Venda2 = new ProdutoVendaEntity();
			produto1Venda2.setId(UUID.fromString("d4a200ba-bc67-459e-97e9-bacf8644f374"));
			produto1Venda2.setProduto(sabaoEmPo);
			produto1Venda2.setQuantidade(1); // se você colocou o tipo como Long, mode o 2 para 2L
			produto1Venda2.setValor(7.4);
			produto1Venda2.setVenda(venda2);
			produtoVendaService.insert(produto1Venda2);

			ProdutoVendaEntity produto2Venda2 = new ProdutoVendaEntity();
			produto2Venda2.setId(UUID.fromString("20a23269-63e0-445c-924c-b046dd0852f6"));
			produto2Venda2.setProduto(cafe);
			produto2Venda2.setQuantidade(1); // se você colocou o tipo como Long, mode o 2 para 2L
			produto2Venda2.setValor(4.6);
			produto2Venda2.setVenda(venda2);
			produtoVendaService.insert(produto2Venda2);

			ProdutoVendaEntity produto3Venda2 = new ProdutoVendaEntity();
			produto3Venda2.setId(UUID.fromString("edd881bb-3b30-4373-9fe4-7802c1f78a6c"));
			produto3Venda2.setProduto(amaciante);
			produto3Venda2.setQuantidade(3); // se você colocou o tipo como Long, mode o 2 para 2L
			produto3Venda2.setValor(5.9);
			produto3Venda2.setVenda(venda2);
			produtoVendaService.insert(produto3Venda2);
		};
	}
	
}

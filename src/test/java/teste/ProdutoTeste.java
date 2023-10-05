package teste;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import dao.IProdutoDao;
import dao.ProdutoDao;
import model.Produto;


public class ProdutoTeste {
	private IProdutoDao produtoDao;
	
	public ProdutoTeste() {
		produtoDao = new ProdutoDao();
	}
	
	@After
	public void end() {
		List<Produto> list = produtoDao.buscarTodos();
		System.out.println(list);
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		
		produto.setDescricao("Produto TESTE");
		produto.setNome("Bombril");
		produto.setPreco(1.59d);
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}

}

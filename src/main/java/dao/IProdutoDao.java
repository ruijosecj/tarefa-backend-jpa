package dao;

import java.util.List;

import model.Produto;

public interface IProdutoDao {
	public Produto cadastrar(Produto produto);

	public void excluir(Produto produto);

	public List<Produto> buscarTodos();
	
	public Produto buscarPorId(int id);

}

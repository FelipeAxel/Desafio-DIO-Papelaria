package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um cliente.
 * @author thiago leite
 */
public class Pedido {

    //TODO Preencher esta classe

    //codigo
    private String codigo;
    //cliente
    private Cliente cliente;
    //produtos
    private List<Produto> produtos;
    //total
    private double total;

    //Construtor padrao para inicialização da lista de pedidos.
    public Pedido(){
        this.produtos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", cliente=" + cliente +
                ", produtos=" + produtos +
                ", total=" + total +
                '}';
    }
}

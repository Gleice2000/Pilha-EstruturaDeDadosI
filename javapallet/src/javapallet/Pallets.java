
package javapallet;

public class Pallets {
    private String produto;
    private int qtd;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQnt() {
        return qtd;
    }

    public void setQnt(int qtd) {
        this.qtd = qtd;
    }
    
    @Override
    public String toString(){
        return getProduto ()+ "  :  " + getQnt();
    }
}

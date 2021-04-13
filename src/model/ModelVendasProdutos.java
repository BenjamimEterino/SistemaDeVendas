package model;
/**
*
* @author Benjamim
*/
public class ModelVendasProdutos {

    private int idVendaProdutos;
    private int venda;
    private int produto;
    private int quantidadeVenda;
    private double valorVenda;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de idVendaProdutos
    * @param pIdVendaProdutos
    */
    public void setIdVendaProdutos(int pIdVendaProdutos){
        this.idVendaProdutos = pIdVendaProdutos;
    }
    /**
    * @return pk_idVendaProdutos
    */
    public int getIdVendaProdutos(){
        return this.idVendaProdutos;
    }

    /**
    * seta o valor de venda
    * @param pVenda
    */
    public void setVenda(int pVenda){
        this.venda = pVenda;
    }
    /**
    * @return fk_venda
    */
    public int getVenda(){
        return this.venda;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * @return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de quantidadeVenda
    * @param pQuantidadeVenda
    */
    public void setQuantidadeVenda(int pQuantidadeVenda){
        this.quantidadeVenda = pQuantidadeVenda;
    }
    /**
    * @return quantidadeVenda
    */
    public int getQuantidadeVenda(){
        return this.quantidadeVenda;
    }

    /**
    * seta o valor de valorVenda
    * @param pValorVenda
    */
    public void setValorVenda(double pValorVenda){
        this.valorVenda = pValorVenda;
    }
    /**
    * @return valorVenda
    */
    public double getValorVenda(){
        return this.valorVenda;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProdutos = " + this.idVendaProdutos + "::venda = " + this.venda + "::produto = " + this.produto + "::quantidadeVenda = " + this.quantidadeVenda + "::valorVenda = " + this.valorVenda +  "}";
    }
}
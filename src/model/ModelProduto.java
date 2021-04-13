package model;

import java.sql.Date;

/**
*
* @author Benjamim
*/
public class ModelProduto {

    private int idProduto;
    private int idFornecedor;
    private int idCategoria;
    private String nomeProduto;
    private double precoProduto;
    private double compraProduto;
    private int stock;
    private Date dataEntrega;
    private Date validade;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return pk_idProduto
    */
    public int getIdProduto(){
        return idProduto;
    }

    /**
    * seta o valor de idFornecedor
    * @param pIdFornecedor
    */
    public void setIdFornecedor(int pIdFornecedor){
        this.idFornecedor = pIdFornecedor;
    }
    /**
    * @return fk_idFornecedor
    */
    public int getIdFornecedor(){
        return this.idFornecedor;
    }

    /**
    * seta o valor de idCategoria
    * @param pIdCategoria
    */
    public void setIdCategoria(int pIdCategoria){
        this.idCategoria = pIdCategoria;
    }
    /**
    * @return fk_idCategoria
    */
    public int getIdCategoria(){
        return this.idCategoria;
    }

    /**
    * seta o valor de nomeProduto
    * @param pNomeProduto
    */
    public void setNomeProduto(String pNomeProduto){
        this.nomeProduto = pNomeProduto;
    }
    /**
    * @return nomeProduto
    */
    public String getNomeProduto(){
        return this.nomeProduto;
    }

    /**
    * seta o valor de precoProduto
    * @param pPrecoProduto
    */
    public void setPrecoProduto(double pPrecoProduto){
        this.precoProduto = pPrecoProduto;
    }
    /**
    * @return precoProduto
    */
    public double getPrecoProduto(){
        return this.precoProduto;
    }

    /**
    * seta o valor de stock
    * @param pStock
    */
    public void setStock(int pStock){
        this.stock = pStock;
    }
    /**
    * @return stock
    */
    public int getStock(){
        return this.stock;
    }

    /**
    * seta o valor de dataEntrega
    * @param pDataEntrega
    */
    public void setDataEntrega(Date pDataEntrega){
        this.dataEntrega = pDataEntrega;
    }
    /**
    * @return dataEntrega
    */
    public Date getDataEntrega(){
        return this.dataEntrega;
    }

    /**
    * seta o valor de validade
    * @param pValidade
    */
    public void setValidade(Date pValidade){
        this.validade = pValidade;
    }
    /**
    * @return validade
    */
    public Date getValidade(){
        return this.validade;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "ModelProduto {" + "::idProduto = " + this.idProduto + "::idFornecedor = " + this.idFornecedor + "::idCategoria = " + this.idCategoria + "::nomeProduto = " + this.nomeProduto + "::precoProduto = " + this.precoProduto + "::Stock = " + this.stock + "::dataEntrega = " + this.dataEntrega + "::validade = " + this.validade +  "}";
    }

    /**
     * @return the compraProduto
     */
    public double getCompraProduto() {
        return compraProduto;
    }

    /**
     * @param compraProduto the compraProduto to set
     */
    public void setCompraProduto(double compraProduto) {
        this.compraProduto = compraProduto;
    }
}
package model;
/**
*
* @author Benjamim
*/
public class ModelFornecedor {

    private int idFornecedor;
    private String nomeFornecedor;
    private String telefoneFornecedor;
    private String enderecoFornecedor;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de idFornecedor
    * @param pIdFornecedor
    */
    public void setIdFornecedor(int pIdFornecedor){
        this.idFornecedor = pIdFornecedor;
    }
    /**
    * @return pk_idFornecedor
    */
    public int getIdFornecedor(){
        return this.idFornecedor;
    }

   

    /**
    * seta o valor de nomeFornecedor
    * @param pNomeFornecedor
    */
    public void setNomeFornecedor(String pNomeFornecedor){
        this.nomeFornecedor = pNomeFornecedor;
    }
    /**
    * @return nomeFornecedor
    */
    public String getNomeFornecedor(){
        return this.nomeFornecedor;
    }

    /**
    * seta o valor de telefoneFornecedor
    * @param pTelefoneFornecedor
    */
    public void setTelefoneFornecedor(String pTelefoneFornecedor){
        this.telefoneFornecedor = pTelefoneFornecedor;
    }
    /**
    * @return telefoneFornecedor
    */
    public String getTelefoneFornecedor(){
        return this.telefoneFornecedor;
    }

    /**
    * seta o valor de enderecoFornecedor
    * @param pEnderecoFornecedor
    */
    public void setEnderecoFornecedor(String pEnderecoFornecedor){
        this.enderecoFornecedor = pEnderecoFornecedor;
    }
    /**
    * @return enderecoFornecedor
    */
    public String getEnderecoFornecedor(){
        return this.enderecoFornecedor;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::idFornecedor = " + this.idFornecedor + "::nomeFornecedor = " + this.nomeFornecedor + "::telefoneFornecedor = " + this.telefoneFornecedor + "::enderecoFornecedor = " + this.enderecoFornecedor +  "}";
    }
}
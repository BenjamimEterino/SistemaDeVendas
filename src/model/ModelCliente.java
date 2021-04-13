package model;
/**
*
* @author Benjamim
*/
public class ModelCliente {

    private String enderecoCliente;
    private String  telefone;
    private int idCliente;
    private String nomeCliente;
    private String cidadeCliente;
    private double totalCompraCliente;

    /**
    * Construtor
    */
    public ModelCliente(){}
    
    
    
    

    /**
    * seta o valor de enderecoCliente
    * @param pBairroCliente
    */
    public void setEnderecoCliente(String pBairroCliente){
        enderecoCliente=pBairroCliente;
    }
    /**
    * @return enderecoCliente
    */
    public String getEnderecoCliente(){
        return enderecoCliente;
    }

    /**
    * seta o valor de cidadeCliente
    * @param pCidadeCliente
    */
    public void setCidadeCliente(String  pCidadeCliente){
        this.cidadeCliente=pCidadeCliente;
    }
    /**
    * @return cidadeCliente
    */
    public String  getCidadeCliente(){
        return cidadeCliente;
    }

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return pk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

  
    /**
    * seta o valor de nomeCliente
    * @param pNomeCliente
    */
    public void setNomeCliente(String pNomeCliente){
        this.nomeCliente = pNomeCliente;
    }
    /**
    * @return nomeCliente
    */
    public String getNomeCliente(){
        return this.nomeCliente;
    }

  

    /**
    * seta o valor de totalCompraCliente
    * @param pTotalCompraCliente
    */
    public void setTotalCompraCliente(double pTotalCompraCliente){
        this.totalCompraCliente = pTotalCompraCliente;
    }
    /**
    * @return totalCompraCliente
    */
    public double getTotalCompraCliente(){
        return this.totalCompraCliente;
    }


    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

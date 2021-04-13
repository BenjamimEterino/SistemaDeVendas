package model;

import java.sql.Date;

/**
*
* @author Benjamim
*/
public class ModelVenda {

    private int idVenda;
    private int idCliente;
    private double valorVenda;
    private Date dataVenda;
    private double descontoVenda;
    private double totalVenda;

    /**
    * Construtor
    */
    public ModelVenda(){}

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return pk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * @return fk_idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
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

    /**
    * seta o valor de dataVenda
    * @param pDataVenda
    */
    public void setDataVenda(Date pDataVenda){
        this.dataVenda = pDataVenda;
    }
    /**
    * @return dataVenda
    */
    public Date getDataVenda(){
        return this.dataVenda;
    }

    /**
    * seta o valor de descontoVenda
    * @param pDescontoVenda
    */
    public void setDescontoVenda(double pDescontoVenda){
        this.descontoVenda = pDescontoVenda;
    }
    /**
    * @return descontoVenda
    */
    public double getDescontoVenda(){
        return this.descontoVenda;
    }

    /**
    * seta o valor de totalVenda
    * @param pTotalVenda
    */
    public void setTotalVenda(double pTotalVenda){
        this.totalVenda = pTotalVenda;
    }
    /**
    * @return totalVenda
    */
    public double getTotalVenda(){
        return this.totalVenda;
    }


    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "}" +  "ModelVenda {" + "::idVenda = " + this.idVenda + "::idCliente = " + this.idCliente + "::valorVenda = " + this.valorVenda + "::dataVenda = " + this.dataVenda + "::descontoVenda = " + this.descontoVenda + "::totalVenda = " + this.totalVenda;
    }
}
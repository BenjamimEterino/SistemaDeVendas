package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Benjamim
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteController(int idCliente){
        return this.daoCliente.getClienteDAO(idCliente);
    }
    /**
    * recupera Cliente
    * @param nomeCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteController(String nomeCliente){
        return this.daoCliente.getClienteDAO(nomeCliente);
    }

    /**
    * recupera uma lista deCliente
    * @param pBairroCliente
    * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pBairroCliente
    * @return boolean
    */
    public boolean excluirClienteController(ModelCliente pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}
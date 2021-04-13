package controller;

import model.ModelFornecedor;
import DAO.DAOFornecedor;
import java.util.ArrayList;

/**
*
* @author Benjamim
*/
public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pIdFornecedor
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(String pNomeFornecedor){
        return this.daoFornecedor.getFornecedorDAO(pNomeFornecedor);
    }
    public ModelFornecedor getFornecedorController(int pIdFornecedor){
        return this.daoFornecedor.getFornecedorDAO(pIdFornecedor);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pIdFornecedor
    * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pIdFornecedor
    * @return boolean
    */
    public boolean excluirFornecedorController(int pIdFornecedor){
        return this.daoFornecedor.excluirFornecedorDAO(pIdFornecedor);
    }
}
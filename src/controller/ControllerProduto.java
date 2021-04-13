package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Benjamim
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pNomeProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(String pNomeProduto){
        return this.daoProduto.getProduto(pNomeProduto);
    }
    /**
    * recupera Produto
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pIdProduto){
        return this.daoProduto.getProdutoDAO(pIdProduto);
    }

    /**
    * recupera uma lista deProduto
    * @param pIdProduto
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }
    public boolean atualizarProdutoQuantidade(ModelProduto pModelProduto, int pIdProduto){
        return this.daoProduto.atualizarQuantidade(pModelProduto, pIdProduto);
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutoController(int pIdProduto){
        return this.daoProduto.excluirProdutoDAO(pIdProduto);
    }
}
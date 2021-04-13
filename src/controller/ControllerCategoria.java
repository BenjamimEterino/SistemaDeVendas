package controller;

import model.ModelCategoria ;
import DAO.DAOCategoria ;
import java.util.ArrayList;

/**
*
* @author Benjamim
*/
public class ControllerCategoria  {

    private DAOCategoria  daoCategoria  = new DAOCategoria ();

    /**
    * grava Categoria 
    * @param pModelCategoria 
    * @return int
    */
    public int salvarCategoria (ModelCategoria  pModelCategoria ){
        return this.daoCategoria .salvarCategoria(pModelCategoria );
    }

    /**
    * recupera Categoria 
    * @param pIdCategoria
    * @return ModelCategoria 
    */
    public ModelCategoria  getCategoria (int pIdCategoria){
        return this.daoCategoria .getCategoria(pIdCategoria);
    }
    public ModelCategoria  getCategoria (String pNomeCategoria){
        return this.daoCategoria .getCategoria(pNomeCategoria);
    }

    /**
    * recupera uma lista deCategoria 
    * @param pIdCategoria
    * @return ArrayList
    */
    public ArrayList<ModelCategoria > getListaCategoria(){
        return this.daoCategoria .getListaCategoria();
    }

    /**
    * atualiza Categoria 
    * @param pModelCategoria 
    * @return boolean
    */
    public boolean atualizarCategoria(ModelCategoria  pModelCategoria ){
        return this.daoCategoria .atualizarCategoria(pModelCategoria );
    }

    /**
    * exclui Categoria 
    * @param pIdCategoria
    * @return boolean
    */
    public boolean excluirCategoria(int pIdCategoria){
        return this.daoCategoria .excluirCategoria(pIdCategoria);
    }
}
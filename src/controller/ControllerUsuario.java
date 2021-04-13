package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Benjamim
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIdUsuario){
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }
    /**
    * recupera Usuario
    * @param pModelUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.getUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pIdUsuario
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pIdUsuario){
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }
    /**
     * Valida usuario
     * @param pModel
     * @return boolean
     */
    public boolean getValidarUsuarioController(ModelUsuario pModel) {
            return this.daoUsuario.getValidarUsuarioDAO(pModel);
    }
}
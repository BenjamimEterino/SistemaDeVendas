/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOCategoriaProduto;
import java.util.ArrayList;
import model.ModelCategoriaProduto;

/**
 *
 * @author benjamim
 */
public class ControllerCategoriaProduto {
    private DAOCategoriaProduto daoCP = new DAOCategoriaProduto();
    
    /**
     * recupera lista de categorias
     * @return ArrayList<ModelCategoriaProduto>
     */
    public ArrayList<ModelCategoriaProduto> getListCategoriaProduto(){
        return this.daoCP.getList();
    }
    
}

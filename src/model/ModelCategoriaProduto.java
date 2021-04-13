/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author benjamim
 */
public class ModelCategoriaProduto {
    private ModelCategoria modelCategoria;
    private ModelProduto modelProduto;
    private ArrayList<ModelCategoriaProduto> listaCategoriaProduto;

    /**
     * @return the modelCategoria
     */
    public ModelCategoria getModelCategoria() {
        return modelCategoria;
    }

    /**
     * @param modelCategoria the modelCategoria to set
     */
    public void setModelCategoria(ModelCategoria modelCategoria) {
        this.modelCategoria = modelCategoria;
    }

    /**
     * @return the modelProduto
     */
    public ModelProduto getModelProduto() {
        return modelProduto;
    }

    /**
     * @param modelProduto the modelProduto to set
     */
    public void setModelProduto(ModelProduto modelProduto) {
        this.modelProduto = modelProduto;
    }

    /**
     * @return the listaCategoriaProduto
     */
    public ArrayList<ModelCategoriaProduto> getListaCategoriaProduto() {
        return listaCategoriaProduto;
    }

    /**
     * @param listaCategoriaProduto the listaCategoriaProduto to set
     */
    public void setListaCategoriaProduto(ArrayList<ModelCategoriaProduto> listaCategoriaProduto) {
        this.listaCategoriaProduto = listaCategoriaProduto;
    }
    
}

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
public class ModelVendaCliente {
    private ModelVenda modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendaCliente> listaModelVendaCliente;

    /**
     * @return the modelVenda
     */
    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    /**
     * @param modelVenda the modelVenda to set
     */
    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelVendaCliente
     */
    public ArrayList<ModelVendaCliente> getListaModelVendaCliente() {
        return listaModelVendaCliente;
    }

    /**
     * @param listaModelVendaCliente the listaModelVendaCliente to set
     */
    public void setListaModelVendaCliente(ArrayList<ModelVendaCliente> listaModelVendaCliente) {
        this.listaModelVendaCliente = listaModelVendaCliente;
    }
    
    
    
}

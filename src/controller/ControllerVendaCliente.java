/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ModelVendaCliente;
import DAO.DAOVendasCliente;

/**
 *
 * @author benjamim
 */
public class ControllerVendaCliente {
    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();
    
    /**
     * recupera lista de venda e cliente
     * @return ArrayList<ModelVendaCliente>
     */
    public ArrayList<ModelVendaCliente> getListaVendaCliente() {
        return this.daoVendasCliente.getListaVenda();
    }
    
}

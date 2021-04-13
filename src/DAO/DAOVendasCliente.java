/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySQL;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVenda;
import model.ModelVendaCliente;

/**
 *
 * @author benjamim
 */
public class DAOVendasCliente extends ConexaoMySQL {
        /**
         * recupera uma lista de vendas e clientes
         * @return ArrayList<ModelVendaCliente>
         */
        public  ArrayList<ModelVendaCliente> getListaVenda(){
        ArrayList<ModelVendaCliente> listaModelVendaCliente = new ArrayList<>(); 
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendaCliente modelVC = new ModelVendaCliente();
        
        try{
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    +"tbl_venda.pk_id_venda,"
                    +"tbl_venda.fk_id_cliente,"
                    +"tbl_venda.valor_venda,"
                    +"tbl_venda.data_venda,"
                    +"tbl_venda.desconto_venda,"
                    +"tbl_venda.total_venda,"
                    +"tbl_cliente.pk_id_cliente,"
                    +"tbl_cliente.nome_cliente,"
                    +"tbl_cliente.endereco_cliente,"
                    +"tbl_cliente.cidade_cliente,"
                    +"tbl_cliente.telefone_cliente,"
                    +"tbl_cliente.compra_cliente"
                    +" FROM "
                    + " tbl_venda INNER JOIN tbl_cliente "
                    +"ON tbl_cliente.pk_id_cliente = tbl_venda.fk_id_cliente; "
                    +";"
            );
            
            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelCliente = new ModelCliente();
                modelVC = new ModelVendaCliente();
                
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setValorVenda(this.getResultSet().getDouble(3));
                modelVenda.setDataVenda(this.getResultSet().getDate(4));
                modelVenda.setDescontoVenda(this.getResultSet().getDouble(5));
                modelVenda.setTotalVenda(this.getResultSet().getDouble(6));
                
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setNomeCliente(this.getResultSet().getString(8));
                modelCliente.setEnderecoCliente(this.getResultSet().getString(9));
                modelCliente.setCidadeCliente(this.getResultSet().getString(10));
                modelCliente.setTelefone(this.getResultSet().getString(11));
                modelCliente.setTotalCompraCliente(this.getResultSet().getDouble(12));
                
                modelVC.setModelCliente(modelCliente);
                modelVC.setModelVenda(modelVenda);
                
                listaModelVendaCliente.add(modelVC);
            }
        } catch(SQLException e){
            
        }
        return listaModelVendaCliente;
    }
        public static void main(String[] args){
            
            DAOVendasCliente dao = new DAOVendasCliente();
            ArrayList<ModelVendaCliente> model = new ArrayList<>();
            
            model = dao.getListaVenda();
            System.out.print(model.size());
            
            for(int i=0; i<model.size(); i++){
                System.out.println(model.get(i).getModelVenda().getIdVenda());
            }
        }
    
}

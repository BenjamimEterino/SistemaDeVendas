/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySQL;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCategoria;
import model.ModelCategoriaProduto;
import model.ModelProduto;

/**
 *Retorna uma lista de produtos com as respectivas categorias
 * @author benjamim
 */
public class DAOCategoriaProduto extends ConexaoMySQL {
    
    public ArrayList<ModelCategoriaProduto> getList(){
        ArrayList<ModelCategoriaProduto> listaCP = new ArrayList<>();
        ModelProduto modelp = new ModelProduto();
        ModelCategoria modelC = new ModelCategoria();
        ModelCategoriaProduto modelCP = new ModelCategoriaProduto();
        
        try{
            this.conectar();
            this.executarSQL(
            "SELECT "
                    +"tbl_categoria.nome_categoria"
                    +" FROM "
                    +" tbl_categoria INNER JOIN tbl_produto "
                    +"ON tbl_cliente.pk_id_categoria = tbl_produto.fk_id_categoria; "
                    +";"
            );
            
            while(this.getResultSet().next()){
              modelp = new ModelProduto();
              modelC = new ModelCategoria();
              modelCP = new ModelCategoriaProduto();
              
              modelC.setNomeCategoria(this.getResultSet().getString(1));
              
              modelCP.setModelCategoria(modelC);
              listaCP.add(modelCP);
            }
        } catch(SQLException e){
            
        }
        return listaCP;
    }
    
}

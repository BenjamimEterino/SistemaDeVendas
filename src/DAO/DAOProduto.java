package DAO;

import model.ModelProduto;
import java.sql.Date;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Benjamim
*/
public class DAOProduto extends ConexaoMySQL {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_produto ("
                    + "pk_id_produto,"
                    + "fk_id_fornecedor,"
                    + "fk_id_categoria,"
                    + "nome_produto,"
                    + "preco_produto,"
                    + "compra_produto,"
                    + "produto_stock,"
                    + "data_entrega,"
                    + "validade_produto"
                + ") VALUES ("
                    + "'" + pModelProduto.getIdProduto() + "',"
                    + "'" + pModelProduto.getIdFornecedor() + "',"
                    + "'" + pModelProduto.getIdCategoria() + "',"
                    + "'" + pModelProduto.getNomeProduto() + "',"
                    + "'" + pModelProduto.getPrecoProduto() + "',"
                    + "'" + pModelProduto.getCompraProduto() + "',"
                    + "'" + pModelProduto.getStock() + "',"
                    + "'" + pModelProduto.getDataEntrega() + "',"
                    + "'" + pModelProduto.getValidade() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pIdProduto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "fk_id_fornecedor,"
                    + "fk_id_categoria,"
                    + "nome_produto,"
                    + "preco_produto,"
                    + "compra_produto,"
                    + "produto_stock,"
                    + "data_entrega,"
                    + "validade_produto"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " pk_id_produto = '" + pIdProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setIdFornecedor(this.getResultSet().getInt(2));
                modelProduto.setIdCategoria(this.getResultSet().getInt(3));
                modelProduto.setNomeProduto(this.getResultSet().getString(4));
                modelProduto.setPrecoProduto(this.getResultSet().getDouble(5));
                modelProduto.setCompraProduto(this.getResultSet().getDouble(6));
                modelProduto.setStock(this.getResultSet().getInt(7));
                modelProduto.setDataEntrega(this.getResultSet().getDate(8));
                modelProduto.setValidade(this.getResultSet().getDate(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }
    /**
    * recupera Produto
    * @param pNomeProduto
    * @return ModelProduto
    */
    public ModelProduto getProduto(String pNomeProduto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "fk_id_fornecedor,"
                    + "fk_id_categoria,"
                    + "nome_produto,"
                    + "preco_produto,"
                    + "compra_produto,"
                    + "produto_stock,"
                    + "data_entrega,"
                    + "validade_produto"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " nome_produto = '" + pNomeProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setIdFornecedor(this.getResultSet().getInt(2));
                modelProduto.setIdCategoria(this.getResultSet().getInt(3));
                modelProduto.setNomeProduto(this.getResultSet().getString(4));
                modelProduto.setPrecoProduto(this.getResultSet().getDouble(5));
                modelProduto.setCompraProduto(this.getResultSet().getDouble(6));
                modelProduto.setStock(this.getResultSet().getInt(7));
                modelProduto.setDataEntrega(this.getResultSet().getDate(8));
                modelProduto.setValidade(this.getResultSet().getDate(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
             this.executarSQL(
                    "SELECT "
                            + "pk_id_produto,"
                            + "fk_id_fornecedor,"
                    + "fk_id_categoria,"
                            + "nome_produto,"
                            + "preco_produto,"
                            + "compra_produto,"
                            + "produto_stock,"
                            + "data_entrega,"
                            + "validade_produto"
                            + " FROM"
                            + " tbl_produto"
                            + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setIdFornecedor(this.getResultSet().getInt(2));
                modelProduto.setNomeProduto(this.getResultSet().getString(4));
                modelProduto.setPrecoProduto(this.getResultSet().getDouble(5));
                modelProduto.setCompraProduto(this.getResultSet().getDouble(6));
                modelProduto.setStock(this.getResultSet().getInt(7));
                modelProduto.setDataEntrega(this.getResultSet().getDate(8));
                modelProduto.setValidade(this.getResultSet().getDate(9));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "',"
                    + "fk_id_fornecedor = '" + pModelProduto.getIdFornecedor() + "',"
                    + "fk_id_categoria = '" + pModelProduto.getIdCategoria() + "',"
                    + "nome_produto = '" + pModelProduto.getNomeProduto() + "',"
                    + "preco_produto = '" + pModelProduto.getPrecoProduto() + "',"
                    + "compra_produto = '" + pModelProduto.getCompraProduto() + "',"
                    + "produto_stock = '" + pModelProduto.getStock() + "',"
                    + "data_entrega = '" + pModelProduto.getDataEntrega() + "',"
                    + "validade_produto = '" + pModelProduto.getValidade() + "'"
                + " WHERE "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    public boolean atualizarQuantidade( ModelProduto pModelProduto, int pIdProduto){
       
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "',"
                    + "fk_id_fornecedor = '" + pModelProduto.getIdFornecedor() + "',"
                    + "fk_id_categoria = '" + pModelProduto.getIdCategoria() + "',"
                    + "nome_produto = '" + pModelProduto.getNomeProduto() + "',"
                    + "preco_produto = '" + pModelProduto.getPrecoProduto() + "',"
                    + "compra_produto = '" + pModelProduto.getCompraProduto() + "',"
                    + "produto_stock = '" + pModelProduto.getStock() + "',"
                    + "data_entrega = '" + pModelProduto.getDataEntrega() + "',"
                    + "validade_produto = '" + pModelProduto.getValidade() + "'"
                + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pIdProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_produto "
                + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}
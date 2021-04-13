package DAO;

import model.ModelFornecedor;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Benjamim
*/
public class DAOFornecedor extends ConexaoMySQL {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * @return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_fornecedor ("
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "'" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "'" + pModelFornecedor.getEnderecoFornecedor() + "'"
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
    * recupera Fornecedor
    * @param pIdFornecedor
    * @return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pIdFornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor"
                 + " FROM"
                     + " tbl_fornecedor"
                 + " WHERE"
                     + " pk_id_fornecedor = '" + pIdFornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }
    public ModelFornecedor getFornecedorDAO(String pNomeFornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor"
                 + " FROM"
                     + " tbl_fornecedor"
                 + " WHERE"
                     + " nome_fornecedor = '" + pNomeFornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * @return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_fornecedor,"
                    + "nome_fornecedor,"
                    + "telefone_fornecedor,"
                    + "endereco_fornecedor"
                 + " FROM"
                     + " tbl_fornecedor"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setEnderecoFornecedor(this.getResultSet().getString(4));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * @return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_fornecedor SET "
                    + "pk_id_fornecedor = '" + pModelFornecedor.getIdFornecedor() + "',"
                    + "nome_fornecedor = '" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "telefone_fornecedor = '" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "endereco_fornecedor = '" + pModelFornecedor.getEnderecoFornecedor() + "'"
                + " WHERE "
                    + "pk_id_fornecedor = '" + pModelFornecedor.getIdFornecedor() + "'"
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
    * exclui Fornecedor
    * @param pIdFornecedor
    * @return boolean
    */
    public boolean excluirFornecedorDAO(int pIdFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_fornecedor "
                + " WHERE "
                    + "pk_id_fornecedor = '" + pIdFornecedor + "'"
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
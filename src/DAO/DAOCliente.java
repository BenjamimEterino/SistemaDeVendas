package DAO;

import model.ModelCliente;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Benjamim
*/
public class DAOCliente extends ConexaoMySQL {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "endereco_cliente,"
                    + "cidade_cliente,"
                    + "telefone_cliente,"
                    + "nome_cliente,"
                    + "compra_cliente"
                + ") VALUES ("
                    + "'" + pModelCliente.getEnderecoCliente() + "',"
                    + "'" + pModelCliente.getCidadeCliente() + "',"
                    + "'" + pModelCliente.getTelefone() + "',"
                    + "'" + pModelCliente.getNomeCliente() + "',"
                    + "'" + pModelCliente.getTotalCompraCliente() + "'"
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
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pIdCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "endereco_cliente,"
                    + "cidade_cliente,"
                    + "pk_id_cliente,"
                    + "telefone_cliente,"
                    + "nome_cliente,"
                    + "compra_cliente"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setEnderecoCliente(this.getResultSet().getString(1));
                modelCliente.setCidadeCliente(this.getResultSet().getString (2));
                modelCliente.setIdCliente(this.getResultSet().getInt(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setNomeCliente(this.getResultSet().getString(5));
                modelCliente.setTotalCompraCliente(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    /**
    * recupera Cliente
    * @param pNomeCliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(String pNomeCliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "endereco_cliente,"
                    + "cidade_cliente,"
                    + "pk_id_cliente,"
                    + "telefone_cliente,"
                    + "nome_cliente,"
                    + "compra_cliente"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " nome_cliente = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setEnderecoCliente(this.getResultSet().getString(1));
                modelCliente.setCidadeCliente(this.getResultSet().getString (2));
                modelCliente.setIdCliente(this.getResultSet().getInt(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setNomeCliente(this.getResultSet().getString(5));
                modelCliente.setTotalCompraCliente(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "endereco_cliente,"
                    + "cidade_cliente,"
                    + "pk_id_cliente,"
                    + "telefone_cliente,"
                    + "nome_cliente,"
                    + "compra_cliente"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setEnderecoCliente(this.getResultSet().getString(1));
                modelCliente.setCidadeCliente(this.getResultSet().getString (2));
                modelCliente.setIdCliente(this.getResultSet().getInt(3));
                modelCliente.setTelefone(this.getResultSet().getString(4));
                modelCliente.setNomeCliente(this.getResultSet().getString(5));
                modelCliente.setTotalCompraCliente(this.getResultSet().getDouble(6));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "endereco_cliente = '" + pModelCliente.getEnderecoCliente() + "',"
                    + "cidade_cliente = '" + pModelCliente.getCidadeCliente() + "',"
                    + "telefone_cliente = '" + pModelCliente.getTelefone() + "',"
                    + "nome_cliente = '" + pModelCliente.getNomeCliente() + "',"
                    + "compra_cliente = '" + pModelCliente.getTotalCompraCliente() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getIdCliente() + "'"
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
    * exclui Cliente
    * @param pBairroCliente
    * @return boolean
    */
    public boolean excluirClienteDAO(ModelCliente pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pIdCliente.getIdCliente() + "'"
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
package DAO;

import model.ModelVenda;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
import java.util.Calendar;
/**
*
* @author Benjamim
*/
public class DAOVenda extends ConexaoMySQL {

    /**
    * grava Venda
    * @param pModelVenda
    * @return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_venda ("
                    + "fk_id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "desconto_venda,"
                    + "total_venda"
                + ") VALUES ("
                    + "'" + pModelVenda.getIdCliente() + "',"
                    + "'" + pModelVenda.getValorVenda() + "',"
                    + "'" + pModelVenda.getDataVenda() + "',"
                    + "'" + pModelVenda.getDescontoVenda() + "',"
                    + "'" + pModelVenda.getTotalVenda() + "'"
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
    * recupera Venda
    * @param pIdVenda
    * @return ModelVenda
    */
    public ModelVenda getVendaDAO(int pIdVenda){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "desconto_venda,"
                    + "total_venda,"
                 + " FROM"
                     + " tbl_venda"
                 + " WHERE"
                     + " pk_id_venda = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setValorVenda(this.getResultSet().getDouble(4));
                modelVenda.setDataVenda(this.getResultSet().getDate(5));
                modelVenda.setDescontoVenda(this.getResultSet().getDouble(6));
                modelVenda.setTotalVenda(this.getResultSet().getDouble(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * @return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_id_cliente,"
                    + "valor_venda,"
                    + "data_venda,"
                    + "desconto_venda,"
                    + "total_venda"
                 + " FROM "
                     + " tbl_venda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setIdCliente(this.getResultSet().getInt(2));
                modelVenda.setValorVenda(this.getResultSet().getDouble(3));
                modelVenda.setDataVenda(this.getResultSet().getDate(4));
                modelVenda.setDescontoVenda(this.getResultSet().getDouble(5));
                modelVenda.setTotalVenda(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * @return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_venda SET "
                    + "fk_id_cliente = '" + pModelVenda.getIdCliente() + "',"
                    + "valor_venda = '" + pModelVenda.getValorVenda() + "',"
                    + "data_venda = '" + pModelVenda.getDataVenda() + "',"
                    + "desconto_venda = '" + pModelVenda.getDescontoVenda() + "',"
                    + "total_venda = '" + pModelVenda.getTotalVenda() + "',"
                + " WHERE "
                    + "pk_id_venda = '" + pModelVenda.getIdVenda() + "'"
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
    * exclui Venda
    * @param pIdVenda
    * @return boolean
    */
    public boolean excluirVendaDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_venda "
                + " WHERE "
                    + "pk_id_venda = '" + pIdVenda + "'"
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
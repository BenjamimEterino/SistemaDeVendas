package DAO;

import model.ModelVendasProdutos;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Benjamim
*/
public class DAOVendasProdutos extends ConexaoMySQL {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_venda_produtos ("
                    + "pk_id_venda_produtos,"
                    + "fk_venda,"
                    + "fk_produto,"
                    + "quantidade_venda,"
                    + "valor_venda"
                + ") VALUES ("
                    + "'" + pModelVendasProdutos.getIdVendaProdutos() + "',"
                    + "'" + pModelVendasProdutos.getVenda() + "',"
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getQuantidadeVenda() + "',"
                    + "'" + pModelVendasProdutos.getValorVenda() + "'"
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
    * recupera VendasProdutos
    * @param pIdVendaProdutos
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProdutos){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produtos,"
                    + "fk_venda,"
                    + "fk_produto,"
                    + "quantidade_venda,"
                    + "valor_venda"
                 + " FROM"
                     + " tbl_venda_produtos"
                 + " WHERE"
                     + " pk_id_venda_produtos = '" + pIdVendaProdutos + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(2));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidadeVenda(this.getResultSet().getInt(4));
                modelVendasProdutos.setValorVenda(this.getResultSet().getDouble(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produtos,"
                    + "fk_venda,"
                    + "fk_produto,"
                    + "quantidade_venda,"
                    + "valor_venda"
                 + " FROM"
                     + " tbl_venda_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setIdVendaProdutos(this.getResultSet().getInt(1));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(2));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidadeVenda(this.getResultSet().getInt(4));
                modelVendasProdutos.setValorVenda(this.getResultSet().getDouble(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_venda_produtos SET "
                    + "pk_id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "',"
                    + "fk_venda = '" + pModelVendasProdutos.getVenda() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "quantidade_venda = '" + pModelVendasProdutos.getQuantidadeVenda() + "',"
                    + "valor_venda = '" + pModelVendasProdutos.getValorVenda() + "'"
                + " WHERE "
                    + "pk_id_venda_produtos = '" + pModelVendasProdutos.getIdVendaProdutos() + "'"
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
    * exclui VendasProdutos
    * @param pIdVendaProdutos
    * @return boolean
    */
    public boolean excluirVendasProdutosDAO(int pIdVendaProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_venda_produtos "
                + " WHERE "
                    + "pk_id_venda_produtos = '" + pIdVendaProdutos + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> listaVP) {
         try {
            this.conectar();
            int cont = listaVP.size();
            
            for(int i=0; i<cont; i++){
                this.insertSQL(
                "INSERT INTO tbl_venda_produtos ("
                    + "fk_venda,"
                    + "fk_produto,"    
                    + "quantidade_venda,"
                    + "valor_venda"
                + ") VALUES ("
                    + "'" + listaVP.get(i).getVenda() + "',"
                    +"'"  +listaVP.get(i).getProduto() + "',"
                    + "'" + listaVP.get(i).getQuantidadeVenda() + "',"
                    + "'" + listaVP.get(i).getValorVenda() + "'"
                + ");"
            );
            }
           
        }catch(Exception e){
            e.printStackTrace();
            return true;
        }finally{
            this.fecharConexao();
        }
        return true;
    }
}
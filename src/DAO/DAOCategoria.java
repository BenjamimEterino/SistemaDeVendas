package DAO;

import model.ModelCategoria ;
import conexoes.ConexaoMySQL;
import java.util.ArrayList;
/**
*
* @author Benjamim
*/
public class DAOCategoria  extends ConexaoMySQL {

    /**
    * Salva categoria 
    * @param pModelCategoria 
    * @return int
    */
    public int salvarCategoria (ModelCategoria  pModelCategoria ){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_categoria  ("
                    + "pk_id_categoria,"
                    + "nome_categoria"
                + ") VALUES ("
                    + "'" + pModelCategoria .getIdCategoria() + "',"
                    + "'" + pModelCategoria .getNomeCategoria() + "'"
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
    * recupera categoria 
    * @param pIdCategoria
    * @return ModelCategoria 
    */
    public ModelCategoria  getCategoria (int pIdCategoria){
        ModelCategoria  modelCategoria  = new ModelCategoria ();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_categoria,"
                    + "nome_categoria"
                 + " FROM"
                     + " tbl_categoria "
                 + " WHERE"
                     + " pk_id_categoria = '" + pIdCategoria + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria .setIdCategoria(this.getResultSet().getInt(1));
                modelCategoria .setNomeCategoria(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategoria ;
    }
    public ModelCategoria  getCategoria (String pNomeCategoria){
        ModelCategoria  modelCategoria  = new ModelCategoria ();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_categoria,"
                    + "nome_categoria"
                 + " FROM"
                     + " tbl_categoria "
                 + " WHERE"
                     + " nome_categoria = '" + pNomeCategoria + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria .setIdCategoria(this.getResultSet().getInt(1));
                modelCategoria .setNomeCategoria(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCategoria ;
    }

    /**
    * recupera uma lista de categoria 
        * @return ArrayList
    */
    public ArrayList<ModelCategoria > getListaCategoria (){
        ArrayList<ModelCategoria > listamodelCategoria  = new ArrayList();
        ModelCategoria  modelCategoria  = new ModelCategoria ();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_categoria,"
                    + "nome_categoria"
                 + " FROM"
                     + " tbl_categoria "
                + ";"
            );

            while(this.getResultSet().next()){
                modelCategoria  = new ModelCategoria ();
                modelCategoria .setIdCategoria(this.getResultSet().getInt(1));
                modelCategoria .setNomeCategoria(this.getResultSet().getString(2));
                listamodelCategoria .add(modelCategoria );
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCategoria ;
    }

    /**
    * atualiza Categoria 
    * @param pModelCategoria 
    * @return boolean
    */
    public boolean atualizarCategoria (ModelCategoria  pModelCategoria ){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_categoria  SET "
                    + "nome_categoria = '" + pModelCategoria .getNomeCategoria() + "'"
                + " WHERE "
                    + "pk_id_categoria = '" + pModelCategoria .getIdCategoria() + "'"
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
    * exclui Categoria 
    * @param pIdCategoria
    * @return boolean
    */
    public boolean excluirCategoria (int pIdCategoria){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_categoria  "
                + " WHERE "
                    + "pk_id_categoria = '" + pIdCategoria + "'"
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
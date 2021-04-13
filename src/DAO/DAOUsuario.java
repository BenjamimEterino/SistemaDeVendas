package DAO;

import java.sql.ResultSet;
import model.ModelUsuario;
import conexoes.ConexaoMySQL;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
/**
*
* @author Benjamim
*/
public class DAOUsuario extends ConexaoMySQL {
   ConexaoMySQL con = new ConexaoMySQL();
   Connection cc=con.conectar();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    
   public boolean checkLogin(String login, String senha) throws SQLException{
       
       boolean check = false;
       try{
           this.conectar();
           
          var sql = this.executarSQL(
                "SELECT "
                    + "login_usuario,"
                    + "senha_usuario"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " login_usuario = '" + login + "'"
                             +"and"
                             +" senha_usuario = '" + senha + "'"
                + ";"
            );
          Statement st= con.getStatement();
           ResultSet rs=st.executeQuery(sql);
          
           if(rs.next()){
               check = true;
           } else{
               check = false;
           }

       } catch(Exception e){
           e.printStackTrace();
       }
       return true;
   }
    
    /**
     * 
     * salva usuario
     * @param pModelUsuario
     * @return 
     */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuario ("
                    + "pk_id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                + ") VALUES ("
                    + "'" + pModelUsuario.getIdUsuario() + "',"
                    + "'" + pModelUsuario.getNomeUsuario() + "',"
                    + "'" + pModelUsuario.getLoginUsuario() + "',"
                    + "'" + pModelUsuario.getSenhaUsuario() + "'"
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
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " pk_id_usuario = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString (2));
                modelUsuario.setLoginUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }
    public ModelUsuario getUsuarioDAO(ModelUsuario pModel){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome_usuario,"
                    + "nivel_acesso,"
                    + "login_usuario,"
                    + "senha_usuario"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                      + " login_usuario = '" + pModel.getLoginUsuario() + "' AND senha_usuario = '"+pModel.getSenhaUsuario()+"'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString (2));
                modelUsuario.setNivelAcesso(this.getResultSet().getString (3));
                modelUsuario.setLoginUsuario(this.getResultSet().getString(4));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome_usuario,"
                    + "login_usuario,"
                    + "senha_usuario"
                 + " FROM"
                     + " tbl_usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString (2));
                modelUsuario.setLoginUsuario(this.getResultSet().getString(3));
                modelUsuario.setSenhaUsuario(this.getResultSet().getString(4));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuario SET "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "',"
                    + "nome_usuario = '" + pModelUsuario.getNomeUsuario() + "',"
                    + "login_usuario = '" + pModelUsuario.getLoginUsuario() + "',"
                    + "senha_usuario = '" + pModelUsuario.getSenhaUsuario() + "'"
                + " WHERE "
                    + "pk_id_usuario = '" + pModelUsuario.getIdUsuario() + "'"
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
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuario "
                + " WHERE "
                    + "pk_id_usuario = '" + pIdUsuario + "'"
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
     * valida o usuario
     * @param pModel
     * @return 
     */
    public boolean getValidarUsuarioDAO(ModelUsuario pModel) {
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome_usuario,"
                    + "nivel_acesso,"
                    + "login_usuario,"
                    + "senha_usuario"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " login_usuario = '" + pModel.getLoginUsuario() + "' AND senha_usuario = '"+pModel.getSenhaUsuario()+"'"
                + ";"
            );
               if(getResultSet().next()){
                   return true;
               } else{
                   return false;
               }
           
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}
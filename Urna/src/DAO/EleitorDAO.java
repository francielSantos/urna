/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Eleitores;
/**
 *
 * @author Aluno
 */

    public class EleitorDAO extends ExecuteSQL{
    public EleitorDAO(Connection con){
        super(con);
    }
    
    public String salvar(Eleitores eleitor){
        String sql = "INSERT INTO ELEITOR VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
             ps.setInt(1, eleitor.getNumero());
             ps.setString(2, eleitor.getNome());    
              ps.setString(3, eleitor.getNascimento());
              ps.setString(4, eleitor.getCPF());
              
            if(ps.executeUpdate() > 0){
                return "Candidato Inserido com sucesso";
            }else{
                return "Erro ao Inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
}

    


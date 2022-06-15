/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Candidatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */public class CandidatoDAO extends ExecuteSQL{
    public CandidatoDAO(Connection con){
        super(con);
    }
    
    public String salvar(Candidatos candidato){
        String sql = "INSERT INTO CANDIDATO VALUES(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
           
             ps.setString(1, candidato.getNome());
              ps.setInt(2, candidato.getNumero());
              ps.setString(3, candidato.getChapa());
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

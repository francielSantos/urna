/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Chapas;

/**
 *
 * @author Israel
 */
public class ChapaDAO extends ExecuteSQL{
    public ChapaDAO(Connection con){
        super(con);
    }
    
    public String salvar(Chapas chapa){
        String sql = "INSERT INTO CHAPA VALUES(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
            ps.setInt(1, chapa.getNumero());
             ps.setString(2, chapa.getDescricao());
            if(ps.executeUpdate() > 0){
                return "Chapa Inserida com sucesso";
            }else{
                return "Erro ao Inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aluno
 */
public class Eleitores {
     private String nome;
     private int numero;
     private  String nascimento;
    private  String CPF;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}

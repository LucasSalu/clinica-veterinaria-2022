/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tc.luslopes
 */
public class Veterinario {
    
    private Integer id;
    private String nome;
    private String endereço;
    private String telefone;
    
    Veterinario(Integer id, String nome, String endereço, String telefone){
        this.id = id;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}

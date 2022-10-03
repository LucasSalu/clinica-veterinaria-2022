/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tc.luslopes
 */
public class Cliente {
    
    private Integer id;
    private String nome;
    private String cep;
    private String email;
    private String telefone;

    List<Animal> animais = new ArrayList<>();

    public Cliente(Integer id, String nome, String Cep, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cep = Cep;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCep() {
        return cep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCep(String Cep) {
        this.cep = Cep;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void addAnimais(Animal animal) {
        this.animais.add(animal);
    }
    
    
    
    
}

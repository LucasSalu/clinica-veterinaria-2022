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
    private String telefone;
    private String email;
    private Long Cep;
    List<Animal> animais = new ArrayList<>();

    public Cliente(Integer id, String nome, String telefone, String email, Long Cep) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.Cep = Cep;
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

    public Long getCep() {
        return Cep;
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

    public void setCep(Long Cep) {
        this.Cep = Cep;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void addAnimais(Animal animal) {
        this.animais.add(animal);
    }
    
    
    
    
}

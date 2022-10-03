/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tc.luslopes
 */
public class Animal {
    
    private Integer id;
    private String nome;
    private Integer nascimento;
    private String sexo;
    private String especie;
    private ArrayList tratamentos = new ArrayList<>();
    
    public Animal(Integer id, String nome, Integer nascimento, String sexo, String especie) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.especie = especie;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Integer nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void addTratamento(Tratamento tratamento) {
        this.tratamentos.add(tratamento);
    }

    public ArrayList getTratamentos() {
        return tratamentos;
    }
    
    
    
    
    
}

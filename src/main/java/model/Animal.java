/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author tc.luslopes
 */
public class Animal {
    
    private Integer id;
    private String nome;
    private Calendar nascimento;
    private Integer sexo;
    private String especie;
    private ArrayList tratamentos = new ArrayList<>();
    
    public Animal(Integer id, String nome, Calendar nascimento, Integer sexo, String especie) {
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

    public Calendar getNascimento() {
        return nascimento;
    }

    public Integer getSexo() {
        return sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    
}

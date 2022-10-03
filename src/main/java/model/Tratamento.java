/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author tc.luslopes
 */
public class Tratamento {
    
    private Integer id;
    private Calendar inicio;
    private Calendar fim;
    List<Consulta> consultas = new ArrayList();

    public Tratamento(Integer id, Calendar inicio, Calendar fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }
    
    
}

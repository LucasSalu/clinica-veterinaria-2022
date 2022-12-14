
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tc.luslopes
 */
public class Consulta {
    
    private Integer id;
    private Date data;
    private String historico;
    List<Exame> exames =  new ArrayList<>();
    List<Veterinario> veterinarios  = new ArrayList<>(); 

    public Consulta(Integer id,Date data, String historico) {
        this.id = id;
        this.data = data;
        this.historico = historico;
    }

    public Integer getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getHistorico() {
        return historico;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void addExames(Exame exame) {
        this.exames.add(exame);
    }

    public void addVeterinarios(Veterinario veterinario) {
        this.veterinarios.add(veterinario);
    }
    
    
   
    
}

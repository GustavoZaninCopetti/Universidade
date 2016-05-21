/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetsSets;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Professor {

    private Integer prof_codigo;
    private String prof_nome;
    private String prof_cidade;
    private String prof_sexo;
    private String prof_estado;
    private String prof_materia;
    private Date prof_datacad;

    public Integer getProf_codigo() {
        return prof_codigo;
    }

    public void setProf_codigo(Integer prof_codigo) {
        this.prof_codigo = prof_codigo;
    }

    public String getProf_nome() {
        return prof_nome;
    }

    public void setProf_nome(String prof_nome) {
        this.prof_nome = prof_nome;
    }

    public String getProf_cidade() {
        return prof_cidade;
    }

    public void setProf_cidade(String prof_cidade) {
        this.prof_cidade = prof_cidade;
    }

    public String isProf_sexo() {
        return prof_sexo;
    }

    public void setProf_sexo(String prof_sexo) {
        this.prof_sexo = prof_sexo;
    }

    public String getProf_estado() {
        return prof_estado;
    }

    public void setProf_estado(String prof_estado) {
        this.prof_estado = prof_estado;
    }

    public String getProf_materia() {
        return prof_materia;
    }

    public void setProf_materia(String prof_materia) {
        this.prof_materia = prof_materia;
    }

    public Date getProf_datacad() {
        return prof_datacad;
    }

    public void setProf_datacad(Date prof_datacad) {
        this.prof_datacad = prof_datacad;
    }

}

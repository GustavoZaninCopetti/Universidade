/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

/**
 *
 * @author Gustavo
 */
public class Curso {
    Integer curso_codigo;
    String curso_nome;
    String curso_localizacao;
    Integer curso_semestres;
    Float curso_valor;

    public Integer getCurso_codigo() {
        return curso_codigo;
    }

    public void setCurso_codigo(Integer curso_codigo) {
        this.curso_codigo = curso_codigo;
    }

    public String getCurso_nome() {
        return curso_nome;
    }

    public void setCurso_nome(String curso_nome) {
        this.curso_nome = curso_nome;
    }

    public String getCurso_localizacao() {
        return curso_localizacao;
    }

    public void setCurso_localizacao(String curso_localizacao) {
        this.curso_localizacao = curso_localizacao;
    }

    public Integer getCurso_semestres() {
        return curso_semestres;
    }

    public void setCurso_semestres(Integer curso_semestres) {
        this.curso_semestres = curso_semestres;
    }

    public Float getCurso_valor() {
        return curso_valor;
    }

    public void setCurso_valor(Float curso_valor) {
        this.curso_valor = curso_valor;
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import GetsSets.Curso;
import Views.CursoJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class CursoListener implements ActionListener {

    private CursoJIF curso;

    public CursoListener(CursoJIF curso) {
        this.curso = curso;
    }

    @Override
    public void actionPerformed(ActionEvent ce) {
        if ("salvarcurso".equals(ce.getActionCommand())) {
            Curso c = curso.getInfoCurso();

          /*  JOptionPane.showMessageDialog(null, "Codigo: " + c.getCurso_codigo() + "\n"
                    + "Nome: " + c.getCurso_nome() + "\n "
                    + "Localização: " + c.getCurso_localizacao() + "\n "
                    + "Quantidade Semestre: " + c.getCurso_semestres() + "\n "
                    + "Valor Curso: " + c.getCurso_valor());*/
             try {
                FileWriter arq = new FileWriter("C:/Users/comp1/Desktop/Java/Universidade/LOG.txt",true);
                PrintWriter gravarArq = new PrintWriter(arq);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                gravarArq.printf("\n" + date + "\n");
                gravarArq.printf(c.getCurso_nome() + "\n");
                gravarArq.printf(c.getCurso_localizacao()  + "\n");
                gravarArq.printf(c.getCurso_semestres()  + "\n");
                gravarArq.printf(c.getCurso_valor() + "\n");
                arq.close();
            } catch (IOException ec) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
            }
            
        }
        if ("saircurso".equals(ce.getActionCommand())) {
            curso.dispose();
        }
        if ("excluircurso".equals(ce.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Excluiu");
        }
        if ("consutarcurso".equals(ce.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Consultar");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import GetsSets.Professor;
import Views.ProfessorJIF;
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
public class ProfessorListener implements ActionListener{
     private ProfessorJIF professor;
    
    public ProfessorListener(ProfessorJIF professor){
        this.professor = professor;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent pe) {
        if("salvarprof".equals(pe.getActionCommand())){
            
           Professor p = professor.getInfoProfessor();
            
           try {
                FileWriter arq = new FileWriter("C:/Users/comp1/Desktop/Java/Universidade/LOG.txt",true);
                PrintWriter gravarArq = new PrintWriter(arq);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                gravarArq.printf("\n" + date + "\n");
                gravarArq.printf("Cadastro de Professores \n");
                gravarArq.printf("Codigo: " + p.getProf_codigo()  + "\n");
                gravarArq.printf("Nome: " + p.getProf_nome()  + "\n");
                gravarArq.printf("Cidade: " + p.getProf_cidade()  + "\n");
                gravarArq.printf("Sexo: " + p.isProf_sexo() + "\n");
                gravarArq.printf("Estado: " + p.getProf_estado() + "\n");
                gravarArq.printf("Materia: " + p.getProf_materia() + "\n");
                arq.close();
            } catch (IOException ec) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
            }
            
        }
        if("sairprof".equals(pe.getActionCommand())){
            professor.dispose();
            
        }
         if("consultarprofessor".equals(pe.getActionCommand())){
             JOptionPane.showMessageDialog(null, "Consultar");         
                 
             
         }
    }
    
}

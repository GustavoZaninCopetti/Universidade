package Listeners;

import GetsSets.Alunos;
import Views.AlunosJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AlunosListener implements ActionListener {

    AlunosJIF aluno;

    public AlunosListener(AlunosJIF aluno) {
        this.aluno = aluno;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {

            Alunos a = aluno.getInfoAluno();

           /* JOptionPane.showMessageDialog(null, "Codigo: " + a.getAlunos_codigo() + "\n"
                                              + "Nome: " + a.getAlunos_nome() + "\n "
                                              + "Cidade: " + a.getAlunos_cidade() + "\n "
                                              + "Sexo: " + a.isAlunos_sexo() + "\n "
                                              + "Estado: " + a.getAlunos_estado());*/
            
             try {
                FileWriter arq = new FileWriter("C:/Users/comp1/Desktop/Java/Universidade/LOG.txt",true);
                PrintWriter gravarArq = new PrintWriter(arq);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                gravarArq.printf("\n" + date + "\n");
                gravarArq.printf(a.getAlunos_codigo() + "\n");
                gravarArq.printf(a.getAlunos_nome()  + "\n");
                gravarArq.printf(a.getAlunos_cidade()  + "\n");
                gravarArq.printf(a.isAlunos_sexo()  + "\n");
                gravarArq.printf(a.getAlunos_estado()  + "\n");
                arq.close();
            } catch (IOException ec) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
            }

        }
        if ("sair".equals(e.getActionCommand())) {
            aluno.dispose();
        }
        if("excluiraluno".equals(e.getActionCommand())){
            JOptionPane.showMessageDialog(null, "Excluiu");
        }
        if("consultaralunos".equals(e.getActionCommand())){
             JOptionPane.showMessageDialog(null, "Consultar");
        }

    }

}

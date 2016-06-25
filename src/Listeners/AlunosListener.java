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
import Dao.AlunosDao;

public class AlunosListener implements ActionListener {

    AlunosJIF aluno;

    public AlunosListener(AlunosJIF aluno) {
        this.aluno = aluno;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            
            AlunosDao dao = new AlunosDao();

            Alunos a = aluno.getInfoAluno();
            
            
           /* JOptionPane.showMessageDialog(null, "Codigo: " + a.getAlunos_codigo() + "\n"
                                              + "Nome: " + a.getAlunos_nome() + "\n "
                                              + "Cidade: " + a.getAlunos_cidade() + "\n "
                                              + "Sexo: " + a.isAlunos_sexo() + "\n "
                                              + "Estado: " + a.getAlunos_estado());*/
            
             try {
                FileWriter arq = new FileWriter("C:/Users/Bruno Lopes/Desktop/LOG.txt",true);
                PrintWriter gravarArq = new PrintWriter(arq);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                gravarArq.printf("\n" + date + "\n");
                gravarArq.printf("Cadastro de Alunos \n ");
                gravarArq.printf("Codigo: " + a.getAlunos_codigo() + "\n");
                gravarArq.printf("Nome: " + a.getAlunos_nome()  + "\n");
                gravarArq.printf("Cidade: " + a.getAlunos_cidade()  + "\n");
                gravarArq.printf("Sexo: " + a.isAlunos_sexo()  + "\n");
                gravarArq.printf("Estado: " + a.getAlunos_estado()  + "\n");
                arq.close();
            } catch (IOException ec) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
            }
             
             dao.insert(a);
             
             
        }
        if ("sair".equals(e.getActionCommand())) {
            aluno.dispose();
        }
        if("excluiraluno".equals(e.getActionCommand())){
            AlunosDao dao = new AlunosDao();
            Alunos a = aluno.getInfoAluno();
            dao.delete(a);
            JOptionPane.showMessageDialog(null, "Excluiu");
            
        }
        if("consultaralunos".equals(e.getActionCommand())){
            AlunosDao dao = new AlunosDao();
            Alunos a = aluno.getInfoAluno();
                 
            
            Alunos resultado = dao.consultarAluno(a.getAlunos_codigo());
            
            aluno.atualiarAluno(resultado);
            
        }

    }

}

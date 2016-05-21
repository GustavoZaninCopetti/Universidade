package Listeners;

import GetsSets.Alunos;
import Views.AlunosJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

            JOptionPane.showMessageDialog(null, "Codigo: " + a.getAlunos_codigo() + "\n"
                                              + "Nome: " + a.getAlunos_nome() + "\n "
                                              + "Cidade: " + a.getAlunos_cidade() + "\n "
                                              + "Sexo: " + a.isAlunos_sexo() + "\n "
                                              + "Estado: " + a.getAlunos_estado());

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

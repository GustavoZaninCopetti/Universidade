
package Universidade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Acoes implements ActionListener{
   

    private IFAlunos aluno;
    
    public Acoes(IFAlunos aluno){
        this.aluno = aluno;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if("salvar".equals(e.getActionCommand())){
         JOptionPane.showMessageDialog(null,"Codigo: " + aluno.getInfoAluno().alunos_codigo + "\n" +
                                            "Nome: " + aluno.getInfoAluno().alunos_nome + "\n "  + 
                                            "Cidade: " + aluno.getInfoAluno().alunos_cidade + "\n " + 
                                            "Sexo: " + aluno.getInfoAluno().alunos_sexo + "\n " + 
                                            "Estado: " + aluno.getInfoAluno().alunos_estado);
            
        }
        if("sair".equals(e.getActionCommand())){
            aluno.dispose();
        }
        
    }
    
    
    
}

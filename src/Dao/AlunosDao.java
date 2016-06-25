package Dao;

import GetsSets.Alunos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunosDao {

    public void delete(Alunos alunos) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            
            conn = Conexao.getConnection();
            String sql = "delete from Aluno (codigo,nome,cidade,sexo,estado) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, alunos.getAlunos_codigo());
            ps.setString(2, alunos.getAlunos_nome());
            ps.setString(3, alunos.getAlunos_cidade());
            ps.setString(4, alunos.isAlunos_sexo());
            ps.setString(5, alunos.getAlunos_estado());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    //update pessoa set nome = ? where id = ?
    
    
    public void insert(Alunos alunos) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into Aluno (codigo,nome,cidade,sexo,estado) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, alunos.getAlunos_codigo());
            ps.setString(2, alunos.getAlunos_nome());
            ps.setString(3, alunos.getAlunos_cidade());
            ps.setString(4, alunos.isAlunos_sexo());
            ps.setString(5, alunos.getAlunos_estado());
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Alunos alunos) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update Aluno set nome = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, alunos.getAlunos_nome());
            ps.setInt(2, alunos.getAlunos_codigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public Alunos consultarAluno(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, nome, cidade, sexo, estado from Aluno where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cidade = rs.getString(3);
                String sexo = rs.getString(4);
                String estado = rs.getString(5);
                
                Alunos p = new Alunos();
                p.setAlunos_codigo(cod);
                p.setAlunos_nome(nome);
                p.setAlunos_cidade(cidade);
                p.setAlunos_sexo(sexo);
                p.setAlunos_estado(estado);       
                
                JOptionPane.showMessageDialog(null, estado);
               return p;
            }
            
            
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }


    public List<Alunos> getAll() {
        List<Alunos> lista = new ArrayList<Alunos>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            //select codigo, nome, cidade, sexo, estado from Aluno where codigo = ?
            String sql = "select codigo, nome, cidade, sexo, estado from Aluno where codigo = ?";
            ps = conn.prepareStatement(sql);

            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cidade = rs.getString(3);
                String sexo = rs.getString(4);
                String estado = rs.getString(5);
                
                
                
                
               // return ;
            }
            return null;
            
            
      /*      while(rs.next()) {
                Integer codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cidade = rs.getString(3);
                String sexo = rs.getString(4);
                String estado = rs.getString(5);
                
                Alunos p = new Alunos();
                p.setAlunos_codigo(codigo);
                p.setAlunos_nome(nome);
                p.setAlunos_cidade(cidade);
                p.setAlunos_sexo(sexo);
                p.setAlunos_estado(estado);
                lista.add(p);
            }*/
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Alunos getAlunos(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, nome from Aluno where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String nome = rs.getString(2);
                Alunos p = new Alunos();
                p.setAlunos_codigo(cod);
                p.setAlunos_nome(nome);
                return p;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }



}

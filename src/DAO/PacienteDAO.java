package DAO;




import conexao.Conexao;
import java.sql.*;
import MODEL.Paciente;
import javax.swing.*;
import conexao.Conexao;

public class PacienteDAO extends Conexao{
    
    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet linha = null;
    
    public PacienteDAO(){
        this.conexao = Conexao.conexao();
    }
    
    public void adicionar(Paciente cadpaciente){
        String sql = "insert into paciente (nomePaciente,idade, IdenUnica ,peso,altura,emailPaciente,senha,telefonePaciente, enderecoPaciente) values(?,?,?,?,?,?,?,?,?)";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cadpaciente.getNomePaciente());
            stmt.setString(2, cadpaciente.getIdade());
            stmt.setString(3, cadpaciente.getIdenUnica());
            stmt.setString(4, cadpaciente.getPeso());
            stmt.setString(5, cadpaciente.getAltura());
            stmt.setString(6, cadpaciente.getEmailPaciente());
            stmt.setString(7, cadpaciente.getSenha());
            stmt.setString(8, cadpaciente.getTelefonePaciente());
            stmt.setString(9, cadpaciente.getEnderecoPaciente());
           
            stmt.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro No Banco"+ e.getMessage());
        }
    }
    
        public Paciente consultar(String Iden){
        try{
            Paciente paciente = new Paciente();
            stmt = conexao.prepareStatement ("select * from paciente where IdenUnica = ?");
            stmt.setString(1, Iden);
            linha = stmt.executeQuery();
            if(linha.next()){
                paciente.setIdPaciente(linha.getInt("idPaciente"));
                paciente.setNomePaciente(linha.getString("nomePaciente"));
                paciente.setIdade(linha.getString("idade"));
                paciente.setIdenUnica(linha.getString("IdenUnica"));
                paciente.setPeso(linha.getString("peso"));
                paciente.setAltura(linha.getString("altura"));
                paciente.setEmailPaciente(linha.getString("emailPaciente"));
                paciente.setSenha(linha.getString("senha"));
                paciente.setTelefonePaciente(linha.getString("telefonePaciente"));
                paciente.setEnderecoPaciente(linha.getString("enderecoPaciente"));
               
                return paciente;
            }else{
                return null;
            }
            
        }catch(Exception e){
           return null;
        }
    }
        
         public void atualizar(Paciente paciente){
       try{
           stmt = conexao.prepareStatement
        ("update paciente set  nomePaciente = ?,idade = ?,peso = ?,altura = ?,emailPaciente = ?,senha = ?,telefonePaciente = ?,enderecoPaciente = ? where IdenUnica = ?");
           
            stmt.setString(1, paciente.getNomePaciente());
            stmt.setString(2, paciente.getIdade());
            stmt.setString(3, paciente.getPeso());
            stmt.setString(4, paciente.getAltura());
            stmt.setString(5, paciente.getEmailPaciente());
            stmt.setString(6, paciente.getSenha());
            stmt.setString(7, paciente.getTelefonePaciente());
            stmt.setString(8, paciente.getEnderecoPaciente());
            stmt.setString(9,paciente.getIdenUnica());
            
           stmt.executeUpdate();
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro No Banco"+ e.getMessage());
        }
   } 
        
     public boolean excluir(String Iden){
       try{
           stmt = conexao.prepareStatement("delete from paciente where IdenUnica = ?");
           stmt.setString(1, Iden);
           stmt.executeUpdate();
           return true;
       }catch(Exception e){
           return false;
       }
   }
     
     
     
     
    
}
   
   
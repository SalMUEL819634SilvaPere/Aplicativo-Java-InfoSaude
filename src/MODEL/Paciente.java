
package MODEL;


public class Paciente {

    

    public int idPaciente;
    private String nomePaciente;
    private String idade;
    private String IdenUnica;
    private String peso;
    private String altura;
    private String emailPaciente;
    private String senha;
    private String telefonePaciente;
    private String enderecoPaciente;
    
    
   
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
     public String getIdenUnica(){
        
        return IdenUnica;
    }
    
    public void setIdenUnica(String IdenUnica){
        
        this.IdenUnica = IdenUnica;
        
    }
    

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }
    
   
      public Paciente(){
       //construtor vazio serve para a saída das informações
   }
   
   public Paciente(int idPaciente,String nomePaciente, String idade,
        String IdenUnica,String peso,String altura,
        String emailPaciente, String senha, String telefonePaciente,
        String enderecoPaciente){
       //construtor cheio serve para que os atributos sejam lidos
       //em outras classes
   }
    
            
    
}

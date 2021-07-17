package javalandia.aulas_soltas;

public final class Cadastro 
{
    // ÁREA DE ATRIBUTOS DE CLASSE
    public static int idClasse;
    
    // ÁREA DE ATRIBUTOS DE INSTÂNCIA
    private int id;
    private String nome;
    private Long telefone;
    private String email;
    private String tipo;

    // ÁREA DE CONSTRUTORES
    public Cadastro(String nome, Long tel, String mail, String tip)
    {
        Cadastro.setIdClasse();
        this.setId();
        this.setNome(nome);
        this.setTelefone(tel);
        this.setEmail(mail);
        this.setTipo(tip);
    }
    
    // ÁREA DE MÉTODOS DE CLASSE
    public static int getIdClasse() {
        return idClasse;
    }

    public static void setIdClasse() {
        Cadastro.idClasse += 1;
    }
    
    // ÁREA DE MÉTODOS DE INSTÂNCIA
    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Cadastro.getIdClasse();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
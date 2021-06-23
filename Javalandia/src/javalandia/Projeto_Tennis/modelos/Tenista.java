package javalandia.Projeto_Tennis.modelos;

/**
 * @author Junior Martins
 */
public final class Tenista
{
// --------------- AREA DE ATRIBUTOS --------------- //
    // ATRIBUTOS DE CLASSE
    // ATRIBUTOS DE INSTANCIA
    private int id;
    private int id_cbt;
    private String nome;
    private Enum sexo;

// ---------------  AREA DE METODOS  --------------- //
    // METODOS CONSTRUTORES
    public Tenista(){};
    
    // METODOS GETTERS E SETTERS
    // Getters
    public int getId(){return id;};
    public int getId_cbt(){return id_cbt;};
    public String getNome(){return nome;};
    public Enum getSexo(){return sexo;};
    // Setters
    public void setId_cbt(int id_cbt){this.id_cbt = id_cbt;};
    public void setNome(String nome){this.nome = nome;};
    public void setSexo(Enum sexo){this.sexo = sexo;};
    
    // METODOS FUNCIONAIS
    // METODOS ABSTRATOS E POLIMORFICOS
}
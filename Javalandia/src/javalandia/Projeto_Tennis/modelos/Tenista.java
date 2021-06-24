package javalandia.Projeto_Tennis.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Junior Martins
 */
@Entity
public final class Tenista
{
// --------------- AREA DE ATRIBUTOS --------------- //
    // ATRIBUTOS DE CLASSE
    // ATRIBUTOS DE INSTANCIA
    @Id
    private int id;
    private int cbt_id;
    private String nome;
    private Enum sexo;

// ---------------  AREA DE METODOS  --------------- //
    // METODOS CONSTRUTORES
    public Tenista(){};
    public Tenista(int id){this.id = id;};
    
    // METODOS GETTERS E SETTERS
    // Getters
    public int getCbt_id(){return cbt_id;};
    public String getNome(){return nome;};
    public Enum getSexo(){return sexo;};
    // Setters
    public void setCbt_id(int cbt_id){this.cbt_id = cbt_id;};
    public void setNome(String nome){this.nome = nome;};
    public void setSexo(Enum sexo){this.sexo = sexo;};
    
    // METODOS FUNCIONAIS
    // METODOS ABSTRATOS E POLIMORFICOS
}
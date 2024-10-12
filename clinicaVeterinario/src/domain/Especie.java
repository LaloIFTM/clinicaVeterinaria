package domain;

import java.util.List;

public class Especie {

    private Integer codigo;
    private String nome;
    private List<Pet> pets;

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Especie(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

    }
    
}

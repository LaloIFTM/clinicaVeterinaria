package domain;

import java.util.Date;

public class Pet {

    private Integer codigo;
    private String nome;
    private Date dataNascimento;
    private GeneroEnum genero;
    private Cliente tutor;

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GeneroEnum getGenero() {
        return genero;
    }
    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public Cliente getTutor() {
        return tutor;
    }
    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }
    public Pet(Integer codigo, String nome, Date dataNascimento, GeneroEnum genero, Cliente tutor) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.tutor = tutor;

    }
    


}

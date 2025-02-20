package domain;

import java.util.List;

public class Tratamento {

    private Integer codigo;
    private String descricao;
    private Veterinario iniciadoPor;
    private List<Consulta> consultas;

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Veterinario getIniciadoPor() {
        return iniciadoPor;
    }
    public void setIniciadoPor(Veterinario iniciadoPor) {
        this.iniciadoPor = iniciadoPor;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;

    public Tratamento(Integer codigo, String descricao, Veterinario iniciadoPor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.iniciadoPor = iniciadoPor;

    }
    

}

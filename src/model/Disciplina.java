package model;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int periodo;
    private Curso curso;

    public Disciplina(String nome, int cargaHoraria, int periodo, Curso curso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.periodo = periodo;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getPeriodo() {
        return periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Período: "+ this.periodo);
    }
}

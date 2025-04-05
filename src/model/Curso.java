package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    protected String nome;
    protected int cargaH;
    protected String codigo;
    private List<Disciplina> disciplinas;

    public Curso(String nome, int cargaH, String codigo){
        this.nome = nome;
        this.cargaH = cargaH;
        this.codigo = codigo;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public int getCargaH(){
        return cargaH;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }else{
            System.out.println("Disciplina já vinculada ao curso");
        }
    }

    public void exibirDisciplinas() {
        System.out.println("Disciplinas do curso " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }
    }
}

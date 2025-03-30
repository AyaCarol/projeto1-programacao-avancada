package model;

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

    public void adicionarDisciplina(Disciplina disciplina) {
        if(disciplinas.contains(disciplina)){
            System.out.println("A disciplina já foi cadastrada ao curso");
        }else{
            disciplinas.add(disciplina);
        }
        
    }

    public void exibirDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada no curso " + nome);
        } else {
            System.out.println("Disciplinas do curso " + nome + ":");
            for (Disciplina d : disciplinas) {
                System.out.println(d);
            }
        }
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

}
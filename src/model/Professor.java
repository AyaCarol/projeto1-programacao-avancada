package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    protected String especialidade;
    private double salario;
    protected List<Curso> cursosLecionados;

    public Professor(String nome, String cpf, int idade, String especialidade, double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.salario = salario;
        this.cursosLecionados = new ArrayList<>();
    }

    public Professor(String nome, String cpf, int idade, String genero, String especialidade, double salario) {
        super(nome, cpf, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Especialidade: "+ this.especialidade);
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    //EXERCICIO 2
    public void atribuirCurso(Curso curso){
        if(cursosLecionados.contains(curso)){
            System.out.println("O professor já está atribuido a este curso.");
        }else{
            cursosLecionados.add(curso);
        }
    }

    public void exibirCursos(){
        if(cursosLecionados.isEmpty()){
            System.out.println("Este professor não está vinculado a nenhum curso");
        }else{
            System.out.println("Cursos Lecionados: ");
            cursosLecionados.stream().forEach(curso-> System.out.println(curso.nome));
        }
        
    }

}

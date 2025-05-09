package service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import model.*;

public class GestorAcademico {
    Map<String, Aluno> alunos;
    List<Professor> professores;
    Map<String, Curso> cursos;

    public GestorAcademico(){
        this.alunos = new HashMap<>();
        this.cursos = new HashMap<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor p){
        professores.add(p);
    }

    public void adicionarAluno(Aluno a){
        alunos.put(a.getMatricula(), a);
    }

    private String gerarMatricula(){
        return ""+(alunos.size()+1);
    }

    public void adicionarAluno(String nome, String cpf, int idade){
        String matricula = gerarMatricula();
        Aluno a = new Aluno(nome, cpf, idade, matricula);
        alunos.put(matricula, a);
    }

    public void adicionarAluno(String nome, String cpf, int idade, String matricula){
        Aluno a = new Aluno(nome, cpf, idade, matricula);
        alunos.put(matricula, a);
    }

    public void adicionarCurso(Curso c){
        cursos.put(c.getCodigo(), c);
    }

    public void matricularAlunoCurso(Aluno a, Curso c){
        Aluno aluno = this.alunos.get(a.getMatricula());
        if(aluno == null){
            System.out.println("Aluno não encontrado");
            return;
        }
        Curso curso = this.cursos.get(c.getCodigo());
        if(curso == null){
            System.out.println("Curso não encontrado");
            return;
        }

        aluno.matricularEmCurso(curso);
        alunos.put(aluno.getMatricula(), aluno);
    }

    public void matricularAlunoCurso(String ra_aluno, String cod_curso){
        Aluno aluno = this.alunos.get(ra_aluno);
        if(aluno == null){
            System.out.println("Aluno não encontrado");
            return;
        }
        Curso curso = this.cursos.get(cod_curso);
        if(curso == null){
            System.out.println("Curso não encontrado");
            return;
        }

        aluno.matricularEmCurso(curso);
        alunos.put(aluno.getMatricula(), aluno);
    }

    public void listarProfessores(){
        System.out.println("Professores: ");
        professores.stream().forEach(professor -> professor.exibirDetalhes());
    }

    public void listarAlunos(){
        System.out.println("Alunos: ");
        alunos.values().stream()
        .forEach(aluno -> aluno.exibirDetalhes());
    }

    public void listarCursos(){
        System.out.println("Cursos: ");
        cursos.values().stream()
        .forEach(curso -> System.out.println(curso.getNome()));
    }

    public void filtrarProfNome(String nome){
        professores.stream()
        .filter(prof -> prof.getNome().contains(nome))
        .forEach(prof -> prof.exibirDetalhes());
    }

    public void filtrarProfEsp(String esp){
        professores.stream()
        .filter(prof -> prof.getEspecialidade().equals(esp))
        .forEach(prof -> prof.exibirDetalhes());
    }

    public void filtrarProf(Predicate<Professor> filter){

        professores.stream()
            .filter(filter)
            .forEach(prof -> prof.exibirDetalhes());

    }

    public void listarAlunosPorCurso(String nomeCurso) {
        alunos.values().stream()
                .filter(aluno -> aluno.getCursosMat().stream()
                        .anyMatch(curso -> curso.getNome().equalsIgnoreCase(nomeCurso)))
                .forEach(aluno -> aluno.exibirDetalhes());
    }

    public int contarAlunosPorCurso(String nomeCurso) {
        return (int) alunos.values().stream()
                .filter(aluno -> aluno.getCursosMat().stream()
                        .anyMatch(curso -> curso.getNome().equalsIgnoreCase(nomeCurso)))
                .count();
    }

}

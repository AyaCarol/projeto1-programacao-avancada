package model;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    protected String matricula;
    protected List<Curso> cursosMat;
    private List<Disciplina> disciplinasMat;


    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.cursosMat = new ArrayList<>();
        this.disciplinasMat = new ArrayList<>();
    }

    public Aluno(String nome, String cpf, int idade, String genero, String matricula) {
        super(nome, cpf, idade, genero);
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matrícula: "+ this.matricula);
        System.out.println("Cursos Matriculados: ");
        cursosMat.stream().forEach(curso-> System.out.println(curso.nome));
    }

    public void matricularEmCurso(Curso curso){
        if(cursosMat.contains(curso)){
            System.out.println("O aluno já está matriculado neste curso");;
        }else{
            cursosMat.add(curso);
        }
    }

    public void desmatricularEmCurso(Curso curso){
        if(cursosMat.contains(curso)){
            cursosMat.remove(curso);
        }else{
            System.out.println("O aluno não está matriculado neste curso.");
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public List<Curso> getCursosMat(){
        return this.cursosMat;
    }

    public void exibirCursosMat(){
        if(this.cursosMat.isEmpty()){
            System.out.println("O aluno não está matriculado neste curso");
        }else{
            System.out.println("Cursos Matriculados:");
            cursosMat.stream().forEach(curso-> System.out.println(curso.nome));
        }
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMat;
    }

    public void matricularCurso(Curso curso) {
        if (!this.cursosMat.contains(curso)) {
            this.cursosMat.add(curso);
        }else{
            System.out.println("Aluno já matriculado neste curso!");
        }
    }

    public void matricularDisciplina(Disciplina disciplina) {
        if (!this.disciplinasMat.contains(disciplina)) {
            this.disciplinasMat.add(disciplina);
        }else{
            System.out.println("Aluno já matriculado nesta disciplina?");
        }
    }

    public void exibirDisciplinasMat() {
        if (disciplinasMat.isEmpty()) {
            System.out.println("O aluno não está matriculado em nenhuma disciplina.");
        } else {
            System.out.println("Disciplinas matriculadas por " + this.nome + ":");
            for (Disciplina d : disciplinasMat) {
                System.out.println("- " + d.getNome());
            }
        }
    }

}

package model;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    protected String matricula;
    protected List<Curso> cursosMat = new ArrayList<>();
    private List<Disciplina> disciplinasMat;


    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public Aluno(String nome, String cpf, int idade, String genero, String matricula) {
        super(nome, cpf, idade, genero);
        this.matricula = matricula;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
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

    public List<Curso> getCursosMatriculados() {
        return cursosMat;
    }

    public void exibirCursosMat(){
        if(cursosMat.isEmpty()){
            System.out.println("O aluno não está matriculado neste curso");
        }else{
            System.out.println("Cursos Matriculados:");
            for (Curso c : cursosMat) {
                System.out.println(c);
            }
        }
    }

    public void matricularDisciplina(Disciplina disciplina) {
        if (cursosMat.contains(disciplina.getCurso().getNome())) {
            disciplinasMat.add(disciplina);
            System.out.println("Aluno " + nome + " matriculado na disciplina " + disciplina.getNome());
        } else {
            System.out.println("Erro: O aluno " + nome + " não está matriculado no curso da disciplina " + disciplina.getNome());
        }
    }

    public void exibirDisciplinasMatriculadas() {
        if (disciplinasMat.isEmpty()) {
            System.out.println("O aluno não está matriculado em nenhuma disciplina.");
        } else {
            System.out.println("Disciplinas matriculadas:");
            for (Disciplina d : disciplinasMat) {
                System.out.println(d);
            }
        }
    }

}
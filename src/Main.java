
import java.util.Scanner;
import model.Curso;
import model.Disciplina;
import model.Professor;
import model.Aluno;
import service.GestorAcademico;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        GestorAcademico gestorAcademico = new GestorAcademico();

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Listar Alunos");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Listar Professores");
            System.out.println("4. Cadastrar Aluno");
            System.out.println("5. Cadastrar Curso");
            System.out.println("6. Cadastrar Professor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    gestorAcademico.listarAlunos();
                    break;
                case 2:
                    gestorAcademico.listarCursos();
                    break;

                case 3:
                    gestorAcademico.listarProfessores();
                    break;
                
                case 4:
                    System.out.println("Cadastro de Aluno");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("RA: ");
                    String matricula = scanner.nextLine();

                    System.out.println("Código do curso: ");
                    String cod_curso = scanner.nextLine();

                    gestorAcademico.adicionarAluno(nome, cpf, idade, matricula);

                    gestorAcademico.matricularAlunoCurso(matricula, cod_curso);

                    break;

                case 5:
                    System.out.print("Nome do Curso: ");
                    String nomeCurso = scanner.nextLine();
                    System.out.print("Carga Horária: ");
                    int cargaHoraria = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Código do Curso: ");
                    String codigoCurso = scanner.nextLine();
                    Curso novoCurso = new Curso(nomeCurso, cargaHoraria, codigoCurso);
                    gestorAcademico.adicionarCurso(novoCurso);
                    break;
                case 6:
                    System.out.print("Nome do Professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("CPF do Professor: ");
                    String cpfProfessor = scanner.nextLine();
                    System.out.print("Idade do Professor: ");
                    int idadeProfessor = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Matrícula do Professor: ");
                    String matriculaProfessor = scanner.nextLine();
                    System.out.print("Especialidade do Professor: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Salário do Professor: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha
                    Professor novoProfessor = new Professor(nomeProfessor, cpfProfessor, idadeProfessor, matriculaProfessor, especialidade, salario);
                    gestorAcademico.adicionarProfessor(novoProfessor);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    throw new AssertionError();
            }

        // ==================== TESTES DOS EXERCICIOS ====================
        
        // ====== EXERCICIO 1 ======
        
        Aluno a1 = new Aluno("Joao", "1112223334", 25, "1234");
        Aluno a2 = new Aluno("Ana", "1234567890", 20, "232114542");
        Curso adsis = new Curso("Análise de Sistemas", 100, "123224");
        Curso engSoft = new Curso("Engenharia de Software", 150, "111222");

        a2.matricularEmCurso(adsis);
        a2.matricularEmCurso(engSoft);

        a2.desmatricularEmCurso(engSoft);
        
        a2.exibirCursosMat();

        // ====== EXERCICIO 2 ======
        
        Professor p1 = new Professor("José", "111111", 30, "Programação Frontend", 1000.0);
        p1.atribuirCurso(adsis);
        p1.exibirCursos();
        
        // ====== EXERCICIO 3 ======
        
        Aluno a3 = new Aluno("Maria", "33322211143", 32, "1231231232");
        a1.matricularEmCurso(adsis);
        a3.matricularEmCurso(adsis);

        GestorAcademico gestor = new GestorAcademico();
        gestor.listarAlunosPorCurso("Análise de Sistemas");
        gestor.contarAlunosPorCurso("Análise e Desenvolvimento de Sistemas");

        // ====== EXERCICIO 4 ======
        
        Disciplina frontEnd = new Disciplina("Programação Front end", 30, 3, adsis);
        Disciplina estruturaDD = new Disciplina("Estrutura de Dados", 40, 3, adsis);
        adsis.adicionarDisciplina(frontEnd);
        adsis.adicionarDisciplina(estruturaDD);

        a1.matricularDisciplina(frontEnd);
        a1.matricularDisciplina(estruturaDD);

        a1.exibirDisciplinasMatriculadas();

        }
    }
}
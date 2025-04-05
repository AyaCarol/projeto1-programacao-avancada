
import java.util.Scanner;
import model.Curso;
import model.Disciplina;
import model.Professor;
import model.Aluno;
import service.GestorAcademico;
import java.util.InputMismatchException;

public class App {
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
                     try {
                        System.out.println("Cadastro de Aluno");
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        if (!nome.matches("[a-zA-Z\\s]+")) throw new IllegalArgumentException("Nome deve conter apenas letras.");
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        if (!cpf.matches("\\d+")) throw new IllegalArgumentException("CPF deve conter apenas números.");
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("RA: ");
                        String matricula = scanner.nextLine();
                        System.out.print("Código do curso: ");
                        String cod_curso = scanner.nextLine();
                        gestorAcademico.adicionarAluno(nome, cpf, idade, matricula);
                        gestorAcademico.matricularAlunoCurso(matricula, cod_curso);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Valor inválido digitado. Tente novamente.");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.print("Nome do Curso: ");
                        String nomeCurso = scanner.nextLine();
                        if (!nomeCurso.matches("[a-zA-Z\\s]+")) throw new IllegalArgumentException("O nome do curso deve conter apenas letras.");
                        System.out.print("Carga Horária: ");
                        int cargaHoraria = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Código do Curso: ");
                        String codigoCurso = scanner.nextLine();
                        Curso novoCurso = new Curso(nomeCurso, cargaHoraria, codigoCurso);
                        gestorAcademico.adicionarCurso(novoCurso);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite apenas números para carga horária.");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                    
                case 6:
                    try {
                        System.out.print("Nome do Professor: ");
                        String nomeProfessor = scanner.nextLine();
                        if (!nomeProfessor.matches("[a-zA-Z\\s]+")) throw new IllegalArgumentException("Nome deve conter apenas letras.");
                        System.out.print("CPF do Professor: ");
                        String cpfProfessor = scanner.nextLine();
                        if (!cpfProfessor.matches("\\d+")) throw new IllegalArgumentException("CPF deve conter apenas números.");
                        System.out.print("Idade do Professor: ");
                        int idadeProfessor = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Matrícula do Professor: ");
                        String matriculaProfessor = scanner.nextLine();
                        System.out.print("Especialidade do Professor: ");
                        String especialidade = scanner.nextLine();
                        System.out.print("Salário do Professor: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        Professor novoProfessor = new Professor(nomeProfessor, cpfProfessor, idadeProfessor, matriculaProfessor, especialidade, salario);
                        gestorAcademico.adicionarProfessor(novoProfessor);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Verifique se digitou corretamente idade ou salário.");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    throw new AssertionError();
            }
        }
        
        //====== TESTES EXERCICIO 1 ======
        /* 
        Aluno a1 = new Aluno("Joao", "1112223334", 25, "1234");
        Aluno a2 = new Aluno("Ana", "1234567890", 20, "232114542");
        Curso adsis = new Curso("Análise de Sistemas", 100, "123224");
        Curso engSoft = new Curso("Engenharia de Software", 150, "111222");
        Curso engComp = new Curso("Engenharia da Computação", 200, "11233211");

        a2.matricularEmCurso(adsis);
        a2.matricularEmCurso(engSoft);
        a2.matricularEmCurso(engComp);

        a2.desmatricularEmCurso(engSoft);
        a2.exibirCursosMat();
        */

        
        // ====== TESTES EXERCICIO 2 ======
        /* 
        Professor p1 = new Professor("José", "111111", 30, "Programação Frontend", 1000.0);
        p1.atribuirCurso(adsis);
        p1.atribuirCurso(engSoft);
        p1.exibirCursos();
        */

        // ====== TESTES EXERCICIO 3 ======
        /* 
        Aluno a3 = new Aluno("Maria", "33322211143", 32, "1231231232");
        a1.matricularEmCurso(adsis);
        a3.matricularEmCurso(adsis);

        GestorAcademico gestor = new GestorAcademico();

        gestor.adicionarAluno(a1);
        gestor.adicionarAluno(a2);
        gestor.adicionarAluno(a3);

        gestor.listarAlunosPorCurso("Análise de Sistemas");
        int totalAlunosADSIS = gestor.contarAlunosPorCurso("Análise de Sistemas");
        System.out.println("\nTotal de alunos no curso de ADSIS: " + totalAlunosADSIS);
        */

        // ====== TESTES EXERCICIO 4 ======
        /* 
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", 80, 2, adsis);
        Disciplina bancoDados = new Disciplina("Banco de Dados", 60, 2, adsis);
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados", 60, 3, adsis);

        adsis.adicionarDisciplina(poo);
        adsis.adicionarDisciplina(bancoDados);
        adsis.adicionarDisciplina(estruturaDados);

        adsis.exibirDisciplinas();

        a1.matricularDisciplina(poo);
        a1.matricularDisciplina(bancoDados);

        a1.exibirDisciplinasMat();
        */

    }
}

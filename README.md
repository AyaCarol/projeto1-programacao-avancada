## Projeto Prático de Programação Avançada

Este é o nosso repositório para a avaliação do primeiro bimestre de Programação Avançada! Nossa dupla é:
- Ana Carolina Gomes da Silva 23211454-2
- Emily Grzgorczyki 23034936-2

## Estrutura do trabalho

Nosso trabalho consta com um menu aprimorado com tratamento de erros de input de usuário, entretanto, os testes constados nos resquisitos do trabalho estão comentados ao final da classe MAIN!

Mesmo assim, segue abaixo para observar os resultados:

### Exercício 1: Implementar a Remoção de Cursos para um Aluno

- `Objetivo:` Adicionar funcionalidade para um aluno remover um curso ao qual está
    matriculado.
- `Tarefa:`
    - Adicione um método desmatricularCurso(String nomeCurso) na classe Aluno.
    - Esse método deve remover o curso da lista de cursos matriculados.
    - - No Main, teste a funcionalidade matriculando um aluno em dois cursos e depois removendo
    um deles.
  
  ![image](https://github.com/user-attachments/assets/77f25e99-7147-47a8-a6ea-1d0d1b1071c6)
  
  ![image](https://github.com/user-attachments/assets/636ad4b3-7c84-40ff-a62d-aa0dc6210b96)

- `Resultado:`
  ![image](https://github.com/user-attachments/assets/5974cf35-8356-471f-80ee-9bf1e098a98a)

### Exercício 2: Relatório de Professores e Seus Cursos

- `Objetivo`: Criar uma funcionalidade que relacione professores e os cursos que eles lecionam.
- `Tarefa`:
    - Adicione uma lista de cursos na classe Professor para armazenar os cursos que ele leciona.
    - Crie um método atribuirCurso(Curso curso) para associar um professor a um curso.
    - Adicione um método exibirCursos() que liste os cursos que ele ministra.
    - No Main, associe um professor a pelo menos dois cursos e exiba as informações.

  ![image](https://github.com/user-attachments/assets/298ea763-52bc-4d2e-abfc-42fd21801541)
    
  ![image](https://github.com/user-attachments/assets/6fb94428-3c50-401b-9d3b-39da5971824b)

- `Resultado:`
  ![image](https://github.com/user-attachments/assets/a6db2fc5-bcfa-432c-8b6c-6ea7eb5f4667)

### Exercício 3: Contar e Filtrar Alunos Matriculados em um Curso Específico
- `Objetivo:` Usar Streams para contar e listar alunos matriculados em um
determinado curso.
- `Tarefa:`
    - No GestorAcademico, adicione um método listarAlunosPorCurso(String nomeCurso) que:
    - Filtra os alunos que estão matriculados no curso informado.
    - Retorna a lista desses alunos.
    - Crie um método contarAlunosPorCurso(String nomeCurso), que retorna o número total de
    alunos matriculados no curso.
    - No Main, teste listando alunos de um curso específico e exibindo a contagem.

  ![image](https://github.com/user-attachments/assets/f05cf9e3-8ff2-4b67-84f3-292e8a483f17)

  ![image](https://github.com/user-attachments/assets/bfed7965-8b85-445a-a2e5-7ad855173991)

- `Resultado:`
  ![image](https://github.com/user-attachments/assets/ab81b064-1262-4889-a89f-de112ba3db0d)

### Exercício 4: Criar a Classe Disciplina e Relacioná-la com Aluno e Curso
1. Criar a classe Disciplina com os seguintes atributos:
    - nome (String) → Nome da disciplina
    - cargaHoraria (int) → Carga horária da disciplina em horas
    - periodo (int) → Período recomendado da disciplina
    - curso (Curso) → Curso ao qual a disciplina pertence
2. Modificar a classe Aluno para permitir a matrícula em disciplinas:
    - Adicionar um atributo disciplinasMatriculadas, que será uma lista de disciplinas.
    - Criar um método matricularDisciplina(Disciplina disciplina), que adiciona a disciplina à lista.
    - Criar um método exibirDisciplinasMatriculadas(), que lista todas as disciplinas do aluno.
3. Criar a relação entre Curso e Disciplina:
    - Adicionar um atributo disciplinas na classe Curso, que será uma lista de disciplinas.
    - Criar um método adicionarDisciplina(Disciplina disciplina), que vincula a disciplina ao curso.
    - Criar um método exibirDisciplinas(), que exibe todas as disciplinas do curso.
4. Testar no Main:
    - Criar um curso.
    - Criar algumas disciplinas vinculadas ao curso.
    - Criar um aluno e matriculá-lo em algumas disciplinas.
    - Exibir as disciplinas matriculadas do aluno

   ![image](https://github.com/user-attachments/assets/3c688eed-f0e8-40ea-a173-e288982a0eb2)
   ![image](https://github.com/user-attachments/assets/02811901-dcde-41a5-9a48-23f92be3ef90)
   ![image](https://github.com/user-attachments/assets/62a70945-639d-42a4-9092-1c8e9dd19240)
   ![image](https://github.com/user-attachments/assets/a6f31484-dc7b-468c-8788-e0b8a58d5cac)

- `Resultado:`
  ![image](https://github.com/user-attachments/assets/ff488462-b07d-4fa5-844b-ad4d8be542cc)


   



  



  



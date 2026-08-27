package pkg27.pkg08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    Scanner sc = new Scanner(System.in);
    List<Aluno> Percy = new ArrayList<>();

    public void met1() {
        while (true) {
            System.out.println("Digite o nome do Aluno (ou 'fim' para encerrar):");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a primeira nota parcial do Aluno (0 a 100):");
            int NotaP1 = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int NotaP2 = Integer.parseInt(sc.nextLine());

            Percy.add(new Aluno(nome, NotaP1, NotaP2));
            System.out.println("Aluno cadastrado com sucesso!\n");
        }
    }

    public void met2() {
        if (Percy.isEmpty()) {
            System.out.println("A lista está vazia, não há alunos para remover.");
            return;
        }
        
        System.out.println("Informe o índice que gostaria de remover (0 a " + (Percy.size() - 1) + "):");
        int indice = Integer.parseInt(sc.nextLine());
        
        if (indice >= 0 && indice < Percy.size()) {
            Percy.remove(indice);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void gerarRelatorio() {
        if (Percy.isEmpty()) {
            System.out.println("\nNenhum aluno foi cadastrado.");
            return;
        }

        double somaMediasTurma = 0;
        int aprovados = 0;
        int finalistas = 0;
        int reprovados = 0;

        for (Aluno aluno : Percy) {
            double mediaAluno = aluno.calcularMedia();
            somaMediasTurma += mediaAluno;

            if (mediaAluno >= 70) {
                aprovados++;
            } else if (mediaAluno >= 40) {
                finalistas++;
            } else {
                reprovados++;
            }
        }

        double mediaTurma = somaMediasTurma / Percy.size();

        System.out.println("\n--- RELATÓRIO DA TURMA ---");
        System.out.printf("Média da turma: %.2f\n", mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos para a final: " + finalistas);
        System.out.println("Alunos reprovados: " + reprovados);

        System.out.println("\nAlunos com média abaixo da média da turma:");
        boolean encontrou = false;
        for (Aluno aluno : Percy) {
            if (aluno.calcularMedia() < mediaTurma) {
                System.out.println("- " + aluno.getnome() + " (Média: " + aluno.calcularMedia() + ")");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum aluno ficou com a média abaixo da média da turma.");
        }
    }

    public static void main(String[] args) {
        Controle controle = new Controle();
        

        controle.met1(); 

        
        controle.gerarRelatorio(); 
        
        controle.sc.close();
    }
}
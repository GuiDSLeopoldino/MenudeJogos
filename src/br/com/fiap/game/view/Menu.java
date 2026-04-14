package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {
    static void main() {

        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int op;

        do{
            IO.println("Selecione a opção desejada: \n" +
                    "1- Cadastrar:  \n"  +
                    "2- Exibir Personagem: \n" +
                    "3- Atacar: \n " +
                    "4- Aumentar Energia: \n " +
                    "5- Ativar habilidade Especial: \n " +
                    "6- Habilitar a habilidade Especial: \n " +
                    "0- Sair: \n");
            op = sc.nextInt();

            switch(op){
                case 1:
                    IO.println("Digite o nome do Personagem: ");
                    String nome = sc.next() + sc.nextLine();

                    IO.println("Digite o poder do Personagem: ");
                    String poderMagico = sc.next() + sc.nextLine();

                    IO.println("Digite o nivel energia: ");
                    int Energia = sc.nextInt();

                    personagem.nome = nome;
                    personagem.poderMagico = poderMagico;         //este bloco estabelece os atributos do objeto acabado de ser criado no caso personagem
                    personagem.nivelEnergia = Energia;


                    IO.println("Digite o nome da Habilidade Especial: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();

                    IO.println("Digite o custo de energia para realizar a habilidade especial : ");
                    int nivelEnergia = sc.nextInt();

                    IO.println("A habilidade está ativada? (true/false): ");
                    boolean ativada = sc.nextBoolean();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, nivelEnergia, ativada);
                    personagem.habilidadeEspecial = habilidadeEspecial;
                    break;

                case 2:
                    IO.println("Nome: " + personagem.nome + " \n Energia: " + personagem.nivelEnergia + " \n Poder: " + personagem.poderMagico + "Habilidade: "+ personagem.habilidadeEspecial.nome + "Custo energia: " + personagem.habilidadeEspecial.custoEnergia + "Habilitado: " + personagem.habilidadeEspecial.habilitada);
                    break;

                case 3:
                    IO.println("Digite o nome do ataque que deseja usar: ");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;

                case 4:
                    IO.println("Digite quanto de energia quer recarregar");
                    int qtd = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(qtd);
                    IO.println("Nivel atual de energia:" + nivelAtual);
                    break;

                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;

                case 6:
                    personagem.habilidadeEspecial.ativarHabilidade();
                    break;

                case 0:
                    IO.println("Programa finalizado");

                default:
                    IO.println("Opção Inválida");
            }

        }while (op != 0);

        sc.close();
    }
}

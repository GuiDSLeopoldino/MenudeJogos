import java.util.Scanner;

public class ItemView {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Item item = new Item();
        int opcao;


        do {
            IO.println("Selecione a opção desejada: \n" +
                    "1- Cadastrar Item:  \n"  +
                    "2- Exibir Item: \n" +
                    "3- Sair: \n ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    IO.println("Digite o nome do Item: ");
                    String nome = sc.next() + sc.nextLine();
                    IO.println("Digite a descrição do item: ");
                    String descricao = sc.next() + sc.nextLine();
                    IO.println("Digite True se o item for raro ou false para o contrário: ");
                    Boolean raro = sc.nextBoolean();
                    IO.println("Digite o nível de poder do Item: ");
                    int nivelPoder = sc.nextInt();

                    item.nome = nome;
                    item.descricao = descricao;
                    item.raro = raro;
                    item.nivelPoder = nivelPoder;
                    break;

                case 2:
                    IO.println("A descrição desse item é:" + item.nome + "\n" + item.descricao + "\n" + "Raro? \n" + item.raro + "Nivel de poder: " + item.nivelPoder);
                    break;

                case 3:
                    IO.println("Sistema finalizando...");

                default:
                    IO.println("Opção inválida, Tente novamente!");
                    break;


            }
        }while (opcao != 0);

        sc.close();
    }
}

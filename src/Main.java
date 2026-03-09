import java.util.Scanner;

class Pet { // Classe que representa um pet disponível para adoção ou resgate, com atributos como ID, espécie, porte, estado de saúde e situação (para adoção ou para resgate)
    int id;
    String especie;
    String porte;
    String estado;
    String situacao;

    Pet(int id, String especie, String porte, String estado, String situacao) { 
        this.id = id;
        this.especie = especie;
        this.porte = porte;
        this.estado = estado;
        this.situacao = situacao;
    }
}

class Usuario { // Classe que representa um usuário do sistema, com atributos como nome, telefone, cidade, bairro, número e tipo (doador ou adotante)
    String nome;
    String telefone;
    String cidade;
    String bairro;
    String numero;
    String tipo;

    Usuario(String nome, String telefone, String cidade, String bairro, String numero, String tipo) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.tipo = tipo;
    }
}

class Resgate {  // Classe que representa um pedido de resgate de um animal, com atributos como local e descrição do animal a ser resgatado
    String local;
    String descricao;

    Resgate(String local, String descricao) { 
        this.local = local;
        this.descricao = descricao;
    }
}

class SistemaDelivery { // Classe que representa o sistema de delivery de pets para adoção, contendo métodos para cadastrar usuários, cadastrar pets, listar pets, adotar pets, registrar pedidos de resgate e listar pedidos de resgate

    Pet[] pets = new Pet[50];
    Resgate[] resgates = new Resgate[50];

    int totalPets = 0;
    int totalResgates = 0;

    void cadastrarUsuario(Usuario usuario) { // Método para cadastrar um usuário no sistema, recebendo um objeto do tipo Usuario como parâmetro e adicionando-o à lista de usuários cadastrados no sistema

        System.out.println("\nUsuário cadastrado com sucesso!"); 
        System.out.println("Nome: " + usuario.nome);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Cidade: " + usuario.cidade);
        System.out.println("Bairro: " + usuario.bairro);
        System.out.println("Número: " + usuario.numero);
        System.out.println("Tipo: " + usuario.tipo);
    }

    void cadastrarPet(Pet pet) { // Método para cadastrar um pet no sistema, recebendo um objeto do tipo Pet como parâmetro e adicionando-o à lista de pets disponíveis para adoção ou resgate

        pets[totalPets] = pet;
        totalPets++;

        System.out.println("\nPet cadastrado com sucesso!");
        System.out.println("ID: " + pet.id);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Porte: " + pet.porte);
        System.out.println("Estado de saúde: " + pet.estado);
        System.out.println("Situação: " + pet.situacao);
    }

    void listarPets() { // Método para listar os pets cadastrados no sistema, exibindo suas informações como ID, espécie, porte, estado de saúde e situação (para adoção ou para resgate)

        System.out.println("\n=== LISTA DE PETS CADASTRADOS ==="); 

        if (totalPets == 0) {
            System.out.println("Nenhum pet cadastrado.");
        }

        for (int i = 0; i < totalPets; i++) {

            System.out.println("\nID: " + pets[i].id);
            System.out.println("Espécie: " + pets[i].especie);
            System.out.println("Porte: " + pets[i].porte);
            System.out.println("Estado: " + pets[i].estado);
            System.out.println("Situação: " + pets[i].situacao);
        }
    }

    void adotarPet(String nomeUsuario, int idPet, String dataRetirada) { // Método para adotar um pet, recebendo o nome do usuário que irá adotar, o ID do pet que deseja adotar e a data de retirada escolhida pelo usuário, e registrando a adoção no sistema

        System.out.println("\nAdoção registrada!");
        System.out.println("Usuário: " + nomeUsuario);
        System.out.println("Pet ID: " + idPet);
        System.out.println("Data de retirada escolhida: " + dataRetirada);
    }

    void registrarResgate(Resgate resgate) {  // Método para registrar um pedido de resgate de um animal, recebendo um objeto do tipo Resgate como parâmetro e adicionando-o à lista de pedidos de resgate registrados no sistema

        resgates[totalResgates] = resgate;
        totalResgates++;

        System.out.println("\nPedido de resgate registrado!");
        System.out.println("Local: " + resgate.local);
        System.out.println("Descrição: " + resgate.descricao);
    }

    void listarResgates() { // Método para listar os pedidos de resgate registrados no sistema, exibindo suas informações como local e descrição do animal a ser resgatado

        System.out.println("\n=== LISTA DE PEDIDOS DE RESGATE ===");

        if (totalResgates == 0) {
            System.out.println("Nenhum pedido de resgate.");
        }

        for (int i = 0; i < totalResgates; i++) {

            System.out.println("\nLocal: " + resgates[i].local);
            System.out.println("Descrição: " + resgates[i].descricao);
        }
    }
}

public class Main { 

    public static void main(String[] args) { // Método principal da classe Main, onde é criado um objeto do tipo Scanner para ler as entradas do usuário e um objeto do tipo SistemaDelivery para gerenciar as funcionalidades do sistema de delivery de pets para adoção, e onde é implementado um loop para exibir o menu de opções e executar as ações correspondentes às escolhas do usuário até que ele escolha a opção de sair do sistema

        Scanner scanner = new Scanner(System.in);
        SistemaDelivery sistema = new SistemaDelivery();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n=== PETS RESCURE ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Pet");
            System.out.println("3 - Adotar Pet");
            System.out.println("4 - Solicitar Resgate Animal");
            System.out.println("5 - Listar Pets");
            System.out.println("6 - Listar Pedidos de Resgate");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.println("\nNome:");
                String nome = scanner.nextLine();

                System.out.println("Telefone:");
                String telefone = scanner.nextLine();

                System.out.println("Cidade:");
                String cidade = scanner.nextLine();

                System.out.println("Bairro:");
                String bairro = scanner.nextLine();

                System.out.println("Número:");
                String numero = scanner.nextLine();

                System.out.println("Tipo (Doador ou Adotante):");
                String tipo = scanner.nextLine();

                Usuario usuario = new Usuario(nome, telefone, cidade, bairro, numero, tipo);
                sistema.cadastrarUsuario(usuario);

            }

            else if (opcao == 2) {

                System.out.println("\nCrie um ID para o pet:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Espécie:");
                String especie = scanner.nextLine();

                System.out.println("Porte:");
                String porte = scanner.nextLine();

                System.out.println("Estado de saúde:");
                String estado = scanner.nextLine();

                System.out.println("Situação:");
                System.out.println("1 - Para adoção");
                System.out.println("2 - Para resgate");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                String situacao;

                if (escolha == 1) {
                    situacao = "Para adoção";
                } else if (escolha == 2) {
                    situacao = "Para resgate";
                } else {
                    situacao = "Indefinido";
                }

                Pet pet = new Pet(id, especie, porte, estado, situacao);
                sistema.cadastrarPet(pet);
            }

            else if (opcao == 3) {

                System.out.println("\nNome do usuário que irá adotar:");
                String nomeUsuario = scanner.nextLine();

                System.out.println("ID do pet que deseja adotar:");
                int idPet = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Escolha a data de retirada do pet:");
                String data = scanner.nextLine();

                sistema.adotarPet(nomeUsuario, idPet, data);
            }

            else if (opcao == 4) {

                System.out.println("\nLocal do animal:");
                String local = scanner.nextLine();

                System.out.println("Descrição do animal:");
                String descricao = scanner.nextLine();

                Resgate resgate = new Resgate(local, descricao);
                sistema.registrarResgate(resgate);
            }

            else if (opcao == 5) {

                sistema.listarPets();
            }

            else if (opcao == 6) {

                sistema.listarResgates();
            }

            else if (opcao == 7) {

                System.out.println("\nEncerrando sistema...");
            }

            else {

                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}

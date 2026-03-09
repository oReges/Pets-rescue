package service; // Pacote onde estão localizadas as classes de serviço do sistema, responsáveis por implementar a lógica de negócios e as funcionalidades do sistema de delivery de pets para adoção

import java.util.ArrayList; // Importa a classe ArrayList para utilizar listas dinâmicas no sistema
import java.util.List; // Importa a classe List para utilizar listas no sistema

import model.Acolhimento;
import model.AgendamentoRetirada;
import model.Entrega;
import model.Usuario;
import model.Pet;

public class SistemaDelivery {

    
        private List<Usuario> usuarios = new ArrayList<>(); // Lista de usuários cadastrados no sistema
        private List<Pet> pets = new ArrayList<>(); // Lista de pets disponíveis para adoção
        private List<Acolhimento> acolhimentos = new ArrayList<>(); // Lista de pedidos de acolhimento de pets feitos por usuários
        private List<AgendamentoRetirada> agendamentos = new ArrayList<>(); // Lista de agendamentos de retirada de pets para adoção
        private List<Entrega> entregas = new ArrayList<>(); // Lista de entregas de pets para adotantes

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario); // Adiciona um novo usuário à lista de usuários cadastrados no sistema

        usuarios.add(new Usuario(1, "João Silva", "11987654321", "São Paulo", "Doador")); // Exemplo de cadastro de um usuário do tipo "Doador" com informações fictícias
     
        System.out.println("Usuário cadastrado com sucesso!" + usuario.getNome()); // Exibe uma mensagem de confirmação do cadastro do usuário, mostrando o nome do usuário cadastrado
    }

    public void cadastrar_Pet(Pet pet) {
        pets.add(pet); // Adiciona um novo pet à lista de pets disponíveis para adoção

        System.out.println("Pet cadastrado com sucesso!"); // Exibe uma mensagem de confirmação do cadastro do pet
    }

    public void criar_Acolhimento(Acolhimento acolhimento) {
        acolhimentos.add(acolhimento); // Adiciona um novo pedido de acolhimento à lista de pedidos de acolhimento feitos por usuários

        System.out.println("Pedido de acolhimento criado com sucesso!" + acolhimento.getSolicitante().getNome()); // Exibe uma mensagem de confirmação da criação do pedido de acolhimento, mostrando o nome do usuário que solicitou o acolhimento
    }

    public void Encontrou_um_novo_lar(Acolhimento acolhimento) {
        acolhimento.setStatus("Aprovado"); // Altera o status do pedido de acolhimento para "Aprovado", indicando que o pedido foi aprovado e o pet está sendo acolhido

        System.out.println("Pedido de acolhimento aprovado!" + acolhimento.getSolicitante().getNome()); // Exibe uma mensagem de confirmação da aprovação do pedido de acolhimento, mostrando o nome do usuário que solicitou o acolhimento
    }

    public void Agendar_Retirada(AgendamentoRetirada agendamento) {
        agendamentos.add(agendamento); // Adiciona um novo agendamento de retirada à lista de agendamentos de retirada de pets para adoção

        System.out.println("Agendamento de retirada criado com sucesso!" + agendamento.getAdotante().getNome()); // Exibe uma mensagem de confirmação da criação do agendamento de retirada, mostrando o nome do usuário que está adotando o pet
    }

    public void Novo_lar (Entrega entrega) {
        entregas.add(entrega); // Adiciona uma nova entrega à lista de entregas de pets para adotantes

        System.out.println("Entrega realizada com sucesso!" + entrega.getAdotante().getNome()); // Exibe uma mensagem de confirmação da realização da entrega, mostrando o nome do usuário que está adotando o pet
    }
}
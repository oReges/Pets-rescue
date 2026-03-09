package model;

import java.time.LocalDateTime;

public class AgendamentoRetirada { // Classe que representa um agendamento de retirada de um pet para adoção
    
    private int id;
    private Usuario adotante; // Usuário que está adotando o pet
    private Pet pet; // Pet que está sendo agendado para retirada
    private LocalDateTime horario; // Data e hora agendada para a retirada do pet
    private String local; // Local onde o pet será retirado
    private String status; // "Pendente", "Confirmado", "Cancelado"

}

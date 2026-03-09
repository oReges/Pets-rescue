package model;
 
import java.time.LocalDateTime;

public class Entrega { // Classe que representa uma entrega de um pet para um adotante
    
    private int id;
    private Usuario doador; // Usuário que está doando o pet
    private Usuario adotante; // Usuário que está adotando o pet
    private Pet pet; // Pet que está sendo entregue
    private String status; // "Pendente", "Em andamento", "Concluída"
    private LocalDateTime dataEntrega; // Data e hora da entrega do pet

}
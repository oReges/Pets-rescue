package model;

public class Acolhimento { // Classe que representa um pedido de acolhimento de um pet
    
    private int id;
    private Usuario solicitante; // Usuário que está solicitando o acolhimento do pet
    private Pet pet; // Pet que está sendo solicitado para acolhimento
    private String local; // Local onde o pet está localizado para acolhimento
    private String status; // "Procurando", "Aprovado", "Rejeitado"


    public Acolhimento(int id, Usuario solicitante, Pet pet, String local, String status) {
        this.id = id; // ID do pedido de acolhimento
        this.solicitante = solicitante;  // Usuário que está solicitando o acolhimento do pet
        this.pet = pet; // Pet que está sendo solicitado para acolhimento
        this.local = local; // Local onde o pet está localizado para acolhimento
        this.status = status; // Status do pedido de acolhimento ("Procurando", "Aprovado", "Rejeitado")

    }

        public Usuario getSolicitante() {
            return solicitante; // Retorna o usuário que está solicitando o acolhimento do pet
        }
}

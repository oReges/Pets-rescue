package model;

public class Pet { // Classe que representa um pet disponível para adoção ou resgate
    
    private int id;
    private String especie; // "Cachorro", "Gato", etc.
    private String porte; // "Pequeno", "Médio", "Grande"
    private String estado; // "Saudável", "Doente", etc.
    private String situacao; // "Para adoção", "Para Resgate"

    public Pet(int id, String especie, String porte, String estado, String situacao) {
        this.id = id;
        this.especie = especie; // Espécie do pet (ex: "Cachorro", "Gato", etc.)
        this.porte = porte; // Porte do pet ("Pequeno", "Médio", "Grande")
        this.estado = estado; // Estado de saúde do pet ("Saudável", "Doente", etc.)
        this.situacao = situacao; // Situação do pet ("Para adoção", "Para Resgate")
    }

    public String getEspecie() {
        return especie; // Retorna a espécie do pet (ex: "Cachorro", "Gato", etc.)
    }
}

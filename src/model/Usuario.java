package model;

public class Usuario { // Classe que representa um usuário do sistema, seja ele um doador ou adotante
    
    private int id; // ID único do usuário, pode ser usado para identificação e correspondência de pets disponíveis para adoção ou resgate
    private String nome; // Nome do usuário
    private String telefone; // Número de telefone do usuário para contato
    private String cidade; // Cidade onde o usuário está localizado, importante para correspondência de pets disponíveis para adoção ou resgate
    private String tipo; // "Doador" ou "Adotante"

    public Usuario(int id, String nome, String telefone, String cidade, String tipo) {
        this.id = id; // ID único do usuário, pode ser usado para identificação e correspondência de pets disponíveis para adoção ou resgate
        this.nome = nome; // Nome do usuário
        this.telefone = telefone; // Número de telefone do usuário para contato
        this.cidade = cidade; // Cidade onde o usuário está localizado, importante para correspondência de pets disponíveis para adoção ou resgate
        this.tipo = tipo; // Tipo do usuário, pode ser "Doador" ou "Adotante", importante para diferenciar as funcionalidades disponíveis para cada tipo de usuário no sistema
    }

    public String getNome() {
        return nome; // Retorna o nome do usuário, importante para exibição e identificação do usuário no sistema
    }
}

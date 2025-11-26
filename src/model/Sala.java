/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 3mysi
 */
public class Sala {
    private int numero;
    private int capacidade;
    private int id;

    // Construtor com id
    public Sala(int id, int numero, int capacidade) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
    }

    // Construtor sem id
    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    // getNome necessário para o GerenciadorSalas
    public String getNome() {
        return "Sala " + numero;
    }

    // toString atualizado
    @Override
    public String toString() {
        return "Sala: " +
               (id != 0 ? "id=" + id + ", " : "") +
               "numero=" + numero +
               ", capacidade=" + capacidade + '.';
    }
}

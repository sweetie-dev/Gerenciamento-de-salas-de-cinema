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

    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala: " +
                "numero=" + numero +
                ", capacidade=" + capacidade +
                '.';
    }
}

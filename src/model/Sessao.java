/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 3mysi
 */
public class Sessao {
    private int id;
    private String horario;
    private Filme filme;
    private Sala sala;

    // Construtor com id
    public Sessao(int id, String horario, Filme filme, Sala sala) {
        this.id = id;
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
    }

    // Construtor sem id
    public Sessao(String horario, Filme filme, Sala sala) {
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }
    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }

    // toString atualizado
    @Override
    public String toString() {
        return "Sessao{" +
               (id != 0 ? "id=" + id + ", " : "") +
               "horario='" + horario + '\'' +
               ", filme=" + filme +
               ", sala=" + sala +
               '}';
    }
}

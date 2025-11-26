/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 3mysi
 */
public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private int id;


    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public String getNome() {
        return titulo;
    }
    @Override
    public String toString() {
    return "Filme: " +
        "titulo='" + titulo + '\'' +
        ", genero='" + genero + '\'' +
        ", duracao=" + duracao +
        ' ';
    }
}

package model;

import java.util.ArrayList;

public class GerenciadorFilmes {

    private ArrayList<Filme> filmes = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(Filme filme) {
        filme.setId(proximoId++);
        filmes.add(filme);
    }

    public ArrayList<Filme> listar() {
        return filmes;
    }

    public Filme buscarPorId(int id) {
        for (Filme f : filmes) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public boolean remover(int id) {
        Filme filme = buscarPorId(id);
        if (filme != null) {
            filmes.remove(filme);
            return true;
        }
        return false;
    }

    public boolean editar(Filme atualizado) {
        Filme existente = buscarPorId(atualizado.getId());
        if (existente != null) {
            existente.setTitulo(atualizado.getTitulo());
            existente.setDuracao(atualizado.getDuracao());
            return true;
        }
        return false;
    }
}

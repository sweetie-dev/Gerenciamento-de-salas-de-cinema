package model;

import java.util.ArrayList;

public class GerenciadorSalas {

    private ArrayList<Sala> salas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(Sala sala) {
        sala.setId(proximoId++);
        salas.add(sala);
    }

    public ArrayList<Sala> listar() {
        return salas;
    }

    public Sala buscarPorId(int id) {
        for (Sala s : salas) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean remover(int id) {
        Sala sala = buscarPorId(id);
        if (sala != null) {
            salas.remove(sala);
            return true;
        }
        return false;
    }

    public boolean editar(Sala atualizada) {
        Sala antiga = buscarPorId(atualizada.getId());
        if (antiga != null) {
            antiga.setNumero(atualizada.getNumero());
            antiga.setCapacidade(atualizada.getCapacidade());
            return true;
        }
        return false;
    }
}

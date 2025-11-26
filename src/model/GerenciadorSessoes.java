package model;

import java.util.ArrayList;

public class GerenciadorSessoes {

    private ArrayList<Sessao> sessoes = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(Sessao sessao) {
        sessao.setId(proximoId++);
        sessoes.add(sessao);
    }

    public ArrayList<Sessao> listar() {
        return sessoes;
    }

    public Sessao buscarPorId(int id) {
        for (Sessao s : sessoes) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public boolean remover(int id) {
        Sessao sessao = buscarPorId(id);
        if (sessao != null) {
            sessoes.remove(sessao);
            return true;
        }
        return false;
    }

    public boolean editar(Sessao atualizada) {
        Sessao antiga = buscarPorId(atualizada.getId());
        if (antiga != null) {
            antiga.setFilme(atualizada.getFilme());
            antiga.setSala(atualizada.getSala());
            antiga.setHorario(atualizada.getHorario());
            return true;
        }
        return false;
    }
}


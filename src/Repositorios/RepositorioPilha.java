package Repositorios;

import Entidades.Doador;
import Entidades.PilhaDoadores;
import Interfaces.InterfaceRepositorioPilha;

public class RepositorioPilha implements InterfaceRepositorioPilha {
    private PilhaDoadores pilhaDoadores;

    public RepositorioPilha() {
        this.pilhaDoadores = new PilhaDoadores();
    }

    public void adicionarDoador(Doador doador) {
        pilhaDoadores.adicionarDoador(doador);
    }

    public Doador removerDoador() {
        return pilhaDoadores.removerDoador();
    }

    public Doador visualizarDoador() {
        return pilhaDoadores.visualizarDoador();
    }

    public void listarDoadores() {
        pilhaDoadores.listarDoadores();
    }

    public boolean isEmpty() {
        return pilhaDoadores.isEmpty();
    }
}

package Interfaces;

import Entidades.Doador;
public interface InterfaceRepositorioPilha {
    void adicionarDoador(Doador doador);
    Doador removerDoador();
    Doador visualizarDoador();
    void listarDoadores();
    boolean isEmpty();
}

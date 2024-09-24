package Entidades;

import java.util.ArrayList;

public class PilhaDoadores {
    private ArrayList<Doador> pilhaDoadores;

    public PilhaDoadores() {
        this.pilhaDoadores = new ArrayList<>();
    }

    public void adicionarDoador(Doador doador) {
        this.pilhaDoadores.add(doador);
    }

    public Doador removerDoador() {
        if (!pilhaDoadores.isEmpty()) {
            return pilhaDoadores.remove(pilhaDoadores.size() - 1);
        }
        System.out.println("A pilha está vazia.");
        return null;
    }

    public Doador visualizarDoador() {
        if (!pilhaDoadores.isEmpty()) {
            return pilhaDoadores.get(pilhaDoadores.size() - 1);
        }
        System.out.println("A pilha está vazia.");
        return null;
    }

    public boolean isEmpty() {
        return pilhaDoadores.isEmpty();
    }

    public void listarDoadores() {
        if (pilhaDoadores.isEmpty()) {
            System.out.println("Nenhum doador na pilha.");
        } else {
            for (Doador doador : pilhaDoadores) {
                System.out.println("Nome: " + doador.getNome() + ", CPF: " + doador.getCpf() +
                        ", Telefone: " + doador.getTelefone() + ", Endereço: " + doador.getEndereco() +
                        ", Email: " + doador.getEmail());
            }
        }
    }
}

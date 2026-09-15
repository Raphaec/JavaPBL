package models;

import java.util.List;

public class Inventario {
    private final int id;
    private List<Item> itens;
    private boolean acessivel;

    public Inventario(int id) {
        this.id = id;
    }

    public int getId() { return id; }
    public List<Item> getItens() { return itens; }
    public void setItens(List<Item> itens) { this.itens = itens; }
    public boolean isAcessivel() { return acessivel; }
    public void setAcessivel(boolean acessivel) { this.acessivel = acessivel; }

    public void guardarItem(Item item) {
        // Lógica para guardar
    }

    public void removerItem(Item item) {
        // Lógica para remover
    }
}
package models;


import java.util.List;

public class Protagonista extends Personagem {
    private List<Integer> caracteristicas;
    private Inventario inventario;

    public Protagonista(int id, String nome) {
        super(id, nome);
    }

    public List<Integer> getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(List<Integer> caracteristicas) { this.caracteristicas = caracteristicas; }
    public Inventario getInventario() { return inventario; }
    public void setInventario(Inventario inventario) { this.inventario = inventario; }

}
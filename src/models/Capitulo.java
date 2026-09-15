package models;

//import Cena.java;
import java.util.List;
public class Capitulo {
    private final int id;
    private List<Cena> cenas;

    public Capitulo(int id) {
        this.id = id;
    }

    public int getId() { return id; }
    public List<Cena> getCenas() { return cenas; }
    public void setCenas(List<Cena> cenas) { this.cenas = cenas; }
}
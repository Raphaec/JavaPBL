package models;


import java.util.List;

public class Cena {
    private final int id;
    private String titulo;
    private List<Personagem> personagens;

    public Cena(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public List<Personagem> getPersonagens() { return personagens; }
    public void setPersonagens(List<Personagem> personagens) { this.personagens = personagens; }

    public void iniciarCena() {
        // Lógica para iniciar cena
    }
}
package models;

import java.util.List;
import java.util.ArrayList;

public class Cena {
    private final int id;
    private String titulo;
    private String textoNarrativa; // O diálogo ou descrição da cena
    private List<Escolha> escolhas; // Caminhos possíveis
    private List<Personagem> personagens; // Opcional, dependendo da sua engine

    public Cena(int id, String titulo, String textoNarrativa) {
        this.id = id;
        this.titulo = titulo;
        this.textoNarrativa = textoNarrativa;
        this.escolhas = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getTextoNarrativa() { return textoNarrativa; }

    public List<Escolha> getEscolhas() { return escolhas; }
    public void adicionarEscolha(Escolha escolha) { this.escolhas.add(escolha); }
}
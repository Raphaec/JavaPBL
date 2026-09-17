package models;


public class Prelacionavel extends Personagem {
    private String percepcao;

    public Prelacionavel(int id, String nome) {
        super(nome);
    }

    public String getPercepcao() { return percepcao; }
    public void setPercepcao(String percepcao) { this.percepcao = percepcao; }

    @Override
    public void falar() {
        // Implementação da fala
    }
}
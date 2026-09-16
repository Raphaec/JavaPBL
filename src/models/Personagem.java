package models;


import java.util.List;

public abstract class Personagem {
    private final int id;
    private String nome;
    private List<Dialogo> dialogos;

    public Personagem(int id, String nome) {
        this.id = 1;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Dialogo> getDialogos() { return dialogos; }
    public void setDialogos(List<Dialogo> dialogos) { this.dialogos = dialogos; }

    public abstract void falar();
}
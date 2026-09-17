package models;

public class Escolha {
    private String textoOpcao;
    private int proximaCenaId;

    public Escolha(String textoOpcao, int proximaCenaId) {
        this.textoOpcao = textoOpcao;
        this.proximaCenaId = proximaCenaId;
    }

    public String getTextoOpcao() { return textoOpcao; }
    public int getProximaCenaId() { return proximaCenaId; }
}
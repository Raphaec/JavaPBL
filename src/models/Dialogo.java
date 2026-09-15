package models;


public class Dialogo {
    private final int id;
    private String conteudo;
    private String tipo;

    public Dialogo(int id, String conteudo, String tipo) {
        this.id = id;
        this.conteudo = conteudo;
        this.tipo = tipo;
    }

    public int getId() { return id; }
    public String getConteudo() { return conteudo; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public void iniciar() {
        // Lógica para iniciar diálogo
    }
}
package models;


public class Item {
    private final int id;
    private String nome;
    private String descricao;
    private int qtd;
    private String tipo;

    public Item(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public int getQtd() { return qtd; }
    public void setQtd(int qtd) { this.qtd = qtd; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }


}
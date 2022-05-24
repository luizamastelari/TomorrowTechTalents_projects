package Mod_2.Ex2;

public class Produto {
    private String nome;
    private String session;
    private String tipo;
    private Integer qtd;
    private String marca;

    private Integer id_prod;
    private static int cnt;

    public Produto() {
        this.id_prod = cnt++;
    }

    public Produto(String nome, String marca, Integer qtd) {
        this.nome = nome;
        this.marca = marca;
        this.qtd = qtd;
        this.id_prod = cnt++;
    }

    public Produto(String nome, String session, String tipo, Integer qtd, String marca) {
        this.nome = nome;
        this.session = session;
        this.tipo = tipo;
        this.qtd = qtd;
        this.marca = marca;
        this.id_prod = cnt++;
    }

    public int getId_prod() {
        return this.id_prod;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return "Produto{ id = " + id_prod +
                " nome='" + nome + '\'' +
                ", session='" + session + '\'' +
                ", tipo='" + tipo + '\'' +
                ", qtd=" + qtd +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

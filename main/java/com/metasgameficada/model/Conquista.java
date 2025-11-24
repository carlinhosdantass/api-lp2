public class Conquista {

    private Long id;

    private String nome;
    private String descricao;
    private int requisitoMetas;

    public Conquista() {}

    public Conquista(Long id, String nome, String descricao, int requisitoMetas) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.requisitoMetas = requisitoMetas;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getRequisitoMetas() { return requisitoMetas; }
    public void setRequisitoMetas(int requisitoMetas) { this.requisitoMetas = requisitoMetas; }
}

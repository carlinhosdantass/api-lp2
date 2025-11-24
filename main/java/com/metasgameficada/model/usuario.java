// Classe que representa um usuário da aplicação
public class Usuario {

    private Long id;
    private String nome;
    private int pontos = 0;
    private int metasConcluidas = 0;

    // Construtor padrão
    public Usuario() {}

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getNivel() {
        return pontos / 100; // cada 100 pontos = 1 nível
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getPontos() { return pontos; }
    public void addPontos(int quantidade) { this.pontos += quantidade; }

    public int getMetasConcluidas() { return metasConcluidas; }
    public void incrementarMetasConcluidas() { this.metasConcluidas++; }
}

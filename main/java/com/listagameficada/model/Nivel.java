public class Nivel {

    private int nivelAtual;
    private int pontosParaProximoNivel;

    public Nivel(int pontosTotais) {
        this.nivelAtual = pontosTotais / 100;               // cada 100 pontos = 1 nível
        this.pontosParaProximoNivel = 100 - (pontosTotais % 100);
    }

    public int getNivelAtual() { return nivelAtual; }
    public int getPontosParaProximoNivel() { return pontosParaProximoNivel; }
}

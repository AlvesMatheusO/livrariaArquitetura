package Livros;

/**
 * A classe LivroDigital é uma subclasse de Livro
 */
public class LivroDigital extends Livro {
    // Dois campos adicionais específicos para LivroDigital
    private final String formato;
    private final double tamanhoArquivo;

    /**
     * Construtor privado que aceita um objeto Builder como parâmetro.
     */
    private LivroDigital(Builder builder) {
        // Chama o construtor da classe pai (Livro) e inicializa os campos herdados
        super(builder.id, builder.titulo, builder.autor, builder.anoPublicacao);
        // Inicializa os campos específicos de LivroDigital com os valores do objeto Builder
        this.formato = builder.formato;
        this.tamanhoArquivo = builder.tamanhoArquivo;
    }

    /**
     * Métodos getter para os campos formato e tamanhoArquivo.
     */
    public String getFormato() {
        return formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    /**
     * Classe Builder estática interna.
     */
    public static class Builder {
        // Campos correspondentes aos da classe LivroDigital.
        private final int id;
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private String formato;
        private double tamanhoArquivo;

        /**
         * Construtor do Builder que aceita o campo obrigatório id como parâmetro.
         */
        public Builder(int id) {
            this.id = id;
        }

        /**
         * Métodos setter para cada campo. Cada método retorna a própria instância do Builder.
         */
        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder anoPublicacao(int anoPublicacao) {
            this.anoPublicacao = anoPublicacao;
            return this;
        }

        public Builder formato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder tamanhoArquivo(double tamanhoArquivo) {
            this.tamanhoArquivo = tamanhoArquivo;
            return this;
        }

        /**
         * Método build que cria uma nova instância de LivroDigital usando os valores definidos no Builder.
         */
        public LivroDigital build() {
            return new LivroDigital(this);
        }
    }
}

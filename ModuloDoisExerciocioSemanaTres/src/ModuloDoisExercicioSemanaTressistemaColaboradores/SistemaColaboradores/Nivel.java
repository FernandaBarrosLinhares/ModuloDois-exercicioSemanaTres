package ModuloDoisExercicioSemanaTressistemaColaboradores.SistemaColaboradores;



//1 Crie uma nova Classe do tipo Enum para adicionar os níveis//

public enum Nivel {
    JUNIOR( 0, "Junior"),

    PLENO( 1, "Pleno"),

    SENIOR( 2,"Senior");

    private final int valor;
    private final String descricao;

    Nivel( int valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}


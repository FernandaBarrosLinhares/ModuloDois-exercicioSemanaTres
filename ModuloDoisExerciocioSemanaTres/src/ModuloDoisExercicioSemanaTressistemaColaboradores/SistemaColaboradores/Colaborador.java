package ModuloDoisExercicioSemanaTressistemaColaboradores.SistemaColaboradores;

//3 Crie uma Classe Colaborador com atributos:
//
//nome;
//dtAdmissao;
//dtDesligamento;
//Cargo ( Objeto do Tipo Cargo do exercício 2 )
//salario;//

import java.util.Date;

public class Colaborador {
   private  String nome;
    private Double salario;
    private Date dtAdmissao;
    private Date dtDesligamento;
    private Cargo cargo;

       public  Colaborador(String nome, Double salario, Date dtAdmissao,String cargo){
           this.nome = nome;
           this.salario = salario;
           this.dtAdmissao = dtAdmissao;


       }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario( Double salario ) {
        this.salario = salario;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao( Date dtAdmissao ) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtDesligamento() {
        return dtDesligamento;
    }

    public void setDtDesligamento( Date dtDesligamento ) {
        this.dtDesligamento = dtDesligamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo( Cargo cargo ) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Object get( int i ) {
    }
}


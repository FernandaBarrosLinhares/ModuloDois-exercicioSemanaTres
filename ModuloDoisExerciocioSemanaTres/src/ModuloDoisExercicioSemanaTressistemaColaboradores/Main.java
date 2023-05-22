package ModuloDoisExercicioSemanaTressistemaColaboradores;

import ModuloDoisExercicioSemanaTressistemaColaboradores.SistemaColaboradores.Cargo;
import ModuloDoisExercicioSemanaTressistemaColaboradores.SistemaColaboradores.Colaborador;
import ModuloDoisExercicioSemanaTressistemaColaboradores.SistemaColaboradores.Nivel;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main( String[] args ) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        ArrayList<Cargo> cargos = new ArrayList<>();


        //4 Faça um método para inclusão de um novo colaborador na lista de colaboradores//

        cargos.add(new Cargo("Dev Front-end Junior", 3000.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Dev Front-end Pleno", 5000.0, Nivel.PLENO));
        cargos.add(new Cargo("Dev Front-end Senior", 7000.0, Nivel.SENIOR));
        colaboradores.add(new Colaborador("Guilherme", new Date(), cargos.get(0)));
        colaboradores.add(new Colaborador("Renata", new Date(), cargos.get(1)));
        colaboradores.add(new Colaborador("Leonardo", new Date(), cargos.get(2)));

        //5 Faça um método para listar colaboradores da lista de colaboradores que não possuem data de desligamento//
//        listarColaboradores();
//        for (Colaborador c : colaboradores){
//            if(c.getDtDesligamento() == null){
//                System.out.println(c);
//            }
//        }

        //6 Através da lista de Cargos criados, faça um método que liste todos colaboradores que são de determinado Cargo//
//        listarColaboradoresPorCargo();
//        for (Cargo cargo : cargos){
//            System.out.println("Lista de colaboradores de Cargo" + cargo);
//            for (Colaborador colaborador : colaboradores){
//                if(colaborador.getCargo()== cargo){
//                    System.out.println(colaborador);
//                }
//            }
//        }
    }

    //7 Faça um método que será responsável por admitir um colaborador//
    //( incluir na lista de colaboradores )//

//        Colaborador colaborador = newColaborador();
//            if (colaborador != null){
//                addColaborador(colaborador);
//    }

    listarColaboradores();

    }


    //8Faça um método que será responsável por desligar um colaborador ( alterar o objeto incluindo uma data de desligamento )//
//    desligarColaborador();
    listarColaborador();

    //9Faça um método que será responsável por promover um colaborador de Cargo ( deverá alterar o objeto alterando o Cargo )//

    promover();

    public static void promover(){
        JOptionPane.showMessageDialog(null, "Promover Colaborador");

        Colaborador colaborador = (Colaborador) JOptionPane.showInputDialog(
                null,
                "Selecioner o colaborador",
                "Selecao de colaborador",
                JOptionPane.PLAIN_MESSAGE,
                null,
                Colaboradores().getArray(),
                colaborador.get(0)
        );

            colaborador.setDtDesligamento(new Date());
        )
    }

    private static Array Colaboradores() {
    }

    public static void desligarColaborador(){

        JOptionPane.showMessageDialog(null, "Desligar colaborador");

        Colaborador colaborador = (Colaborador) JOptionPane.showInputDialog(
                null,
                "Selecione Colaborador",
                "Selecao de Colaborador",
                JOptionPane.PLAIN_MESSAGE,
                null,
                colaboradores.toArray(),
                colaboradores.get(0)
        );
        Cargo  cargo =(Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo" +
                        "Selecao de cargo",
                new JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );

        colaborador.setCargo(cargo);
        colaborador.setSalario(cargo.getSalarioBase());
    }

    public static void addColaborador (Colaborador colaborador){
        colaboradores.add(colaborador);
    }
//Faça um método que será responsável por admitir um colaborador//

//( incluir na lista de colaboradores )
    public static Colaborador newColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do colaborador");
        Date dtAdmissao = new Date();
        Cargo  cargo =(Cargo) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo" +
                        "Selecao de cargo",
                new JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
         Colaborador colaborador = new Colaborador(nome, dtAdmissao, cargo);
             return colaborador;

    }

    public static void listarColaboradores(ArrayList<Colaborador> colaboradores){
        for (Colaborador c : colaboradores){
            if(c.getDtDesligamento() == null){
               System.out.println(c);
            }
        }
    }

    public static void listarColaboradoresPorCargo(){
        for (Cargo cargo : cargos){
            System.out.println("Lista de colaboradores de Cargo" + cargo.getDescricao());
            for (Colaborador colaborador : colaboradores){
                if(colaborador.getCargo()== cargo){
                    System.out.println(colaborador);
                }
            }
        }
    }
}
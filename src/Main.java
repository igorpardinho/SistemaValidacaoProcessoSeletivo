import com.sun.source.tree.WhileLoopTree;

import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {


     case1(2000.0,3000.0);
     case2();
     case3();


    }

    static void case1(double salarioBase,double salarioPretendido){
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
    static void case2(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int proximoCandidato = 0;
        int totalCandidatos = 0;
        double salarioBase = 2000.0;

        while (totalCandidatos < 5 && proximoCandidato < candidatos.length){
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo: " + valorPretendido);
            if (valorPretendido > salarioBase){
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
            }else {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                totalCandidatos++;
            }
        }
        System.out.println("Total de selecionados: " + totalCandidatos);
        System.out.println("Total de consultados: " + proximoCandidato);

    }

    static void case3(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(int i = 0; i < candidatos.length; i++){
            System.out.println((i+1) + "° " +  " candidato é "  + candidatos[i]);
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
import java.util.concurrent.ThreadLocalRandom;


public class ExemploWhile {
    public static void main(String[] args) {
        double masada = 50.0;

        while(masada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > masada)
                valorDoce = masada;

            System.out.println("Doce valor: " + valorDoce + "Adicionado no carrinho");
            masada = masada - valorDoce;
        }
        System.out.println("Mesada: " + masada);
        System.out.println("Joãozinho gastou toda a sua mesada em doce");

    }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,8);
        }
    }


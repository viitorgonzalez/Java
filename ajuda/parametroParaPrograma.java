package Java.ajuda;

class Parametro {
    public static void main(String[] args) {
        int soma = 0;
        //tratamento para entradas nulas ou negativo
        if(args.length <= 0) {
            System.out.print("Error!");
            return;
        }

        //funcionalidade do código
        for(String i:args) {
            soma += Integer.valueOf(i);
        }
        System.out.print("A soma é: " + soma);

    }
}

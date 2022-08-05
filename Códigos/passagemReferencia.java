package Java;

class PassagemReferenciaJava {
    public static int verificarNotas(int[] n, int[] r) {
        //verifica a nota e atribui 1 para aprovado ou reprovado, sendo indice 0 aprovados, e indice 1 reprovados
        for(int i:n) {
            if(i >= 60)
                r[0]++;
            else
                r[1]++;
        }

        return 0;
    }
    public static void main(String[] args) {
        //arrays para notas e resultado
        int[] notas = {10,30,50,60,48,9,98,76,82,95,75};
        int[] resultado = {0,0};

        //chamado das funções e mostrar resultados na tela
        verificarNotas(notas, resultado);
        System.out.println("Aprovados: " + resultado[0]);
        System.out.println("Reprovados: " + resultado[1]);
    }
} 
class Recursividade {

    public static void main(String[] args){
        int[] vetor = new int[10];
        
        //dando valores ao vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.print("|" + vetor[i] + "|");
        }
        
        //soma
        System.out.println("\n");
        System.out.print(somar(0, 0, vetor));
    }
    
    //função recursiva
    private static int somar(int soma, int posicao, int[] vetor){
        if(posicao < vetor.length){
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        }else{
            return soma;
        }
    }
}

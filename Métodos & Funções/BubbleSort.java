class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        //mostrar vetor desordenado
        System.out.println("Vetor desorndenado: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.print(vetor[i] + "-");
        }

        //BUBBLESORT
        bubbeSort(vetor);

        //mostrar vetor após BubbleSort
        System.out.println("\nVetor Ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "-");
        }
    }

    //método BubbleSort
    public static void bubbeSort(int[] vetor){
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
}
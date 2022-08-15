class InsertionSort {
    public static void main(String[] args){
        int[] vet = new int[10];

        //vetor antes do insertion
        for(int i = 0; i < vet.length; i++){
            vet[i] = (int)(Math.random() * vet.length);
            System.out.print(vet[i] + "|");
        }

        //INSERTIONSORT
        insertionSort(vet);
        System.out.println("\n");

        //vetor após insertionsort
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + "|");
        }
    }

    //método InsertionSort
 public static void insertionSort(int[] vetor){
        int aux, j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1]= vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }
}
class SelectionSort {
    public static void main(String[] args){
        int[] vetor = new int[10];
    
        //vetor antes do selection
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.print(vetor[i] + "|");
        }

        //SELECTIONSORT
        selectionSort(vetor);
        System.out.print("\n");

        //vetor após o selectionsort
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "|");
        }
    }

    //método selectionSort
    public static void selectionSort(int[] vetor){
        int posMenor, aux;
        for(int i = 0; i < vetor.length; i++){
            posMenor = i;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[posMenor]){
                    posMenor = j;
                }
            }
            aux = vetor[posMenor];
            vetor[posMenor] = vetor[i];
            vetor[i] = aux;
        }
    }
}

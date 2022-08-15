class HeapSort {

    public static void main(String[] args){
        int[] vetor = new int[10];
        
        //criando vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
            System.out.print("|" + vetor[i] + "|");
        }
        
        //HEAPSORT
        heapSort(vetor);
        System.out.println();

        //arry após HeapSort
        for(int i = 0; i < vetor.length; i++){
            System.out.print("|" + vetor[i] + "|");
        }
    }

    public static void heapSort(int[] vet){
        int n = vet.length;
        
        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(vet, n, i);
        }
        
        for(int j = n - 1; j > 0; j--){
            int aux = vet[0];
            vet[0] = vet[j];
            vet[j] = aux;
            
            aplicarHeap(vet, j, 0);
        }
    }
    
    private static void aplicarHeap(int[] vetor, int n, int i){
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        
        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            aplicarHeap(vetor, n, raiz);
        }
    }
}
package JavaRoadMap.JavaCollections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePoll {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        // Adicionando 10 elementos à fila
        for (int i = 1; i <= 10; i++) {
            System.out.println("Adicionando elemento de n: " + i);
            fila.add(i);
        }

        // Removendo e imprimindo os elementos da fila usando poll()
        while (!fila.isEmpty()) {
            int elemento = fila.poll();
            System.out.println("Elemento removido: " + elemento);
        }

        // Tamanho da fila após todas as remoções
        System.out.println("Tamanho da fila após todas as remoções: " + fila.size()); // Isso imprimirá 0
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];

        // Gera os números aleatórios
        for (int i = 0; i < 1000; i++) {
            numbers[i] = random.nextInt(19999) - 9999;
        }

        // Cria da lista circular dupla
        Listadupla linkedList = new Listadupla();

        // coloca dos números na lista
        for (int number : numbers) {
            linkedList.inserirnumero(number);
        }

        // Imprime a lista em ordem crescente
        System.out.println("Lista em ordem crescente:");
        linkedList.printList(false);

        // Imprime a lista em ordem decrescente
        System.out.println("Lista em ordem decrescente:");
        linkedList.printList(true);

        // Remove dos números primos da lista
        linkedList.removePrimo();

        // Impressão da lista após remoção dos números primos
        System.out.println("Lista após remoção dos números primos:");
        linkedList.printList(false);
    }
}
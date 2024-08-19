public class Listadupla {

    

No sentinel;


    Listadupla() {
        sentinel = new No(Integer.MIN_VALUE);
        sentinel.proximo = sentinel;
        sentinel.anterior = sentinel;
    }

    void inserirnumero(int data) {
        No newNode = new No(data);
        No current = sentinel.proximo;

        while (current != sentinel && current.data < data) {
            current = current.proximo;
        }

        newNode.anterior = current.anterior;
        newNode.proximo = current;
        current.anterior.proximo = newNode;
        current.anterior = newNode;
    }

    void removePrimo() {
        No current = sentinel.proximo;
        while (current != sentinel) {
            if (isPrimo(current.data)) {
                current.anterior.proximo = current.proximo;
                current.proximo.anterior = current.anterior;
            }
            current = current.proximo;
        }
    }

    boolean isPrimo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    void printList(boolean reverse) {
        if (reverse) {
            No current = sentinel.anterior;
            while (current != sentinel) {
                System.out.print(current.data + " ");
                current = current.anterior;
            }
        } else {
            No current = sentinel.proximo;
            while (current != sentinel) {
                System.out.print(current.data + " ");
                current = current.proximo;
            }
        }
        System.out.println();
    }

}

/*
MATHEUS DE JESUS MAIA 
E
VITORIA CRISTINA SILVA

 */
public class EXE2 {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.furarFila(4);
        while (!fila.isEmpty()) {
            int x = (int) fila.dequeue();
            System.out.print(x);
        }

    }
}

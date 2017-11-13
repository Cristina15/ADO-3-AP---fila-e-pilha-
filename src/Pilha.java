
/*
MATHEUS DE JESUS MAIA 
E
VITORIA CRISTINA SILVA

 */

public class Pilha {
    
    // atributos
    private Object [] dados;
    private int topo;

    // Cria uma pilha
    public Pilha () {
        dados = new Object[50];
        topo = -1;
    }
    
    public boolean isFull() {
        return (topo == dados.length - 1);
    }
    
    public boolean isEmpty() {
        return (topo == -1);
    }
    
    public void push(Object x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        }
    }
    
    public Object pop() {
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        }
        return null;
    }
    
    public Object top() {
        if (!isEmpty()) {
            return dados[topo];
        }
        return null;
    }    
}
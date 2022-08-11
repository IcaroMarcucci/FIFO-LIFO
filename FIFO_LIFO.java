import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Teste {
    public static void main (String[] args) {

    System.out.println("Criando itens da lista");
    ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);     
    System.out.println(lista);

    System.out.println("Removendo itens da lista");
    lista.removeAll(lista);
    System.out.println(lista);    
        
    System.out.println("Inserindo os dados da lista na pilha");
    ArrayDeque<Integer> pilha = new ArrayDeque<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
    System.out.println(pilha);

    System.out.println("Removendo itens da pilha");
    pilha.removeAll(pilha);
    System.out.println(pilha); 

    System.out.println("Inserindo os dados da pilha na fila");
    Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
    System.out.println(fila);
    
    System.out.println("Adicionando novos itens na fila");
        fila.add(6);
        fila.add(7);
        fila.add(8);
        fila.add(9);
        fila.add(10);
    System.out.println(fila); 

    System.out.println("Removendo itens da lista");
    lista.removeAll(lista);
    System.out.println(lista);    
        
    System.out.println("Inserindo os dados da lista na pilha");
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
    System.out.println(pilha);

    System.out.println("Removendo itens da pilha");
    pilha.removeAll(pilha);
    System.out.println(pilha); 

    System.out.println("Inserindo os dados da pilha na fila");
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);
    System.out.println(fila);
    
 }   

}

/*Comentários:
- Os dados são inseridos da lista até a pilha de forma sequencial First in, First Out (FIFO),
após isso, são inseridos na fila tirando da pilha de forma Last in, First Out (LIFO)*/
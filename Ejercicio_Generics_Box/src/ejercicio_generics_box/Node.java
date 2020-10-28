package ejercicio_generics_box;
/**
 * @author Daniel
 */
//TipadoBorrado de nodo
public class Node<T> {

  private T data;
  private Node<T> next;

  public Node(T data, Node<T> next) }
    this.data = data;
    this.next = next;
  }

  public T getData() { return data; }
  // ...
}

// Nodo tipado borrado
public class Node {

  private Object data;
  private Node next;

  public Node(Object data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Object getData() { return data; }
  // ...
}

// TipadoBorrado a comparación
public class Node<T extends Comparable<T>> {

  private T data;
  private Node<T> next;

  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  public T getData() { return data; }
  // ...
}

// Nodo tipado Borrado
public class Node {

  private Comparable data;
  private Node next;

  public Node(Comparable data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Comparable getData() { return data; }
  // ...
}
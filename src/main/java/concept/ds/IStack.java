package concept.ds;

public interface IStack<E> {
  public E push(E ele);
  public E pop();
  public E peek();
  public boolean empty();
  public int size();
  public int search(E ele);
}

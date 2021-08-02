package concept.ds;
public class Stack<E> implements IStack {
  private E[] data;
  private int size;
  private int currentIndx = -1;
  public Stack() {
    size = 10;
    data = new E[size];
  }
  public Stack(int size) {
    this.size = size;
    data = new E[this.size];
  }
  public E push(E ele) {
    if(currentIndx < size) {
      ensureCapacity();
      data[++currentIndx] = ele;
    } else {
      throw new StackOverflowException("Stack is full");
    }
  }
  public E pop() {
    E ele = null;
    if(currentIndx >= 0) {
      ele = data[currentIndx];
      int numMoved = size - currentIndx - 1;
      if (numMoved > 0) {
        System.arraycopy(data, currentIndx+1, data, currentIndx,
                             numMoved);
      }
      data[currentIndx--] = null;
    } else {
      throw new StackUnderflowException("Stack is empty");
    }
    return ele;
  }
  private void ensureCapacity() {
    if(currentIndx > (size/2)) {
      int newCapacity = size + size >> 1;
      data = Arrays.copyOf(data, newCapacity);
    }
  }
  public E peek() {
    E ele = null;
    if(currentIndx >= 0) {
      ele = data[currentIndx];
    } else {
      throw new StackUnderflowException("Stack is empty");
    }
    return ele;
  }
  public boolean isEmpty() {
    return currentIndx == -1;
  }
  public int size() {
    return currentIndx;
  }
}

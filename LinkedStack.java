
public class LinkedStack<E> implements Stack<E>{

    private static class Elem<T>{
        private T info;
        private Elem<T> next;
        private Elem( T info, Elem<T> next) {
            this.info = info;
            this.next = next;
        }
    }

    private Elem<E> top; // instance variable

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push( E info ) {
        top = new Elem<E>( info, top );
    }

    public E peek() {
      try
      {
        if (top.info == null)
        {
           throw new EmptyStackException("Error");
        }
        else
        {
        return top.info;
        }
      }
      catch(EmptyStackException e)
      {
        return null;
      }
    }

    public E pop() {
        E savedInfo = top.info;
        try
        {
          if (savedInfo==null)
          {
            throw new EmptyStackException("Error");
          }
          else
          {
            Elem<E> oldTop = top;
            Elem<E> newTop = top.next;

            top = newTop;

            oldTop.info = null; // scrubbing the memory
            oldTop.next = null; // scrubbing the memory

            return savedInfo;
          }
          }
        
        catch (EmptyStackException e)
        {
          return null;
        }
    }
}


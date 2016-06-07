public class LinkedQueue<E> implements Queue<E> {

    private static class Elem<T> {

        private T value;
        private Elem<T> next;

        private Elem( T value, Elem<T> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Elem<E> front;
    private Elem<E> rear;

    public E peek() {
      try{
        if(front.value==null)
        {
          throw new EmptyQueueException("Error");
        }
        else
        {
        return front.value;
        }
      }
      catch (EmptyQueueException e)
      {
      }
      return null;
    }

    public void enqueue( E o ) {
        Elem<E> newElem;
        newElem = new Elem<E>( o, null );

        if ( rear == null ) {
            front = rear = newElem;
        } else {
            rear.next = newElem;
            rear = newElem;
        }
    }

    public E dequeue() {
        E result = front.value;
        try
        {
          if (front == null && front.next== null)
          {
            throw new EmptyQueueException("Error");
          }
          else
          {
            if ( front != null && front.next == null ) {
              front = rear = null;
            } 
            else {
              front = front.next;
            }
            return result;
          }
        }
        catch (EmptyQueueException e) 
        {
        }
        return null;
    }

    public boolean isEmpty() {
        return front == null;
    }

}

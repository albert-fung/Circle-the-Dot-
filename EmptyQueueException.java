public class EmptyQueueException extends Exception 
{
  public EmptyQueueException(String message)
  {
    super(message);
  }
  public EmptyQueueException(Throwable cause)
  {
    super(cause);
  }
  public EmptyQueueException(String message, Throwable cause)
  {
    super(message,cause);
  }
}

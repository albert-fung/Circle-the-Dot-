public class EmptyStackException extends Exception 
{
  public EmptyStackException(String message)
  {
    super(message);
  }
  public EmptyStackException(Throwable cause)
  {
    super(cause);
  }
  public EmptyStackException(String message, Throwable cause)
  {
    super(message,cause);
  }
}

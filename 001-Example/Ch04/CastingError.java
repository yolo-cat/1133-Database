public class CastingError  {
  public static void main(String[] argv) {
    int i = 32768;
    System.out.println("i=" + i);
    short s = (short) i;  // int �j���૬�� short
    System.out.println("s=" + s);
    byte b = (byte) s;   // short �j���૬�� byte
    System.out.println("b=" + b);
  }
}

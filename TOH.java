import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
static void toh(int n, char source, char dest, char aux)
{
  if (n == 1)
  {
    System.out.println("Move disk 1 from rod "+ source +" to rod "+ dest);
    return;
  }
  toh(n - 1, source, aux, dest);
  System.out.println("Move disk "+ n + " from rod " + source +" to rod " + dest );
  toh(n - 1, aux, dest, source);
}

public static void main(String args[])
{
  int n = 6; 
  toh(n, 'A', 'C', 'B'); 
}
}

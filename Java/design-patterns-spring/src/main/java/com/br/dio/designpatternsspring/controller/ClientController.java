// Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar
import java.io.IOException;
import java.util.Scanner;

public class Desafio
{
    public static void main(
        final String[] args )
        throws IOException
    {
        final Scanner leitor = new Scanner( System.in );
        int cont = 0;
        double soma = 0;
        int n = leitor.nextInt();

        // TODO: Complete os espa�os em branco com uma poss�vel solu��o para o
        // desafio

        while( n >= 1 ) {
            if( n >= 0 ) {
                soma += n;
                cont++;
            }
            n = leitor.nextInt();
        }
        final double media = soma / cont;
        System.out.println( String.format( "%.2f", media ) );
    }
}
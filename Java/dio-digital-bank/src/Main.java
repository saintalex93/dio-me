import br.com.dio.model.Account;
import br.com.dio.model.Client;
import br.com.dio.model.CurrentAccount;
import br.com.dio.model.SavingAccount;

public class Main
{

    public static void main(
        final String[] args )
    {
        final Client client = new Client();
        client.setNome( "Roberto" );

        final Account currentAccount = new CurrentAccount( client );
        final Account savingAccount = new SavingAccount( client );

        currentAccount.deposit( 100 );
        currentAccount.shifting( 100, savingAccount );

        currentAccount.printStatment();
        savingAccount.printStatment();
    }

}

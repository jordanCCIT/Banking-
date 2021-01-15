package cookies;
import java.io.PrintStream;
import java.util.Collection;

public class BankingApp {
    private Collection<Account> accounts;
    public BankingApp(Collection<Account> accounts) {
        this.accounts = accounts;
    }

    void printAccountBalances(PrintStream out) {
        for(Account a: accounts) {
            out.println("Balance is " + a.balance());
        }
    }
}

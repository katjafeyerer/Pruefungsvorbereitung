public class Konto {
    private String owner;
    private double amount;

    private double abzug;

    private String accountOwner;

    public Konto(String owner, double amount) {
        this.owner = accountOwner;
        this.amount = 100.00;
    }
    public double abzugMethode(){
       return amount - abzug;
    }

    public boolean debit(){
        double neuerKontostand = amount - abzug;
        if(amount < abzug){
            System.out.println(neuerKontostand);
            return false;
        }
        System.out.println(amount);
        return true;
    }
}

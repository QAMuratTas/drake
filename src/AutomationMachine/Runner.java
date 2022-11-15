package AutomationMachine;

public class Runner {
    public static void main(String[] args) {

        double accountbalance =3;



        Urun urun = new Urun();
        System.out.println(urun);


Options options = new Options();
//options.select(urun);
urun.setPrice(options.select(urun));
accountbalance=options.balance(urun.getPrice(),accountbalance,urun);
        System.out.println(accountbalance);


    }
}

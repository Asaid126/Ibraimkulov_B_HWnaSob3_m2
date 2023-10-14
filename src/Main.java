import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            BankAccount Optima=new BankAccount();
            Scanner scanner=new Scanner(System.in);
            Optima.deposit(15000.0);
            System.out.println( "Доступно: "+Optima.getAmount()+" сом.Какую сумму желаете снять? ");

            while (true) {
                try {
                    if(Optima.getAmount()==0){
                        System.out.println("На вашем счете нет средств");
                        break;
                    }
                    int withDrawS=scanner.nextInt();
                    Optima.withDraw(withDrawS);

                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                    System.out.println(e.getRemainingAmount());
                    System.out.println("Хотите снять остаток?");


                }

            }


        }
    }

import java.util.Scanner;

public class SwitchStatement {

    public  static  void main(String args[]){

        int variable;
        System.out.println("enter you choicec");
        System.out.println("1.Name,2.Address,3.Organisation");
        Scanner sc = new Scanner(System.in);
        variable = sc.nextInt();

        switch (variable)
        {
            case 1:
                System.out.println("milind ghumare");
                break;
            case 2:
                System.out.println("Pune");
                break;
            case 3:
                System.out.println("TCS");
                break;
        }

    }
}

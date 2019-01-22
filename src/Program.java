import java.util.Scanner;

public class Program {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Witamy w kalkulatorze");
        System.out.println("Wpisz rownanie, ale na dwie liczby...");
        while(true){
            String Data=GetUserInput();
            double firstNumber=0;
            double secondNumber=0;
            String[]wejsci2=Data.split();
            char[] wejscie=Data.toCharArray();
            try{
                 firstNumber=Double.parseDouble(wejscie[0]);
                 secondNumber=(double)wejscie[2];
            }catch(NoClassDefFoundError nfc) {
                System.out.println("wez sie pierdol z takimi liczbanmi");
                continue;
            }
            if(wejscie[1]=='+'){
                Calculator calculator=new Calculator(new Add())        ;
                System.out.println(calculator.ExecuteCalculation(firstNumber,secondNumber));

            }
            if(wejscie[1]=='-'){
                Calculator calculator=new Calculator(new Delete())        ;
                System.out.println(calculator.ExecuteCalculation(firstNumber,secondNumber));

            }
            if(wejscie[1]=='/'){
                Calculator calculator=new Calculator(new Divide())        ;
                System.out.println(calculator.ExecuteCalculation(firstNumber,secondNumber));

            }
            if(wejscie[1]=='*'){
                Calculator calculator=new Calculator(new Multiply())        ;
                System.out.println(calculator.ExecuteCalculation(firstNumber,secondNumber));

            }

        }

    }

    public static String GetUserInput(){
        return sc.nextLine().trim();
    }
}

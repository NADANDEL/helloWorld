

public class TypeCasting {
    public static void main(String[] args){

        int firstNumber = 20;
        double secondNumber = 30.5;
        double sumNumbers = firstNumber + secondNumber;

    System.out.println(sumNumbers);

    double valueOne = 100.50;
    int intNumber = (int)valueOne;

    System.out.println("Integer value:" + intNumber);
    System.out.println("Double Value:" + valueOne);

    String valueString = "423424";
    int sayiBir = Integer.parseInt(valueString);
    System.out.println("String value:" + valueString);
    System.out.println("Integer value:" + sayiBir);
    }
}

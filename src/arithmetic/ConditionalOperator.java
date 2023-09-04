package arithmetic;

public class ConditionalOperator {
    public static void main(String[] args) {

        int  a=5, b=8,c=10;

        boolean result;
        boolean resultt;

//             AND OPERATOR (&&)
        result = (a>b) && (c>a);
        System.out.println(result);
//             OR OPERATOR (||)
        result = (a>b) || (c>a);
        System.out.println(result);
//        TERNARY OPERATOR
        resultt = a<b ? true:false;
        System.out.println(resultt);

    }
}

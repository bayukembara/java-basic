package arithmetic;

public class OperatorPrecedence {

	public static void main(String[] args) {
//*		Unary is the operator with first priority (++,--,+,-,!)
//*		Multiplicative is the operator with second priority (*,/,%)
//*		Additive is the operator with third priority (+,-)
//*		Relational is the operator with fourth priority (<,<=,>=,>)
//*		Equality is the operator with fifth priority (==,!=)
//*		Conditional AND is the operator with sixth priority (&&)
//*		Conditional OR is the operator with seventh priority (||)
//*		Ternary is the operator with eighth priority (?:)
//*		Assignment is the operator with lowest priority (=,+=,-=,*=,/=,%=)

		int result = 5 + 2 * 4;
		System.out.println("Result " + result);

		result = (5 + 2) * 4;
		System.out.println(result);

		int x = 8, y = 4, z = 2, sum = 0;
		sum = x + --y + --z;
		System.out.println(sum);
	}
}

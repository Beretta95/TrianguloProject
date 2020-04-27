package pucrs.si.qp.ProjetoTriangulo;

import javax.management.InvalidAttributeValueException;

/**
 * Hello world!
 *
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int identificaTriangulo(int a, int b, int c) throws InvalidAttributeValueException {
	    if (a <= 0 || b <= 0 || c <= 0) {
	      throw new InvalidAttributeValueException("Valor acima de ZERO, senão nao é triangulo!!");
	    } else {
	      if ((a < b + c) && (b < a + c) && (c < b + a)) {
	        if ((a == b) && (b == c))
	          return tipos.EQUILATERO.value();
	        else if ((a != b) && (a != c) && (b != c))
	          return tipos.ESCALENO.value();
	        else if ((a == b) || (b == c) || (c == a))
	          return tipos.ISOSCELES.value();
	        else 
	        	return tipos.NAOETRINAGULO.value();
	      }
	      return tipos.INVALIDO.value();
	    }
	  }

	  public static void main(String[] args) {
	    try {
	      System.out.println("Triângulos!");
	      System.out.println(identificaTriangulo(5, 4, 9));
	    } catch (InvalidAttributeValueException ex) {
	      System.out.println(ex.getMessage());
	    }
	  }
}

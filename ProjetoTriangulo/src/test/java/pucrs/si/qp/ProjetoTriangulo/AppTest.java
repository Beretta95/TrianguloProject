package pucrs.si.qp.ProjetoTriangulo;

import static org.junit.Assert.assertEquals;
import javax.management.InvalidAttributeValueException;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	//T1 Válido
  @Test
  public void testEscaleno() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(2, 3, 4);
    int expected = tipos.ESCALENO.value();
    assertEquals(expected, actual);
  }

	//T2 Válido
  @Test
  public void testEquilatero() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(5, 5, 5);
    int expected = tipos.EQUILATERO.value();
    assertEquals(expected, actual);
  }

	//T3 Válido
  @Test
  public void testIsosceles() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(6, 6, 7);
    int expected = tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

	//Variante de 3
  @Test
  public void primeiroVarianteDeTres() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(6, 7, 6);
    int expected = tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }
  
	//Teste Extra_Isosceles
  @Test
  public void segundoVarianteDeTres() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(7, 6, 6);
    int expected = tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

	//Valor ZERO
  @Test(expected = InvalidAttributeValueException.class)
  public void valorZero() throws InvalidAttributeValueException {
    App.identificaTriangulo(8, 0, 9);
  }

	//Valor NEGATIVO
  @Test(expected = InvalidAttributeValueException.class)
  public void valorNegativo() throws InvalidAttributeValueException {
    App.identificaTriangulo(2, 3, -4);
  }

	//Linha(Nao é triangulo)
  @Test
  public void valoresNaoTriangulares() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 2, 3);
    int expected = tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }
  
	//Variante de 7
  @Test
  public void primeiroVarianteDeSete() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 3, 2);
    int expected = tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

	//Valor não é triangulo
  @Test
  public void segundoVarianteDeSete() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(3, 1, 2);
    int expected = tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

	//Linha Longa
  @Test
  public void linhaLonga() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 2, 8);
    int expected = tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

	//Variante 9
  @Test
  public void varianteDeNove() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(8, 1, 2);
    int expected = tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

	//Todos ZEROS
  @Test(expected = InvalidAttributeValueException.class)
  public void todosZero() throws InvalidAttributeValueException {
    App.identificaTriangulo(0, 0, 0);
  }
}

import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLongerArray() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceEvenArray() {
    int[] input1 = {1, 2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2, 1}, input1);
  }

  @Test
  public void testReverseInPlaceOddArray() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {0.0, 2, 4, -1.2, -1.2};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowest2(){
    double[] input = {2, 2};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
}

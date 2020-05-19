package gvsucis;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NeighborsJaggedTest {

  @Test
  public void jaggedOrthogonal_v1() {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0 } };
    int[][] expected = { { 2, 0, 2 }, { 1, 3, 1, 1 }, { 1, 2, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void jaggedOrthogonal_v2() {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 8, 9, 0 } };
    int[][] expected = { { 2, 0, 2 }, { 1, 3, 1, 2, 0 }, { 1, 2, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void jaggedOrthogonal_v3() {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7}, { 8, 9, 0 } };
    int[][] expected = { { 1, 1, 2, 0 }, { 2, 1, 2 }, { 0, 3, 0 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void jaggedOrthogonal_v4() {
    int[][] matrix = { { 1, 2, 3, 4, 5 }, { 5, 6, 7}, { 8, 9, 0 } };
    int[][] expected = { { 1, 1, 2, 0, 1 }, { 2, 1, 2 }, { 0, 3, 0 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }


  //
  // All
  //

  @Test
  public void jaggedAll_v1() {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0 } };
    int[][] expected = { { 2, 2, 2 }, { 2, 5, 2, 2 }, { 1, 4, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  public void jaggedAll_v2() {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 8, 9, 0 } };
    int[][] expected = { { 2, 2, 2 }, { 2, 5, 2, 3, 0 }, { 1, 4, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void jaggedAll_v3() {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7}, { 8, 9, 0 } };
    int[][] expected = { {2, 1, 3, 0 }, { 3, 3, 4 }, { 1, 3, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void jaggedAll_v4a() {
    int[][] matrix = { { 1, 2, 3, 4, 5 }, { 5, 6, 7}, { 8, 9, 0 } };
    int[][] expected = { {2, 1, 3, 0, 1 }, { 3, 3, 4 }, { 1, 3, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }


  public void jaggedAll_v4b() {
    int[][] matrix = { { 1, 2, 3, 4, 6 }, { 5, 6, 7}, { 8, 9, 0 } };
    int[][] expected = { {2, 1, 3, 1, 1 }, { 3, 3, 4 }, { 1, 3, 1 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }


}
package gvsucis;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NeighborsEasyTest {

  @Test
  public void threeByThreeOrthogonal_v1() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expected = { { 2, 0, 2 }, { 0, 4, 0 }, { 2, 0, 2 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void threeByThreeOrthogonal_v2() {
    int[][] matrix = {{1, 1, 1}, {2, 2, 2}, {3, 4, 3}};
    int[][] expected = { { 1, 1, 1 }, { 1, 3, 1 }, { 2, 1, 2 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void threeByThreeOrthogonal_v3() {
    int[][] matrix = {{1, 1, 1}, {3, 3, 3}, {5, 5, 6}};
    int[][] expected = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 1, 0 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void threeByThreeOrthogonal_v4() {
    int[][] matrix = {{2, 2, 2}, {2, 2, 2}, {4, 4, 4}};
    int[][] expected = { { 2, 3, 2 }, { 3, 4, 3 }, { 2, 3, 2 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void fourByFourOrthogonal_v1() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {13, 14, 15, 16}};
    int[][] expected = { { 1, 1, 2, 1 }, { 1, 2, 2, 2 }, { 1, 2, 2, 2}, {1, 1, 2, 1} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void fourByThreeOrthogonal_v1() {
    int[][] matrix = {{1, 2, 3}, {1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
    int[][] expected = { { 1, 1, 1 }, { 2,1, 2}, { 1, 3, 1}, {1, 2, 1} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  @Test
  public void threeByFourOrthogonal_v1() {
    int[][] matrix = {{1, 2, 3, 4}, {6, 6, 8, 8}, {2, 3, 4, 5}};
    int[][] expected = { { 2, 1, 3, 1 }, { 2, 3, 3, 2 }, { 1, 3, 1, 2} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsOrthogonal(matrix));
  }

  //
  // All 
  //

  @Test
  public void threeByThreeAll_v1() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expected = { { 2, 2, 2 }, { 2, 4, 2 }, { 2, 2, 2 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void threeByThreeAll_v2() {
    int[][] matrix = {{1, 1, 1}, {2, 2, 2}, {3, 4, 3}};
    int[][] expected = { { 2, 3, 2 }, { 2, 3, 2 }, { 3, 3, 3 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void threeByThreeAll_v3() {
    int[][] matrix = {{1, 1, 1}, {3, 3, 3}, {5, 5, 6}};
    int[][] expected = { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 1, 0 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void threeByThreeAll_v4() {
    int[][] matrix = {{2, 2, 2}, {2, 2, 2}, {4, 4, 4}};
    int[][] expected = { { 3, 5, 3 }, { 5, 8, 5 }, { 3, 5, 3 } };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void fourByFourAll_v1() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {13, 14, 15, 16}};
    int[][] expected = { { 2, 1, 4, 1 }, { 3, 2, 6, 2 }, { 3, 2, 6, 2}, {2, 1, 4, 1} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void fourByThreeAll_v1() {
    int[][] matrix = {{1, 2, 3}, {1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
    int[][] expected = { { 2, 1, 2 }, { 3, 3, 3}, { 2, 5, 2}, {1, 4, 1} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }

  @Test
  public void threeByFourAll_v1() {
    int[][] matrix = {{1, 2, 3, 4}, {6, 6, 8, 8}, {2, 3, 4, 5}};
    int[][] expected = { { 3, 3, 5, 2 }, { 3, 5, 5, 3 }, { 2, 5, 3, 3} };
    assertArrayEquals(expected, Neighbors.numEvenNeighborsAll(matrix));
  }




}
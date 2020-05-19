package gvsucis;

/**
 * Analyze the neighboring cells in a two-dimensional array.
 */
public class Neighbors {

  // for each element in the array, count the number of neighbors that have even
  // values.
  // return a *new* 2D array with the count of even neighbors for each cell.
  // (Don't modify the parameter)

  // For example, given
  //
  // 1, 2, 3
  // 4, 5, 6
  // 7, 8, 9
  //
  // numEvenNeighborsOrthogonal should return
  //
  // 2, 0, 2
  // 0, 4, 0
  // 2, 0, 2
  //
  // and numEvenNeighborsAll should return
  //
  // 2, 2, 2
  // 2, 4, 2
  // 2, 2, 2

  // just look North, South, East, and West.
  public static int[][] numEvenNeighborsOrthogonal(int[][] matrix) {

    int[][] answer = null;
    // 
    return answer;
  }

  // Look at all neighbors --- including diagonal neighbors.
  public static int[][] numEvenNeighborsAll(int[][] matrix) {

    // A short-cut is to begin with the count of evens from the orthogonal neighbors
    // then just look at the diagonal neighbors. (You aren't required to do this.
    // You may start from scratch, if you prefer.)
    int[][] answer = numEvenNeighborsOrthogonal(matrix);

    // 
    return answer;
  }

}
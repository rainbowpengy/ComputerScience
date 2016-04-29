public class CharMatrix
{
  // Fields:
  private static final char SPACE = ' ';
  private final char[][] grid;

  /*
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
      this(rows, cols, SPACE);
  }

  /*
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];
    fillRect(0, 0, (rows - 1), (cols - 1), fill);
  }

  /*
   * Returns the number of rows in grid
   */
  public int numRows()
  {
      return grid.length;
  }

  /*
   * Returns the number of columns in grid
   */
  public int numCols()
  {
      return grid[0].length;
  }

  /*
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
      return grid[row][col];
  }

  /*
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
      grid[row][col] = ch;
  }

  /*
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
      return charAt(row, col) == SPACE;
  }

  /*
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for(int i = row0; i <= row1; ++i) {
          for(int j = col0; j <= col1; ++j) {
              this.setCharAt(i, j, fill);
          }
      }
  }

  /*
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      this.fillRect(row0, col0, row1, col1, SPACE);
  }

  /*
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
      int count = 0;
      for (int col = 0; col < numCols(); ++col){
          if (!isEmpty(row, col)) {
              ++count;
          }
      }
      return count;
  }

  /*
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
      int count = 0;
      for(int row = 0; row < numRows(); row++) {
          if(!isEmpty(row, col)) {
              count++;
          }
      }
      return count;
  }
}

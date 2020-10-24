
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int centerCol = size / 2;
        int count = 0;
        int row = 0;
        int col = centerCol;
        int num = 1;
        square.placeValue(col, row, num);
        num++;
        while (num <= size * size) {
            if (square.readValue(col + 1, row - 1) == 0) {
                row = row - 1;
                col = col + 1;
                square.placeValue(col, row, num);
                num++;
                
            } else if (square.readValue(col + 1, row - 1) > 0) {
                row = row + 1;
                square.placeValue(col, row, num);
                num++;
                
            } else {
                // if out of bounds alternative is filled
                if (row - 1 < 0 && col + 1 < size) {
                    if (square.readValue(col + 1, size - 1) > 0) {
                        row = row + 1;
                        square.placeValue(col, row, num);
                        num++;
                    } else {
                        row = size - 1;
                        col++;
                        square.placeValue(col, row, num);
                        num++;
                    }
                } else if (row - 1 >= 0 && col + 1 == size) {
                    if (square.readValue(0, row - 1) > 0) {
                        row = row + 1;
                        square.placeValue(col, row, num);
                        num++;
                    } else {
                        row--;
                        col = 0;
                        square.placeValue(col, row, num);
                        num++;
                    }
                } else {
                    row++;
                    square.placeValue(col, row, num);
                    num++;
                }
            }
        }
        return square;
    }

}

public class Product {
    public String productID;
    public double price;

    public static void main(String[] args) {
        System.out.println(isColumnError(column));
        for (int[] column2 : column2) {
            System.out.println("elele");
            System.out.println(column2[0]);
            System.out.println(column2[1]);
            System.out.println(column2[2]);
            System.out.println(column2[3]);
            System.out.println();
        }

        updateColumn(column2);

        for (int[] column2 : column2) {
            System.out.println("After");
            System.out.println(column2[0]);
            System.out.println(column2[1]);
            System.out.println(column2[2]);
            System.out.println(column2[3]);
            System.out.println();
        }

    }

    public Product(String productID, double pr) {
        // implementation not shown
    }

    public String getProductID() {
        return productID;
    }

    public boolean canReplace(Product pl) {
//        System.out.println(getProductID());
        // implementation not shown
//        if (pl.productID.compareTo(productID) > 0) {
//            if ((pl.price - price) > 0) {
//                return true;
//            }
//
//        }
        return false;
    }

    public boolean canReplace(Product p, double pr) {
        return false;

    }

    // other instance variables, constructors and methods are not shown
    public static int[] column = {
            3,
            2,
            1,
            2

    };
    public static int[][] column2 = {
            {
                    3,
                    2,
                    1,
                    2

            },
            {
                    3,
                    2,
                    2,
                    2

            },
            {
                    1,
                    2,
                    2,
                    2

            }
    };

    public static boolean isColumnError(int[] col) {
        for (int i = 0; i < col.length; i++) {
            if (col[i] != 2 || col[i] != 3) {
                return true;
            }
        }
        return false;
    }

    public static void updateColumn(int[][] array) {
        int i = 0;
        for (int[] column2 : column2) {

            if (isColumnError(column2) && i == 0) {
                array[i] = array[i + 1];
            } else if (isColumnError(column2)) {
                try {
                    array[i] = array[i - 1];
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            } else {
                array[i] = array[i - 1];
            }
            i++;
        }
    }

}

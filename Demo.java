public class Demo {
    public static void printLoop(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    
    public static String arrayDeepToString(int[][] arr) {
        String result = "{ ";
            for (int i = 0; i < arr.length; i ++) { //looping rows 
                for (int j = 0; j < arr[i].length; j++) { //looping numbers in each row
                    if (j ==0) {
                        result += "{";
                    }
                    if (j != arr[i].length-1) {
                        result += arr[i][j];
                        result += ", ";
                    }
                    if (j == arr[i].length-1) {
                        result += arr[i][j];
                        result += "}, ";
                    }
                }
            }    
        return(result.substring(0, result.length()-2) +" }");
    }
    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = ((int)(Math.random() * (maxValue + 1)));
            }
        }
        return(arr);
    }
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int [][] arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int random = (int)(Math.random() * (cols + 1));
                arr[i] = new int[random];
                for (int k = 0; k < arr[i].length; k++) {
                    arr[i][k] = (int)(Math.random() * (maxValue + 1));
                }
            }
        }
        return(arr);
    }  

    public static void main(String[]args) {
        if (args.length == 0) {
            printLoop(5);
        }
        else {
            int n = Integer.parseInt(args[0]);
        printLoop(n);
        }
      
    }
}

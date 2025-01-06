package academy.tochkavhoda.introduction;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }
    public int mul (int x, int y){
        return x * y;
    }
    public int div (int x, int y){
        return x / y;
    }
    public int mod (int x, int y){
        return x % y;
    }
    public boolean isEqual (int x, int y){
        boolean True = true;
        boolean False = false;
        if (x == y)
            return True;
        else
            return False;
    }
    public boolean isGreater (int x, int y){
        boolean True = true;
        boolean False = false;
        if (x > y)
            return True;
        else
            return False;
    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        boolean True = true;
        boolean False = false;
        if (xLeft <= x & yTop <= y & x <= xRight & y <= yBottom)
            return True;
        else
            return False;
    }
    public int sum(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        if (array.length != 0)
            return sum;
        else
            return 0;
    }
    public int mul(int[] array){
        int multi = 1;
        for (int i=0; i<array.length; i++) {
            multi *= array[i];
        }
        if (array.length != 0)
            return multi;
        else
            return 0;
    }
    public int min(int[] array){
        int mini = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if (array[i] < mini)
                mini = array[i];
        }
        if (array.length != 0)
            return mini;
        else
            return Integer.MAX_VALUE;
    }
    public int max(int[] array){
        int maxi = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++) {
            if (array[i] > maxi)
                maxi = array[i];
        }
        if (array.length != 0)
            return maxi;
        else
            return Integer.MIN_VALUE;
    }
    public double average(int[] array){
        double aver;
        double sum = 0;
        for (int i =0; i<array.length; i++){
            sum += array[i];
        }
        aver = sum / array.length;
        if (array.length != 0)
            return aver;
        else
            return 0;
    }
    public boolean isSortedDescendant(int[] array){
        boolean True = true;
        boolean False = false;
        for (int i=0; i < array.length - 1; i++){
            if(array[i] <= array[i+1])
                return False;
        }
        return True;
    }
    public void cube(int[]array){
        int tmp;
        for(int i=0; i < array.length; i++){
            tmp = array[i];
            array[i] = (int) Math.pow(tmp, 3);
        }
    }
    public boolean find(int[]array, int value){
        boolean True = true;
        boolean False = false;
        for(int i=0; i < array.length; i++){
            if (array[i] == value)
                return True;
        }
        return False;
    }
    public void reverse(int[]array){
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
    public boolean isPalindrome(int[]array){
        boolean True = true;
        boolean False = false;
        for (int i = 0; i < array.length / 2; i++){
            if (array[i] != array[array.length - i - 1])
                return False;
        }
        return True;
    }
    public int sum(int[][] matrix){
        int sum = 0;
        for (int i=0; i < matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
    public int max(int[][] matrix){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i < matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                if (maxi < matrix[i][j])
                    maxi = matrix[i][j];
            }
        }
        if (matrix.length != 0)
            return maxi;
        else
            return Integer.MIN_VALUE;
    }
    public int diagonalMax(int[][] matrix){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i < matrix.length; i++){
            if (maxi < matrix[i][i])
                maxi = matrix[i][i];
        }
        if (matrix.length != 0)
            return maxi;
        else
            return Integer.MIN_VALUE;
    }
    public boolean isSortedDescendant(int[][] matrix){
        boolean True = true;
        boolean False = false;
        for (int i=0; i < matrix.length - 1; i++){
            for (int j=0; j < matrix[i].length - 1; j++){
                if (matrix[i][j] <= matrix[i][j+1])
                    return False;
            }
        }
        return True;
    }
    public char getCharByCode(short code){
        return (char) code;
    }
    public short getCodeByChar(char character){
        return (short) character;
    }
    public char getCharByCodeAndOffset(char ch, short offset){
        int sum;
        sum = (short) ch + offset;
        return (char) sum;
    }
    public boolean isGreaterOrEqual(char ch1, char ch2){
        if ((short) ch1 >= (short) ch2)
            return true;
        else
            return false;
    }
    public char getAverageChar(char ch1, char ch2){
        int avgsum;
        avgsum = ((short) ch1 + (short) ch2) / 2;
        return (char) avgsum;
    }

}
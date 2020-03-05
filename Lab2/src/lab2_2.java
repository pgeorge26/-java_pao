public class lab2_2 {
    public static void main(String[] args) {
        char[] charArray = {'j', 'a', 'b', 'c'};
        System.out.println(charArray[1]);
        for (char c : charArray)
            System.out.print(c);
        System.out.println();
        int[][] matrix = new int[3][3];
        matrix[0][0]=26;
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

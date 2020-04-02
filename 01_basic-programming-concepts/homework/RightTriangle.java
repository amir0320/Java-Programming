public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTri;

        // each integer is positive or not?
        isRightTri = (a > 0) && (b > 0) && (c > 0);

        // The sum of the squares of two of the integers must equal the square of the third integer.
        isRightTri = isRightTri && (((a*a) == ((c*c) + (b*b))) || ((b*b) == ((a*a) + (c*c))) || ((c*c) == ((a*a) + (b*b))));
        System.out.println(isRightTri);
    }

}

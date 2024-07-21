package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int temp = 1;
        int tempI;

        for (int i = 1; i < cathetusLength-2; i++) {
            for (int j = 1; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            tempI = i;
            boolean flag = true;
            for (int j = 1; j <= temp; j++) {

                if (tempI == 1) flag = false;
                if (flag) {
                    System.out.print("*");
                    tempI--;
                } else {
                    System.out.print(" ");
                    tempI++;
                }
            }
            temp += 2;

            for (int j = 1; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

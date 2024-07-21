package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int temp = 1;
        int tempI;

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            tempI = i;
            boolean flag = true;
            for (int j = 1; j <= temp; j++) {
                System.out.print(tempI);
                if (tempI == 1) flag = false;
                if (flag) {
                    tempI--;
                } else {
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
        new Pyramid().printPyramid(7);
    }
}

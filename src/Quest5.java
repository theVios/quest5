import java.util.Scanner;
public class Quest5 {
    public static void main(String[] args) {

        Scanner scannerStart = new Scanner(System.in);
        Scanner scannerStep = new Scanner(System.in);

        System.out.println("input you X start coor");
        int xStart = scannerStart.nextInt();
        System.out.println("input you Y start coor");
        int yStart = scannerStart.nextInt();
        System.out.println("your start point: " + "(" + xStart + ":" + yStart +")");
        while (true) {
            System.out.println("input X coor where you whant to go");
            int xStep = scannerStep.nextInt();
            System.out.println("input Y coor where you whant to go");
            int yStep = scannerStep.nextInt();
            if (
                    (xStep == xStart - 2 && yStep == yStart - 1) ||
                            (xStep == xStart - 2 && yStep == yStart + 1) ||
                            (xStep == xStart + 2 && yStep == yStart - 1) ||
                            (xStep == xStart + 2 && yStep == yStart + 1) ||
                            (yStep == yStart - 2 && xStep == xStart - 1) ||
                            (yStep == yStart - 2 && xStep == xStart + 1) ||
                            (yStep == yStart + 2 && xStep == xStart - 1) ||
                            (yStep == yStart + 2 && xStep == xStart + 1)

                                    && xStep <= 8 && xStep >= 0
                                    && yStep <= 8 && yStep >= 0)

            {
                System.out.println("ti poshel na: " + "(" + xStep + ":" + yStep + ")");
            } else {
                System.out.println("tuda nel'za");
            }
        }
    }
}

package goldman;

public class Triangle {
    private static double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
    }

    // Method to check if a point lies inside the triangle formed by three points
    private static boolean isPointInTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int xp, int yp) {
        double areaABC = calculateArea(x1, y1, x2, y2, x3, y3);
        double areaPAB = calculateArea(xp, yp, x1, y1, x2, y2);
        double areaPBC = calculateArea(xp, yp, x2, y2, x3, y3);
        double areaPCA = calculateArea(xp, yp, x3, y3, x1, y1);

        return (areaABC == areaPAB + areaPBC + areaPCA);
    }

    public static int checkPointsInTriangle(int x1, int y1, int x2, int y2, int x3, int y3,
                                            int xp, int yp, int xq, int yq) {
        if (calculateArea(x1, y1, x2, y2, x3, y3) == 0) {
            return 0;  // Not a valid triangle
        }

        boolean pInTriangle = isPointInTriangle(x1, y1, x2, y2, x3, y3, xp, yp);
        boolean qInTriangle = isPointInTriangle(x1, y1, x2, y2, x3, y3, xq, yq);

        if (pInTriangle && qInTriangle) {
            return 3;
        } else if (pInTriangle) {
            return 1;
        } else if (qInTriangle) {
            return 2;
        } else {
            return 4;
        }
    }
}

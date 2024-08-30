package goldman;

import java.util.ArrayList;
import java.util.List;

public class Encircular {
    private static boolean isEncircled(int direction) {
        return direction != 0;
    }

    public static List<String> doesCircleExist(String[] commands) {
        List<String> results = new ArrayList<>();

        for (String command : commands) {
            int x = 0, y = 0, direction = 0;

            for (char cmd : command.toCharArray()) {
                if (cmd == 'G') {
                    switch (direction % 4) {
                        case 0:
                            y += 1;
                            break;
                        case 1:
                            x += 1;
                            break;
                        case 2:
                            y -= 1;
                            break;
                        case 3:
                            x -= 1;
                            break;
                    }
                } else if (cmd == 'L') {
                    direction -= 1;
                } else if (cmd == 'R') {
                    direction += 1;
                }
            }

            if (isEncircled(direction % 4) || (x == 0 && y == 0)) {
                results.add("YES");
            } else {
                results.add("NO");
            }
        }

        return results;
    }
}

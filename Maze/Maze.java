import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maze {
    private static final String PATH = "0";
    private static final String WALL = "1";
    private static final String BLOCKED = "9";
    private static final String ROUTE = "\u2587";

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File("map.txt"))));

            int x = 0, y = 0;
            String[] xy = br.readLine().split(" ");
            x = Integer.parseInt(xy[0]);
            y = Integer.parseInt(xy[1]);

            String[][] map = new String[x][y];
            for (int i = 0; i < x; i++) {
                String line = br.readLine();
                String[] pixel = line.split(" ");
                for (int j = 0; j < y; j++) {
                    map[i][j] = pixel[j];
                }
            }
            printMap(map);
            if (hasRoute(map, 0, 0)) {
                System.out.println("can pass!");
            }
            else {
                System.out.println("no Pass!");
            }
            printMap(map);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasRoute(String[][] map, int x, int y) {
		boolean result = false;
		if (x < 0 || y < 0 || x >= map.length || y >= map[0].length) {
            printMap(map);
			return result;
		// } else if (map[x][y].equals(BLOCKED) || map[x][y].equals(WALL)) {
		// 	return result;
		} else if (x == 7 && y == 7) {
            printMap(map);
			map[7][7] = ROUTE;
			return true;
		} else if (map[x][y].equals(PATH)) {
			map[x][y] = ROUTE;
            if (hasRoute(map, x - 1, y) || 
                hasRoute(map, x, y + 1) || 
                hasRoute(map, x + 1, y) || 
                hasRoute(map, x, y - 1)) {
                    printMap(map);
				return true;
			}
            printMap(map);
			map[x][y] = BLOCKED;
		}
		return result;
	}

    public static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
    }
}
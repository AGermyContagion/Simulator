/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jeremywarren
 */
public class Voronoi {
    private ArrayList<Point> points;

    public Voronoi() {
        this.points = new ArrayList<>();
    }
    
    /**
     *
     * @param maxX the maximum x value
     * @param maxY the maximum y value
     * @param points the number of points to generate
     */
    public void generatePoints(int maxX, int maxY, int points) {
        Random rnd = new Random();
        int rx;
        int ry;
        for(int i = 0; i < points; i++) {
            rx = rnd.nextInt(maxX);
            ry = rnd.nextInt(maxY);
            while (new Point(rx, ry).containedIn(this.points) || (((rx == 0) || (rx == maxX)) || ((ry == 0) || (ry == maxY)))) {
                rx = rnd.nextInt(maxX);
                ry = rnd.nextInt(maxY);
            }
            this.points.add(new Point(rx, ry));
        }
    }
    
    public ArrayList getPoints() {
        return this.points;
    }
}

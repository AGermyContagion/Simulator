/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulator;

import java.util.ArrayList;

/**
 *
 * @author Jeremy Andrew Warren
 */
public class Point {
    private int x;
    private int y;
    
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    Point() {
        this.x = 0;
        this.y = 0;
    }
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public boolean isEqual(Point p) {
        return ((this.getX() == p.getX()) && (this.getY() == this.getX()));
    }
    
    /**
     *
     * @param pts
     * @return
     */
    public boolean containedIn(ArrayList<Point> pts) {
        for (int j = 0; j < pts.size(); j ++) {
            if ((this.getX() == pts.get(j).getX()) && (this.getY() == pts.get(j).getY())) {
                return true;
            }
        }
        return false;
    }
}

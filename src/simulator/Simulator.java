/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

/**
 *
 * @author jerewarr
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voronoi map = new Voronoi();
        map.generatePoints(4, 4, 4);
        System.out.println(map.getPoints());
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;
import javax.swing.JFrame;

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
        
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        VoronoiDraw vd = new VoronoiDraw();
        frame.add(vd);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        map.generatePoints(4, 4, 4);
    }
}
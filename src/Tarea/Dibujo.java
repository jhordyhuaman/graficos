/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JApplet;
import javax.swing.JFrame;



/**
 *
 * @author AlphaTeam
 */
public class Dibujo extends JApplet {
    final static BasicStroke stroke = new BasicStroke(2.0f);
    
    public static void Dibujo1(Graphics g) {
        double x,y;
        Principal p = new Principal();
         p.jPanel1.repaint();
    
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.DARK_GRAY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//Filtro antialiasing              
        // dibujo 
        
        g2.drawOval(0, 0, 600, 600);
        g2.drawLine(300, 0, 300, 600);
        g2.drawLine(0, 300, 600, 300);
        g2.drawLine(90, 90, 90, 510);
        g2.drawLine(90, 510, 510, 510);
        g2.drawLine(510, 510, 510, 90);
        g2.drawLine(510, 90, 90, 90);
        g2.drawLine(150, 150, 150, 450);
        g2.drawLine(150, 450, 450, 450);
        g2.drawLine(450, 450, 450, 150);
        g2.drawLine(450, 150, 150, 150);
        g2.drawLine(0, 300, 300, 600);
        g2.drawLine(300, 600, 600, 300);
        g2.drawLine(600, 300, 300, 0);
        g2.drawLine(300, 0, 0, 300);
        g2.drawLine(90, 300, 300, 510);
        g2.drawLine(300, 510, 510, 300);
        g2.drawLine(510, 300, 300, 90);
        g2.drawLine(300, 90, 90, 300);
        g2.drawLine(375, 75, 75, 375);
        g2.drawLine(75, 225, 375, 525);
        g2.drawLine(525, 225, 225, 525);
        g2.drawLine(225, 75, 525, 375);
        g2.drawLine(190, 90, 190, 510);
        g2.drawLine(410, 90, 410, 510);
        g2.drawLine(90, 400, 510, 400);
        g2.drawLine(90, 200, 510, 200);
        g2.drawLine(510, 90, 90, 510);
        g2.drawLine(90, 90, 510, 510);

    }

public static void Dibujo2(Graphics g) {
        Principal p = new Principal();
         p.jPanel1.repaint();
 
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.DARK_GRAY);g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);             
       // Dibujo 01
        g2.drawOval(0, 0, 600, 600);
        g2.drawLine(45,150, 555, 150);
        g2.drawLine(45, 450, 555, 450);
        g2.drawLine(300, 0, 300, 600);
        g2.drawLine(300, 0, 45, 450);
        g2.drawLine(300, 0, 555, 450);
        g2.drawLine(45, 150, 300, 600);
        g2.drawLine(555, 150, 300, 600);
        g2.drawLine(45, 150, 555, 450);
        g2.drawLine(555, 150, 45, 450);
        g2.drawLine(172, 150, 172, 450);
        g2.drawLine(428, 150, 428, 450);
        g2.drawLine(172, 225, 428, 225);
        g2.drawLine(172, 375, 428, 375);
        g2.drawLine(172, 225, 300, 450);
        g2.drawLine(215, 150, 385, 450);
        g2.drawLine(300, 150, 428, 375);
        g2.drawLine(428, 225, 300, 450);
        g2.drawLine(385, 150, 215, 450);
        g2.drawLine(300, 150, 172, 375);
        g2.drawLine(110, 262, 490, 262);
        g2.drawLine(110, 338, 490, 338);
        g2.drawLine(110, 340, 172, 450);
        g2.drawLine(172, 150, 110, 262);
        g2.drawLine(428, 150, 490, 262);
        g2.drawLine(490, 338, 428, 450);
        g2.drawLine(110, 338, 365, 485);
        g2.drawLine(490, 338, 235, 485);
        g2.drawLine(235, 110, 490, 262);
        g2.drawLine(365, 110, 110, 262);
        g2.drawLine(235, 110, 365, 110);
        g2.drawLine(235, 485, 365, 485);
        g2.drawLine(365, 110, 172, 450);
        g2.drawLine(235, 110, 428, 450);
        g2.drawLine(235, 485, 428, 150);
        g2.drawLine(365, 485, 172, 150);
        g2.drawLine(130, 300, 470, 300);
 
  }
public static void Dibujo3(Graphics g) {
        Principal p = new Principal();
         p.jPanel1.repaint();
        double x,y;
        x = 100;y = 50;
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.DARK_GRAY);g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);             
       // Dibujo 03
        
        g2.drawOval(0, 0, 600, 600);
        g2.drawOval(151, 151, 298, 298);
        g2.drawOval(20, 75, 298, 298);
        g2.drawOval(148, 0, 298, 298);
        g2.drawOval(22, 225, 298, 298);
        g2.drawOval(280, 225, 298, 298);
        g2.drawOval(150, 300, 298, 298);
        g2.drawOval(280, 75, 298, 298);
        g2.drawLine(45,150, 555, 150);
        g2.drawLine(45, 450, 555, 450);
        g2.drawLine(300, 0, 300, 600);
        g2.drawLine(300, 0, 45, 450);
        g2.drawLine(300, 0, 555, 450);
        g2.drawLine(45, 150, 300, 600);
        g2.drawLine(555, 150, 300, 600);
        g2.drawLine(172, 225, 428, 225);
        g2.drawLine(172, 375, 428, 375);
        g2.drawLine(172, 225, 300, 450);
        g2.drawLine(428, 225, 300, 450);
        g2.drawLine(385, 150, 215, 450);
        g2.drawLine(428, 225, 300, 450);
        g2.drawLine(385, 150, 215, 450);
        g2.drawLine(300, 150, 172, 375);
        g2.drawLine(215, 150, 385, 450);
        g2.drawLine(300, 150, 428, 375);
        g2.drawLine(130, 300, 470, 300);
        g2.drawLine(428, 225, 172, 375);
        g2.drawLine(172, 225, 428, 375);

        
        
}

   
}


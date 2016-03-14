/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;
import FractalTree.Principal;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.*;


/**
 *
 * @author AlphaTeam
 */
public class Dibujo {
    final static BasicStroke stroke = new BasicStroke(2.0f);
    
    public static void Dibujar(Graphics g) {
        double x,y;
        Principal p = new Principal();
        int w= p.jPanel1.getWidth();
        int h = p.jPanel1.getHeight();

        x = 100;
        y = 100;
       
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.DARK_GRAY);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//Filtro antialiasing              
        

       // p1 circulo
        g2.setStroke(stroke);
        g2.draw(new Ellipse2D.Double(x,y,400,400));
        // p2 cuadrado 
        g2.setStroke(stroke);
        g2.draw(new Rectangle2D.Double(x+60,y+60,280,280));
        // p3 lineas 
        
        g2.draw(new Line2D.Double(x+0, y+200, x+400,y+200));
        g2.draw(new Line2D.Double(x+200,y+0, x+200, y+400));
        
        ///--
        g2.draw(new Line2D.Double(x+0, y+200, x+200, y+0));
       
        g2.draw(new Line2D.Double(x+0, y+200, x+200, y+400));
        
        g2.draw(new Line2D.Double(x+400, y+200, x+200, y+400));
        
        g2.draw(new Line2D.Double(x+400, y+200, x+200, y+0));
       
        //-----------
        g2.draw(new Line2D.Double(x+60, y+60, x+340, y+340));
        g2.draw(new Line2D.Double(x+60, y+340, x+340, y+60));
        //------
        g2.draw(new Line2D.Double(x+200, y+60, x+60, y+200));
        g2.draw(new Line2D.Double(x+200, y+60, x+340, y+200));
        g2.draw(new Line2D.Double(x+200, y+340, x+340, y+200));
        g2.draw(new Line2D.Double(x+200, y+340, x+60, y+200));
        //---
        g2.draw(new Line2D.Double(x+100, y+100, x+100, y+300));
        g2.draw(new Line2D.Double(x+300, y+300, x+100, y+300));
        g2.draw(new Line2D.Double(x+300, y+300, x+300, y+100));
        g2.draw(new Line2D.Double(x+100, y+100, x+300, y+100));
        
        //---
        g2.draw(new Line2D.Double(x+130, y+60, x+130, y+340));
        g2.draw(new Line2D.Double(x+270, y+60, x+270, y+340));
        //---
        g2.draw(new Line2D.Double(x+60, y+130, x+340, y+130));
        g2.draw(new Line2D.Double(x+60, y+270, x+340, y+270));
    }
}


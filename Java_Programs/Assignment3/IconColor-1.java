/*
DWAYNE FRASER
HOMEWORK 3.4
 */

package q4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
   Icon Color Class
*/
public class IconColor implements Icon
{
    /**
       Constructor.
       @param width
       @param color 
    */
    public IconColor(int width, Color color)
    {
	this.width = width;
	this.color = color;
    }
    
    /**
       @return the icon width
    */
    @Override
    public int getIconWidth()
    {
	return width;
    }
    
    /**
       @return the icon height
    */
    @Override
    public int getIconHeight()
    {
	return width;
    }
    
    /**
       Paint Icon
    */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
	Graphics2D g2 = (Graphics2D)g;
	double r = 100;     

	Rectangle2D el = new Rectangle2D.Double(x + width/2 - r, y + width/2 - r, width/2, width/2);
	g2.setColor(color);
	g2.fill(el);
    }
    
    /**
    * Sets Icon Color
     * @param color
    */
    public void setColor(Color color)
    {
	this.color = color;
    }
    
    private Color color;
    private final int width;
}
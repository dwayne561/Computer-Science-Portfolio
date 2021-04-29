/*
DWAYNE FRASER
HOMEWORK 3.4
 */

package q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame
{
    /*
    *   Main Class
     */
    public static void main(String[] args)
    {

        final IconColor icon = new IconColor(300, Color.YELLOW);
        
	final JLabel label = new JLabel(icon);
        
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();
        
	panel.setLayout(new FlowLayout());

	Color []colors = new Color[]{Color.RED, Color.YELLOW, Color.BLUE};
        
	String []colorNames = new String[]{"Red", "Yellow", "Blue"};
        
	JButton []buttons = new JButton[colors.length];
        
	int x;

	for (x = 0; x < colors.length; x++) {
            
	    final Color c = colors[x];
	    
	    buttons[x] = new JButton(colorNames[x]);

	    ActionListener actionListener = (ActionEvent action) -> {
                icon.setColor(c);
                label.repaint();
            };


	    buttons[x].addActionListener(actionListener);
	    panel.add(buttons[x]);
	} 
		
	frame.add(label, BorderLayout.CENTER);
	frame.add(panel, BorderLayout.SOUTH);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
    }  


}


package buoi10;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author trant
 */
public class javaswing {
    
    public static void main(String[] args) {
    
        JFrame frame = new JFrame();
        JButton button = new JButton("Trang");
        
        button.setBounds(130, 100, 100, 40);
        
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

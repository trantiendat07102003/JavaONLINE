package javaswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class JavaSwing {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();// tạo cửa sổ
        
        JButton button = new JButton("click"); // tạo nút
        
        button.setBounds(150, 225, 200, 50);// đặt tọa độ x,y,chiều ngang,chiều dọc
        frame.add(button);
        
        frame.setSize(500,500); // đặt chiều ngang và chiều dọc cho cửa sổ
        frame.setLayout(null);//đặt layout cho cửa sổ
        frame.setVisible(true);// đặt hiển thị cho màn hình
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// tắt khi ấn nút đóng
        
        
    }
    
}

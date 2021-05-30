package sk.stuba.fei.uim.oop.utility;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {
    public AppWindow(){
        createWindow();
    }
    private void createWindow(){
        ControlOfProgram controlOfProgram=new ControlOfProgram();
        JFrame appWindow = new JFrame();
        appWindow.setSize(2300,2300);
        appWindow.setLayout(new BorderLayout());
        appWindow.add("Center",controlOfProgram.myCanvas);
        appWindow.setDefaultCloseOperation(appWindow.EXIT_ON_CLOSE);
        appWindow.setVisible(true);
    }
}

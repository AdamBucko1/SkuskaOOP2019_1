package sk.stuba.fei.uim.oop.utility;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseMovement extends MouseAdapter {
    private ControlOfProgram controlOfProgram;
    Plus newPlus;
    Line newLine;
    int mouseStartX,mouseStartY,mouseEndX,mouseEndY;
    public MouseMovement(ControlOfProgram controlOfProgram){this.controlOfProgram=controlOfProgram;}
    @Override
    public void mousePressed(MouseEvent e){
        mouseStartX=e.getX();
        mouseStartY=e.getY();
        newPlus=new Plus(mouseStartX,mouseStartY,mouseStartX,mouseStartY);
        controlOfProgram.canvasRegistry.add(newPlus);
        System.out.println(e.getX());
        System.out.println(e.getY());
    }
    public void mouseDragged(MouseEvent e){
        mouseEndX=e.getX();
        mouseEndY=e.getY();
        //controlOfProgram.canvasRegistry.add(new Plus(mouseStartX,mouseStartY,mouseEndX,mouseEndY));
        newPlus.setMyDimensions(mouseStartX,mouseStartY,mouseEndX,mouseEndY);
        controlOfProgram.myCanvas.repaint();
        System.out.println(e.getX());
        System.out.println(e.getY());
    }
}

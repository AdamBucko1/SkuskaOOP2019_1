package sk.stuba.fei.uim.oop.utility;

import java.awt.*;

public class MyCanvas extends Canvas {
    private ControlOfProgram controlOfProgram;
    public MyCanvas(ControlOfProgram controlOfProgram) {this.controlOfProgram=controlOfProgram;
    }

    public void paint(Graphics g){
        for (int i=0;controlOfProgram.canvasRegistry.size()>i;i++){
            if (controlOfProgram.canvasRegistry.get(i).amIPlus==true){
               Plus plusObject= (Plus) controlOfProgram.canvasRegistry.get(i);
                g.fillRect(plusObject.getStartOfFirstRectangleX(),plusObject.getStartOfFirstRectangleY(), plusObject.getWidthOfFirstRectangle(), plusObject.getLengthOfFirstRectangle());
                g.fillRect(plusObject.getStartOfSecondRectangleX(), plusObject.getStartOfSecondRectangleY(), plusObject.getWidthOfSecondRectangle(), plusObject.getLengthOfSecondRectangle());
                System.out.println("I have drawn");
            }
        }
    }
}

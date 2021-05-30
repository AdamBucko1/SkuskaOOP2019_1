package sk.stuba.fei.uim.oop.utility;

import java.util.ArrayList;

public class ControlOfProgram {
    public MyCanvas myCanvas;
    private MouseMovement mouseMovement= new MouseMovement(this);
    public ArrayList<Shapes> canvasRegistry=new ArrayList<>();

    public ControlOfProgram() {
        this.myCanvas=new MyCanvas(this);
        myCanvas.addMouseListener(mouseMovement);
        myCanvas.addMouseMotionListener(mouseMovement);
    }
}

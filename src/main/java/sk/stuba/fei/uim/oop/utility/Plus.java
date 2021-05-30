package sk.stuba.fei.uim.oop.utility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Plus extends Shapes {
    private int startOfFirstRectangleX;
    private int startOfFirstRectangleY;
    private int widthOfFirstRectangle;
    private int lengthOfFirstRectangle;
    private int startOfSecondRectangleX;
    private int startOfSecondRectangleY;
    private int widthOfSecondRectangle;
    private int lengthOfSecondRectangle;
    public Plus(int startXPosition,int startYPosition, int endXPosition, int endYPosition){
        super();
        amIPlus=true;
        if ((startXPosition != endXPosition) && (startYPosition != endYPosition)){
setMyDimensions(startXPosition,startYPosition,endXPosition,endYPosition);}
    }

    public void setMyDimensions(int startXPosition,int startYPosition, int endXPosition, int endYPosition){
        System.out.println("startX "+startXPosition);
        System.out.println("startY "+startYPosition);
        System.out.println("endX "+endXPosition);
        System.out.println("endY "+endYPosition);


        if (endXPosition>startXPosition){
            startOfFirstRectangleX=startXPosition+((endXPosition-startXPosition)/3);
            startOfSecondRectangleX=startXPosition;
            System.out.println("start1X "+startOfFirstRectangleX);
            System.out.println("start2X "+startOfSecondRectangleX);
        }
        else {
            startOfFirstRectangleX=endXPosition+((startXPosition-endXPosition)/3);
            startOfSecondRectangleX=endXPosition;
        }

        if (endYPosition>startYPosition){
            startOfFirstRectangleY=startYPosition;
            startOfSecondRectangleY=startYPosition+ ((endYPosition-startYPosition)/3);
            System.out.println("start1Y "+startOfFirstRectangleY);
            System.out.println("start2Y "+startOfSecondRectangleY);
        }
        else{
            startOfFirstRectangleY=endYPosition;
            startOfSecondRectangleY=endYPosition+((startYPosition-endYPosition)/3);
        }


        widthOfFirstRectangle=Math.abs(startXPosition-endXPosition)/3;
        lengthOfFirstRectangle=Math.abs(startYPosition-endYPosition);
        widthOfSecondRectangle=Math.abs(startXPosition-endXPosition);
        lengthOfSecondRectangle=Math.abs(startYPosition-endYPosition)/3;



    }


    public int getStartOfFirstRectangleX() {
        return startOfFirstRectangleX;
    }

    public int getStartOfFirstRectangleY() {
        return startOfFirstRectangleY;
    }

    public int getStartOfSecondRectangleX() {
        return startOfSecondRectangleX;
    }

    public int getStartOfSecondRectangleY() {
        return startOfSecondRectangleY;
    }

    public int getWidthOfFirstRectangle() {
        return widthOfFirstRectangle;
    }

    public int getLengthOfFirstRectangle() {
        return lengthOfFirstRectangle;
    }

    public int getWidthOfSecondRectangle() {
        return widthOfSecondRectangle;
    }

    public int getLengthOfSecondRectangle() {
        return lengthOfSecondRectangle;
    }
}

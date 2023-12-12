public class rectangle {

    public int length;
    public int width; 


    public rectangle(){
        length = 10;
        width = 5;
    }

    public rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }
    
    public void setWidth(int width){
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getArea(){
        return length * width;
    }

    public String toString(){
        return "This rectangle has an length of " + length + " and an width of " + width + ", therefore it has an area of " + getArea();
    }
    
}

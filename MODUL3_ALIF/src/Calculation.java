public class Calculation implements Runnable{
    public double radius, side, area;
    public double phi = 3.14;
    @Override
    public void run(){   
    }
    public double getSquare(){
        return this.area;
    }
    public void setSquare(){
        if (side > 0) {
            this.area=Math.pow(side, 2);
        }
        else{
            throw new IllegalArgumentException();
        } 
    }
    public double getCircle(){
        return this.area;
    }
    public void setCircle(){
        if (this.radius > 0) {
            this.area = this.phi * Math.pow(this.radius, 2) ;
        }
        else {
            throw new IllegalArgumentException();
        }            
    }
    public double getTrapezoid(){
        return this.area;
    }
    public void setTrapezoid(double a, double b, double t){
        if ((a > 0 || b > 0 || t > 0)) {
            this.area = ((a + b) * t);
        }else{
            throw new IllegalArgumentException();
        }
    }
}

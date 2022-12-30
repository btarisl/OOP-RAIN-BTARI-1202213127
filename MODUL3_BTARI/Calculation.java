public class Calculation implements Runnable {
    public double radius=0; 
    public double side=0; 
    public double area=0;
    public double phi = 3.14;
    
    public void setSquare (double side) throws IllegalAccessException{
        if (side < 1) {
            System.out.println("\n");
            throw new IllegalAccessException("\n");
        }
            this.area = Math.pow(side,2);
    }

    public double getSquare(){
        return area;  
    }
    
    public void setCircle(double radius){
        this.radius = radius;
        this.area = phi*Math.pow(radius,2);
    }
    
    public double getCircle(){
        return area;
    }
    
    public void setTripezoid(double a, double b, double t){
        if (a < 1 | b< 1 |  t< 1 ){
            System.out.println("\n");
            throw new IllegalArgumentException("\n");
        }
        else{
            this.area = (( a + b ) * t) / 2;
        }
    }
    
    public double getTrapezoid(){
        return area;
    }

    @Override
    public void run() {
        System.out.println("\n==== Program will start in ====");
        for (int i = 3; i > 0; i--){
            try {
          System.out.printf("Starting with thread "+i+"\n");
          Thread.sleep(1000);
        } catch (InterruptedException except) {
          System.out.println(except.getMessage());
        }
        }
    }
}


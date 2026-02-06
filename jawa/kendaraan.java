abstract class vehicle{
    private int seats;
    private String name;
    private double  fuels;
    private int speed;

    public vehicle(int seats, String name, double fuels, int speed){
        this.seats = seats;
        this.name = name;
        this.fuels = fuels;
        this.speed = speed;
    }
    public int getSeats(){return this.seats;}
    public String getName(){return this.name;}
    public double getFuels(){return this.fuels;}
    public int getSpeed(){return this.speed;}

    public void setSeats(int seats){this.seats = seats;}
    public void setName(String name){this.name = name;}
    public void setFuels(double fuels){this.fuels = fuels;}
    public void setSpeed(int speed){this.speed = speed;}

    public abstract void move();
    public abstract double CFC(double fuel);
}

class LandVehicle extends vehicle{
    private int wheels;
    public LandVehicle(
        int seats, String name,double fuels, int speed,int wheels
    ){
        super(seats,name,fuels,speed);
        this.wheels = wheels;
    }
    @Override
    public void move(){
        System.out.println(
            " the land vehicle is moving on " + wheels +" wheels. with the speed of " + getSpeed() + "km/h"
        );
    };
    @Override
    public double CFC(double distance){
        return distance / getFuels();
    };
}

public class kendaraan {
    public static void main(String[] args) {
        vehicle car = new LandVehicle(
            4,"car",50.0,120,4
        );
        car.move();
        double fuelcomsumption = car.CFC(200);
        System.out.println(fuelcomsumption);
        vehicle bike = new LandVehicle(
            2,"motor bike",8.1,800,2
        );
        bike.move();
        double motorConsumption = bike.CFC(100);
        System.out.println(motorConsumption);
    }
}

package example;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;

    }
    public void startEngine(){
        System.out.println("The engine of make "+getMake()+" model " +getModel()+" of year "+getYear()+" has started..");
    }
}

class Electriccar extends Car{
    private int BatteryRange;
    public Electriccar(String make,String model,int year,int BatteryRange){
        super(make,model,year);
        this.BatteryRange=BatteryRange;
    }
    public int getBatteryRange(){
        return BatteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.BatteryRange=BatteryRange;
    }
    public void chargebattery(){
        System.out.println(getMake()+" car of model "+getModel()+" of year "+getYear()+" has a battery range of "+getBatteryRange()+" is charging");
    }
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", "Camry", 2023),
        new Electriccar("Tesla", "S", 2023, 370),
                new Car("Honda","civic",2022),
                new Electriccar("Nissan","Leaf",2022,150)
        };
        for (Car car : cars) {
            car.startEngine();

        }
        Electriccar car1=new Electriccar("tesla","u8",2018,480);
            car1.chargebattery();

    }
}

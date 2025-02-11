package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // TODO: Add constructor
    public Vehicle (String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    // TODO: Add abstract methods

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

    // TODO: Add getters/setters

    public String getMake() { 
        return make; 
    }
    public void setMake(String make) { 
        this.make = make; 
    }

    public String getModel() { 
        return model; 
    }
    public void setModel(String model) { 
        this.model = model; 
    }

    public int getYear() { 
        return year; 
    }
    public void setYear(int year) { 
        this.year = year; 
    }

    public boolean isRunning() { 
        return isRunning; 
    }
    public void setRunning(boolean running) { 
        isRunning = running; 
    }

    
}

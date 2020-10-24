
package application;


public class StandardSensor implements Sensor{
    private int input;
    
    public StandardSensor(int input) {
        this.input = input;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public void setOn() {
        // Do nothing, its a feature
    } 
    
    @Override
    public void setOff() {
        // Do nothing, its a feature
    }
    
    @Override
    public int read() {
        return this.input;
    }
}

import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipeList;
    
    public Pipe() {
        this.pipeList = new ArrayList<T>();
    }
    
    public void putIntoPipe(T value) {
        this.pipeList.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipeList.isEmpty()) {
            return null;
        } else {
            T tempT = this.pipeList.get(0);
            this.pipeList.remove(0);
            return tempT;
        }
    }
    
    public boolean isInPipe() {
        if (this.pipeList.isEmpty()) {
            return false;
        }
        return true;
    }
} 

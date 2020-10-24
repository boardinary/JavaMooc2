
public class Hideout<T>{
    private T hiddenObject;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        this.hiddenObject = toHide;
    }
    
    public T takeFromHideout() {
        if (this.isInHideout() == true) {
            T tempT = this.hiddenObject;
            this.hiddenObject = null;
            return tempT;
        } else {
            return null;
        }
    }
    
    public boolean isInHideout() {
        if (this.hiddenObject == null) {
            return false;
        }
        
        return true;
    }
}

/**
 * Created by Robert on 27.03.2017.
 */

public class Item {

    private String name;
    private boolean state;

    public Item( String name ) {
        this.state = false;
        this.name = name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setState( boolean state ) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }
}

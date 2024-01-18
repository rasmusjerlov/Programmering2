package navigation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class NavigationComponent {
    private ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();
    public void addChild(NavigationComponent navigationComponent) {
        throw new UnsupportedOperationException();

    }

    public ArrayList<NavigationComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();

    }

    public String getLink()
    {
        throw new UnsupportedOperationException();

    }

    public void print()
    {
        throw new UnsupportedOperationException();
    }
}

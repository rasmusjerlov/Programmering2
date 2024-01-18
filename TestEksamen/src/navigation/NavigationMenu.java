package navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent
{
    private List<NavigationComponent> navigationComponentList = new ArrayList<>();
    private String name;

    public NavigationMenu(String name)
    {
        this.name = name;
    }
    public void add(NavigationComponent navigationComponent) {
        navigationComponentList.add(navigationComponent);
    }
    public void remove(NavigationComponent navigationComponent) {
        navigationComponentList.remove(navigationComponent);
    }
    public NavigationComponent getChild(int i) {
        return navigationComponentList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(getName());
        for (NavigationComponent n : navigationComponentList) {
            n.print();
        }
    }
}

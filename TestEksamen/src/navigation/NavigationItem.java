package navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationItem extends NavigationComponent
{
    private List<NavigationComponent> navigationComponentList = new ArrayList<>();
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLink() {
        return link;
    }
    public void print() {
        System.out.println("\n " + getName());
        System.out.println("\n " + getLink());

        }
    }

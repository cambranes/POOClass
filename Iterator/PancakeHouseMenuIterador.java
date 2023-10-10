import java.util.ArrayList;

public class PancakeHouseMenuIterador implements Iterador<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterador(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}

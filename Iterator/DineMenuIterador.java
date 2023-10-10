public class DineMenuIterador implements Iterador<MenuItem> {
    // Class implementation goes here
    MenuItem[] items;
    int position = 0;

    public DineMenuIterador(MenuItem[] list  ) {
        this.items = list;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}

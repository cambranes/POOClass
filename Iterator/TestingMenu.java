import java.util.ArrayList;
public class TestingMenu {
    public static void main(String[] args) {
        Menu<MenuItem> pancakeHouseMenu = new PancakeHouseMenu();
        Menu<MenuItem> dinerMenu = new DinerMenu();

        ArrayList<Menu<MenuItem>> menus = new ArrayList<Menu<MenuItem>>();  
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();

    }
}
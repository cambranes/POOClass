import java.util.ArrayList;

public class Waitress{
      ArrayList<Menu<MenuItem>> menus;

    public Waitress(ArrayList<Menu<MenuItem>> menus){
        this.menus = menus;
    }

    public void printMenu(){
        for(Menu<MenuItem> menu:menus){
            printMenu(menu.createIterador());
        }
    }   

    private void printMenu(Iterador<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
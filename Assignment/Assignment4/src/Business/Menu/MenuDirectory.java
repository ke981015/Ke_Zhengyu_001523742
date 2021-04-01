/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MenuDirectory {
    
    private ArrayList<Menu> menuList;
    

    public MenuDirectory() {
        menuList = new ArrayList();
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }
    
    public Menu createMenu(String name, String price){
        Menu menu = new Menu();
        menu.setName(name);
        menu.setPrice(price);
        menuList.add(menu);
        return menu;
    }
     
}
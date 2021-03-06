package com.example.dspritzman.myapplication;

import java.util.ArrayList;
/**
 * Created by Shane McDonald on 3/21/2015.
 */
public class WeaponInventory {

    private ArrayList<Weapons> Inventory;

    WeaponInventory(){
        Inventory = new ArrayList<Weapons>();
    }

    public Weapons createWeapon(char t, boolean e, boolean o) {
        Weapons x = new Weapons(t, e, o);
        return x;
    }

    public void addWeapon(char t, boolean e, boolean o) {
        Inventory.add(createWeapon(t, e, o));
    }

    public Weapons getIndex(int slot) {
        return Inventory.get(slot);
    }

    public void Own(Weapons w) {
        w.ToggleOwned();
    }

    public void Equip(Weapons w) {
        w.ToggleEquipped();
    }
}

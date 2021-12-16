package com.krypton.interfaces;

import com.krypton.entities.Player;

public interface CRUD {
    public void insertRecord(Player player);
    public void updateRecord(Player player);
    public void deleteRecord(Player player);
}

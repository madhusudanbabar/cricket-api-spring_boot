package com.krypton.datastores;

import com.krypton.entities.Player;
import com.krypton.interfaces.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dataConnect implements CRUD {
    @Override
    public void insertRecord(Player player) {
        Connection connection = (new Conn()).getConnection();
        String query = "insert into scorecard values(?, ?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateRecord(Player player) {

    }

    @Override
    public void deleteRecord(Player player) {

    }
}

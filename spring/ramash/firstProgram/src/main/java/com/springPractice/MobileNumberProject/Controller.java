package com.springPractice.MobileNumberProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<PrimaryData> primaryList = new ArrayList<PrimaryData>();
    List<seccondPrimaryData> secondPrimaryList = new ArrayList<seccondPrimaryData>();



    public List<PrimaryData> firstPrimaryData() throws SQLException {

        Connection connection = DbConnection.dbConnection();

        PreparedStatement ps = connection.prepareStatement("select * from firstprimary");

        ResultSet executed = ps.executeQuery();

        while (executed.next()) {

            PrimaryData primaryData = new PrimaryData();

            primaryData.setMobilenumber(executed.getString("number"));
            primaryData.setName(executed.getString("name"));

            primaryList.add(primaryData);
        }
        return primaryList;
    }

    public List<seccondPrimaryData>  secondPrimary() throws SQLException {
        Connection connection = DbConnection.dbConnection();

        PreparedStatement ps = connection.prepareStatement("select * from seccondPrimary");

        ResultSet executed = ps.executeQuery();
        while (executed.next()) {

            seccondPrimaryData primaryData2 = new seccondPrimaryData();

            primaryData2.setMobilenumber(executed.getString("number"));
            primaryData2.setAddress(executed.getString("address"));

            secondPrimaryList.add(primaryData2);
        }
        return secondPrimaryList;
    }


}

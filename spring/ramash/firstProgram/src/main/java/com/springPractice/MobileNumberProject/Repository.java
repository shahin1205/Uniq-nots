package com.springPractice.MobileNumberProject;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {
    public static void main(String[] args) throws SQLException {
        Map<String, UserData> map = new HashMap<String, UserData>();
        System.out.println("first primary data");

        Controller controller=new Controller();
//        System.out.println(controller.firstPrimaryData());

        List<PrimaryData> primaryList = controller.firstPrimaryData();
        List<seccondPrimaryData> secondList = controller.secondPrimary();




        for (PrimaryData primaryData:primaryList){
            for (seccondPrimaryData primaryData1:secondList){
                if (primaryData.getMobilenumber().equals(primaryData1.getMobilenumber())){
             map.put(primaryData1.getMobilenumber(), (new UserData(primaryData.getName(),primaryData1.getAddress())));
                }
            }
        }
        System.out.println(map);

        //        System.out.println("second primary data");
//        System.out.println(controller.secondPrimary());



    }
}

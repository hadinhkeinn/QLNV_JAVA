/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LoadDuLieuTable {
    public static Object[][] chuyenSangObj(ArrayList dataList) {
        Object[][] data = new Object[dataList.size()][];
        for (int i = 0; i < dataList.size(); i++) {
            Object[] rowData = new Object[dataList.get(i).getClass().getDeclaredFields().length];
            for (int j = 0; j < rowData.length; j++) {
                try {
                    Field field = dataList.get(i).getClass().getDeclaredFields()[j];
                    field.setAccessible(true);
                    rowData[j] = field.get(dataList.get(i));
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            data[i] = rowData;
        }
        return data;
    }
}

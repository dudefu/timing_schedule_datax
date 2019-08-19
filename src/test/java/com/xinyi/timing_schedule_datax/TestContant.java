package com.xinyi.timing_schedule_datax;

import com.xinyi.timing_schedule_datax.constant.Constant;
import com.xinyi.timing_schedule_datax.utils.OracleDBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestContant {

    public static void main(String[] args) {
        MakeData01 makeData01 = new MakeData01();
        makeData01.start();
        MakeData02 makeData02 = new MakeData02();
        makeData02.start();
        MakeData03 makeData03 = new MakeData03();
        makeData03.start();
        MakeData04 makeData04 = new MakeData04();
        makeData04.start();;
    }
}

class MakeData01 extends Thread {
    public void run()   {
        int count = 0;
        Connection conn;
        conn = OracleDBUtils.getConnection();
        PreparedStatement pst = null;
        String sql = "insert into TEST_DATA_01(taskId,startTime,endTime,totalCostsTime,byteSpeedPerSecond," +
                "recordSpeedPerSecond,TotalReadRecords,TotalErrorRecords) values(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql); // 指定返回生成的主键
            while (count <= 10000000) {
                pst.setInt(1, (int) (Math.random() * 1000000) + 1);
                pst.setString(2, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(3, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(4, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(5, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(6, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(7, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(8, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.executeUpdate();
                count++;
                System.out.println(count);
            }
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class MakeData02 extends Thread {
    public void run()   {
        int count = 0;
        Connection conn;
        conn = OracleDBUtils.getConnection();
        PreparedStatement pst = null;
        String sql = "insert into TEST_DATA_01(taskId,startTime,endTime,totalCostsTime,byteSpeedPerSecond," +
                "recordSpeedPerSecond,TotalReadRecords,TotalErrorRecords) values(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql); // 指定返回生成的主键
            while (count <= 50000000) {
                pst.setInt(1, (int) (Math.random() * 1000000) + 1);
                pst.setString(2, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(3, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(4, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(5, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(6, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(7, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(8, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.executeUpdate();
                count++;
                System.out.println(count);
            }
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class MakeData03 extends Thread {
    public void run()   {
        int count = 0;
        Connection conn;
        conn = OracleDBUtils.getConnection();
        PreparedStatement pst = null;
        String sql = "insert into TEST_DATA_01(taskId,startTime,endTime,totalCostsTime,byteSpeedPerSecond," +
                "recordSpeedPerSecond,TotalReadRecords,TotalErrorRecords) values(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql); // 指定返回生成的主键
            while (count <= 50000000) {
                pst.setInt(1, (int) (Math.random() * 1000000) + 1);
                pst.setString(2, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(3, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(4, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(5, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(6, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(7, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(8, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.executeUpdate();
                count++;
                System.out.println(count);
            }
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class MakeData04 extends Thread {
    public void run()   {
        int count = 0;
        Connection conn;
        conn = OracleDBUtils.getConnection();
        PreparedStatement pst = null;
        String sql = "insert into TEST_DATA_01(taskId,startTime,endTime,totalCostsTime,byteSpeedPerSecond," +
                "recordSpeedPerSecond,TotalReadRecords,TotalErrorRecords) values(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql); // 指定返回生成的主键
            while (count <= 50000000) {
                pst.setInt(1, (int) (Math.random() * 1000000) + 1);
                pst.setString(2, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(3, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(4, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(5, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(6, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(7, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.setString(8, String.valueOf((int) (Math.random() * 1000000) + 1));
                pst.executeUpdate();
                count++;
                System.out.println(count);
            }
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

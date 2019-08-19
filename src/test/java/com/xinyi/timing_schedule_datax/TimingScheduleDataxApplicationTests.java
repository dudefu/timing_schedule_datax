package com.xinyi.timing_schedule_datax;

import com.xinyi.timing_schedule_datax.constant.Constant;
import com.xinyi.timing_schedule_datax.service.TimingSchedule;
import com.xinyi.timing_schedule_datax.utils.OracleDBUtils;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.nio.cs.ext.MacThai;

import java.sql.*;
import java.util.Arrays;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@SpringBootTest
public class TimingScheduleDataxApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testContant() {
        System.out.println(Constant.oneDay);
        System.out.println(Constant.initDelay);
        System.out.println(Constant.jsonPath);
        System.out.println(Constant.dataxPath);
    }

    @Test
    public void testExecuteDatax() {
        TimingSchedule.executeDatax();
    }

    @Test
    public void test() {
        String[] str = new String[]{"1", "2"};
        System.out.println(Arrays.asList(str));
        int a = (int) (Math.random() * 1000000) + 1;
        System.out.println(a);
    }

    @Test
    public void testOracleDBConn() {
        System.out.println(OracleDBUtils.getConnection());

        Connection conn;
        conn = OracleDBUtils.getConnection();
        PreparedStatement pst = null;
        String sql = "insert into TEST_DATA_01(taskId,startTime,endTime,totalCostsTime,byteSpeedPerSecond," +
                "recordSpeedPerSecond,TotalReadRecords,TotalErrorRecords) values(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql); // 指定返回生成的主键
            pst.setInt(1, (int) (Math.random() * 1000000) + 1);
            pst.setString(2, "666");
            pst.setString(3, "666");
            pst.setString(4, "666");
            pst.setString(5, "666");
            pst.setString(6, "666");
            pst.setString(7, "666");
            pst.setString(8, "666");
            pst.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void makeTestData() {
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
    }


}

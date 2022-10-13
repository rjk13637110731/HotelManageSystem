package com.baidu.javase.array.Hotel;

import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
        //创建酒店对象
        Hotel hotel = new Hotel();

        Scanner s = new Scanner(System.in);
        while(true){
            //界面设置
            System.out.println("欢迎使用酒店管理系统：请认真阅读以下使用说明。");
            System.out.println("功能对应的编号：");
            System.out.println("[1]表示查看房间列表；");
            System.out.println("[2]表示订房；");
            System.out.println("[3]表示退房；");
            System.out.println("[0]表示退出系统；");

            System.out.print("请输入功能编号:>");
            int i = s.nextInt();
            if (i == 1){
                //查看房间列表
                hotel.print();
            }else if (i == 2){
                //订房
                System.out.print("请输入订房的房间编号：");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            }else if (i == 3){
                //退房
                System.out.print("请输入退房的房间编号：");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            }else if (i == 0){
                //退出系统
                System.out.println("再见，欢迎再来！");
                return;
            }else{
                //出错
                System.out.println("输入有误，请重新输入！");
            }
        }

    }
}

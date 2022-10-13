package com.baidu.javase.array.Hotel;

//酒店对象，有二维数组，二维数组模拟大厦。
public class Hotel {
    //二维数组，模拟大厦。
    private Room[][] rooms;

    //盖楼，通过构造方法

    public Hotel() {
        //一共几层，每层的房间类型是什么，每个房间标号是什么
        //可以先写死,一层单人间，二层标准间，三层总统套房
        //房间号规律：101,102，...；201,202，...
        //动态初始化
        rooms = new Room[3][10];

        //创建30个Room对象，放到数组中
        for (int i = 0;i < rooms.length;i++){
            for (int j = 0;j < rooms[i].length;j++){
                if (i == 0){
                    //一层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"单人间",true);
                }else if(i == 1){
                    //二层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"标准间",true);
                }else if (i == 2){
                    //三层
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1,"总统套房",true);
                }

            }
        }
    }

    //打印酒店房间信息
    public void print(){
        for (int i = 0;i < rooms.length;i++){
            for (int j = 0;j < rooms[i].length;j++){
                Room room = rooms[i][j];
                System.out.print( room + "  ");
            }
            System.out.println();
        }
    }

    //订房方法:传入一个房间编号
    public void order(int roomNo){
        //订房最主要的是将房间对象的status修改为false
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        //修改为占用
        room.setStatus(false);
        System.out.println(roomNo + "已定房！");
    }

    //退房方法
    public void exit(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        //修改为空闲
        room.setStatus(true);
        System.out.println(roomNo + "已退房！");
    }

}

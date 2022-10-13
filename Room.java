package com.baidu.javase.array.Hotel;

//酒店房间
public class Room {
    private int no;
    private String type;
    //房间状态：true表示空闲，false标识占用
    private boolean status;

    //构造方法
    public Room() {
    }
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //set和get方法
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //IDEA工具对于boolean类型的变量，生成的get()方法的方法名是：isXXX();可以修改为getXXX();
    /*
    public boolean getStatus() {
        return status;
    }
     */
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //重写equals()方法
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;

        Room room = (Room)obj;
        //当前的房间编号 == 传过来的对象的房间编号，认为是同一个房间。
        return this.no == room.getNo();
    }

    //重写toString()方法
    public String toString(){
        return "[" + no + "," + type + "," + (status? "空闲":"占用") + "]";
    }

/*
    //测试
    public static void main(String[] args) {
        Room room = new Room(101,"单人间",true);
        System.out.println(room);

        Room room1 = new Room(102,"单人间",false);
        System.out.println(room.equals(room1));
    }
 */
}

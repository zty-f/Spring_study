package com.zty.demo1;
//客户
public class Client {
    public static void main(String[] args) {
        // 房东要租房出去
        Host host = new Host();
        // 中介帮房东出租房子
        Proxy proxy = new Proxy(host);
        // 客户去找中介租房
        proxy.rent();
    }
}

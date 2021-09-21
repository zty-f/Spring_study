package com.zty.demo1;

public class Proxy implements  Rent{
    private Host host;
    public Proxy(){

    }
    public Proxy(Host host){
        this.host = host;
    }
    // 因为要帮房东租房子，所以代理也要实现租房子
    public void rent() {
        seeHouse();
        host.rent();
        fee();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }
}

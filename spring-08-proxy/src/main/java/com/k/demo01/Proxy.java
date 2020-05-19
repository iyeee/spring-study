package com.k.demo01;

public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {

        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        System.out.println("----");
        seeHouse();
    }

    public void seeHouse()

    {
        System.out.println("带你看房"); }
}


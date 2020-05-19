package com.k.demo02;

import com.k.demo01.Host;
import com.k.demo01.HostWoman;
import com.k.demo01.Rent;

public class Client {
    public static void main(String[] args) {
        Rent host=new HostWoman();
        ProxyInvocationHandler pih= new ProxyInvocationHandler();
        pih.setRent(host);
        Object proxy= (Rent)pih.getProxy();
        ((Rent) proxy).rent();
    }
}

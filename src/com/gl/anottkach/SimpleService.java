package com.gl.anottkach;

@Service(name = "ProstoSimple")
public class SimpleService {
    @Init()
    public void iniService() {
        System.out.println("SimpleService started");
    }

    public void shoowStatus() {
        System.out.println("Status any");
    }
}

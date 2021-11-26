package com.example.spi;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<IInterface> services = ServiceLoader.load(IInterface.class);
        for (IInterface service : services) {
            System.out.println(service.name());
        }
    }
}

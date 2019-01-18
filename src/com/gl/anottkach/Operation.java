package com.gl.anottkach;

import java.lang.reflect.Method;

public class Operation {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println("Got ServiceName -> " + ann.name());
        } else {
            System.out.println("Not found ServiceName " + service.getSimpleName());
        }

        System.out.println("---------==============>");
        Method[] methods = service.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Init.class)) {
                method.getAnnotation(Init.class);
                System.out.println("Has anotation Init");
            } else {
                System.out.println("No method found");
            }
        }
    }
}

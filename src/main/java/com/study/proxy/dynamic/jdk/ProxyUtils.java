package com.study.proxy.dynamic.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyUtils {

    public static void generateClassFile(Class<?> clazz, String proxyName) {
        // 根据类信息和提供的代理类名称，生成字节码
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyName, new Class[] {clazz});

        ProxyUtils.writeToFile(clazz, classFile, proxyName);
    }

    public static void writeToFile(Class<?> clazz, byte[] classFile, String proxyName) {
        String paths = clazz.getResource(".").getPath();
        System.out.println(paths);
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(new File(paths + proxyName + ".class"));
            out.write(classFile, 0, classFile.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

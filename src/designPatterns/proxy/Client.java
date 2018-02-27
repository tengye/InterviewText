package designPatterns.proxy;


import java.lang.reflect.Proxy;

/**
 * Created by teng on 18/1/10.
 */

public class Client {

    public static void main(String[] args) {
        // 静态代理
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();

        // 动态代理
        Subject realSubject = new RealSubject();
//        DynamicProxy proxy = new DynamicProxy(realSubject);
//        ClassLoader classLoader = realSubject.getClass().getClassLoader();
//
//        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class},proxy);
//        subject.visit();

        Subject proxyInstance = (Subject) new ProxyFactory(realSubject).getProxyInstance();
        proxyInstance.visit();

    }

}

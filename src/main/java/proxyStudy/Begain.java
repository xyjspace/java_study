package proxyStudy;

import java.lang.reflect.Proxy;

/**
 * Created by banma on 2018/1/19.
 */
public class Begain {
    public static void main(String[] args) {
        //静态代理
//        playChiJi chiji = new ShenXianChiJi(new NormalChiji());
//        chiji.play();

        playChiJi chiJi = (playChiJi) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),new Class[]{playChiJi.class},new ChiJiInvocationHandler(new NormalChiji()));
        chiJi.play();

    }
}

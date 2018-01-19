package proxyStudy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by banma on 2018/1/19.
 */
public class ChiJiInvocationHandler implements InvocationHandler {
    private Object proxy;

    ChiJiInvocationHandler(Object proxy){
        this.proxy = proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理");
        System.out.println("只要下载了吃鸡游戏的人都能开这个挂");
        Object object =  method.invoke(this.proxy, args);
        System.out.println("大家都吃鸡啦");
        return object;

    }

}

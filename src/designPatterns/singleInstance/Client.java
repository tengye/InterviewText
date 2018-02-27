package designPatterns.singleInstance;

/**
 * Created by teng on 18/2/27.
 */
public class Client {

    private Client() {

    }

    public volatile static Client client;

    public static synchronized Client getInstance(){
        if (client == null){
            synchronized (Client.class){
                if (client == null) {
                    client = new Client();
                }
            }
        }
        return client;
    }

    //TODO 利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗
    // 需要在看一下类加载的机制 https://www.jianshu.com/p/b6547abd0706
    private static class LazyLoader{
        private static final Client instance = new Client();
    }

    public static Client getClient(){
        return LazyLoader.instance;
    }


}

package com.miki.singleton.hungrysingleton.MongoDB;

import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 【2】
 */
public class MongoDBUtil {

    public static final String MONGO_LOG_TABLENAME = "dip_log";
    public static final String MONGO_DB_NAME = "mxwi";

    /**
     * MongoClient的实例代表数据库连接池，是线程安全的，可以被多线程共享，客户端在多线程条件下仅维持一个实例即可
     * Mongo是非线程安全的，目前mongodb API中已经建议用MongoClient替代Mongo
     */
    private MongoClient mongoClient = null;

    private MongoDBUtil(){
        if(mongoClient == null){
            MongoClientOptions.Builder build = new MongoClientOptions.Builder();
            build.connectionsPerHost(50);   //与目标数据库能够建立的最大connection数量为50
            //build.autoConnectRetry(true);   //自动重连数据库启动
            build.threadsAllowedToBlockForConnectionMultiplier(50); //如果当前所有的connection都在使用中，则每个connection上可以有50个线程排队等待

            build.threadsAllowedToBlockForConnectionMultiplier(100);
            build.maxConnectionIdleTime(0);
            build.maxConnectionLifeTime(0);
            build.socketTimeout(0);
            build.socketKeepAlive(true);
            /***************
             * 	一个线程访问数据库的时候，在成功获取到一个可用数据库连接之前的最长等待时间为2分钟这里比较危险，
             * 	如果超过maxWaitTime都没有获取到这个连接的话，该线程就会抛出Exception
             * 	故这里设置的maxWaitTime应该足够大，以免由于排队线程过多造成的数据库访问失败
             * ***************************************/
            build.maxWaitTime(1000*60*2);		// 一个线程成功获取到一个可用数据库之前的最大等待时间
            build.connectTimeout(1000*60*5);    //与数据库建立连接的timeout设置为1分钟

            MongoClientOptions myOptions = build.build();
            try {

                String user = "";           //PropertiesUtil.gP("dip_logdb", "dip.log.mongo.username");
                String pwd = "";            //PropertiesUtil.gP("dip_logdb", "dip.log.mongo.password");
                String port = "27017";      //PropertiesUtil.gP("dip_logdb", "dip.log.mongo.port");
                String ip = "127.0.0.1";    //PropertiesUtil.gP("dip_logdb", "dip.log.mongo.ip");

                //数据库连接实例
                List<ServerAddress> addrs = new ArrayList<ServerAddress>();
                ServerAddress serverAddress = new ServerAddress(ip,Integer.parseInt(port)); 	//可以添加多个ip，构建mongo集群
                addrs.add(serverAddress);

                if(!"".equals(user)) {
                    //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码
                    MongoCredential credential = MongoCredential.createScramSha1Credential(user, MONGO_DB_NAME, pwd.toCharArray());
                    List<MongoCredential> credentials = new ArrayList<MongoCredential>();
                    credentials.add(credential);
                    mongoClient = new MongoClient(addrs, credentials, myOptions);
                }else {
                    mongoClient = new MongoClient(addrs, myOptions);
                }
            } catch (MongoException e){
                System.out.println("mongodb初始化异常.."+e.getMessage());
            }
        }
    }


    /********单例模式声明开始，采用饿汉式方式生成，保证线程安全********************/

    //类初始化时，自行实例化，饿汉式单例模式，懒汉模式影响性能
    private static final MongoDBUtil mongoDBDaoImpl = new MongoDBUtil();
    /**
     * 方法名：getMongoDBDaoImplInstance
     * 描述：单例的静态工厂方法
     * @return
     */
    public static MongoDBUtil getMongoDBDaoImplInstance(){
        return mongoDBDaoImpl;
    }

    public MongoClient getMongoClient(){
        return mongoClient;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(MongoDBUtil.getMongoDBDaoImplInstance().mongoClient);
        }
    }
}

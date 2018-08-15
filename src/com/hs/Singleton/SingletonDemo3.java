package com.hs.Singleton;

/**
 * @author huangsen
 * 单例模式实现：懒汉模式（线程安全）
 */

public class SingletonDemo3 {
	private static SingletonDemo3 singleton = null;
	private SingletonDemo3(){}
	public static synchronized SingletonDemo3 getInstance(){
		if (singleton==null){
			singleton = new SingletonDemo3();
		}
		return singleton;
	}
}

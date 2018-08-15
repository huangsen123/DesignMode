package com.hs.Singleton;
/**
 * @author huangsen
 * 单例模式实现：懒汉模式（非线程安全）
 *
 */

public class SingletonDemo2 {
	private static SingletonDemo2 singleton = null;
	private SingletonDemo2(){}
	public static SingletonDemo2 getInstance(){
		if (singleton==null){
			singleton = new SingletonDemo2();
		}
		return singleton;
	}

}

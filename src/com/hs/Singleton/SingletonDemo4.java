package com.hs.Singleton;
/**
 * @author huangsen
 * 单例模式实现：静态内部类
 *
 */
public class SingletonDemo4 {
	
	private static class SingletonInner{
		private static  SingletonDemo4 singleton = new SingletonDemo4();
	}
	private SingletonDemo4(){}
	public static SingletonDemo4 getInstance(){
		return SingletonInner.singleton;
		
	}

}

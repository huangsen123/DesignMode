package com.hs.Singleton;
/**
 * @author huangsen
 * ����ģʽʵ�֣���̬�ڲ���
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

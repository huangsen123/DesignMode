package com.hs.Singleton;
/**
 * @author huangsen
 * ����ģʽʵ�֣�����ģʽ�����̰߳�ȫ��
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

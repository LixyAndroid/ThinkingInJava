package com.xuyang.thinkinginjava.AccessControl;

/**
 * @author Li Xuyang
 * @date : 2019/10/9 21:12
 */
public class Cookie {
    public Cookie() {
		System.out.println("Cookie contstructor");
	}
	protected void bite() { System.out.println("bite"); }
}

package com.softacad.snippets.bitmask;

public class Robot {
	public static final int IS_MOVING = 1;// 00001
	public static final int ON_FLAT_SERFACE = 1<<1;// 00010
	public static final int IS_LOADED = 1<<2;// 00100
	public static final int LIGHTS_ON = 1<<3;// 01000
	
    private int state = 0;
    
    public void setFlag(int flag){
    	state = state | flag;
    }
    
    public void unsetFlaf(int flag){
    	state = state & (~flag);
    }
    
    public boolean isSet(int flag){
    	return (state & flag) == flag;
    }
    
    public void printStatus(){
    	if(isSet(IS_MOVING)){
    		System.out.println("The robot is moving");
    	}
    	
    	int newFlag = IS_MOVING |ON_FLAT_SERFACE;
    	
    	if(isSet(newFlag)){
    		System.out.println("The robot is going in zig zag mode");
    	}
    	if(isSet(IS_MOVING | IS_LOADED)){
    		System.out.println("The robot is GOING SLOWLY");
    	}
    	if(isSet(LIGHTS_ON)){
    		System.out.println("The ligths are on");
    	}
    	
    	if(isSet(LIGHTS_ON | IS_MOVING)){
    		System.out.println("The ligths are on");
    	}
    	
    }


}

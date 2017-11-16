/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Java-programming
 */

public class Time2{
	private int h;
	private int m;
	private int s;

	final int SECONDS_IN_MINUTE = 60;
	final int MINUTES_IN_HOUR = 60;
	final int SECONDS_IN_HOUR = 3600;
	final int HOURS_IN_DAY = 24;
	int secondsFromMidnight;
	public Time2(){
		this(0,0,0);
	}

	public Time2(int h, int m, int s){
		setTime(h, m, s);
	}
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);

	}
	public void setHour(int h){
		if(h >23 || h <0 ){
			throw new IllegalArgumentException("Hour must be between 0-23");

		} else {
			secondsFromMidnight += h*3600;
			this.h=h*3600;
		}
	}
	public void setMinute(int m){
		if(m >59 || m<0){
			throw new IllegalArgumentException("Minutes must be between 0-59");
		} else {

			secondsFromMidnight += m*60;
			this.m = m*60;
		}
	}
	public void setSecond(int s){
		if(s >60 || s<0){
			throw new IllegalArgumentException("Seconds must be between 0-59");
		} else {
			this.s = ((s >=0 && s< 60) ? s :0 );
				
				secondsFromMidnight += s;
				
			}
			
		}
	
	public int getHour(){
		int hour = secondsFromMidnight/3600;
                
                return hour;
	}
	public int getMinute(){
		int minute =(secondsFromMidnight-h)/60;
                
                return minute;
	}
	public int getSecond(){
		return s;
	}
        public int getSecondsFromMid(){
            return secondsFromMidnight;
        }
	public String toUniversalFormat(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
        @Override
        public String toString(){
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour()==12) ? 12 : getHour()%12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}
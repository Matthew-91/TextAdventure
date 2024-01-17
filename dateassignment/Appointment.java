package com.skillstorm.dateassignment;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
	private ZonedDateTime start;
	private ZonedDateTime end;
	private Duration duration;
	
	Appointment(){
		
	}
	
	Appointment(ZonedDateTime start, ZonedDateTime end){
		this.start = start;
		this.end = end;
		this.duration = Duration.between(start, end);
	}

	public ZonedDateTime getStart() {
		return start;
	}

	public void setStart(ZonedDateTime start) {
		this.start = start;
	}
	
	public ZonedDateTime getEnd() {
		return end;
	}

	public void setEnd(ZonedDateTime end) {
		this.end = end;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = Duration.between(start, end);
	}
	
	public void alert() {
		System.out.println("You have a " 
			+ duration.toMinutes() + " minute appointment on " 
			+ start.format(DateTimeFormatter.ofPattern("E MMM dd' at 'h:m a z")) + ".");
	}

}

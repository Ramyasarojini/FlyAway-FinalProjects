package com.be;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Userin {
    @Id
	private int flightno;
	private String airlines;
	private String arrivaltime;
	private String depaturetime;
	private String destination;
	private String source;
	private float flightfare;
	public Userin(int flightno, String airlines, String arrivaltime, String depaturetime, String destination,
			String source, float flightfare) {
		super();
		this.flightno = flightno;
		this.airlines = airlines;
		this.arrivaltime = arrivaltime;
		this.depaturetime = depaturetime;
		this.destination = destination;
		this.source = source;
		this.flightfare = flightfare;
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDepaturetime() {
		return depaturetime;
	}
	public void setDepaturetime(String depaturetime) {
		this.depaturetime = depaturetime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public float getFlightfare() {
		return flightfare;
	}
	public void setFlightfare(float flightfare) {
		this.flightfare = flightfare;
	}
	@Override
	public String toString() {
		return "Userin [flightno=" + flightno + ", airlines=" + airlines + ", arrivaltime=" + arrivaltime
				+ ", depaturetime=" + depaturetime + ", destination=" + destination + ", source=" + source
				+ ", flightfare=" + flightfare + "]";
	}

	
	
}


	
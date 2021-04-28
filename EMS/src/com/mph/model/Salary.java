package com.mph.model;

import java.io.Serializable;

public class Salary  implements Serializable {
	private double basic;
	private double da;
	private double hra;
	private double pf;
	private double gross;
	private double net;
	
	public Salary() {
		super();
	}
	public Salary(double basic, double da, double hra, double gross, double net, double pf) {
		super();
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.gross = gross;
		this.net = net;
		this.pf=pf;
	}
	

	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da =0.3*basic ;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = 0.4*basic;
	}
	
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf=pf;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double basic) {
		this.gross = basic+(0.3*basic)+(0.4*basic);
	}
	public double getNet() {
		return net;
	}
	public void setNet(double gross) {
		this.net = gross-(0.1*basic);
	}
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", hra=" + hra + ", gross=" + gross + ", net=" + net + "]";
	}
	
	
	
	
}

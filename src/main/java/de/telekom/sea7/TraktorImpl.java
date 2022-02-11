package de.telekom.sea7;

public class TraktorImpl implements Traktor {
	
	String marke;
	String farbe;
	String motor;
	int ps;
	String antriebsart;
	boolean fronthydraulik;
	
	public TraktorImpl(String marke, String farbe) {
		super();
		this.marke = marke;
		this.farbe = farbe;
	}
	@Override
	public String getMarke() {
		return marke;
	}
	@Override
	public void setMarke(String marke) {
		this.marke = marke;
	}
	@Override
	public String getFarbe() {
		return farbe;
	}
	@Override
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	@Override
	public String getMotor() {
		return motor;
	}
	@Override
	public void setMotor(String motor) {
		this.motor = motor;
	}
	@Override
	public int getPs() {
		return ps;
	}
	@Override
	public void setPs(int ps) {
		this.ps = ps;
	}
	@Override
	public String getAntriebsart() {
		return antriebsart;
	}
	@Override
	public void setAntriebsart(String antriebsart) {
		this.antriebsart = antriebsart;
	}
	@Override
	public boolean isFronthydraulik() {
		return fronthydraulik;
	}
	@Override
	public void setFronthydraulik(boolean fronthydraulik) {
		this.fronthydraulik = fronthydraulik;
	}
	
	
	

}

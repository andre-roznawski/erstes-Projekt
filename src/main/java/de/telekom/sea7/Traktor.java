package de.telekom.sea7;

public interface Traktor {

	String getMarke();

	void setMarke(String marke);

	String getFarbe();

	void setFarbe(String farbe);

	String getMotor();

	void setMotor(String motor);

	int getPs();

	void setPs(int ps);

	String getAntriebsart();

	void setAntriebsart(String antriebsart);

	boolean isFronthydraulik();

	void setFronthydraulik(boolean fronthydraulik);

}
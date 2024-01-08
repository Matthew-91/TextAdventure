package com.skillstorm.rgb;

import java.util.Objects;

public class Color {
	private String name;
	private byte r;
	private byte g;
	private byte b;
	
	public Color() {
		this.name = "white";
		this.r = (byte) 255;
		this.g = (byte) 255;
		this.b = (byte) 255;
	}
	
	public Color(String name, byte r, byte g, byte b) {
		this.name = name;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public String getName() {
		return name;
	}
	public byte getR() {
		return r;
	}
	public byte getG() {
		return g;
	}
	public byte getB() {
		return b;
	}
	
	@Override
	public String toString() {
		return "The color " + name + " is: r=" + r + ", g=" + g + ", b=" + b + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(b, g, r);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return b == other.b && g == other.g && r == other.r;
	}
	
}

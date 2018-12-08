package com.java.patterns.adapter;

public class AdapterApp {

	public static void main(String[] args) {
		// First approach
		VectorGraphicsInterface vgraph = new VectorAdapterFromRaster();
		vgraph.drawLine();
		vgraph.drawSquare();
	}
}

interface VectorGraphicsInterface {
	void drawLine();
	void drawSquare();
}

class RasterGraphics {
	void drawRasterLine() {
		System.out.println("Draw line");
	}
	void drawRasterSquare() {
		System.out.println("Draw square");
	}
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

	@Override
	public void drawLine() {
		drawRasterLine();
	}

	@Override
	public void drawSquare() {
		drawRasterSquare();
	}
	
}

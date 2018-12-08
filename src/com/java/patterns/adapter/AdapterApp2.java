package com.java.patterns.adapter;

public class AdapterApp2 {
	
	public static void main(String[] args) {
		VectorAdapterFromRaster2 vAdapterFromRaster2 = new VectorAdapterFromRaster2();
		vAdapterFromRaster2.drawLine();
		vAdapterFromRaster2.drawSquare();
	}

}

interface VectorGraphicsInterface2 {
	void drawLine();
	void drawSquare();
}

class RasterGraphics2 {
	void drawRasterLine() {
		System.out.println("Draw line");
	}
	void drawRasterSquare() {
		System.out.println("Draw square");
	}
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface2 {

	RasterGraphics2 rasterGraphics = new RasterGraphics2();
	
	@Override
	public void drawLine() {
		rasterGraphics.drawRasterLine();
	}

	@Override
	public void drawSquare() {
		rasterGraphics.drawRasterSquare();
	}
	
}

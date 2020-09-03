package com.java.conversion;

import java.text.DecimalFormat;

public class CoordConvertor {
	
	public static void main(String[] args) {
		String dms = convertToDegreesMinutesAndSeconds(86.74802555555556);
		System.out.println("D M S = " + dms);
	}
	
    /**
     * This method provide conversion from decimal degrees to degrees (°), minutes ('), seconds ('') 
     * 
     * @param decimalDegrees
     * @return string that represent degrees (°), minutes (') and seconds ('')
     */
    public static String convertToDegreesMinutesAndSeconds(double decimalDegrees) {
        boolean isNegative = decimalDegrees < 0 ? true : false;

        double absolute = Math.abs(decimalDegrees);

        int degrees = (int) Math.floor(absolute);
        double minutesNotTruncated = (absolute - degrees) * 60;
        double minutes = Math.floor(minutesNotTruncated);
        double seconds = (absolute - degrees - (minutes / 60)) * 3600;

        DecimalFormat df = new DecimalFormat("#.000");

        if (isNegative) {
            degrees = degrees * -1;
        }

        return degrees + ":" + (int)minutes + ":" + df.format(seconds).replace(",", ".");
    }

}

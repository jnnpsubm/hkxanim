package com.dexesttp.hkxanim.processing.interpolator;

/**
 * Tool to compute values between a start and end point.
 */
public interface Interpolator {

	/**
	 * Compute the inerpolation starting from A to B at the give point inbetween.
	 * @param start the starting point.
	 * @param evolution the inbetween point to evaluate, as a factor between 0 and 1.
	 * @param end the end point
	 * @return the value 
	 */
	double compute(double start, double evolution, double end);

}
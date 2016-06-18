/*
 * (c) Copyright Christian P. Fries, Germany. All rights reserved. Contact: email@christianfries.com.
 *
 * Created on 17.06.2016
 */

package net.finmath.randomnumbers;

import java.io.Serializable;

/**
 * @author Christian Fries
 *
 */
public class MersenneTwister implements Serializable {

	private static final long serialVersionUID = -1827470318370174186L;

	private final org.apache.commons.math3.random.MersenneTwister mersenneTwister;
	
	public MersenneTwister(long seed) {
			mersenneTwister	= new org.apache.commons.math3.random.MersenneTwister((long)seed);
	}

	/**
	 * @return
	 */
	public double nextDouble() {
		return mersenneTwister.nextDouble();
	}
}

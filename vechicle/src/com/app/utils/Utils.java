package com.app.utils;

import com.app.vechicle.Custom_Exception;

public class Utils {
	public static void valPoll(double p) throws Custom_Exception {
		if (p>20)
			throw new Custom_Exception("pollution level is high");
			}
}

package utils;
import custom_exception.CustomException;



public class SpeedCheck {
	public static final int MAX_SPEED;
	public static final int MIN_SPEED;
	static {
		MAX_SPEED=80;
		MIN_SPEED=40;
	}
	public static void validateSpeed(int speed) throws CustomException {
		if (speed < MIN_SPEED)
			throw new CustomException("You are driving too slow !!!!!" );
		if (speed> MAX_SPEED)
			throw new CustomException("You are driving too fast , FATAL " );
		System.out.println("speed within range .....");
	}

}

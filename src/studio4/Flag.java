package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(.5,.5,.4,.25);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(.2, .67, .05);
		StdDraw.filledCircle(.8, .33, .05);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(.2, .33, .05);
		StdDraw.filledSquare(.8, .67, .05);
		StdDraw.setPenColor(160,32,240);
		StdDraw.filledEllipse(.5, 0.5, 0.12, 0.07);
		StdDraw.setPenColor(Color.WHITE);
		Font font = new Font("Arial", Font.BOLD, 10);
		StdDraw.setFont(font);
		StdDraw.text(.5, 0.5, "Sienna, Cindy, Julianne");
	}
	
}
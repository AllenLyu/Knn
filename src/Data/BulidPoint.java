package Data;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class BulidPoint {

	public static ArrayList<Data> generatePoint(Point thePoint)
	{
		ArrayList<Data> out = new ArrayList<Data>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			int x = random.nextInt(431);
			int y = random.nextInt(240);
			Point point = new Point(x, y);
			int color = random.nextInt(2);
			System.out.println(color);
			if(color==1)
			{
				
				Data data = new Data(point, Color.BLUE,thePoint);
				out.add(data);
			}
			else
			{
				Data data = new Data(point, Color.RED, thePoint);
				out.add(data);
			}
			
		}
		return out;
	}
}

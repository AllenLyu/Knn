package Data;

import java.awt.Color;
import java.awt.Point;

public class Data {

	private Point point;
	private double distance;
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	private String type;
	
	public Data(Point point, String type,Point thePoint)
	{
		this.point = point;
		this.distance = point.distance(thePoint);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

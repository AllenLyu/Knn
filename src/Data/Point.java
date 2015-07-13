package Data;

public class Point {
	private double x,y,z,w;
	
	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point(int x,int y,int z,int w)
	{
		this.w=w;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double distance(Point thePoint)
	{
		double sum;
		sum = (x-thePoint.getX())*(x-thePoint.getX())+(y-thePoint.getY())*(y-thePoint.getY())+
			(z-thePoint.getZ())*(z-thePoint.getZ())+(w-thePoint.getW())*(w-thePoint.getW());
		return Math.sqrt(sum);
	}

}

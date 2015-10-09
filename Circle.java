public class Circle {
	double radian;	
	double area;
	
	
	public double getRadian() {
		return radian;
	}
	
	
		public void setRadian(double radian) {
		this.radian = radian;
	}
	
		
	public double Area() {
		return this.radian * this.radian * 3.142;
	}
	
	public double Area(double radian) {
		return (radian * radian * 3.142);
	}
	
}

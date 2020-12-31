
public class Tuple<X, Y> {
	public X x;
	public Y y;

	public Tuple(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}
	
	public int getX() {
		return (int)this.x;
	}
	
	public int getY() {
		return (int)this.y;
	}
	
	public void setX(X x) {
		this.x = x;
	}
	
	public void setY(Y y) {
		this.y = y;
	}
}
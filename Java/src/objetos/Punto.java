package objetos;

public class Punto {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY(){
		int[] xy=new int[2];
		xy[0]=this.x;
		xy[1]=this.y;
		return xy;
	}
	
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int desplazarX(int desplazamiento){
		x+=desplazamiento;
		return x;
	}
	
	public int desplazarY(int desplazamiento){
		y+=desplazamiento;
		return y;
	}
	
}

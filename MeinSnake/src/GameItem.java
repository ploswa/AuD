import java.awt.Graphics;

abstract public class GameItem {

	private Point position;

	public GameItem(int x, int y) {
		this.position = new Point(x, y);
	}

	public Point getPosition() {
		return position;
	}
<<<<<<< HEAD
	
	public abstract void paint (Graphics g);
	
=======

	public abstract void paint(Graphics g);
>>>>>>> branch 'master' of https://github.com/PaulundHasi/AuD.git
}

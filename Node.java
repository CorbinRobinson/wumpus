import java.util.ArrayList;

public class Node {

	private int xpos;
	private int ypos;
	private Node parent;
	private AgentAction action;

	public Node(int x, int y) {
		xpos = x;
		ypos = y;
		parent = null;
		action = AgentAction.doNothing;
	}

	public Node(int x, int y, Node p, AgentAction a) {
		xpos = x;
		ypos = y;
		parent = p;
		action = a;
	}

	public AgentAction getAction() {
		return action;
	}
	public int getX() {
		return xpos;
	}

	public void setX(int xpos) {
		this.xpos = xpos;
	}

	public int getY() {
		return ypos;
	}

	public void setY(int ypos) {
		this.ypos = ypos;
	}

	public Node getParent() {
		return parent;
	}

}

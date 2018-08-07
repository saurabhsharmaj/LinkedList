import com.saurabh.model.Node;
import com.saurabh.service.LinkedList;

/**
 * This is the main class with start the project.
 * @author saurabh
 *
 */
public class App {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();

		Node node = new Node();
		node.setValue(10);
		list.add(node);

		node = new Node();
		node.setValue(20);
		list.add(node);

		node = new Node();
		node.setValue(30);
		list.add(node);

		node = new Node();
		node.setValue(40);
		list.add(node);

		for (Node n : list.toArray()) {
			System.out.println(n);
		}

		list.removeLast();

		for (Node n : list.toArray()) {
			System.out.println(n);
		}

		list.clear();
		node = new Node();
		node.setValue(50);
		list.add(node);
		for (Node n : list.toArray()) {
			System.out.println(n);
		}

	}

}

package P15681.Main;

import java.io.*;
import java.util.*;

public class Main {
  static int pointCount = 0;
  static int rootNo = 0;
  static int queryCount = 0;
  static List<Node> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    // BufferedReader reader = new BufferedReader(new FileReader("./P15681/Main/input.txt"));
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] values = reader.readLine().split(" ");
    pointCount = Integer.parseInt(values[0]);
    rootNo = Integer.parseInt(values[1]);
    queryCount = Integer.parseInt(values[2]);

    // Initialize Nodes
    for (int i = 0; i < pointCount - 1; i++) {
      String[] nodes = reader.readLine().split(" ");
      int first = Integer.parseInt(nodes[0]);
      int second = Integer.parseInt(nodes[1]);
      list = createNode(list, first, second);
    }

    // Arrage by root
    Optional<Node> findRootNode = list.stream().filter(node -> node.value == rootNo).findFirst();
    if (!findRootNode.isPresent()) return;

    Node rootNode = findRootNode.get();
    Node tree = createTree(rootNode, -1);

    // Query 
    for (int i = 0; i < queryCount; i++) {
      int query = Integer.parseInt(reader.readLine());
      int count = getSubtreeCount(tree, query);
      writer.write(count);
      writer.newLine();
    }

    writer.flush();
    writer.close();
    reader.close();
    return;
  }

  static int getSubtreeCount(Node tree, int root) {
    int count = 0;
    int subRoot = root;
    if (tree.value == root || tree.root == root) {
      count = 1;
      subRoot = tree.value;
    }

    for (Node child : tree.connects) {
      count += getSubtreeCount(child, subRoot);
    }
    return count;
  }

  static Node createTree(Node node, int root) {
    if (root == -1) {
      node.root = -1;
    } else {
      node.root = root;
      Optional<Node> findRootNode = node.connects.stream().filter(child -> child.value == root).findFirst();
      if (findRootNode.isPresent()) {
        Node rootNode = findRootNode.get();
        node.connects.remove(rootNode);
      }
    }
    node.connects.forEach(child -> createTree(child, node.value));
    return node;
  }  

  static List<Node> createNode (List<Node> list, int first, int second) {
    Optional<Node> findFirstNode = list.stream().filter(node -> node.value == first).findFirst();
    Optional<Node> findSecondNode = list.stream().filter(node -> node.value == second).findFirst();

    Node firstNode = null;
    Node secondNode = null;

    if (findFirstNode.isPresent()) {
      firstNode = findFirstNode.get();
    } else {
      firstNode = new Node(first);
    }

    if (findSecondNode.isPresent()) {
      secondNode = findSecondNode.get();
    } else {
      secondNode = new Node(second);
    }

    if (!firstNode.connects.contains(secondNode)) {
      firstNode.connects.add(secondNode);
    }
    if (!secondNode.connects.contains(firstNode)) {
      secondNode.connects.add(firstNode);
    }

    if (!findFirstNode.isPresent()) list.add(firstNode);
    if (!findSecondNode.isPresent()) list.add(secondNode);

    return list;
  }
}

class Node {
  int value;
  int root;
  List<Node> connects;

  public Node (int value) {
    this.value = value;
    this.connects = new ArrayList<>();
  }
}

package alphabeta;

/**
 *
 * @author Alexandros Kritikos
 */
public class ABMain{
    public static void main(String[] args) {

        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        
        Alphabeta ab = new Alphabeta();

        // Orizoume tous komvous tou dentrou
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();
        Node n10 = new Node(1);
        Node n11 = new Node(8);
        Node n12 = new Node(5);
        Node n13 = new Node(6);
        Node n14 = new Node(4);
        Node n15 = new Node(7);
        Node n16 = new Node(9);
        Node n17 = new Node(3);
        Node n18 = new Node(2);
        Node n19 = new Node(6);
        Node n20 = new Node(10);
        Node n21 = new Node(2);

        // Orizoume poios einai o komvos-riza
        n1.setRootNode(true);

        // Orizoume poioi einai oi komvoi-fylla
        n10.setTerminalNode(true);
        n11.setTerminalNode(true);
        n12.setTerminalNode(true);
        n13.setTerminalNode(true);
        n14.setTerminalNode(true);
        n15.setTerminalNode(true);
        n16.setTerminalNode(true);
        n17.setTerminalNode(true);
        n18.setTerminalNode(true);
        n19.setTerminalNode(true);
        n20.setTerminalNode(true);
        n21.setTerminalNode(true);

        // Parakatw ftiaxnoume tin domh tou dentrou
        n1.addChild(n2);
        n1.addChild(n3);

        n2.addChild(n4);
        n2.addChild(n5);
        n2.addChild(n6);

        n3.addChild(n7);
        n3.addChild(n8);
        n3.addChild(n9);

        n4.addChild(n10);
        n4.addChild(n11);

        n5.addChild(n12);

        n6.addChild(n13);
        n6.addChild(n14);
        n6.addChild(n15);

        n7.addChild(n16);

        n8.addChild(n17);
        n8.addChild(n18);

        n9.addChild(n19);
        n9.addChild(n20);
        n9.addChild(n21);
        
        ab.doAlphabeta(n1, 4, negInf, posInf, true);
        System.out.println(n1.getValue());
    }    
}

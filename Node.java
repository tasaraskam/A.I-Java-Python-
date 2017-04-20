package alphabeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Alexandros Kritikos
 */

/* Me thn sigkekrimenh klash ilopoioume ton komvo ws ontothta tou programmatos. Iparxoun kapoies voithitikes methodoi pou
   ftiaxtikan gia tin kaliteri ilopoihsh tou algorithmou alphabeta */ 
public class Node{
    
    // Metavlites
    private int value;   // Apothikevei thn timh enos komvou
    private boolean isRootNode;     // Th xrhsimopoioume gia na deixnoume an enas komvos einai riza h oxi
    private boolean isTerminalNode;     // Th xrhsimopoioume gia na deixnoume an enas komvos einai fyllo h oxi
    private List<Node> childNodesList;      // Tha periexei tous komvous paidia enos komvou

    /* Epeidh kapoioi komvoi endexetai na min exoun arxika kapoia timh, dhmiourgisame 2 constructors, enan xwris parametrous kai 
     enan me parametro value */
    public Node() {
        this.childNodesList = new ArrayList<>();
    }

    public Node(int value) {
        this.value = value;
        this.childNodesList = new ArrayList<>();
    }

    // Getters kai setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isRootNode() {
        return isRootNode;
    }

    public boolean isTerminalNode() {
        return isTerminalNode;
    }

    public void setRootNode(boolean isRootNode) {
        this.isRootNode = isRootNode;
    }

    public void setTerminalNode(boolean isTerminalNode) {
        this.isTerminalNode = isTerminalNode;
    }

    public List<Node> getChildNodesList() {
        return childNodesList;
    }

    // Xrhsimopoioume afth th methodo gia na prosthesoume sth lista twn paidiwn enos komvou enan komvo n
    public void addChild(Node n) {
        this.childNodesList.add(n);
    }
    
    public Node getChild(){
        return childNodesList.get(0);
    }

    /* H parakatw methodos xrhsimevei gia na vriskoume apo mia lista me komvous-paidia ekeinon ton komvo me thn megaliterh timh.
     Gia na to petixoume afto xrhsimopoihsame thn klash Collections kai pio sigkekrimena, thn methodo max pou pairnei san orisma
     th lista afth kai ena antikeimeno ths klashs ChildrenComparator pou ilopoihsame parakatw */
    public Node findMaxOfChilds(List<Node> childNodesList) {
        return Collections.max(childNodesList, new ChildrenComparator());
    }

    // Paromoia douleia kanei kai h parakatw methodos h opoia omws vriskei ton komvo-paidi me thn mikroterh timh apo mia lista
    public Node findMinOfChilds(List<Node> childNodesList) {
        return Collections.min(childNodesList, new ChildrenComparator());
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    /* H eswterikh klash ChildrenComparator ftiaxthke wste na mporoume na sigkrinoume 2 antikeimena tipou Node ws pros ena pedio tous.
     Stin sigkekrimenh periptwsh sigkrinoume ws pros thn timh */
    class ChildrenComparator implements Comparator<Node> {

        @Override
        public int compare(Node n1, Node n2) {
            if (n1.getValue() < n2.getValue()) {
                return 1;
            } else if (n1.getValue() > n2.getValue()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

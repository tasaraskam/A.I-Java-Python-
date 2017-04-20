package alphabeta;

/**
 *
 * @author Alexandros Kritikos
 */
public class Alphabeta{
    
    public int doAlphabeta(Node node,int depth,double a, double b, boolean maxPlayer){
    
        if(depth == 0 || node.isTerminalNode()){
            return node.getValue();
        }
        
        if(maxPlayer){
            for(Node n : node.getChildNodesList()){
                a = Math.max(a, doAlphabeta(node.getChild(), depth-1, a, b, false));
                
                if(a >= b){
                    break;  // kladema tou dentrou
                }
            }
            
            return (int) a;
        }
        else{
            for (Node n : node.getChildNodesList()) {
                b = Math.min(b, doAlphabeta(node.getChild(), depth - 1, a, b, true));

                if (a >= b) {
                    break;  // kladema tou dentrou
                }
            } 
            
            return (int) b;
        }
        
    }
    
}

package Tree;
import java.util.*;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;
    public TreeNode(T data) {
         this.data = data;
        children = new ArrayList<>();
    }
        public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
            TreeNode<Integer> root=takeInput(sc);
            print(root);
        }

    private static void print(TreeNode<Integer> root) {
            String set=root.data+":";
            for(int i=0;i<root.children.size();i++){
                set+=root.children.get(i).data+",";
            }
        System.out.println(set);
        System.out.println("-----------------------------");
            for (int i=0;i<root.children.size();i++){
                print(root.children.get(i));
            }

    }

    private static TreeNode<Integer> takeInput( Scanner s) {
        System.out.println("Enter next NOde");
        int d=s.nextInt();
        TreeNode<Integer> root=new TreeNode<>(d);
        System.out.println("Enter no. of child nodes you want & press 0 for move forward");
        int childnodes=s.nextInt();
        for(int i=0;i<childnodes;i++){
            TreeNode<Integer>child=takeInput(s);
            root.children.add(child);
        } return root;
    }

}

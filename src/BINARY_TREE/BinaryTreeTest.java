package BINARY_TREE;



class Node {
    Node left;
    Node right;
    int value;
    public Node(int value) {
      this.value = value;
    }
  }

public class BinaryTreeTest {	  

	  public static void main(String[] args) {
	    // build the simple tree from chapter 11.
	    Node root = new Node(5);
	    System.out.println("Binary Tree Example");
	    System.out.println("Building tree with root value " + root.value);
	    insert(root, 1);
	    insert(root, 8);
	    insert(root, 6);
	    insert(root, 3);
	    insert(root, 9);
	    System.out.println("Traversing tree in order");
	    traverseInOrder(root);
	    System.out.println("Traversing tree front-to-back from location 7");
	    printFrontToBack(root, 7);
	    
	    int length = countNodes(root);
	    System.out.println("Length of tree :"+ length);
	    
	    // search of element
	    boolean flag = search(root,18);
	    System.out.println("fount in tree is :"+ flag);
	    
	  //To get level of node in a binary tree
	    int levelOfNode= getLevelOfNode(root,6,8);
	    System.out.println("To get level of node in a binary tree :"+ levelOfNode);
	    
	    // lowestCommonAncestor
	    Node lowroot = new Node(5);	   
	    Node node5=new Node(4);
	    Node node30=new Node(30);
	    
	    lowroot.left=node5;
	    lowroot.right=node30;
	    Node lowerAnchester =  lowestCommonAncestor(lowroot,node5,node30);
		System.out.println("lowestCommonAncestor : "+lowerAnchester.value);
		
		//deleteNode		
		root = deleteNode(root,6);
		traverseInOrder(root);
		
		// inorder travel		
		preorder(root);
	  }

	 /* public static void insert(Node node, int value) {
	    if (value < node.value) {
	      if (node.left != null) {
	        insert(node.left, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.value);
	        node.left = new Node(value);
	      }
	    } else if (value > node.value) {
	      if (node.right != null) {
	        insert(node.right, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.value);
	        node.right = new Node(value);
	      }
	    }
	  }

	  /* Function to insert data recursively */
	    private static Node insert(Node node, int data) 
	    {
	        if (node == null)
	            node = new Node(data);
	        else 
	        {
	            if (data <= node.value)
	                node.left = insert(node.left, data);
	            else
	                node.right = insert(node.right, data);
	        }
	        return node;
	    }
	  
	  public static void traverseInOrder(Node node) {
	    if (node != null) {
	    	traverseInOrder(node.left);
	      System.out.println("  Traversed " + node.value);
	      traverseInOrder(node.right);
	    }
	  }

	  /**
	   * uses in-order traversal when the origin is less than the node's value
	   * 
	   * uses reverse-order traversal when the origin is greater than the node's
	   * order
	   */
	  public static void printFrontToBack(Node node, int data) {
	    if (node == null)
	      return;
	    if (node.value > data) {
	      // print in order
	      printFrontToBack(node.left, data);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.right, data);
	    } else if (node.value < data) {
	      // print reverse order
	      printFrontToBack(node.right, data);
	      System.out.println("  Traversed " + node.value);
	      printFrontToBack(node.left, data);
	    } else {
	      // order doesn't matter
	      printFrontToBack(node.left, data);
	      printFrontToBack(node.right, data);
	    }
	  }
	  
	  
	  /* Function to count number of nodes recursively */
	    private static int countNodes(Node node) 
	    {
	        if (node == null)
	            return 0;
	        else 
	        {
	            int l = 1;
	            l += countNodes(node.left);
	            l += countNodes(node.right);
	            return l;
	        }
	    }

	    
	  	 
	    /* Function to search for an element recursively */
	    private static boolean search(Node r, int val) 
	    {
	        boolean found = false;
	        while ((r != null) && !found) 
	        {
	            int rval = r.value;
	            if (val < rval)
	                r = r.left;
	            else if (val > rval)
	                r = r.right;
	            else 
	            {
	                found = true;
	                break;
	            }
	            found = search(r, val);
	        }
	        return found;
	    }
	    
	    // Recursive Solution
		//To get level of node in a binary tree
		public static int getLevelOfNode(Node root,int key,int level)
		{
			if(root==null)
				return 0;
			if(root.value==key)
				return level;
	 
			int result=getLevelOfNode(root.left,key,level+1) ;
			if(result!=0)
			{ 
				// If found in left subtree , return 
				return result;
			}
			result= getLevelOfNode(root.right,key,level+1);
	 
			return result;
		}
	    
		
		public static Node lowestCommonAncestor(Node root, Node a, Node b) {
			if(root == null)
				return null;
			if(root.value == a.value || root.value == b.value )
				return root;
	 
			Node left=lowestCommonAncestor(root.left,a,b);
			Node right=lowestCommonAncestor(root.right,a,b);
	 
			// If we get left and right not null , it is lca for a and b
			if(left!=null && right!=null)
				return root;
			if(left== null)
				return right;
			else
				return left;
	 
		}
		
		// delete node
		 public static Node deleteNode(Node root, int data) {
				if (root == null)
					return null;
				if (root.value > data) {
					root.left = deleteNode(root.left, data);
				} else if (root.value < data) {
					root.right = deleteNode(root.right, data);
		 
				} else {
					// if nodeToBeDeleted have both children
					if (root.left != null && root.right != null) {
						Node temp = root;
						// Finding minimum element from right
						Node minNodeForRight = minimumElement(temp.right);
						// Replacing current node with minimum node from right subtree
						root.value = minNodeForRight.value;
						// Deleting minimum node from right now
						deleteNode(root.right, minNodeForRight.value);
		 
					}
					// if nodeToBeDeleted has only left child
					else if (root.left != null) {
						root = root.left;
					}
					// if nodeToBeDeleted has only right child
					else if (root.right != null) {
						root = root.right;
					}
					// if nodeToBeDeleted do not have child (Leaf node)
					else
						root = null;
				}
				return root;
			}
		 
		 // Get minimum element in binary search tree
			public static Node minimumElement(Node root) {
				if (root.left == null)
					return root;
				else {
					return minimumElement(root.left);
				}
			}
			
		
			  
			  private static void preorder(Node rootr) 
			    {				 
			        if (rootr != null) 
			        {   			        	
			            System.out.print(" preorder "+rootr.value + " ");
			            preorder(rootr.left);
			            preorder(rootr.right);
			        }
			    }
	}

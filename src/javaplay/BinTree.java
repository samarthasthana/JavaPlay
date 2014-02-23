package javaplay;

// Find the depth of a bin tree
class BinTree{
	public class Node{
	Node rchild,lchild,parent;
	Integer data;
		Node(){		
		data=0;
		rchild=null;
		lchild=null;
		parent=null;
		}
	}

	private Node root;

	BinTree(){
		root=new Node();
		root=null;
	}

	public Node get_root(){
		return root;
	}

	public void add_element(Node node,int val){
		Node nd=new Node();
		if(root==null){
			//add to root
                        nd.rchild=null;
			nd.lchild=null;
			nd.parent=null;
			nd.data=val;
			root=nd;			
		}
		else{
			if(node.data<val){
				//go to right sub tree
				if(node.rchild!=null)add_element(node.rchild,val);
				else {
					nd.rchild=null;
					nd.lchild=null;
					nd.parent=node;
					nd.data=val;
					node.rchild=nd;
				}
			}
			else{
				//go to left child
				if(node.lchild!=null)add_element(node.lchild,val);
				else {
					nd.rchild=null;
					nd.lchild=null;
					nd.parent=node;
					nd.data=val;
					node.lchild=nd;
				}
			}
		}
	}

	public Integer rem_element(Node node,int val){
            Integer res=null;
            Node temp,temp2;
            if(root==null)return null;
		else{
			if(node.data<val){
				// go to right
				if(node.rchild!=null)rem_element(node.rchild,val);
				else{
					return null;
				}
			}
			else if(node.data>val){
				if(node.lchild!=null)rem_element(node.lchild,val);
				else{
					return null;
				}
			}
			else{
				//this is the node to be deleted
				//check if leaf
				if(node.lchild==null && node.rchild==null){
                                    temp=get_left_or_right(node);
                                    temp=null;                                   
				}
				//check if one sub tree
				else if(node.lchild==null){
                                    temp=get_left_or_right(node);
                                    temp=node.rchild;
				}
				else if(node.rchild==null){
                                    temp=get_left_or_right(node);
                                    temp=node.lchild;
				}
				else{
				//check if both sub tree	
                                    temp=find_max_node(node.lchild);
                                    node.data=temp.data;
                                    if(temp.lchild==null && temp.rchild==null){  
                                        temp2=get_left_or_right(temp);
                                        temp2=null;                                        
                                    }
                                    else{
                                        temp2=get_left_or_right(temp);
                                        temp2=temp.lchild;
                                    }
				}
				
			}
		}
            return res;
	}
        
        private Node get_left_or_right(Node node){
         if(node.parent.data>node.data){
            //left
                return node.parent.lchild;
            }
            else{
                return node.parent.rchild;
            }
        }
        
        private Node find_max_node(Node node){
            if(node==null || node.rchild==null)return node;
            else{
                return find_max_node(node.rchild);
            }
        }

	public Integer get_depth(Node nd){
		if(nd==null)return 0;
		else{
			return Math.max(get_depth(nd.rchild),get_depth(nd.rchild))+1;
		}
	}

	public void inorder_trav(Node nd){
		if(nd!=null){
			inorder_trav(nd.lchild);
			System.out.printf("%d \t",nd.data);
			inorder_trav(nd.rchild);
		}
	}
}

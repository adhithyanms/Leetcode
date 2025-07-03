class Node{
     Node prev;
     Node next;
     String url;
     Node( String url)
     {
        this.url=url;
     }
}
class BrowserHistory {
    Node current;
    public BrowserHistory(String homepage) {
        current=new Node(homepage);
    }
    
    public void visit(String url) {
      current.next=new Node(url);
      current.next.prev=current;
      current=current.next;
    }
    
    public String back(int steps) {
        while(current.prev!=null && steps-->0)
        {
            current=current.prev;
        }
        return current.url;
    }
    
    public String forward(int steps) {
        while(current.next!=null && steps-->0)
        {
            current=current.next;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
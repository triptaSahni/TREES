boolean search(String data) {
    Node curr = root;
    while(curr != null) {
        if(curr.data.compareTo(data) == 0) {
            return true;
        }
        else if(curr.data.compareTo(data) > 0) {
            curr = curr.left;
        }
        else {
            curr = curr.right;
        }
    }
    return false;
}

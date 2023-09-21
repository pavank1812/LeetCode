class MyHashSet {

    public MyHashSet() {
        set = new boolean[1000001];
        
    }
    
    public void add(int key) {
        set[key] = true;
        
    }
    
    public void remove(int key) {
        set[key] = false;
        
    }
    
    public boolean contains(int key) {
        return set[key];
    }
    private boolean[] set = new boolean[1000001];
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */




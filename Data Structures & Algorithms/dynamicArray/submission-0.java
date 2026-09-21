class DynamicArray {
    LinkedList<Integer> list;
    int cap;
    public DynamicArray(int capacity) {
        list = new LinkedList<>();
        cap = capacity;
    }

    public int get(int i) {
        return list.get(i);
    }

    public void set(int i, int n) {
        list.set(i, n);
    }

    public void pushback(int n) {
        if(list.size() == cap) {
            this.resize();
        }
        list.add(n);
    }

    public int popback() {
        return list.removeLast();
    }

    private void resize() {
        cap *= 2;
    }

    public int getSize() {
        return list.size();
    }

    public int getCapacity() {
        return cap;
    }
}
class Stack {
    int[] arr;
    int length, capacity;

    public Stack(int size) {
        length = -1;
        capacity = size;
        arr = new int[capacity];
    }

    public Stack() {
        length = -1;
        capacity = 4;
        arr = new int[capacity];
    }

    private void increaseSize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void push(int number) {
        if (length == capacity - 1) {
            increaseSize();
        }
        arr[++length] = number;
    }

    public int pop() {
        if (length < 0) {
            System.out.println("Array is Empty");
            return 0;
        }
        int popElement = arr[length];
        arr[length--] = 0;
        return popElement;
    }

    public int peek() {
        return arr[length];
    }

    public void print() {
        if (length < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack : ");
        for (int i = length; i >= 0; i++) {
            System.out.println(arr[i]);
        }
    }

}

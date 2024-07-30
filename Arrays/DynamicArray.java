class DynamicArray {
    int[] arr;
    int length, capacity;

    public DynamicArray(int size) {
        length = -1;
        capacity = size;
        arr = new int[capacity];
    }

    public DynamicArray() {
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

    public void add(int number) {
        if (length == capacity - 1) {
            increaseSize();
        }
        arr[++length] = number;
    }

    public void add(int number, int index) {
        if (index > length) {
            System.out.println("Index out of range");
            return;
        }
        if (length == capacity - 1) {
            increaseSize();
        }

        for (int i = length + 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
        length++;
    }

    public void remove() {
        if (length < 0) {
            System.out.println("Array is Empty");
            return;
        }
        arr[length--] = 0;
    }

    public void remove(int index) {
        if (length < 0) {
            System.out.println("Array is Empty");
            return;
        }
        for (int i = index; i < length; i++) {
            arr[i] = arr[i + 1];
        }
        arr[length--] = 0;
    }

    public void print() {
        if (length < 0) {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("Array : ");
        for (int i = 0; i <= length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
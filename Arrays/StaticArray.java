class StaticArray {
    int[] arr;

    public StaticArray(int size) {
        arr = new int[size];
    }

    public void print() {
        System.out.print("Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private boolean isFull() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public void add(int number) {
        if (isFull()) {
            System.out.println("Array is Full");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = number;
                break;
            }
        }
    }

    public void insertAt(int number, int index) {
        if (isFull()) {
            System.out.println("Array is full");
            return;
        }
        if (index == arr.length - 1) {
            arr[index] = number;
            return;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
    }

    public void remove() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == 0) {
                arr[i] = 0;
                return;
            }
        }
        arr[arr.length - 1] = 0;
    }

    public void removeAt(int index) {
        if (index == arr.length - 1) {
            arr[index] = 0;
            return;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
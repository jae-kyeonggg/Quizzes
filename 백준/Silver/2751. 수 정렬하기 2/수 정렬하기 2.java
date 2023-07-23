import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());    int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        heapSort(ar);
        for (int i = 0; i < ar.length; i++) {
            bw.write(String.valueOf(ar[i]));
            bw.newLine();
        }
        bw.close();
    }

    static void heapSort(int[] ar) {
        int size = ar.length;
        if (size < 2) {
            return;
        }
        int parentIdx = getParent(size - 1);
        for (int i = parentIdx; i >= 0; i--) {
            heapify(ar, i, size - 1);
        }
        for (int i = size - 1; i > 0; i--) {
            swap(ar, 0, i);
            heapify(ar, 0, i - 1);
        }
    }

    static int getParent(int child) {
        return (child - 1) / 2;
    }

    static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static void heapify(int[] ar, int parentIdx, int lastIdx) {
        int leftChildIdx = 2 * parentIdx + 1;
        int rightChildIdx = 2 * parentIdx + 2;
        int largestIdx = parentIdx;
        if (leftChildIdx <= lastIdx && ar[largestIdx] < ar[leftChildIdx]) {
            largestIdx = leftChildIdx;
        }
        if (rightChildIdx <= lastIdx && ar[largestIdx] < ar[rightChildIdx]) {
            largestIdx = rightChildIdx;
        }
        if (parentIdx != largestIdx) {
            swap(ar, largestIdx, parentIdx);
            heapify(ar, largestIdx, lastIdx);
        }
    }
}
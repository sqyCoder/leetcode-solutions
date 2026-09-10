class leetcode1089 {
    public void duplicateZeros(int[] arr) {
        int dest = 0;
        int cur = 0;
        while (dest < arr.length) {
            if (arr[cur] == 0) {
                dest += 2;
            } else {
                dest++;
            }
            cur++;
        }
        if (dest == arr.length) {
            arr[arr.length - 1] = 0;
            cur--;
            dest -= 2;
        }

        while (cur > 0) {
            if (arr[cur] != 0) {
                arr[dest--] = arr[cur--];
            } else {
                arr[dest--] = 0;
                arr[dest--] = 0;
                cur--;
            }
        }
    }
}
#include <stdio.h>
#include <stdlib.h>

int f(int a[], int n) {
    int i = 0, r = 0;
    for (i = 0; i < n; i++) {
        r ^= a[i];
    }
    return r;
}

int main() {
    int n, *a, r;

    printf("请输入数组的长度: ");
    scanf("%d", &n);

    a = (int *)malloc(n * sizeof(int));
    if (a == NULL) {
        printf("内存分配失败！\n");
        return 1;
    }

    printf("请输入 %d 个整数: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    r = f(a, n);
    printf("只出现一次的数字是: %d\n", r);

    free(a);
    a = NULL;

    return 0;
}

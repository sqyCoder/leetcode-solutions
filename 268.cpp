#include <stdio.h>
#include <stdlib.h>

int f(int a[], int n) {
    int r = n, i;
    for(i = 0; i < n; i++) {
        r ^= i ^ a[i];
    }
    return r;
}

int main() {
    int n, *a, r;

    printf("请输入数组长度: ");
    scanf("%d", &n);

    a = (int *)malloc(n * sizeof(int));
    if(a == NULL) {
        printf("内存分配失败！\n");
        return 1;
    }

    printf("请输入 %d 个整数: ", n);
    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    r = f(a, n);
    printf("缺失的数字是: %d\n", r);

    free(a);
    a = NULL;
    return 0;
}

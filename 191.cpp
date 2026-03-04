#include <iostream>
using namespace std;

class Solution {
public:
    int hammingWeight(int n) {
        int cnt=0;
        while(n)
        {
            n&=n-1;
            cnt++;
        }
        return cnt;
    }
};

int main() {
    Solution sol;
    int n;
    cin >> n;
    cout << sol.hammingWeight(n) << endl;
    return 0;
}

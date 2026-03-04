#include <iostream>
using namespace std;

class Solution {
public:
    int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) + 1;
        }
        return mask ^ num;
    }
};

int main() {
    Solution sol;
    int num;
    cin >> num;
    cout << sol.findComplement(num) << endl;
    return 0;
}

/*
    Enlace al problema: https://leetcode.com/problems/maximum-69-number/

    La solución se encuentra dentro de la clase `Solution`, lo demás es para hacer pruebas de manera local
*/

#include <iostream>

using namespace std;

class Solution {
public:
    int maximum69Number (int num) {
        int temp = num;
        int reverse = 0;
        while(temp) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        temp = reverse;
        reverse = 0;
        bool changed = false;
        while(temp) {
            int digit = temp % 10;
            if(!changed && digit == 6) {
                changed = true;
                digit = 9;
            }
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return reverse;
    }
};

int main() {
    auto solution = new Solution();
    cout << solution->maximum69Number(9996) << "\n";
    return 0;
}
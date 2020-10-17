/*
    Enlace al problema: https://leetcode.com/problems/peak-index-in-a-mountain-array/

    La solución se encuentra dentro de la clase `Solution`, lo demás es para hacer pruebas de manera local
*/
#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int pos = 1;
        for(int i = 0 ; i < arr.size()-1; i ++) {
            if(arr[i] > arr[i+1]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
};

int main() {

    auto solution = new Solution();
    vector<int> v = {0,2,1,0};
    cout << solution->peakIndexInMountainArray(v) << "\n";
    return 0;
}
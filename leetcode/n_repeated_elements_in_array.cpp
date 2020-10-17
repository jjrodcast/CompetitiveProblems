/*
    Enlace al problema: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

    La solución se encuentra dentro de la clase `Solution`, lo demás es para hacer pruebas de manera local
*/
#include <iostream>
#include <vector>
#include <map>

using namespace std;

class Solution {
public:
    int repeatedNTimes(vector<int>& A) {
        int element = -1;
        map<int, int> mymap;
        for(auto a : A) {
            mymap[a] += 1;
            auto it = mymap.find(a);
            if(it->second == A.size()/2){
                element = it->first;
                break;
            }
        }
        return element;
    }
};


int main() {

    auto solution = new Solution();
    vector<int> v = {5,1,5,2,5,3,5,4};
    cout << solution->repeatedNTimes(v) << "\n";
    return 0;
}
#include <iostream>
#include <cstring>
using namespace std;
int main()
{
    string word1="abcd";
    string word2="pqrs";
    string s="";
    int x=size(word1);
    int y=size(word2);
    int i=0,j=0,k=0;
    cout<<x<<" "<<y<<endl;

    if(x>y){
        while(y>0){
            if(k%2==0){
                s+=word1[i++];
                k++;
            }
            else{
                s+=word2[j++];
                k++;
                y--;
            }
        }
        while(i<x){
            s+=word1[i++];
        }
    }
    else if(y>x){
        while(x>0){
            if(k%2==0){
                s+=word1[i++];
                k++;
                x--;
            }
            else{
                s+=word2[j++];
                k++;
            }
        }
        while(j<y){
            s+=word2[j++];
        }

    }
    else{
        while(y>0){
            if(k%2==0){
                s+=word1[i++];
                k++;
            }
            else{
                s+=word2[j++];
                k++;
                y--;
            }
        }
    }
    cout<<s;
    return 0;
}
// #include <string>

// std::string mergeAlternately(const std::string& word1, const std::string& word2) {
//     std::string result;
//     int i = 0, j = 0;

//     while (i < word1.size() && j < word2.size()) {
//         result += word1[i++];
//         result += word2[j++];
//     }

//     // Append the remaining characters from both strings
//     while (i < word1.size()) {
//         result += word1[i++];
//     }

//     while (j < word2.size()) {
//         result += word2[j++];
//     }

//     return result;
// }

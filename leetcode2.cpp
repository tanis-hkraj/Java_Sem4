// #include <iostream>
// #include <vector> 
// #include <string.h>
// #include <bits/stdc++.h>
// using namespace std;

// int main()
// {
//     string s="aacabdkacaa";
//     vector<string> aage;
//     int n=s.size();
//     for(int i=0;i<n;i++){
//         string str="";
//         for(int j=i;j<n;j++){
//             str+=(s[j]);
//             aage.push_back(str);
//         }
//     }
//     for(int i=0;i<aage.size();i++){
//         for(int j=0;j<aage.size()-i-1;j++){
//             if(aage[j].length()<aage[j+1].length()){
//                 swap(aage[j],aage[j+1]);
//             }
//         }
//     }
//     string ans;
//     for(int i=0;i<aage.size();i++){
//         ans=aage[i];
//         string rev=string(ans.rbegin(),ans.rend());
//         if(ans==rev){
//             break;
//         }
        
//     }
//     cout<<ans<<endl;
//     for(int i=0;i<aage.size();i++){
//         cout<<aage[i]<<" ";
//     }
    
//     return 0;
// }
#include <iostream>
#include <string>
using namespace std;

int main() {
    string inputString = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    int length = inputString.length();

    // Access substrings in descending order by length
    for (int len = length; len > 0; --len) {
        string ans="";
        string rev;
        for (int i = 0; i <= length - len; ++i) {
            string substring = inputString.substr(i, len);
            rev=string(substring.rbegin(),substring.rend());
            if(substring==rev){
                cout<<rev<<endl;
                ans=substring;
                break;
            }
        }
        if(ans!=""){
            break;
        }
    }

    return 0;
}


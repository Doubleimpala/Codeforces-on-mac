#include <iostream>

using namespace std;

void solve() {
    string a;
    string b;
    cin >> a; 
    cin >> b;
    if(a.length()>b.length()) {
        cout << "NO\n";
        return;
    }
    int g = 0;
    for(int i = 0; i < (int)a.length(); i++) {
        if(a[i] != b[g]){
            cout << "NO\n";
            return;
        }
        int cap = 2;
        int min = 1;
        while(a[i+1] == a[i]){
            cap += 2;
            min += 1;
            i++;
        }
        int o = 0;
        while(o < cap){
            if(a[i] == b[g]){
                g++;
            } else {
                break;
            }
            o++;
        }
        if(o < min){
            cout << "NO\n";
            return;
        }
        if(a[i]==b[g]){
            cout << "NO\n";
            return;
        }
    }
    if(g != b.length()){
        cout << "NO\n";
        return;
    }
    cout << "YES\n";
    return;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--) solve();
}

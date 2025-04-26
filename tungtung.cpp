#include <iostream>

using namespace std;
using vi = vector<char>;

void solve() {
    vi v = vi();
    vi p = vi();
    char n;
    cin >> n;
    // Your code here
    while(n != 10) {
        v.push_back(n);
    }
    while(n != 10) {
        p.push_back(n);
    }
    for(int i = 0; i < min(v.size(), p.size()); i++) {
        
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--) solve();
}

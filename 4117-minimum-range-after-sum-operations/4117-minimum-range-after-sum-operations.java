class Solution {
    public int minRange(int a, int b, int c) {
        int sum = 0;
        int a1 = b+c;
        int b1 = a+c;
        int c1 = a+b;
        int max = Math.max(a1, Math.max(b,c));
        int max1 = Math.max(b1, Math.max(c,a));
        int max2 = Math.max(c1, Math.max(a,b));

        int min = Math.min(a1, Math.min(b,c));
        int min1 = Math.min(b1, Math.min(a,c));
        int min2 = Math.min(c1, Math.min(a,b));

        int ans = max-min;
        int ans1 = max1-min1;
        int ans2 = max2-min2;

        int res = Math.min(ans, Math.min(ans1,ans2));
        int t = Math.max(a, Math.max(b,c)) - Math.min(a, Math.min(b,c));
        
        
        return Math.min(res, t); 
    }
}
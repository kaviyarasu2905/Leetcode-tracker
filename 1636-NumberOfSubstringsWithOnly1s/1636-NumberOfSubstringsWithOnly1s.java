// Last updated: 08/07/2026, 15:38:06
class Solution {
    public int numSub(String s) {
        final int mod=1000000007;
        long cnt=0, ans=0;
        for(char c: s.toCharArray()){
            ans+=(1-(c-'0'))*cnt*(cnt+1)/2;
            ans%=mod;
            cnt=(c-'0')*(cnt+1);
        }
        ans=(ans+(long)cnt*(cnt+1)/2%mod);// last one
        return (int)ans;
    }
}
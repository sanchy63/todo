public class SegmentTree {
    int[] a;
    int n;
    int[] st;
    int[] lazy;
    SegmentTree(int[] a,int n){
        this.a=a;
        this.n=n;
        st=new int[4*n];
        lazy=new int[4*n];
        build(0,0,n-1);
    }
    public int build(int i,int l,int r){
        if(l==r){
            st[i]=a[l];
            return st[i];
        }
        int mid=l+(r-l)/2;
        int left= build(2*i+1, l, mid);//left sum
        int right=build(2*i+2,mid+1,r);//right sum
        st[i]=left+right;
        return st[i];
    }
    public int findsum(int l,int r){
        return findRangeSum(0,0,n-1,l,r);
    }
    public int findRangeSum(int i,int sl,int sr,int l,int r){
        if(sr<l || sl>r){ //  no overlapping
            return 0;
        }
        if(sl>=l && sr<=r){ // complete overlapping
            return st[i];
        } 
        // partial overlapping
        int mid=sl+(sr-sl)/2;
        return findRangeSum(2*i+1,sl,mid,l,r)+findRangeSum(2*i+2, mid+1, sr, l, r);

    }
    public void update(int i,int x){
        int diff=x-a[i];
        update(0,0,n-1,i,diff);
    }
    public void update(int si,int sl,int sr,int id,int diff){
        if(id<sl || id>sr){
            return ;
        }
        st[si] += diff;
        if (sl != sr) {
            int mid = sl + (sr - sl) / 2;
            update(2 * si + 1, sl, mid, id, diff);  // Update left child.
            update(2 * si + 2, mid + 1, sr, id, diff);  // Update right child.
        }
    }
    public void updateRange(l,r,x){
        updateRange(0,0,n-1,l,r,x);
    }
    public void updateRange(int i,int sl,int sr,int l,int r,int x){
        if(lazy[i]>0){
            st[i]=(sr-sl+1)*lazy[i];
            if(sl!=sr){
                lazy[2*i+1]=lazy[i];
                lazy[2*i+2]=lazy[i];
            }
            lazy[i]=0;
        }
        if(sr<l || sl>r) return;
        if(sl>=l & sr<=r){
            st[i]=(sr-sl+1)*x;
            lazy[2*i+1]+=x;
            lazy[2*i+2]+=x;
            return;
        }
        int mid=sl+(sr-sl)/2;
        updateRange(2*i+1, sl, sr, l, r, x);
       
    }
    public static void main(String[] args) {
       
    }
}

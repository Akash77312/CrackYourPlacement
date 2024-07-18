75. Sort Colors

https://leetcode.com/problems/sort-colors/description/

int cnt0=0,cnt1=0,cnt2=0;
        for(int i:arr){
            if(i==0)    cnt0++;            
            else if(i==1)    cnt1++;
            else if(i==2)    cnt2++;

        }
        int idx=0;
        while(cnt0!=0){
            arr[idx++]=0;
            cnt0--;
        }
        while(cnt1!=0){
            arr[idx++]=1;
            cnt1--;
        }
        while(cnt2!=0){
            arr[idx++]=2;
            cnt2--;
        }
function solution(arr1, arr2) {
    if(arr1.length>arr2.length){
        return 1;
    } else if(arr2.length>arr1.length){
        return -1
    } else{
        let sum1 = 0;
        let sum2 = 0;
        for(num of arr1){
            sum1+=num;
        }
        for(num of arr2){
            sum2 += num;
        }
        if(sum1>sum2){
            return 1
        } else if(sum1<sum2){
            return -1
        } else{
            return 0
        }
    }
}
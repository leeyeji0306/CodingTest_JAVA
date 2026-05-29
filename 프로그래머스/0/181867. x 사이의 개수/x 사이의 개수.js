function solution(myString) {
    var answer = [];
    let count = 0;
    for(let i =0; i<myString.length; i++){
        let ch = myString.charAt(i)
        if(ch==='x'){
            answer.push(count)
            count=0
        }
        else{
            count++;
        }
        if(i === myString.length-1){
            answer.push(count);
        }
    }
    return answer;
}
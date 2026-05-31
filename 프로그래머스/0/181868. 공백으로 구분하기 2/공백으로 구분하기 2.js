function solution(my_string) {
    let answer=[];
    let temp = my_string.split(" ");
    for(string of temp){
        if(string!==""){
            answer.push(string)
        }
    }
    return answer;
}
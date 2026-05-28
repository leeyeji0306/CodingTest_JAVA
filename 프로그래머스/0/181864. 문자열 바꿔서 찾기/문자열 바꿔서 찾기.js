function solution(myString, pat) {
    let temp=""
    for(char of myString){
        if(char === "A"){
            temp+="B"
        } else{
            temp +="A"
        }
    }
    if(temp.indexOf(pat)===-1){
        return 0
    } else{
        return 1
    }
}
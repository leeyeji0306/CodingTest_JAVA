function solution(binomial) {
    if(binomial.indexOf("+")!==-1){
        let temp = binomial.split(" + ");
        return (+temp[0]) + (+temp[1])
    } else if(binomial.indexOf("-")!==-1){
        let temp = binomial.split(" - ");
        return (+temp[0]) - (+temp[1])
    } else{
      let temp = binomial.split(" * ");
      return (+temp[0]) * (+temp[1])  
    }
}
def myMethod(a,b){
  if(a.compareTo(b)>0){
    return a
  }else{
    return b
  }
}
println myMethod(2,3)
println myMethod("2",3)
println myMethod(2,"3")
println myMethod("2","3") 
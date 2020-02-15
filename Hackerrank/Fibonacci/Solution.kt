fun fibonacci(): Sequence<Int> {
    // fibonacci terms
    return generateSequence(Pair(0, 1), { 
        Pair(it.second, it.first + it.second) 
    }).map { 
        it.first 
    }
}

fun getFibonacci() : Array<Int>{
    val data = fibonacci().take(5).toList()

    val array2 = Array<Int>(data.size){0}
    for(value in 0..data.size-1){
        array2[value] = data[value]
    }
    return array2
}

fun main() {
    for(element in getFibonacci()){  
       println(element)  
    } 
}
import kotlin.random.Random

fun main(args: Array<String>) {
/*
* INT LIST 1.100
* */

}

fun generate():List<Int>{
    val intList= mutableListOf<Int>()
    val target=100//Random(1).nextInt(100)
    for(i in 1 .. 100){
        if(target!=i){
            intList.add(i)
        }
    }

    //intList.remove(target)
    println( "random num= $target list= $intList")
    return intList
}

/**
 * find the mising number
 * */

fun findMissingNumber(intList:List<Int>):Int{
    if(intList[0]>1){
        return 1
    }

    for(i in 1 .. intList.size){
        val nextIndex=i+1
        if(nextIndex < intList.size){
            if(intList[nextIndex] - intList[i] >1){
                return intList[i]+1
            }
        }else{
            return 100
        }
    }
    return -1
}




import kotlin.random.Random

fun main(args: Array<String>) {
    println("Run unit tests to test")
}

fun getRandomItemToRemove()=Random(1).nextInt(100)
fun generateWithRemovedItem(itemToRemove:Int):List<Int>{
    val intList= mutableListOf<Int>()

    for(i in 1 .. 100){
        if(itemToRemove!=i){
            intList.add(i)
        }
    }

    println( "random num= $itemToRemove list= $intList")
    return intList
}

fun findMissingNumber(intList:List<Int>):Int{
    if(intList[0]>1){ //lower bound rule
        return 1
    }

    if(intList[intList.size-1]<100){ //upper bound rule
        return 100
    }

    //there was an off by one here as we were using the range and not the index
    for((index) in intList.withIndex()){
        val nextIndex=index+1
        if(nextIndex < intList.size){
            if(intList[nextIndex] - intList[index] >1){
                return intList[index]+1
            }
        }
    }
    return -1
}




import org.junit.Test

import org.junit.Assert.*


class MainKtTest {

    @Test
    fun `test getRandomItemToRemove contains 99 elements`() {
        val itemToRemove=getRandomItemToRemove()
        val output=generateWithRemovedItem(itemToRemove)
        val expectedSize=99
        assertEquals(expectedSize,output.size)
    }

    @Test
    fun `test generateWithRemovedItem is generated with correct removed item`() {
        val itemToRemove=getRandomItemToRemove()
        val output=generateWithRemovedItem(itemToRemove)

        val expectedOutputList= mutableListOf<Int>()
        expectedOutputList.addAll((1 .. 100).toList())
        expectedOutputList.remove(itemToRemove)

        assertEquals(expectedOutputList,output)
    }

    @Test
    fun `test Upper Bound returns 100 when value 100 is removed`(){
        val genList=generateWithRemovedItem(100)
        val output=findMissingNumber(genList)
        assertEquals(100,output)
    }

    @Test
    fun `test lower Bound returns 1 when value 1 is removed `(){
        val genList=generateWithRemovedItem(1)
        val output=findMissingNumber(genList)
        assertEquals(1,output)
    }
}
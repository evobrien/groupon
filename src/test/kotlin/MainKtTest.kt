import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun `test generate contains 100 elements`() {
        val output=generate()
        val expected=100
        assertEquals(expected,output.size)
        assertEquals((1 .. 100).toList(),output)
    }

    @Test
    fun test(){
        val genList=generate()
        val output=findMissingNumber(genList)
        println(output)
    }
}
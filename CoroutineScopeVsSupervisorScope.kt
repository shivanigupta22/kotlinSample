import kotlinx.coroutines.*
fun main() = runBlocking {
 doWork1()
}
suspend fun doWork2() = coroutineScope {
  launch {
        try {
            coroutineScope {
                val job1 = async { work1()}
    	val job2 = async { work2()}
   		val s1 = job1.await()
       val s2 = job2.await()
       println(s1)
       println(s2)
            }
        } catch(e:Exception){
            println(e.toString())
        }
    }
}
// CoroutineScope here try-catch at the top and if 1 coroutine fails then it results in canceling the complete parent job which can
//have other coroutines as well
suspend fun doWork1() = coroutineScope {
	launch {
        try {
            supervisorScope {
                try {
                    val job1 = async { work1()}
                val s1 = job1.await()
                println(s1)
                }catch(e:Exception){
            println(e.toString())
        }
    	try {
            val job2 = async { work2()}
   		
       val s2 = job2.await()
       
       println(s2)
        }catch(e:Exception){
            println(e.toString())
        }
            }
        } catch(e:Exception){
           // println(e.toString())
        }
    }

} 
// supervisorScope here try-catch for every job and if 1 coroutine fails then there is no impact on another
suspend fun work1():String {
    delay(3000)
    throw RuntimeException()
}
suspend fun work2():String {
    delay(6000)
    return "work2 done"
}

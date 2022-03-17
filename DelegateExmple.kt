//Delegating work from one object to helper object eg -> navUtilRef to navUtil
//In this case we only need to override the method which we need and rest impl can be taken from helper object
//Using by keyboard delegate can be used in kotlin

interface NavigationUtil {
    fun navigateTo()
    fun navigateTo1()
    fun navigateTo2()
}
class NavUtilImpl : NavigationUtil {
    override fun navigateTo() {
        print("navigated")
    }
    override fun navigateTo1() {
        print("navigated 1")
    }
    override fun navigateTo2() {
        print("navigated 2")
    }
}
class NavUtilWithRefToDestination(private val navUtil: NavigationUtil) : NavigationUtil by navUtil {
    override fun navigateTo1() {
        print("addition operation")
        navUtil.navigateTo1()
    }
}

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

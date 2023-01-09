//val vs const
const a = 9
// should be assigned b4 compilation and declared at top level; exceptions=> should be declared at top level && must be init
val b = 2
// should be assigned b4 access and is local; exception => must be init 

//var
var c
println(c) // won't work, kotlin doesn't allow unassigned var to be used and doesn't assign it to default as java does "null" throws exception ==> prop must be init
var d = 9 
var e : Int = 0
//both will work

var f: String? //won't work
var g: String? = null //will work

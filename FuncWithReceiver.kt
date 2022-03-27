fun main() {
 //  function with literal receiver
			   val sum = fun Int.(other:Int) = this + other
				print(3.sum(4))
			   
				
			//   higher order function with lambda
			fun buildString(action: (StringBuilder) -> Unit): String {
				val builder = StringBuilder()
				action(builder)
				return builder.toString()
			}
			//   higher order function with extension function
			fun buildString2(action: StringBuilder.() -> Unit): String {
				val builder = StringBuilder()
				action(builder)
				return builder.toString()
			}
			// here explaintory solution 
			print(buildString(fun (action2:StringBuilder) {
				action2.append("\nhi")
				action2.append("\nbye")
			}))
			//usage
			print(buildString {
				builder ->
				builder.append("\nnextttttttttt")
			})

			//usage
			print(buildString2 {
				append("\nnextttttttttt")
			})
}

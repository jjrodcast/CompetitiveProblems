/*
* Enlace al problema: https://leetcode.com/problems/remove-outermost-parentheses/
*
* La solución se encuentra dentro de la función `removeOuterParentheses`, el resto del código es para
* ejecutarlo de manera local.
*
*  */

class SolutionParenthesis {
    fun removeOuterParentheses(S: String): String {
        var r = ""
        var deph = 0
        for (s in S) {
            if (s == '(') {
                deph++
                if (deph > 1) r += s
            } else {
                deph--
                if (deph > 0) r += s
            }
        }
        return r
    }
}

fun main() {
    val solution = SolutionParenthesis()
    println(solution.removeOuterParentheses("(()())(())"))
    println(solution.removeOuterParentheses("(()())(())(()(()))"))
    println(solution.removeOuterParentheses("()()"))
}
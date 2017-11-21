package am.alite.ga.dsl

import am.alite.ga.ast.*

open class DSLContext internal constructor() {
    val pi = ConstantNode(Constants.PI)
    val e = ConstantNode(Constants.E)
    val x = VarNode("x")
    val y = VarNode("y")
    val z = VarNode("z")
    val n = VarNode("n")
    val k = VarNode("k")

    fun sqrt(x: Node) = FunctionNode(Functions.SQRT, x)
    fun cbrt(x: Node) = FunctionNode(Functions.CBRT, x)
    fun nroot(radix: Node, radicand: Node) = BiFunctionNode(Functions.NROOT, radix, radicand)
    fun log(x: Node) = BiFunctionNode(Functions.LOGN, IntNode(10), x)
    fun ln(x: Node) = BiFunctionNode(Functions.LOGN, e, x)
    fun logn(base: Node, x: Node) = BiFunctionNode(Functions.LOGN, base, x)

    val Int.n
    get() = IntNode(toLong())
    val Long.n
    get() = IntNode(this)

    val Float.n
    get() = FloatNode(toDouble())
    val Double.n
    get() = FloatNode(this)
}

val dslContext = DSLContext()

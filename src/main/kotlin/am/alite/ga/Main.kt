package am.alite.ga

import am.alite.ga.ast.ExpressionNode

fun main(args: Array<String>) {

    val testNumNode = ExpressionNode('4')
    val testOperatorNode = ExpressionNode('+', testNumNode, testNumNode)
}

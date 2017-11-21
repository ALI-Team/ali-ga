package am.alite.ga.dsl

import am.alite.ga.ast.*

class EqContext internal constructor() : DSLContext() {
    infix fun Node.eq(other: Node) = Equation(this, other)
}

val eqContext = EqContext()

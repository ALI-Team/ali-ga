package am.alite.ga.dsl

import am.alite.ga.ast.*

fun expression(builder: DSLContext.() -> Node): Expression {
    return Expression(dslContext.builder());
}

fun equation(builder: EqContext.() -> Equation): Equation {
    return eqContext.builder()
}

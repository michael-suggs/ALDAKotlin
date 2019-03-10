package com.michaelsuggs.alda.classification


/**
 * TODO: Doc me!
 */
class DecisionTree (val data: List<List<Any>>) {
    val root: Node? = null;

    init {
        //TODO: Set root.
        //TODO: Train tree.
    }

    fun growTree() {  }

    fun splitIdx(): Int {
        return 0;
    }

    fun split(splitIdx: Int) {  }

    fun classify(newData: List<List<Any>>): List<Any> { return emptyList(); }

    class Node (val idx: Int) {
        var children: List<Node> = emptyList(); // TODO: Made children split resultants.
    }
}
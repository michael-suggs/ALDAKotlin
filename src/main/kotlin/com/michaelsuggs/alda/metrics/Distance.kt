package com.michaelsuggs.alda.metrics

import kotlin.math.pow

fun distanceMatrix() {  }

/**
 * TODO: Doc me!
 */
fun rnorm(a: List<Double>, b: List<Double>, r: Int): Double? {
    if (a.size != b.size) throw IllegalArgumentException("Arrays must be of same size.");
    var sum: Double = 0.0;
    for (i in 0..a.size-1) sum += (a[i] - b[i]).pow(r);
    return (1/a.size) * sum.pow(1/r);
}

@JvmName("manhattanMatrix")
fun manhattan(a: List<List<Double>>, b: List<List<Double>>): Double? {
    return 0.0;
}

fun manhattan(a: List<Double>, b: List<Double>): Double? = rnorm(a, b, 1);

fun euclidean(a: List<Double>, b: List<Double>): Double? = rnorm(a, b, 2);

fun cosineSimilarity(a: List<Double>, b: List<Double>): Double? {
    return 0.0;
}
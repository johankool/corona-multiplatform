package com.multiplatform.sample.shared.sorting

import com.multiplatform.sample.shared.entity.Row


/**
 * Created by Dima Kovalenko.
 */
class NewCasesComparator : Comparator<Row?> {
    override fun compare(o1: Row?, o2: Row?): Int {
        return when {
            o1 == null || o2 == null -> 0
            else -> o2.newCases?.compareTo(o1.newCases ?: 0) ?: 0
        }
    }
}
package com.consistent

class JenkinsHash(str: String) extends HashFunction{
    def result(): Long = {
        var hash = str.toList.foldLeft(0) ((x,hash) => {
    		val result1 = hash + x
    		val result2 = result1 << 10
    		val result3 = result2 ^ (result2 >> 6)
    		result3
        })
        hash += (hash << 3)
        hash ^= (hash >> 11)
        hash += (hash << 15)
        hash
    }
}
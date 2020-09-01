package com.postoffice.kotlin

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter object's length(cm): ")
    var length = scanner.nextFloat()
    print("Please enter object's width(cm): ")
    var width = scanner.nextFloat()
    print("Please enter object's height(cm): ")
    var hight = scanner.nextInt()

    if( Box3().validate(length, width, hight) == true){
        println("Box3")
    }else if(Box5().validate(length, width, hight) == true){
        println("Box5")
    }
}

open class Boxset (var length:Float, var width:Float, var hight:Int){
    open fun validate( length:Float, width:Float, hight:Int): Boolean {
        var box = false
        if(length < this.length && width < this.width && hight < this.hight){
            box = true
        }
        return box
    }
}

class Box3() : Boxset(2.3f, 14f, 13) {
}

class Box5() : Boxset(39.5f, 27.5f, 23) {
}

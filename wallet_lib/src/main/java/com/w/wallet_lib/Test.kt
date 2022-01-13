package com.w.wallet_lib

import android.util.Log
import walletapi.Walletapi

class Test {
    fun goTest(){
        val mnem = Walletapi.newMnemonicString(0,128)
        Log.v("xx",mnem)
    }
}
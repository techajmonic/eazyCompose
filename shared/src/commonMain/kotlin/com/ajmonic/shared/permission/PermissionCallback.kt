package com.ajmonic.shared.permission

fun interface PermissionCallback {

    fun onResult(

        results: List<PermissionResult>

    )

}
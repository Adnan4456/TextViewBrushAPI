package com.example.customtext

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush

class CustomBrush(val shaderBrush: ShaderBrush): ShaderBrush() {
    override fun createShader(size: Size): Shader {
//        TODO("Not yet implemented")
        return shaderBrush.createShader(size/ 3f)
    }
}
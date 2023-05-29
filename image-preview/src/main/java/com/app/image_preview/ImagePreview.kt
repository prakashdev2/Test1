package com.app.image_preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TestImagePreview(
    image : Int,
    size : Dp

) {

    Image(
        painter = painterResource(id = image),
        contentDescription = null,
        modifier = Modifier.size(size)
    )

}
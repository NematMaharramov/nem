package com.nem.filmmakinesi

import android.content.Context
import com.lagradost.cloudstream3.plugins.*

@CloudstreamPlugin
class FilmMakinesiPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(FilmMakinesi())
    }
}

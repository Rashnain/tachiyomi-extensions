package eu.kanade.tachiyomi.extension.en.manhwafull

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.network.GET
import okhttp3.CacheControl
import okhttp3.Request

class Manhwafull : Madara("Manhwafull", "https://manhwafull.com", "en") {

    override val useLoadMoreSearch = false

    override fun popularMangaNextPageSelector(): String? = "a.nextpostslink"

    override fun popularMangaRequest(page: Int): Request {
        return GET(
            "$baseUrl/manga-mwf/page/$page/?m_orderby=views",
            formHeaders,
            CacheControl.FORCE_NETWORK,
        )
    }
    override fun latestUpdatesRequest(page: Int): Request {
        return GET(
            "$baseUrl/manga-mwf/page/$page/?m_orderby=latest",
            formHeaders,
            CacheControl.FORCE_NETWORK,
        )
    }
}

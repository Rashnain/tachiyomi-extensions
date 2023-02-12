package eu.kanade.tachiyomi.extension.vi.lkdtt

import eu.kanade.tachiyomi.multisrc.mymangacms.MyMangaCMS
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone

class LKDTT : MyMangaCMS("LKDTT", "https://lkdttzz.com", "vi") {
    override val dateFormatter = SimpleDateFormat("dd/MM/yy", Locale.US).apply {
        timeZone = TimeZone.getTimeZone(super.timeZone)
    }

    override fun dateUpdatedParser(date: String): Long =
        runCatching { super.dateUpdatedParser(date.split(" - ")[1]) }.getOrNull() ?: 0L

    override fun getGenreList() = listOf(
        Genre("Học đường", 1),
        Genre("Hài hước", 2),
        Genre("Cổ Đại", 3),
        Genre("Hiện đại", 4),
        Genre("Kinh dị", 5),
        Genre("Tổng tài", 6),
        Genre("Xuyên không", 7),
        Genre("Manhua", 8),
        Genre("Manhwa", 9),
        Genre("Mystery", 10),
        Genre("One shot", 11),
        Genre("Smut", 12),
        Genre("Webtoon", 13),
        Genre("Yaoi", 14),
        Genre("Yuri", 15),
        Genre("Trinh Thám", 16),
        Genre("Tình Cảm", 17),
        Genre("Drama", 18),
        Genre("Comedy", 19),
        Genre("Fantasy", 20),
        Genre("Novel", 21),
        Genre("Action", 22),
        Genre("Manga", 23),
        Genre("Đam Mỹ", 24),
        Genre("Trọng Sinh", 25),
        Genre("Ngôn Tình", 26),
        Genre("Phiêu Lưu", 27),
        Genre("Boy Love", 28),
        Genre("giới giải trí", 29),
        Genre("đô thị", 30),
        Genre("Romance", 31),
        Genre("Đô Thị", 32),
        Genre("Shoujo", 33),
        Genre("Historical", 34),
        Genre("Slice of life", 35),
        Genre("Mature", 36),
        Genre("GL", 37),
        Genre("Adult", 38),
        Genre("Huyền huyễn", 39),
        Genre("Baby", 40),
        Genre("Tragedy", 41),
        Genre("Truyện Màu", 42),
        Genre("School Life", 43),
        Genre("Josei", 44),
        Genre("Oneshot", 45),
        Genre("Gender Bender", 46),
        Genre("Nữ cường", 47),
        Genre("Harem", 48),
        Genre("Reverse Harem", 49),
        Genre("Isekai", 50),
        Genre("Adventure", 51),
        Genre("Chuyển Sinh", 52),
        Genre("Đại Nữ Chủ", 53),
        Genre("Shounen", 54),
        Genre("Sports", 55),
        Genre("Sủng Ngọt", 56),
        Genre("Truyện 18+", 57),
        Genre("Trung Cổ", 58),
        Genre("Ma Thuật", 59),
        Genre("Webtoons", 60),
        Genre("Xuyên", 61),
        Genre("Ngôn", 62),
        Genre("Tiểu Bạch Thỏ", 63),
        Genre("Sủng", 65),
        Genre("Trùng Sinh", 66),
        Genre("Ma Cà Rồng", 67),
        Genre("Tái Sinh", 68),
        Genre("Quân Nhân", 69),
        Genre("Showbiz", 70),
        Genre("Comic", 71),
        Genre("Phép Thuật", 72),
        Genre("Psychological", 73),
        Genre("Supernatural", 74),
        Genre("Lãng Mạn", 75),
        Genre("Gender", 76),
        Genre("Bender", 77),
        Genre("Vườn Trường", 78),
        Genre("Magic", 79),
        Genre("Nhân Thú", 80),
        Genre("Soft Yaoi", 81),
        Genre("Hôn Nhân Hợp Đồng", 82),
        Genre("Cưới Trước Yêu Sau", 83),
        Genre("Bi Kịch", 84),
        Genre("Horror", 85),
        Genre("Reincarnation", 86),
        Genre("Hồi Sinh", 87),
        Genre("Hoàng Gia", 88),
        Genre("Giả Tưởng", 89),
        Genre("Xuyên Sách", 90),
        Genre("Hài", 91),
        Genre("Ngọt", 92),
        Genre("Nam Cường", 93),
        Genre("Chủ Nam", 94),
        Genre("Minh Tinh", 95),
        Genre("Cổ Trang", 96),
        Genre("Xuyên Game", 97),
        Genre("Villainess", 98),
        Genre("Cung Đấu", 99),
        Genre("Hành Động", 100),
        Genre("Truyện Tranh", 101),
        Genre("Adaptation", 102),
        Genre("Magi", 103),
        Genre("Âu Cổ", 104),
    )
}

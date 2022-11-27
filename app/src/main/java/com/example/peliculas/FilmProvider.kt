package com.example.peliculas

class FilmProvider {
    companion object{
        val filmList = listOf<Film>(
            Film(
                film = "Rocky I",
              director = "John G. Avildsen",
              year = 1976,
              photo = "https://es.web.img3.acsta.net/pictures/14/05/12/10/11/064918.jpg"
            ),

            Film(
                film = "Rocky II",
                director = "John G. Avildsen",
                year = 1979,
                photo = "https://m.media-amazon.com/images/I/5190Z57CJPL._SY445_.jpg"
            ),

            Film(
                film = "Rocky III",
                director = "John G. Avildsen",
                year = 1982,
                photo = "https://m.media-amazon.com/images/I/81oAim6NLcL._SL1500_.jpg"
            ),

            Film(
                film = "Rocky IV",
                director = "John G. Avildsen",
                year = 1985,
                photo = "https://static.wikia.nocookie.net/cine/images/a/a5/Rocky4.jpg/revision/latest?cb=20121022224612"
            ),

            Film(
                film = "Rocky V",
                director = "John G. Avildsen",
                year = 1990,
                photo = "https://m.media-amazon.com/images/I/51VnC-VLEVL.jpg"
            )
        )
    }

}
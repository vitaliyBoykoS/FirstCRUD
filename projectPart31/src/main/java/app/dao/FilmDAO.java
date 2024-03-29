package app.dao;

import app.model.Film;

//Відповідає за доступдо даних(Data Access Object)

import java.util.List;

public interface FilmDAO {
    List<Film> allFilms(int page);
    void add(Film film);
    void delete(Film film);
    void edit (Film film);
    Film getById(int id);

    int filmsCount();

    boolean checkTitle(String title);

}

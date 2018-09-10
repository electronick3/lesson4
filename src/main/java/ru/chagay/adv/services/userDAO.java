package ru.chagay.adv.services;

/*
        - добавление объявления;
        - удаление объявления;
        - получения объявления по id;
        - обновление атрибутов объявления;
        - получение всех объявлений;
        - получение всех объявлений из данной категории;
        - получение компании, которой принадлежит данное объявление;
        - получение компании по id;
        - получение всех категорий.
*/

import ru.chagay.adv.models.Category;
import ru.chagay.adv.models.Company;
import ru.chagay.adv.models.Advertisement;
import java.util.List;

public interface userDAO {
    // - добавление объявления;
    void addAdv(Advertisement adv);

    // - удаление объявления;
    void deleteAdv(Advertisement adv);

    // - получения объявления по id;
    Advertisement findAdvById(Long id_adv);

    // - обновление атрибутов объявления;
    void updateAdv(Advertisement adv);

    // - получение всех объявлений;
    List<Advertisement> findAllAdv();

    // - получение всех объявлений из данной категории;
    List<Advertisement> findAllAdvCategory(Category category) ;

    // - получение компании, которой принадлежит данное объявление;
    Company findCompanyByAdv(Advertisement adv);

    // - получение компании по id;
    Company findCompanyById(Long id_company);

    // - получение всех категорий.
    List<Category> findAllCategory();
}
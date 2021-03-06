package ru.chagay.adv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chagay.adv.models.Advertisement;
import ru.chagay.adv.models.Category;
import ru.chagay.adv.models.Company;
import ru.chagay.adv.repository.AdvertisementRepository;
import ru.chagay.adv.repository.CategoryRepository;
import ru.chagay.adv.repository.CompanyRepository;

import java.util.List;

@Service
public class userDAOImpl implements userDAO {

    @Autowired
    private AdvertisementRepository advRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private CompanyRepository companyRepo;

    // - добавление объявления;
    @Transactional
    public void addAdv(Advertisement adv) {
        advRepo.save(adv);
    }

    // - обновление атрибутов объявления;
    @Transactional
    public void updateAdv(Advertisement adv) {
        advRepo.save(adv);
    }

    // - удаление объявления;
    @Transactional
    public void deleteAdv(Advertisement adv) {
        advRepo.delete(adv);
    }

    // - получения объявления по id;
    @Transactional(readOnly=true)
    public Advertisement findAdvById(Long id_adv) {
        return advRepo.getOne(id_adv);
    }

    // - получение всех объявлений;
    @Transactional(readOnly=true)
    public List<Advertisement> findAllAdv() {
        return advRepo.findAll();
    }

    // - получение всех объявлений из данной категории;
    @Transactional(readOnly=true)
    public List<Advertisement> findAllAdvCategory(Category category) {
        return category.getAds();
    }

    // - получение всех категорий.
    @Transactional(readOnly=true)
    public List<Category> findAllCategory() {
        return categoryRepo.findAll();
    }

    // - получение компании, которой принадлежит данное объявление;
    @Transactional
    public Company findCompanyByAdv(Advertisement adv) {
        return companyRepo.getOne(adv.getId());
    }

    // - получение компании по id;
    @Transactional
    public Company findCompanyById(Long id_company) {
        return companyRepo.getOne(id_company);
    }
}
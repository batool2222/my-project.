package com.batool.shblak.library_magement_system_app.patron;


import java.util.List;

public interface PatronServiceInterface {

    Patron add(Patron patron);

    Patron findById(Long id);

    List<Patron> findAll();

    void deleteById(Long id);

    Patron updateById(Long id, Patron updatedPatron);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bombhel.oracle.libraryWebApp.facade;

import com.bombhel.oracle.libraryWebApp.Librarian;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL6420
 */
@Stateless
public class LibrarianFacade extends AbstractFacade<Librarian> {

    @PersistenceContext(unitName = "libraryWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibrarianFacade() {
        super(Librarian.class);
    }
    
}

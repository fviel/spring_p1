/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernando.spring1.repositories;

import com.fernando.spring1.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Fernando
 */
public interface AuthorRepository  extends CrudRepository<Author, Long>{   
}

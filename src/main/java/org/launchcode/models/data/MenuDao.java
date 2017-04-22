package org.launchcode.models.data;

import org.launchcode.models.*;
import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.awt.*;


/**
 * Created by SUK SAPKOTA on 4/14/2017.
 */
@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu,Integer> {
}
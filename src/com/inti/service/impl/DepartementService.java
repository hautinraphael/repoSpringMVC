package com.inti.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inti.entities.Departement;
import com.inti.service.interfaces.IDepartementService;

@Service
@Transactional
public class DepartementService extends ManagerService<Departement> implements IDepartementService {

}

package com.codegym.service.impl.province;

import com.codegym.model.Province;
import com.codegym.service.IGeneralService;
import org.springframework.data.domain.Page;

public interface IProvinceService extends IGeneralService<Province> {
    Iterable<Province> findAll();
}

package com.subway.service.equipments;

import com.subway.dao.equipments.EquipmentsRepository;
import com.subway.dao.equipments.VEqRepository;
import com.subway.domain.equipments.Equipments;
import com.subway.domain.equipments.Vequipments;
import com.subway.service.app.BaseService;
import com.subway.utils.SessionUtil;
import com.subway.utils.dataAuth.DataSeparatable;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangbin on 2016/5/4.
 * 设备查询类
 */
@Service
public class EquipmentSearchService extends BaseService implements SortedSearchable, DataSeparatable {
    @Autowired
    EquipmentsRepository equipmentsRepository;


    /**
     * @return 添加过滤条件
     */
    public String addConditionToService() {

        return "";
    }


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @param pageable
     * @return
     */
    public Page<Equipments> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
        String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
        return equipmentsRepository.findByLocationStartingWithAndEquipmentsClassification_DescriptionContainingAndDescriptionContainingAndLocations_DescriptionContaining(array[0], array[1], array[2], array[3], pageable);
    }


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @return
     */
    public List<Equipments> findByConditions(String searchPhrase, int paramsSize) {
        String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
        return equipmentsRepository.findByLocationStartingWithAndEquipmentsClassification_DescriptionContainingAndDescriptionContainingAndLocations_DescriptionContaining(array[0], array[1], array[2], array[3]);
    }


}

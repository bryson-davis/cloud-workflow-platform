package org.sysu.bpmmanagementservice.dao;

import org.sysu.bpmmanagementservice.entity.RenPositionEntity;

import java.util.List;

public interface RenPositionEntityDao {
    RenPositionEntity saveOrUpdate(RenPositionEntity renPositionEntity);

    RenPositionEntity deleteByName(String name);

    List<RenPositionEntity> findAll();
}
package com.springweb.Dao;

import com.springweb.Entity.Assets;

import java.util.Collection;

public interface AssetDao {

    Collection<Assets> getAllAssets();


    Assets getAssetById(int id);

    void removeAssetById(int id);

    //updates asset object
    void updateAsset(Assets asset);

    void addAssetToDb(Assets asset);
}

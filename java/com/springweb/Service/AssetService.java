package com.springweb.Service;

import com.springweb.Dao.fakeDataAccessService;
import com.springweb.Entity.Assets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AssetService {
    @Autowired
    private fakeDataAccessService fakeDataAccessService;

    public Collection<Assets> getAllAssets(){
        return fakeDataAccessService.getAllAssets();
    }

    public Assets getAssetById(int id){
        return this.fakeDataAccessService.getAssetById(id);
    }

    public void removeAssetById(int id) {
        fakeDataAccessService.removeAssetById(id);
    }

    public void updateAsset(Assets asset) {
        fakeDataAccessService.updateAsset(asset);
    }

    public void addAsset(Assets asset) {
    fakeDataAccessService.addAssetToDb(asset);
    }
}

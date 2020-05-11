package com.springweb.Dao;

import com.springweb.Entity.Assets;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;

import java.util.*;

@Repository
public
class fakeDataAccessService implements AssetDao {

    private static Map<Integer, Assets> assets;

    static{
        assets=new HashMap<Integer, Assets>(){
            {
                put(1,new Assets(1, UUID.randomUUID(),
                        "Good",
                        true,
                        false,
                        "@umuzi.org",
                        "Web-dev",
                        "Sansui",
                        "Electronic","3003"));

                put(2,new Assets(2, UUID.randomUUID(),
                        "broken",
                        false,
                        false,
                        "@umuzi.org",
                        "@umuzi.org",
                        "Alien-ware",
                        "Electronic",
                        "2020"));

                put(3,new Assets(3, UUID.randomUUID(),
                        "Broken",false,
                        false,"@umuzi.org",
                        "Web-dev",
                        "Samsung",
                        "Electronic",
                        "2019"));
                put(4,new Assets(4, UUID.randomUUID(),
                        "@repairs",
                        false,
                        false,
                        "",
                        "Web-dev",
                        "SAMA",
                        "Electronic",
                        "2000"));

                put(5,new Assets(5, UUID.randomUUID(),
                        "Bad-repairs needed",
                        false,
                        true,
                        "postgres.maponya@umuzi.org",
                        "Web-dev(Java)",
                        "Dell",
                        "Electronic",
                        "1800"));
            }
        };
    }
    public Collection<Assets> getAllAssets(){
        return this.assets.values();
    }

    //    get object by value
    public Assets getAssetById(int id){
        return this.assets.get(id);
    }

    //  removes object's values or entities.
    public void removeAssetById(int id) {
        this.assets.remove(id);
    }

    //updates asset object
    public void updateAsset(Assets asset){
//      created an object for
        Assets as=this.assets.get(asset.getId());
        as.setId(asset.getId());
        as.setSerialNo(asset.getSerialNo());
        as.setCondition(asset.getCondition());
        as.setAvailable(asset.isAvailable());
        as.setAssigned(asset.isAssigned());
        as.setAssignedTo(asset.getAssignedTo());
        as.setDepartment(asset.getDepartment());
        as.setManufacturer(asset.getManufacturer());
        as.setCategory(asset.getCategory());
        as.setModel(asset.getModel());
        this.assets.put(asset.getId(),asset);
    }

    public void addAssetToDb(Assets asset) {
        this.assets.put(asset.getId(),asset);
    }
}

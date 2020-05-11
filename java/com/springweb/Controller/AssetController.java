package com.springweb.Controller;

import com.springweb.Entity.Assets;
import com.springweb.Service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @RequestMapping(value="/all",method = RequestMethod.GET )
    public Collection<Assets> getAllStudents(){
        return assetService.getAllAssets();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Assets getAssetById(@PathVariable("id") int id){
        return assetService.getAssetById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
       assetService.removeAssetById(id);
    }

    @RequestMapping(value ="/alter/{id}",method = RequestMethod.PUT)
    public void updateAsset(@RequestBody @PathVariable("id") Assets asset){
       assetService.updateAsset(asset);
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addAsset(@RequestBody Assets asset){
        assetService.addAsset(asset);
    }
}

package com.testRestApi.Restdemo.service;

import com.testRestApi.Restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService
{
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(int cloudVendorId);
    public CloudVendor getCloudVendor(int cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();


}

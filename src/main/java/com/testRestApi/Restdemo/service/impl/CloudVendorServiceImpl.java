package com.testRestApi.Restdemo.service.impl;

import com.testRestApi.Restdemo.model.CloudVendor;
import com.testRestApi.Restdemo.repository.CloudVendorRepository;
import com.testRestApi.Restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService
{


    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "Updated successfully";
    }

    @Override
    public String deleteCloudVendor(int cloudVendorId)
    {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendor(int cloudVendorId) {

        return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendor()
    {

        return cloudVendorRepository.findAll();

    }
}

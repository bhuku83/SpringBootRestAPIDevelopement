package com.testRestApi.Restdemo.repository;

import com.testRestApi.Restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor, Integer> {

}

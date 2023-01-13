package com.grpc.ex.controller;

import com.grpc.ex.IDGeneratorRequest;
import com.grpc.ex.IdGeneratorServiceGrpc;
import com.grpc.ex.service.IdGeneratorServiceClient;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestResource {


  @Autowired
  private IdGeneratorServiceClient idGeneratorServiceClient;

  @GetMapping
  public String getId() {
    return idGeneratorServiceClient.getId();
  }
}

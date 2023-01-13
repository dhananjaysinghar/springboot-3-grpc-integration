package com.grpc.ex.service;

import com.grpc.ex.IDGeneratorRequest;
import com.grpc.ex.IdGeneratorServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class IdGeneratorServiceClient {

    @GrpcClient("grpc-client-service")
    private IdGeneratorServiceGrpc.IdGeneratorServiceBlockingStub serviceBlockingClient;

    public String getId() {
        return serviceBlockingClient.generate(IDGeneratorRequest.newBuilder().setMessage("id").build()).getMessage();
    }
}

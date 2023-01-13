package com.grpc.ex.service;

import com.grpc.ex.IDGeneratorRequest;
import com.grpc.ex.IDGeneratorResponse;
import com.grpc.ex.IdGeneratorServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;


@Slf4j
@GrpcService
public class IdGeneratorService extends IdGeneratorServiceGrpc.IdGeneratorServiceImplBase {

    @Override
    public void generate(IDGeneratorRequest request, StreamObserver<IDGeneratorResponse> responseObserver) {
        log.info("Received request to generate booking id.");
        IDGeneratorResponse response = IDGeneratorResponse.newBuilder().setMessage(UUID.randomUUID().toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

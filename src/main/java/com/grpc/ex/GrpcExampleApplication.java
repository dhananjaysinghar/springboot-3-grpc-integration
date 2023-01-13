package com.grpc.ex;

import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientHealthAutoConfiguration;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientMetricAutoConfiguration;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientSecurityAutoConfiguration;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientTraceAutoConfiguration;
import net.devh.boot.grpc.client.autoconfigure.GrpcDiscoveryClientAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration({
		net.devh.boot.grpc.common.autoconfigure.GrpcCommonCodecAutoConfiguration.class,
		net.devh.boot.grpc.common.autoconfigure.GrpcCommonTraceAutoConfiguration.class,

		net.devh.boot.grpc.server.autoconfigure.GrpcAdviceAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcHealthServiceAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcMetadataConsulConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcMetadataEurekaConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcMetadataNacosConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcMetadataZookeeperConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcReflectionServiceAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcServerAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcServerFactoryAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcServerMetricAutoConfiguration.class,
//		net.devh.boot.grpc.server.autoconfigure.GrpcServerSecurityAutoConfiguration.class,
		net.devh.boot.grpc.server.autoconfigure.GrpcServerTraceAutoConfiguration.class,
		net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration.class,
		net.devh.boot.grpc.client.autoconfigure.GrpcClientHealthAutoConfiguration.class,
		net.devh.boot.grpc.client.autoconfigure.GrpcClientMetricAutoConfiguration.class,
//		net.devh.boot.grpc.client.autoconfigure.GrpcClientSecurityAutoConfiguration.class,
		net.devh.boot.grpc.client.autoconfigure.GrpcClientTraceAutoConfiguration.class,
		net.devh.boot.grpc.client.autoconfigure.GrpcDiscoveryClientAutoConfiguration.class
})
@SpringBootApplication
public class GrpcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcExampleApplication.class, args);
	}

}

package br.com.poc.grpc.controller;

import br.com.poc.grpc.domain.User;
import br.com.poc.grpc.repository.UserRepository;
import br.com.poc.grpc.v1.user.EmptyReq;
import br.com.poc.grpc.v1.user.UserListResponse;
import br.com.poc.grpc.v1.user.UserRequest;
import br.com.poc.grpc.v1.user.UserResponse;
import br.com.poc.grpc.v1.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class UserController extends UserServiceGrpc.UserServiceImplBase {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public void createUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {

        User user = new User(request.getName(), request.getEmail(), request.getAge());
        User userSave = repository.save(user);

        UserResponse response = UserResponse.newBuilder()
                .setId(userSave.getId())
                .setName(userSave.getName())
                .setEmail(userSave.getEmail())
                .setAge(userSave.getAge())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUser(EmptyReq request, StreamObserver<UserListResponse> responseObserver) {

        List<User> userList = repository.findAll();

        List<UserResponse> collect = userList.stream().map(user -> UserResponse.newBuilder()
                .setId(user.getId())
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setAge(user.getAge())
                .build()).toList();

        UserListResponse response = UserListResponse.newBuilder().addAllUsers(collect).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUserStream(EmptyReq request, StreamObserver<UserResponse> responseObserver) {
        repository.findAll().forEach(user -> {
            UserResponse response = UserResponse.newBuilder()
                    .setId(user.getId())
                    .setName(user.getName())
                    .setEmail(user.getEmail())
                    .setAge(user.getAge())
                    .build();
            responseObserver.onNext(response);
        });
        responseObserver.onCompleted();

    }
}

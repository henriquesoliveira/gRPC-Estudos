// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

package br.com.poc.grpc.v1.user;

public interface UserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.poc.grpc.v1.user.UserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string email = 2;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();
}
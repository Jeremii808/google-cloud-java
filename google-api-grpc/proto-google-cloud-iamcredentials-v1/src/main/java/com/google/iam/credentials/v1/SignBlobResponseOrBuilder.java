// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

public interface SignBlobResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.SignBlobResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * The ID of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1;</code>
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * The signed blob.
   * </pre>
   *
   * <code>bytes signed_blob = 4;</code>
   */
  com.google.protobuf.ByteString getSignedBlob();
}

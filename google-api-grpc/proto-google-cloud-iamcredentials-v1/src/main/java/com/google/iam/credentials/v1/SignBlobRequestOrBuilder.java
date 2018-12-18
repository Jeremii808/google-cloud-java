// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

public interface SignBlobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.SignBlobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  java.util.List<java.lang.String> getDelegatesList();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  int getDelegatesCount();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  java.lang.String getDelegates(int index);
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`
   * </pre>
   *
   * <code>repeated string delegates = 3;</code>
   */
  com.google.protobuf.ByteString getDelegatesBytes(int index);

  /**
   *
   *
   * <pre>
   * The bytes to sign.
   * </pre>
   *
   * <code>bytes payload = 5;</code>
   */
  com.google.protobuf.ByteString getPayload();
}

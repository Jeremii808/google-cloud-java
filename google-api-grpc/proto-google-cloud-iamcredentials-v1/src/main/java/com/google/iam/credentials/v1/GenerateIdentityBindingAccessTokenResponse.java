// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/credentials/v1/common.proto

package com.google.iam.credentials.v1;

/** Protobuf type {@code google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse} */
public final class GenerateIdentityBindingAccessTokenResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
    GenerateIdentityBindingAccessTokenResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateIdentityBindingAccessTokenResponse.newBuilder() to construct.
  private GenerateIdentityBindingAccessTokenResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateIdentityBindingAccessTokenResponse() {
    accessToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GenerateIdentityBindingAccessTokenResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              accessToken_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (expireTime_ != null) {
                subBuilder = expireTime_.toBuilder();
              }
              expireTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(expireTime_);
                expireTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.credentials.v1.IAMCredentialsCommonProto
        .internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.credentials.v1.IAMCredentialsCommonProto
        .internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse.class,
            com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse.Builder.class);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object accessToken_;
  /**
   *
   *
   * <pre>
   * The OAuth 2.0 access token.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The OAuth 2.0 access token.
   * </pre>
   *
   * <code>string access_token = 1;</code>
   */
  public com.google.protobuf.ByteString getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   *
   *
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   *
   *
   * <pre>
   * Token expiration time.
   * The expiration time is always set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (expireTime_ != null) {
      output.writeMessage(2, getExpireTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpireTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)) {
      return super.equals(obj);
    }
    com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse other =
        (com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse) obj;

    boolean result = true;
    result = result && getAccessToken().equals(other.getAccessToken());
    result = result && (hasExpireTime() == other.hasExpireTime());
    if (hasExpireTime()) {
      result = result && getExpireTime().equals(other.getExpireTime());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
      com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto
          .internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto
          .internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse.class,
              com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      accessToken_ = "";

      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.credentials.v1.IAMCredentialsCommonProto
          .internal_static_google_iam_credentials_v1_GenerateIdentityBindingAccessTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
        getDefaultInstanceForType() {
      return com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse build() {
      com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse buildPartial() {
      com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse result =
          new com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse(this);
      result.accessToken_ = accessToken_;
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse) {
        return mergeFrom(
            (com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse other) {
      if (other
          == com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
              .getDefaultInstance()) return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     *
     *
     * <pre>
     * The OAuth 2.0 access token.
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth 2.0 access token.
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public com.google.protobuf.ByteString getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth 2.0 access token.
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder setAccessToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth 2.0 access token.
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder clearAccessToken() {

      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth 2.0 access token.
     * </pre>
     *
     * <code>string access_token = 1;</code>
     */
    public Builder setAccessTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      accessToken_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        expireTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
              com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {

      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Token expiration time.
     * The expiration time is always set.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(), getParentForChildren(), isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse)
  private static final com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse();
  }

  public static com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateIdentityBindingAccessTokenResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<GenerateIdentityBindingAccessTokenResponse>() {
            @java.lang.Override
            public GenerateIdentityBindingAccessTokenResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new GenerateIdentityBindingAccessTokenResponse(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<GenerateIdentityBindingAccessTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateIdentityBindingAccessTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.credentials.v1.GenerateIdentityBindingAccessTokenResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
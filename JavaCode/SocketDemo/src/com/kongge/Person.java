// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.kongge;

public final class Person {
  private Person() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PBUserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.kongge.PBUser)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string userId = 1;</code>
     */
    boolean hasUserId();
    /**
     * <code>required string userId = 1;</code>
     */
    java.lang.String getUserId();
    /**
     * <code>required string userId = 1;</code>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();

    /**
     * <code>optional string nick = 2;</code>
     */
    boolean hasNick();
    /**
     * <code>optional string nick = 2;</code>
     */
    java.lang.String getNick();
    /**
     * <code>optional string nick = 2;</code>
     */
    com.google.protobuf.ByteString
        getNickBytes();

    /**
     * <code>optional string avatar = 3;</code>
     */
    boolean hasAvatar();
    /**
     * <code>optional string avatar = 3;</code>
     */
    java.lang.String getAvatar();
    /**
     * <code>optional string avatar = 3;</code>
     */
    com.google.protobuf.ByteString
        getAvatarBytes();
  }
  /**
   * Protobuf type {@code com.kongge.PBUser}
   */
  public static final class PBUser extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.kongge.PBUser)
      PBUserOrBuilder {
    // Use PBUser.newBuilder() to construct.
    private PBUser(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PBUser(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PBUser defaultInstance;
    public static PBUser getDefaultInstance() {
      return defaultInstance;
    }

    public PBUser getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PBUser(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              userId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              nick_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              avatar_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kongge.Person.internal_static_com_kongge_PBUser_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kongge.Person.internal_static_com_kongge_PBUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kongge.Person.PBUser.class, com.kongge.Person.PBUser.Builder.class);
    }

    public static com.google.protobuf.Parser<PBUser> PARSER =
        new com.google.protobuf.AbstractParser<PBUser>() {
      public PBUser parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PBUser(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PBUser> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int USERID_FIELD_NUMBER = 1;
    private java.lang.Object userId_;
    /**
     * <code>required string userId = 1;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string userId = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string userId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NICK_FIELD_NUMBER = 2;
    private java.lang.Object nick_;
    /**
     * <code>optional string nick = 2;</code>
     */
    public boolean hasNick() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public java.lang.String getNick() {
      java.lang.Object ref = nick_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nick_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNickBytes() {
      java.lang.Object ref = nick_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nick_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AVATAR_FIELD_NUMBER = 3;
    private java.lang.Object avatar_;
    /**
     * <code>optional string avatar = 3;</code>
     */
    public boolean hasAvatar() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string avatar = 3;</code>
     */
    public java.lang.String getAvatar() {
      java.lang.Object ref = avatar_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          avatar_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string avatar = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAvatarBytes() {
      java.lang.Object ref = avatar_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      userId_ = "";
      nick_ = "";
      avatar_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUserId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNickBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getAvatarBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUserIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNickBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getAvatarBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.kongge.Person.PBUser parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kongge.Person.PBUser parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kongge.Person.PBUser parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kongge.Person.PBUser parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kongge.Person.PBUser parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kongge.Person.PBUser parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.kongge.Person.PBUser parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.kongge.Person.PBUser parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.kongge.Person.PBUser parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.kongge.Person.PBUser parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.kongge.Person.PBUser prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.kongge.PBUser}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.kongge.PBUser)
        com.kongge.Person.PBUserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kongge.Person.internal_static_com_kongge_PBUser_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kongge.Person.internal_static_com_kongge_PBUser_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kongge.Person.PBUser.class, com.kongge.Person.PBUser.Builder.class);
      }

      // Construct using com.kongge.Person.PBUser.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        userId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        nick_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        avatar_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kongge.Person.internal_static_com_kongge_PBUser_descriptor;
      }

      public com.kongge.Person.PBUser getDefaultInstanceForType() {
        return com.kongge.Person.PBUser.getDefaultInstance();
      }

      public com.kongge.Person.PBUser build() {
        com.kongge.Person.PBUser result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.kongge.Person.PBUser buildPartial() {
        com.kongge.Person.PBUser result = new com.kongge.Person.PBUser(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nick_ = nick_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.avatar_ = avatar_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.kongge.Person.PBUser) {
          return mergeFrom((com.kongge.Person.PBUser)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kongge.Person.PBUser other) {
        if (other == com.kongge.Person.PBUser.getDefaultInstance()) return this;
        if (other.hasUserId()) {
          bitField0_ |= 0x00000001;
          userId_ = other.userId_;
          onChanged();
        }
        if (other.hasNick()) {
          bitField0_ |= 0x00000002;
          nick_ = other.nick_;
          onChanged();
        }
        if (other.hasAvatar()) {
          bitField0_ |= 0x00000004;
          avatar_ = other.avatar_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUserId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.kongge.Person.PBUser parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.kongge.Person.PBUser) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object userId_ = "";
      /**
       * <code>required string userId = 1;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>required string userId = 1;</code>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nick_ = "";
      /**
       * <code>optional string nick = 2;</code>
       */
      public boolean hasNick() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string nick = 2;</code>
       */
      public java.lang.String getNick() {
        java.lang.Object ref = nick_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nick_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string nick = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNickBytes() {
        java.lang.Object ref = nick_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nick_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string nick = 2;</code>
       */
      public Builder setNick(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        nick_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string nick = 2;</code>
       */
      public Builder clearNick() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nick_ = getDefaultInstance().getNick();
        onChanged();
        return this;
      }
      /**
       * <code>optional string nick = 2;</code>
       */
      public Builder setNickBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        nick_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object avatar_ = "";
      /**
       * <code>optional string avatar = 3;</code>
       */
      public boolean hasAvatar() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string avatar = 3;</code>
       */
      public java.lang.String getAvatar() {
        java.lang.Object ref = avatar_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            avatar_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string avatar = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAvatarBytes() {
        java.lang.Object ref = avatar_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          avatar_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string avatar = 3;</code>
       */
      public Builder setAvatar(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        avatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string avatar = 3;</code>
       */
      public Builder clearAvatar() {
        bitField0_ = (bitField0_ & ~0x00000004);
        avatar_ = getDefaultInstance().getAvatar();
        onChanged();
        return this;
      }
      /**
       * <code>optional string avatar = 3;</code>
       */
      public Builder setAvatarBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        avatar_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.kongge.PBUser)
    }

    static {
      defaultInstance = new PBUser(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.kongge.PBUser)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_kongge_PBUser_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_kongge_PBUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\022\ncom.kongge\"6\n\006PBUser\022\016\n\006" +
      "userId\030\001 \002(\t\022\014\n\004nick\030\002 \001(\t\022\016\n\006avatar\030\003 \001" +
      "(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_kongge_PBUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_kongge_PBUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_kongge_PBUser_descriptor,
        new java.lang.String[] { "UserId", "Nick", "Avatar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 154:1
package com.pw.box.bean.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Group extends Message<Group, Group.Builder> {
  public static final ProtoAdapter<Group> ADAPTER = new ProtoAdapter_Group();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ID = 0;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_DESC = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String desc;

  public Group(Integer id, String name, String desc) {
    this(id, name, desc, ByteString.EMPTY);
  }

  public Group(Integer id, String name, String desc, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.name = name;
    this.desc = desc;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.name = name;
    builder.desc = desc;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Group)) return false;
    Group o = (Group) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(name, o.name)
        && Internal.equals(desc, o.desc);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (desc != null ? desc.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (name != null) builder.append(", name=").append(name);
    if (desc != null) builder.append(", desc=").append(desc);
    return builder.replace(0, 2, "Group{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Group, Builder> {
    public Integer id;

    public String name;

    public String desc;

    public Builder() {
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }

    @Override
    public Group build() {
      return new Group(id, name, desc, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Group extends ProtoAdapter<Group> {
    ProtoAdapter_Group() {
      super(FieldEncoding.LENGTH_DELIMITED, Group.class);
    }

    @Override
    public int encodedSize(Group value) {
      return (value.id != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.id) : 0)
          + (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.name) : 0)
          + (value.desc != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.desc) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Group value) throws IOException {
      if (value.id != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.id);
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.name);
      if (value.desc != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.desc);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Group decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.desc(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public Group redact(Group value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

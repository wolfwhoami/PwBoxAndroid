// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 147:1
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

public final class ItemRes extends Message<ItemRes, ItemRes.Builder> {
  public static final ProtoAdapter<ItemRes> ADAPTER = new ProtoAdapter_ItemRes();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_RETCODE = 0;

  public static final String DEFAULT_DESCRIPTION = "";

  public static final Integer DEFAULT_NEWDATAVER = 0;

  public static final Integer DEFAULT_NEWDATAID = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer retCode;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String description;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer newDataVer;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer newDataId;

  public ItemRes(Integer retCode, String description, Integer newDataVer, Integer newDataId) {
    this(retCode, description, newDataVer, newDataId, ByteString.EMPTY);
  }

  public ItemRes(Integer retCode, String description, Integer newDataVer, Integer newDataId, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.retCode = retCode;
    this.description = description;
    this.newDataVer = newDataVer;
    this.newDataId = newDataId;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.retCode = retCode;
    builder.description = description;
    builder.newDataVer = newDataVer;
    builder.newDataId = newDataId;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ItemRes)) return false;
    ItemRes o = (ItemRes) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(retCode, o.retCode)
        && Internal.equals(description, o.description)
        && Internal.equals(newDataVer, o.newDataVer)
        && Internal.equals(newDataId, o.newDataId);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (retCode != null ? retCode.hashCode() : 0);
      result = result * 37 + (description != null ? description.hashCode() : 0);
      result = result * 37 + (newDataVer != null ? newDataVer.hashCode() : 0);
      result = result * 37 + (newDataId != null ? newDataId.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (retCode != null) builder.append(", retCode=").append(retCode);
    if (description != null) builder.append(", description=").append(description);
    if (newDataVer != null) builder.append(", newDataVer=").append(newDataVer);
    if (newDataId != null) builder.append(", newDataId=").append(newDataId);
    return builder.replace(0, 2, "ItemRes{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ItemRes, Builder> {
    public Integer retCode;

    public String description;

    public Integer newDataVer;

    public Integer newDataId;

    public Builder() {
    }

    public Builder retCode(Integer retCode) {
      this.retCode = retCode;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder newDataVer(Integer newDataVer) {
      this.newDataVer = newDataVer;
      return this;
    }

    public Builder newDataId(Integer newDataId) {
      this.newDataId = newDataId;
      return this;
    }

    @Override
    public ItemRes build() {
      return new ItemRes(retCode, description, newDataVer, newDataId, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ItemRes extends ProtoAdapter<ItemRes> {
    ProtoAdapter_ItemRes() {
      super(FieldEncoding.LENGTH_DELIMITED, ItemRes.class);
    }

    @Override
    public int encodedSize(ItemRes value) {
      return (value.retCode != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.retCode) : 0)
          + (value.description != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.description) : 0)
          + (value.newDataVer != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, value.newDataVer) : 0)
          + (value.newDataId != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, value.newDataId) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, ItemRes value) throws IOException {
      if (value.retCode != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.retCode);
      if (value.description != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.description);
      if (value.newDataVer != null) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.newDataVer);
      if (value.newDataId != null) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.newDataId);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public ItemRes decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.retCode(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.description(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.newDataVer(ProtoAdapter.INT32.decode(reader)); break;
          case 4: builder.newDataId(ProtoAdapter.INT32.decode(reader)); break;
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
    public ItemRes redact(ItemRes value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

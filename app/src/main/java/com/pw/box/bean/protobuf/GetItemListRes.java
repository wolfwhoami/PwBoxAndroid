// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 134:1
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
import java.util.List;
import okio.ByteString;

public final class GetItemListRes extends Message<GetItemListRes, GetItemListRes.Builder> {
  public static final ProtoAdapter<GetItemListRes> ADAPTER = new ProtoAdapter_GetItemListRes();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_RETCODE = 0;

  public static final String DEFAULT_ERRORMESSAGE = "";

  public static final String DEFAULT_DESCRIPTION = "";

  public static final Integer DEFAULT_V = 0;

  public static final Integer DEFAULT_TOTAL = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer retCode;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String errorMessage;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String description;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer v;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer total;

  @WireField(
      tag = 6,
      adapter = "com.pw.box.bean.protobuf.ItemOfServer#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<ItemOfServer> items;

  public GetItemListRes(Integer retCode, String errorMessage, String description, Integer v, Integer total, List<ItemOfServer> items) {
    this(retCode, errorMessage, description, v, total, items, ByteString.EMPTY);
  }

  public GetItemListRes(Integer retCode, String errorMessage, String description, Integer v, Integer total, List<ItemOfServer> items, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.retCode = retCode;
    this.errorMessage = errorMessage;
    this.description = description;
    this.v = v;
    this.total = total;
    this.items = Internal.immutableCopyOf("items", items);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.retCode = retCode;
    builder.errorMessage = errorMessage;
    builder.description = description;
    builder.v = v;
    builder.total = total;
    builder.items = Internal.copyOf("items", items);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GetItemListRes)) return false;
    GetItemListRes o = (GetItemListRes) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(retCode, o.retCode)
        && Internal.equals(errorMessage, o.errorMessage)
        && Internal.equals(description, o.description)
        && Internal.equals(v, o.v)
        && Internal.equals(total, o.total)
        && items.equals(o.items);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (retCode != null ? retCode.hashCode() : 0);
      result = result * 37 + (errorMessage != null ? errorMessage.hashCode() : 0);
      result = result * 37 + (description != null ? description.hashCode() : 0);
      result = result * 37 + (v != null ? v.hashCode() : 0);
      result = result * 37 + (total != null ? total.hashCode() : 0);
      result = result * 37 + items.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (retCode != null) builder.append(", retCode=").append(retCode);
    if (errorMessage != null) builder.append(", errorMessage=").append(errorMessage);
    if (description != null) builder.append(", description=").append(description);
    if (v != null) builder.append(", v=").append(v);
    if (total != null) builder.append(", total=").append(total);
    if (!items.isEmpty()) builder.append(", items=").append(items);
    return builder.replace(0, 2, "GetItemListRes{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GetItemListRes, Builder> {
    public Integer retCode;

    public String errorMessage;

    public String description;

    public Integer v;

    public Integer total;

    public List<ItemOfServer> items;

    public Builder() {
      items = Internal.newMutableList();
    }

    public Builder retCode(Integer retCode) {
      this.retCode = retCode;
      return this;
    }

    public Builder errorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder v(Integer v) {
      this.v = v;
      return this;
    }

    public Builder total(Integer total) {
      this.total = total;
      return this;
    }

    public Builder items(List<ItemOfServer> items) {
      Internal.checkElementsNotNull(items);
      this.items = items;
      return this;
    }

    @Override
    public GetItemListRes build() {
      return new GetItemListRes(retCode, errorMessage, description, v, total, items, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GetItemListRes extends ProtoAdapter<GetItemListRes> {
    ProtoAdapter_GetItemListRes() {
      super(FieldEncoding.LENGTH_DELIMITED, GetItemListRes.class);
    }

    @Override
    public int encodedSize(GetItemListRes value) {
      return (value.retCode != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.retCode) : 0)
          + (value.errorMessage != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.errorMessage) : 0)
          + (value.description != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.description) : 0)
          + (value.v != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, value.v) : 0)
          + (value.total != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, value.total) : 0)
          + ItemOfServer.ADAPTER.asRepeated().encodedSizeWithTag(6, value.items)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GetItemListRes value) throws IOException {
      if (value.retCode != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.retCode);
      if (value.errorMessage != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.errorMessage);
      if (value.description != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.description);
      if (value.v != null) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.v);
      if (value.total != null) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.total);
      ItemOfServer.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.items);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GetItemListRes decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.retCode(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.errorMessage(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.description(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.v(ProtoAdapter.INT32.decode(reader)); break;
          case 5: builder.total(ProtoAdapter.INT32.decode(reader)); break;
          case 6: builder.items.add(ItemOfServer.ADAPTER.decode(reader)); break;
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
    public GetItemListRes redact(GetItemListRes value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.items, ItemOfServer.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

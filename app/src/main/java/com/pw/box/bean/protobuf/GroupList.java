// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 163:1
package com.pw.box.bean.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * 用于请求分组列表的返回,新增分组
 */
public final class GroupList extends Message<GroupList, GroupList.Builder> {
  public static final ProtoAdapter<GroupList> ADAPTER = new ProtoAdapter_GroupList();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.pw.box.bean.protobuf.Group#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Group> gps;

  public GroupList(List<Group> gps) {
    this(gps, ByteString.EMPTY);
  }

  public GroupList(List<Group> gps, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.gps = Internal.immutableCopyOf("gps", gps);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.gps = Internal.copyOf("gps", gps);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof GroupList)) return false;
    GroupList o = (GroupList) other;
    return unknownFields().equals(o.unknownFields())
        && gps.equals(o.gps);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + gps.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!gps.isEmpty()) builder.append(", gps=").append(gps);
    return builder.replace(0, 2, "GroupList{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<GroupList, Builder> {
    public List<Group> gps;

    public Builder() {
      gps = Internal.newMutableList();
    }

    public Builder gps(List<Group> gps) {
      Internal.checkElementsNotNull(gps);
      this.gps = gps;
      return this;
    }

    @Override
    public GroupList build() {
      return new GroupList(gps, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_GroupList extends ProtoAdapter<GroupList> {
    ProtoAdapter_GroupList() {
      super(FieldEncoding.LENGTH_DELIMITED, GroupList.class);
    }

    @Override
    public int encodedSize(GroupList value) {
      return Group.ADAPTER.asRepeated().encodedSizeWithTag(1, value.gps)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, GroupList value) throws IOException {
      Group.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.gps);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public GroupList decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.gps.add(Group.ADAPTER.decode(reader)); break;
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
    public GroupList redact(GroupList value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.gps, Group.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

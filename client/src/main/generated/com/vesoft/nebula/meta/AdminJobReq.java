/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AdminJobReq implements TBase, java.io.Serializable, Cloneable, Comparable<AdminJobReq> {
  private static final TStruct STRUCT_DESC = new TStruct("AdminJobReq");
  private static final TField OP_FIELD_DESC = new TField("op", TType.I32, (short)1);
  private static final TField CMD_FIELD_DESC = new TField("cmd", TType.I32, (short)2);
  private static final TField PARAS_FIELD_DESC = new TField("paras", TType.LIST, (short)3);

  /**
   * 
   * @see AdminJobOp
   */
  public AdminJobOp op;
  public AdminCmd cmd;
  public List<byte[]> paras;
  public static final int OP = 1;
  public static final int CMD = 2;
  public static final int PARAS = 3;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(OP, new FieldMetaData("op", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(CMD, new FieldMetaData("cmd", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARAS, new FieldMetaData("paras", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AdminJobReq.class, metaDataMap);
  }

  public AdminJobReq() {
  }

  public AdminJobReq(
      AdminJobOp op,
      AdminCmd cmd,
      List<byte[]> paras) {
    this();
    this.op = op;
    this.cmd = cmd;
    this.paras = paras;
  }

  public static class Builder {
    private AdminJobOp op;
    private AdminCmd cmd;
    private List<byte[]> paras;

    public Builder() {
    }

    public Builder setOp(final AdminJobOp op) {
      this.op = op;
      return this;
    }

    public Builder setCmd(final AdminCmd cmd) {
      this.cmd = cmd;
      return this;
    }

    public Builder setParas(final List<byte[]> paras) {
      this.paras = paras;
      return this;
    }

    public AdminJobReq build() {
      AdminJobReq result = new AdminJobReq();
      result.setOp(this.op);
      result.setCmd(this.cmd);
      result.setParas(this.paras);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdminJobReq(AdminJobReq other) {
    if (other.isSetOp()) {
      this.op = TBaseHelper.deepCopy(other.op);
    }
    if (other.isSetCmd()) {
      this.cmd = TBaseHelper.deepCopy(other.cmd);
    }
    if (other.isSetParas()) {
      this.paras = TBaseHelper.deepCopy(other.paras);
    }
  }

  public AdminJobReq deepCopy() {
    return new AdminJobReq(this);
  }

  /**
   * 
   * @see AdminJobOp
   */
  public AdminJobOp getOp() {
    return this.op;
  }

  /**
   * 
   * @see AdminJobOp
   */
  public AdminJobReq setOp(AdminJobOp op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  // Returns true if field op is set (has been assigned a value) and false otherwise
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean __value) {
    if (!__value) {
      this.op = null;
    }
  }

  public AdminCmd getCmd() {
    return this.cmd;
  }

  public AdminJobReq setCmd(AdminCmd cmd) {
    this.cmd = cmd;
    return this;
  }

  public void unsetCmd() {
    this.cmd = null;
  }

  // Returns true if field cmd is set (has been assigned a value) and false otherwise
  public boolean isSetCmd() {
    return this.cmd != null;
  }

  public void setCmdIsSet(boolean __value) {
    if (!__value) {
      this.cmd = null;
    }
  }

  public List<byte[]> getParas() {
    return this.paras;
  }

  public AdminJobReq setParas(List<byte[]> paras) {
    this.paras = paras;
    return this;
  }

  public void unsetParas() {
    this.paras = null;
  }

  // Returns true if field paras is set (has been assigned a value) and false otherwise
  public boolean isSetParas() {
    return this.paras != null;
  }

  public void setParasIsSet(boolean __value) {
    if (!__value) {
      this.paras = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case OP:
      if (__value == null) {
        unsetOp();
      } else {
        setOp((AdminJobOp)__value);
      }
      break;

    case CMD:
      if (__value == null) {
        unsetCmd();
      } else {
        setCmd((AdminCmd)__value);
      }
      break;

    case PARAS:
      if (__value == null) {
        unsetParas();
      } else {
        setParas((List<byte[]>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case OP:
      return getOp();

    case CMD:
      return getCmd();

    case PARAS:
      return getParas();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof AdminJobReq))
      return false;
    AdminJobReq that = (AdminJobReq)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetOp(), that.isSetOp(), this.op, that.op)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCmd(), that.isSetCmd(), this.cmd, that.cmd)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetParas(), that.isSetParas(), this.paras, that.paras)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {op, cmd, paras});
  }

  @Override
  public int compareTo(AdminJobReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(op, other.op);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCmd()).compareTo(other.isSetCmd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(cmd, other.cmd);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParas()).compareTo(other.isSetParas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(paras, other.paras);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case OP:
          if (__field.type == TType.I32) {
            this.op = AdminJobOp.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CMD:
          if (__field.type == TType.I32) {
            this.cmd = AdminCmd.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARAS:
          if (__field.type == TType.LIST) {
            {
              TList _list34 = iprot.readListBegin();
              this.paras = new ArrayList<byte[]>(Math.max(0, _list34.size));
              for (int _i35 = 0; 
                   (_list34.size < 0) ? iprot.peekList() : (_i35 < _list34.size); 
                   ++_i35)
              {
                byte[] _elem36;
                _elem36 = iprot.readBinary();
                this.paras.add(_elem36);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.op != null) {
      oprot.writeFieldBegin(OP_FIELD_DESC);
      oprot.writeI32(this.op == null ? 0 : this.op.getValue());
      oprot.writeFieldEnd();
    }
    if (this.cmd != null) {
      oprot.writeFieldBegin(CMD_FIELD_DESC);
      oprot.writeI32(this.cmd == null ? 0 : this.cmd.getValue());
      oprot.writeFieldEnd();
    }
    if (this.paras != null) {
      oprot.writeFieldBegin(PARAS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.paras.size()));
        for (byte[] _iter37 : this.paras)        {
          oprot.writeBinary(_iter37);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AdminJobReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("op");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getOp() == null) {
      sb.append("null");
    } else {
      String op_name = this.getOp() == null ? "null" : this.getOp().name();
      if (op_name != null) {
        sb.append(op_name);
        sb.append(" (");
      }
      sb.append(this.getOp());
      if (op_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("cmd");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getCmd() == null) {
      sb.append("null");
    } else {
      String cmd_name = this.getCmd() == null ? "null" : this.getCmd().name();
      if (cmd_name != null) {
        sb.append(cmd_name);
        sb.append(" (");
      }
      sb.append(this.getCmd());
      if (cmd_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("paras");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParas() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParas(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}


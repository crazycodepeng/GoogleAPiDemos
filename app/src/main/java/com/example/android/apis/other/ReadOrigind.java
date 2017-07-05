package com.example.android.apis.other;

/**
 * 创建时间： 2017/7/5
 * 编写人：   liupeng
 * 功能描述：
 */

public class ReadOrigInd extends GenericPdu {
    /**
     * Empty constructor.
     * Since the Pdu corresponding to this class is constructed
     * by the Proxy-Relay server, this class is only instantiated
     * by the Pdu Parser.
     *
     * @throws InvalidHeaderValueException if error occurs.
     */
    public ReadOrigInd() throws InvalidHeaderValueException {
        super();
        setMessageType(PduHeaders.MESSAGE_TYPE_READ_ORIG_IND);
    }
    /**
     * Constructor with given headers.
     *
     * @param headers Headers for this PDU.
     */
    ReadOrigInd(PduHeaders headers) {
        super(headers);
    }
    /**
     * Get Date value.
     *
     * @return the value
     */
    public long getDate() {
        return mPduHeaders.getLongInteger(PduHeaders.DATE);
    }
    /**
     * Set Date value.
     *
     * @param value the value
     */
    public void setDate(long value) {
        mPduHeaders.setLongInteger(value, PduHeaders.DATE);
    }
    /**
     * Get From value.
     * From-value = Value-length
     *      (Address-present-token Encoded-string-value | Insert-address-token)
     *
     * @return the value
     */
    public EncodedStringValue getFrom() {
        return mPduHeaders.getEncodedStringValue(PduHeaders.FROM);
    }
    /**
     * Set From value.
     *
     * @param value the value
     * @throws NullPointerException if the value is null.
     */
    public void setFrom(EncodedStringValue value) {
        mPduHeaders.setEncodedStringValue(value, PduHeaders.FROM);
    }
    /**
     * Get Message-ID value.
     *
     * @return the value
     */
    public byte[] getMessageId() {
        return mPduHeaders.getTextString(PduHeaders.MESSAGE_ID);
    }
    /**
     * Set Message-ID value.
     *
     * @param value the value
     * @throws NullPointerException if the value is null.
     */
    public void setMessageId(byte[] value) {
        mPduHeaders.setTextString(value, PduHeaders.MESSAGE_ID);
    }
    /**
     * Get X-MMS-Read-status value.
     *
     * @return the value
     */
    public int getReadStatus() {
        return mPduHeaders.getOctet(PduHeaders.READ_STATUS);
    }
    /**
     * Set X-MMS-Read-status value.
     *
     * @param value the value
     * @throws InvalidHeaderValueException if the value is invalid.
     */
    public void setReadStatus(int value) throws InvalidHeaderValueException {
        mPduHeaders.setOctet(value, PduHeaders.READ_STATUS);
    }
    /**
     * Get To value.
     *
     * @return the value
     */
    public EncodedStringValue[] getTo() {
        return mPduHeaders.getEncodedStringValues(PduHeaders.TO);
    }
    /**
     * Set To value.
     *
     * @param value the value
     * @throws NullPointerException if the value is null.
     */
    public void setTo(EncodedStringValue[] value) {
        mPduHeaders.setEncodedStringValues(value, PduHeaders.TO);
    }
    /*
     * Optional, not supported header fields:
     *
     *     public byte[] getApplicId() {return null;}
     *     public void setApplicId(byte[] value) {}
     *
     *     public byte[] getAuxApplicId() {return null;}
     *     public void getAuxApplicId(byte[] value) {}
     *
     *     public byte[] getReplyApplicId() {return 0x00;}
     *     public void setReplyApplicId(byte[] value) {}
     */
}
package com.lb.wechat.request;


public class BaseMessage
{
    private String ToUserName;
    private String FromUserName;
    private long CreateTime;
    private String MsgType;
    private long MsgId;

    public long getCreateTime()
    {
        return this.CreateTime;
    }

    public void setCreateTime(long createTime)
    {
        this.CreateTime = createTime;
    }

    public String getFromUserName()
    {
        return this.FromUserName;
    }

    public void setFromUserName(String fromUserName)
    {
        this.FromUserName = fromUserName;
    }

    public long getMsgId()
    {
        return this.MsgId;
    }

    public void setMsgId(long msgId)
    {
        this.MsgId = msgId;
    }

    public String getMsgType()
    {
        return this.MsgType;
    }

    public void setMsgType(String msgType)
    {
        this.MsgType = msgType;
    }

    public String getToUserName()
    {
        return this.ToUserName;
    }

    public void setToUserName(String toUserName)
    {
        this.ToUserName = toUserName;
    }
}

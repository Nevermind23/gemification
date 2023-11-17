package p341ge.bog.mobilebank.model.notification;

import com.google.gson.C5494h;
import com.google.gson.C5611k;
import hd0.C24978b;
import j81.C36763e;
import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.notification.PushNotification */
public class PushNotification implements C36763e {
    @C8664c("additionalData")
    private String additionalData;
    @C8664c("androidCustomData")
    private String androidCustomData;
    @C8664c("channel")
    private String channel;
    @C8664c("createDate")
    private Long createDate;
    @C8664c("headerId")
    private Long headerId;
    @C8664c("Id")

    /* renamed from: id */
    private String f81338id;
    @C8664c("iosCustomData")
    private Object iosCustomData;
    @C8664c("isMessageRead")
    private C24978b isMessageRead;
    @C8664c("isRead")
    private C24978b isRead;
    public boolean isStillValid;
    @C8664c("message")
    private String message;
    @C8664c("messageTitle")
    private String messageTitle;
    @C8664c("messageType")
    private String messageType;
    @C8664c("productId")
    private Long productId;
    @C8664c("rank")
    private Long rank;
    @C8664c("recipientId")
    private String recipientId;
    @C8664c("recipientReference")
    private String recipientReference;

    public String getAdditionalData() {
        return this.additionalData;
    }

    public Object getAndroidCustomData() {
        return this.androidCustomData;
    }

    public String getChannel() {
        return this.channel;
    }

    public Long getCreateDate() {
        return this.createDate;
    }

    public Long getHeaderId() {
        return this.headerId;
    }

    public String getId() {
        return this.f81338id;
    }

    public C24978b getIsMessageRead() {
        return this.isMessageRead;
    }

    public C24978b getIsRead() {
        return this.isRead;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageTitle() {
        return this.messageTitle;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public C5494h getParameters() {
        String str = this.additionalData;
        if (!(str == null || str.length() == 0)) {
            try {
                return C5611k.m22282d(this.additionalData).mo18216g().mo18450x("parameters");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getRecipientId() {
        return this.recipientId;
    }

    public String getRecipientReference() {
        return this.recipientReference;
    }

    public String getType() {
        String str = this.additionalData;
        if (!(str == null || str.length() == 0)) {
            try {
                return C5611k.m22282d(this.additionalData).mo18216g().mo18450x("type").mo18211k();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void setIsRead(C24978b bVar) {
        this.isRead = bVar;
    }
}

package p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.SmsNotificationEntity */
public final class SmsNotificationEntity {
    private final String contact;
    private final String isActive;
    private final MessageMode messageMode;
    private final long notifSetId;

    public SmsNotificationEntity(long j, String str, String str2, MessageMode messageMode2) {
        C41536l.m120489i(str, "contact");
        this.notifSetId = j;
        this.contact = str;
        this.isActive = str2;
        this.messageMode = messageMode2;
    }

    public static /* synthetic */ SmsNotificationEntity copy$default(SmsNotificationEntity smsNotificationEntity, long j, String str, String str2, MessageMode messageMode2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = smsNotificationEntity.notifSetId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = smsNotificationEntity.contact;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = smsNotificationEntity.isActive;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            messageMode2 = smsNotificationEntity.messageMode;
        }
        return smsNotificationEntity.copy(j2, str3, str4, messageMode2);
    }

    public final long component1() {
        return this.notifSetId;
    }

    public final String component2() {
        return this.contact;
    }

    public final String component3() {
        return this.isActive;
    }

    public final MessageMode component4() {
        return this.messageMode;
    }

    public final SmsNotificationEntity copy(long j, String str, String str2, MessageMode messageMode2) {
        C41536l.m120489i(str, "contact");
        return new SmsNotificationEntity(j, str, str2, messageMode2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsNotificationEntity)) {
            return false;
        }
        SmsNotificationEntity smsNotificationEntity = (SmsNotificationEntity) obj;
        return this.notifSetId == smsNotificationEntity.notifSetId && C41536l.m120484d(this.contact, smsNotificationEntity.contact) && C41536l.m120484d(this.isActive, smsNotificationEntity.isActive) && this.messageMode == smsNotificationEntity.messageMode;
    }

    public final String getContact() {
        return this.contact;
    }

    public final MessageMode getMessageMode() {
        return this.messageMode;
    }

    public final long getNotifSetId() {
        return this.notifSetId;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.notifSetId) * 31) + this.contact.hashCode()) * 31;
        String str = this.isActive;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        MessageMode messageMode2 = this.messageMode;
        if (messageMode2 != null) {
            i = messageMode2.hashCode();
        }
        return hashCode + i;
    }

    public final String isActive() {
        return this.isActive;
    }

    public String toString() {
        long j = this.notifSetId;
        String str = this.contact;
        String str2 = this.isActive;
        MessageMode messageMode2 = this.messageMode;
        return "SmsNotificationEntity(notifSetId=" + j + ", contact=" + str + ", isActive=" + str2 + ", messageMode=" + messageMode2 + ")";
    }
}

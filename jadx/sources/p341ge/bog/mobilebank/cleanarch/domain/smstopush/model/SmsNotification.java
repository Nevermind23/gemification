package p341ge.bog.mobilebank.cleanarch.domain.smstopush.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.MessageMode;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification */
public final class SmsNotification implements Parcelable {
    public static final Parcelable.Creator<SmsNotification> CREATOR = new C21039a();

    /* renamed from: d */
    private final long f56495d;

    /* renamed from: e */
    private final String f56496e;

    /* renamed from: f */
    private final boolean f56497f;

    /* renamed from: g */
    private final MessageMode f56498g;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification$a */
    public static final class C21039a implements Parcelable.Creator {
        /* renamed from: a */
        public final SmsNotification createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SmsNotification(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MessageMode.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final SmsNotification[] newArray(int i) {
            return new SmsNotification[i];
        }
    }

    public SmsNotification(long j, String str, boolean z, MessageMode messageMode) {
        C41536l.m120489i(str, "contact");
        this.f56495d = j;
        this.f56496e = str;
        this.f56497f = z;
        this.f56498g = messageMode;
    }

    /* renamed from: a */
    public final String mo52109a() {
        return this.f56496e;
    }

    /* renamed from: b */
    public final MessageMode mo52110b() {
        return this.f56498g;
    }

    /* renamed from: d */
    public final long mo52111d() {
        return this.f56495d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo52113e() {
        return this.f56497f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsNotification)) {
            return false;
        }
        SmsNotification smsNotification = (SmsNotification) obj;
        return this.f56495d == smsNotification.f56495d && C41536l.m120484d(this.f56496e, smsNotification.f56496e) && this.f56497f == smsNotification.f56497f && this.f56498g == smsNotification.f56498g;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f56495d) * 31) + this.f56496e.hashCode()) * 31;
        boolean z = this.f56497f;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        MessageMode messageMode = this.f56498g;
        return i + (messageMode == null ? 0 : messageMode.hashCode());
    }

    public String toString() {
        long j = this.f56495d;
        String str = this.f56496e;
        boolean z = this.f56497f;
        MessageMode messageMode = this.f56498g;
        return "SmsNotification(notifSetId=" + j + ", contact=" + str + ", isActive=" + z + ", messageMode=" + messageMode + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56495d);
        parcel.writeString(this.f56496e);
        parcel.writeInt(this.f56497f ? 1 : 0);
        MessageMode messageMode = this.f56498g;
        if (messageMode == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(messageMode.name());
    }
}

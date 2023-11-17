package p341ge.bog.mobilebank.payments.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.payments.domain.model.KeyValue */
public final class KeyValue implements Parcelable {
    public static final Parcelable.Creator<KeyValue> CREATOR = new C33628a();
    @C8664c("key")

    /* renamed from: d */
    private final String f81986d;
    @C8664c("value")

    /* renamed from: e */
    private final String f81987e;

    /* renamed from: ge.bog.mobilebank.payments.domain.model.KeyValue$a */
    public static final class C33628a implements Parcelable.Creator {
        /* renamed from: a */
        public final KeyValue createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new KeyValue(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final KeyValue[] newArray(int i) {
            return new KeyValue[i];
        }
    }

    public KeyValue(String str, String str2) {
        this.f81986d = str;
        this.f81987e = str2;
    }

    /* renamed from: a */
    public final String mo80134a() {
        return this.f81986d;
    }

    /* renamed from: b */
    public final String mo80135b() {
        return this.f81987e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyValue)) {
            return false;
        }
        KeyValue keyValue = (KeyValue) obj;
        return C41536l.m120484d(this.f81986d, keyValue.f81986d) && C41536l.m120484d(this.f81987e, keyValue.f81987e);
    }

    public int hashCode() {
        String str = this.f81986d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81987e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f81986d;
        String str2 = this.f81987e;
        return "KeyValue(key=" + str + ", value=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81986d);
        parcel.writeString(this.f81987e);
    }
}

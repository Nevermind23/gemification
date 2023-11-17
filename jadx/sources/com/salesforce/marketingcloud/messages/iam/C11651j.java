package com.salesforce.marketingcloud.messages.iam;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/* renamed from: com.salesforce.marketingcloud.messages.iam.j */
public class C11651j implements Parcelable {
    public static final Parcelable.Creator<C11651j> CREATOR = new C11652a();

    /* renamed from: e */
    public static final String f33764e = "buttonClicked";

    /* renamed from: f */
    public static final String f33765f = "dismissed";

    /* renamed from: g */
    public static final String f33766g = "autoDismissed";

    /* renamed from: h */
    public static final String f33767h = "unknown";

    /* renamed from: a */
    final String f33768a;

    /* renamed from: b */
    final InAppMessage.Button f33769b;

    /* renamed from: c */
    final long f33770c;

    /* renamed from: d */
    final Date f33771d;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.j$a */
    class C11652a implements Parcelable.Creator<C11651j> {
        C11652a() {
        }

        /* renamed from: a */
        public C11651j createFromParcel(Parcel parcel) {
            return new C11651j(parcel);
        }

        /* renamed from: a */
        public C11651j[] newArray(int i) {
            return new C11651j[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.messages.iam.j$b */
    @interface C11653b {
    }

    protected C11651j(Parcel parcel) {
        this.f33768a = parcel.readString();
        this.f33769b = (InAppMessage.Button) parcel.readParcelable(InAppMessage.Button.class.getClassLoader());
        this.f33770c = parcel.readLong();
        this.f33771d = new Date(parcel.readLong());
    }

    /* renamed from: e */
    static C11651j m42526e() {
        return new C11651j(f33767h, new Date(), -1, (InAppMessage.Button) null);
    }

    /* renamed from: a */
    public InAppMessage.Button mo30701a() {
        return this.f33769b;
    }

    /* renamed from: b */
    public long mo30702b() {
        return this.f33770c;
    }

    /* renamed from: c */
    public Date mo30703c() {
        return this.f33771d;
    }

    /* renamed from: d */
    public String mo30704d() {
        return this.f33768a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33768a);
        parcel.writeParcelable(this.f33769b, i);
        parcel.writeLong(this.f33770c);
        parcel.writeLong(this.f33771d.getTime());
    }

    private C11651j(String str, Date date, long j, InAppMessage.Button button) {
        this.f33768a = str;
        this.f33770c = j;
        this.f33769b = button;
        this.f33771d = date;
    }

    /* renamed from: a */
    static C11651j m42523a(Date date, long j) {
        return new C11651j(f33766g, date, j, (InAppMessage.Button) null);
    }

    /* renamed from: b */
    static C11651j m42525b(Date date, long j) {
        return new C11651j(f33765f, date, j, (InAppMessage.Button) null);
    }

    /* renamed from: a */
    static C11651j m42524a(Date date, long j, InAppMessage.Button button) {
        return new C11651j(f33764e, date, j, button);
    }
}

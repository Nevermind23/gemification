package p341ge.bog.designsystem.components;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p615tg.C17959a;

/* renamed from: ge.bog.designsystem.components.Amount */
public final class Amount implements Parcelable {
    public static final Parcelable.Creator<Amount> CREATOR = new C13121a();

    /* renamed from: d */
    private final BigDecimal f38624d;

    /* renamed from: e */
    private final String f38625e;

    /* renamed from: ge.bog.designsystem.components.Amount$a */
    public static final class C13121a implements Parcelable.Creator {
        /* renamed from: a */
        public final Amount createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new Amount((BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* renamed from: b */
        public final Amount[] newArray(int i) {
            return new Amount[i];
        }
    }

    public Amount(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currency");
        this.f38624d = bigDecimal;
        this.f38625e = str;
    }

    /* renamed from: a */
    public final BigDecimal mo34588a() {
        return this.f38624d;
    }

    /* renamed from: b */
    public final String mo34589b() {
        return this.f38625e;
    }

    /* renamed from: d */
    public final BigDecimal mo34590d() {
        return this.f38624d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo34592e() {
        return this.f38625e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return C41536l.m120484d(this.f38624d, amount.f38624d) && C41536l.m120484d(this.f38625e, amount.f38625e);
    }

    public int hashCode() {
        return (this.f38624d.hashCode() * 31) + this.f38625e.hashCode();
    }

    public String toString() {
        return C17959a.m61877a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f38624d);
        parcel.writeString(this.f38625e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Amount(double r2, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "currency"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2)
            java.lang.String r3 = "valueOf(amount)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r1.<init>((java.math.BigDecimal) r2, (java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.Amount.<init>(double, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Amount(int r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "currency"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            double r0 = (double) r3
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r0 = "valueOf(amount.toDouble())"
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)
            r2.<init>((java.math.BigDecimal) r3, (java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.Amount.<init>(int, java.lang.String):void");
    }
}

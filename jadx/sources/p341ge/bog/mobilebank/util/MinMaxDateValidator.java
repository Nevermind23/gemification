package p341ge.bog.mobilebank.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.util.MinMaxDateValidator */
public final class MinMaxDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<MinMaxDateValidator> CREATOR = new C35896a();

    /* renamed from: d */
    private final Long f86841d;

    /* renamed from: e */
    private final Long f86842e;

    /* renamed from: ge.bog.mobilebank.util.MinMaxDateValidator$a */
    public static final class C35896a implements Parcelable.Creator {
        /* renamed from: a */
        public final MinMaxDateValidator createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Long l = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new MinMaxDateValidator(valueOf, l);
        }

        /* renamed from: b */
        public final MinMaxDateValidator[] newArray(int i) {
            return new MinMaxDateValidator[i];
        }
    }

    public MinMaxDateValidator() {
        this((Long) null, (Long) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r2.f86842e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16149c(long r3) {
        /*
            r2 = this;
            java.lang.Long r0 = r2.f86841d
            if (r0 == 0) goto L_0x000c
            long r0 = r0.longValue()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
        L_0x000c:
            java.lang.Long r0 = r2.f86842e
            if (r0 == 0) goto L_0x001b
            long r0 = r0.longValue()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.util.MinMaxDateValidator.mo16149c(long):boolean");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinMaxDateValidator)) {
            return false;
        }
        MinMaxDateValidator minMaxDateValidator = (MinMaxDateValidator) obj;
        return C41536l.m120484d(this.f86841d, minMaxDateValidator.f86841d) && C41536l.m120484d(this.f86842e, minMaxDateValidator.f86842e);
    }

    public int hashCode() {
        Long l = this.f86841d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f86842e;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f86841d;
        Long l2 = this.f86842e;
        return "MinMaxDateValidator(minDate=" + l + ", maxDate=" + l2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f86841d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f86842e;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }

    public MinMaxDateValidator(Long l, Long l2) {
        this.f86841d = l;
        this.f86842e = l2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MinMaxDateValidator(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}

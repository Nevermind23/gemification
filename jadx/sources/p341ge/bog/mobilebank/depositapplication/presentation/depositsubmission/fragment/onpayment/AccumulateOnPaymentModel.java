package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel */
public final class AccumulateOnPaymentModel implements Parcelable {
    public static final Parcelable.Creator<AccumulateOnPaymentModel> CREATOR = new C22975a();

    /* renamed from: d */
    private final String f60411d;

    /* renamed from: e */
    private final BigDecimal f60412e;

    /* renamed from: f */
    private final Long f60413f;

    /* renamed from: g */
    private final Integer f60414g;

    /* renamed from: h */
    private final String f60415h;

    /* renamed from: i */
    private final boolean f60416i;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel$a */
    public static final class C22975a implements Parcelable.Creator {
        /* renamed from: a */
        public final AccumulateOnPaymentModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AccumulateOnPaymentModel(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final AccumulateOnPaymentModel[] newArray(int i) {
            return new AccumulateOnPaymentModel[i];
        }
    }

    public AccumulateOnPaymentModel() {
        this((String) null, (BigDecimal) null, (Long) null, (Integer) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ AccumulateOnPaymentModel m74476b(AccumulateOnPaymentModel accumulateOnPaymentModel, String str, BigDecimal bigDecimal, Long l, Integer num, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accumulateOnPaymentModel.f60411d;
        }
        if ((i & 2) != 0) {
            bigDecimal = accumulateOnPaymentModel.f60412e;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 4) != 0) {
            l = accumulateOnPaymentModel.f60413f;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num = accumulateOnPaymentModel.f60414g;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str2 = accumulateOnPaymentModel.f60415h;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            z = accumulateOnPaymentModel.f60416i;
        }
        return accumulateOnPaymentModel.mo57117a(str, bigDecimal2, l2, num2, str3, z);
    }

    /* renamed from: a */
    public final AccumulateOnPaymentModel mo57117a(String str, BigDecimal bigDecimal, Long l, Integer num, String str2, boolean z) {
        return new AccumulateOnPaymentModel(str, bigDecimal, l, num, str2, z);
    }

    /* renamed from: d */
    public final Long mo57118d() {
        return this.f60413f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo57120e() {
        return this.f60412e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccumulateOnPaymentModel)) {
            return false;
        }
        AccumulateOnPaymentModel accumulateOnPaymentModel = (AccumulateOnPaymentModel) obj;
        return C41536l.m120484d(this.f60411d, accumulateOnPaymentModel.f60411d) && C41536l.m120484d(this.f60412e, accumulateOnPaymentModel.f60412e) && C41536l.m120484d(this.f60413f, accumulateOnPaymentModel.f60413f) && C41536l.m120484d(this.f60414g, accumulateOnPaymentModel.f60414g) && C41536l.m120484d(this.f60415h, accumulateOnPaymentModel.f60415h) && this.f60416i == accumulateOnPaymentModel.f60416i;
    }

    /* renamed from: f */
    public final String mo57122f() {
        return this.f60415h;
    }

    /* renamed from: g */
    public final String mo57123g() {
        return this.f60411d;
    }

    /* renamed from: h */
    public final Integer mo57124h() {
        return this.f60414g;
    }

    public int hashCode() {
        String str = this.f60411d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.f60412e;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.f60413f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f60414g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f60415h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f60416i;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo57126i() {
        return this.f60416i;
    }

    /* renamed from: j */
    public final boolean mo57127j() {
        return (this.f60412e == null || this.f60413f == null) ? false : true;
    }

    public String toString() {
        String str = this.f60411d;
        BigDecimal bigDecimal = this.f60412e;
        Long l = this.f60413f;
        Integer num = this.f60414g;
        String str2 = this.f60415h;
        boolean z = this.f60416i;
        return "AccumulateOnPaymentModel(ccy=" + str + ", amount=" + bigDecimal + ", acctKey=" + l + ", image=" + num + ", cardName=" + str2 + ", isFavorite=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60411d);
        parcel.writeSerializable(this.f60412e);
        Long l = this.f60413f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.f60414g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f60415h);
        parcel.writeInt(this.f60416i ? 1 : 0);
    }

    public AccumulateOnPaymentModel(String str, BigDecimal bigDecimal, Long l, Integer num, String str2, boolean z) {
        this.f60411d = str;
        this.f60412e = bigDecimal;
        this.f60413f = l;
        this.f60414g = num;
        this.f60415h = str2;
        this.f60416i = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccumulateOnPaymentModel(java.lang.String r5, java.math.BigDecimal r6, java.lang.Long r7, java.lang.Integer r8, java.lang.String r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = "GEL"
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            r10 = 0
        L_0x0027:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel.<init>(java.lang.String, java.math.BigDecimal, java.lang.Long, java.lang.Integer, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel */
public final class BonusCashBackUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusCashBackUiModel> CREATOR = new C21138a();

    /* renamed from: d */
    private final long f56740d;

    /* renamed from: e */
    private final Long f56741e;

    /* renamed from: f */
    private final Long f56742f;

    /* renamed from: g */
    private final Double f56743g;

    /* renamed from: h */
    private final Long f56744h;

    /* renamed from: i */
    private final Long f56745i;

    /* renamed from: j */
    private final Double f56746j;

    /* renamed from: k */
    private final Long f56747k;

    /* renamed from: l */
    private final Long f56748l;

    /* renamed from: m */
    private final String f56749m;

    /* renamed from: n */
    private final String f56750n;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel$a */
    public static final class C21138a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusCashBackUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusCashBackUiModel(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BonusCashBackUiModel[] newArray(int i) {
            return new BonusCashBackUiModel[i];
        }
    }

    public BonusCashBackUiModel(long j, Long l, Long l2, Double d, Long l3, Long l4, Double d2, Long l5, Long l6, String str, String str2) {
        this.f56740d = j;
        this.f56741e = l;
        this.f56742f = l2;
        this.f56743g = d;
        this.f56744h = l3;
        this.f56745i = l4;
        this.f56746j = d2;
        this.f56747k = l5;
        this.f56748l = l6;
        this.f56749m = str;
        this.f56750n = str2;
    }

    /* renamed from: a */
    public final Long mo52728a() {
        return this.f56748l;
    }

    /* renamed from: b */
    public final String mo52729b() {
        return this.f56749m;
    }

    /* renamed from: d */
    public final Double mo52730d() {
        return this.f56746j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo52732e() {
        return this.f56745i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusCashBackUiModel)) {
            return false;
        }
        BonusCashBackUiModel bonusCashBackUiModel = (BonusCashBackUiModel) obj;
        return this.f56740d == bonusCashBackUiModel.f56740d && C41536l.m120484d(this.f56741e, bonusCashBackUiModel.f56741e) && C41536l.m120484d(this.f56742f, bonusCashBackUiModel.f56742f) && C41536l.m120484d(this.f56743g, bonusCashBackUiModel.f56743g) && C41536l.m120484d(this.f56744h, bonusCashBackUiModel.f56744h) && C41536l.m120484d(this.f56745i, bonusCashBackUiModel.f56745i) && C41536l.m120484d(this.f56746j, bonusCashBackUiModel.f56746j) && C41536l.m120484d(this.f56747k, bonusCashBackUiModel.f56747k) && C41536l.m120484d(this.f56748l, bonusCashBackUiModel.f56748l) && C41536l.m120484d(this.f56749m, bonusCashBackUiModel.f56749m) && C41536l.m120484d(this.f56750n, bonusCashBackUiModel.f56750n);
    }

    /* renamed from: f */
    public final Double mo52734f() {
        return this.f56743g;
    }

    /* renamed from: g */
    public final Long mo52735g() {
        return this.f56744h;
    }

    /* renamed from: h */
    public final String mo52736h() {
        return this.f56750n;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56740d) * 31;
        Long l = this.f56741e;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f56742f;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.f56743g;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Long l3 = this.f56744h;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f56745i;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d2 = this.f56746j;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l5 = this.f56747k;
        int hashCode7 = (hashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.f56748l;
        int hashCode8 = (hashCode7 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str = this.f56749m;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56750n;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final Long mo52738i() {
        return this.f56747k;
    }

    public String toString() {
        long j = this.f56740d;
        Long l = this.f56741e;
        Long l2 = this.f56742f;
        Double d = this.f56743g;
        Long l3 = this.f56744h;
        Long l4 = this.f56745i;
        Double d2 = this.f56746j;
        Long l5 = this.f56747k;
        Long l6 = this.f56748l;
        String str = this.f56749m;
        String str2 = this.f56750n;
        return "BonusCashBackUiModel(id=" + j + ", clientKey=" + l + ", productKey=" + l2 + ", cashbackCalcAmount=" + d + ", cashbackStartDate=" + l3 + ", cashbackAccrualDate=" + l4 + ", cashbackAccrualAmount=" + d2 + ", lastTransferDate=" + l5 + ", acctKey=" + l6 + ", acctNo=" + str + ", ccy=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56740d);
        Long l = this.f56741e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f56742f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Double d = this.f56743g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Long l3 = this.f56744h;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.f56745i;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Double d2 = this.f56746j;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Long l5 = this.f56747k;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Long l6 = this.f56748l;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        parcel.writeString(this.f56749m);
        parcel.writeString(this.f56750n);
    }
}

package p341ge.bog.mobilebank.products.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel */
public final class CheckChildMBankActiveModel implements Parcelable {
    public static final Parcelable.Creator<CheckChildMBankActiveModel> CREATOR = new C33802a();

    /* renamed from: d */
    private final long f82335d;

    /* renamed from: e */
    private final boolean f82336e;

    /* renamed from: f */
    private final boolean f82337f;

    /* renamed from: g */
    private final Long f82338g;

    /* renamed from: ge.bog.mobilebank.products.domain.model.CheckChildMBankActiveModel$a */
    public static final class C33802a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckChildMBankActiveModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CheckChildMBankActiveModel(readLong, z2, z, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final CheckChildMBankActiveModel[] newArray(int i) {
            return new CheckChildMBankActiveModel[i];
        }
    }

    public CheckChildMBankActiveModel(long j, boolean z, boolean z2, Long l) {
        this.f82335d = j;
        this.f82336e = z;
        this.f82337f = z2;
        this.f82338g = l;
    }

    /* renamed from: a */
    public final long mo81928a() {
        return this.f82335d;
    }

    /* renamed from: b */
    public final boolean mo81929b() {
        return this.f82337f;
    }

    /* renamed from: d */
    public final boolean mo81930d() {
        return this.f82336e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo81932e() {
        return this.f82338g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckChildMBankActiveModel)) {
            return false;
        }
        CheckChildMBankActiveModel checkChildMBankActiveModel = (CheckChildMBankActiveModel) obj;
        return this.f82335d == checkChildMBankActiveModel.f82335d && this.f82336e == checkChildMBankActiveModel.f82336e && this.f82337f == checkChildMBankActiveModel.f82337f && C41536l.m120484d(this.f82338g, checkChildMBankActiveModel.f82338g);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f82335d) * 31;
        boolean z = this.f82336e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f82337f;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        Long l = this.f82338g;
        return i2 + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.f82335d;
        boolean z = this.f82336e;
        boolean z2 = this.f82337f;
        Long l = this.f82338g;
        return "CheckChildMBankActiveModel(childClientKey=" + j + ", hasActiveUser=" + z + ", hasActiveChannel=" + z2 + ", userId=" + l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f82335d);
        parcel.writeInt(this.f82336e ? 1 : 0);
        parcel.writeInt(this.f82337f ? 1 : 0);
        Long l = this.f82338g;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}

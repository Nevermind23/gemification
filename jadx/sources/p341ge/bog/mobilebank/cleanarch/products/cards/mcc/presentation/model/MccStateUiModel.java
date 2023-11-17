package p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.domain.model.MccStateChange;

/* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel */
public final class MccStateUiModel implements Parcelable {
    public static final Parcelable.Creator<MccStateUiModel> CREATOR = new C22505a();

    /* renamed from: d */
    private final long f59531d;

    /* renamed from: e */
    private final String f59532e;

    /* renamed from: f */
    private final boolean f59533f;

    /* renamed from: g */
    private final boolean f59534g;

    /* renamed from: h */
    private final String f59535h;

    /* renamed from: i */
    private final String f59536i;

    /* renamed from: j */
    private final String f59537j;

    /* renamed from: k */
    private final String f59538k;

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel$a */
    public static final class C22505a implements Parcelable.Creator {
        /* renamed from: a */
        public final MccStateUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new MccStateUiModel(readLong, readString, z2, z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final MccStateUiModel[] newArray(int i) {
            return new MccStateUiModel[i];
        }
    }

    public MccStateUiModel(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "mccGroupCode");
        C41536l.m120489i(str2, "mccGroupNameKey");
        C41536l.m120489i(str3, "mccGroupName");
        C41536l.m120489i(str4, "mccGroupDescKey");
        C41536l.m120489i(str5, "mccGroupDesc");
        this.f59531d = j;
        this.f59532e = str;
        this.f59533f = z;
        this.f59534g = z2;
        this.f59535h = str2;
        this.f59536i = str3;
        this.f59537j = str4;
        this.f59538k = str5;
    }

    /* renamed from: b */
    public static /* synthetic */ MccStateUiModel m72958b(MccStateUiModel mccStateUiModel, long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, int i, Object obj) {
        MccStateUiModel mccStateUiModel2 = mccStateUiModel;
        int i2 = i;
        return mccStateUiModel.mo55612a((i2 & 1) != 0 ? mccStateUiModel2.f59531d : j, (i2 & 2) != 0 ? mccStateUiModel2.f59532e : str, (i2 & 4) != 0 ? mccStateUiModel2.f59533f : z, (i2 & 8) != 0 ? mccStateUiModel2.f59534g : z2, (i2 & 16) != 0 ? mccStateUiModel2.f59535h : str2, (i2 & 32) != 0 ? mccStateUiModel2.f59536i : str3, (i2 & 64) != 0 ? mccStateUiModel2.f59537j : str4, (i2 & 128) != 0 ? mccStateUiModel2.f59538k : str5);
    }

    /* renamed from: a */
    public final MccStateUiModel mo55612a(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "mccGroupCode");
        String str6 = str2;
        C41536l.m120489i(str6, "mccGroupNameKey");
        String str7 = str3;
        C41536l.m120489i(str7, "mccGroupName");
        String str8 = str4;
        C41536l.m120489i(str8, "mccGroupDescKey");
        String str9 = str5;
        C41536l.m120489i(str9, "mccGroupDesc");
        return new MccStateUiModel(j, str, z, z2, str6, str7, str8, str9);
    }

    /* renamed from: d */
    public final boolean mo55613d() {
        return this.f59534g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo55615e() {
        return this.f59531d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MccStateUiModel)) {
            return false;
        }
        MccStateUiModel mccStateUiModel = (MccStateUiModel) obj;
        return this.f59531d == mccStateUiModel.f59531d && C41536l.m120484d(this.f59532e, mccStateUiModel.f59532e) && this.f59533f == mccStateUiModel.f59533f && this.f59534g == mccStateUiModel.f59534g && C41536l.m120484d(this.f59535h, mccStateUiModel.f59535h) && C41536l.m120484d(this.f59536i, mccStateUiModel.f59536i) && C41536l.m120484d(this.f59537j, mccStateUiModel.f59537j) && C41536l.m120484d(this.f59538k, mccStateUiModel.f59538k);
    }

    /* renamed from: f */
    public final String mo55617f() {
        return this.f59538k;
    }

    /* renamed from: g */
    public final String mo55618g() {
        return this.f59537j;
    }

    /* renamed from: h */
    public final String mo55619h() {
        return this.f59536i;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f59531d) * 31) + this.f59532e.hashCode()) * 31;
        boolean z = this.f59533f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f59534g;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((i + (z2 ? 1 : 0)) * 31) + this.f59535h.hashCode()) * 31) + this.f59536i.hashCode()) * 31) + this.f59537j.hashCode()) * 31) + this.f59538k.hashCode();
    }

    /* renamed from: i */
    public final String mo55621i() {
        return this.f59535h;
    }

    /* renamed from: j */
    public final boolean mo55622j() {
        return this.f59533f;
    }

    /* renamed from: k */
    public final MccStateChange mo55623k() {
        String valueOf = String.valueOf(this.f59531d);
        String str = this.f59532e;
        String e = C24978b.m79846b(Boolean.valueOf(this.f59533f)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(mccStatus).value");
        return new MccStateChange(valueOf, str, e);
    }

    public String toString() {
        long j = this.f59531d;
        String str = this.f59532e;
        boolean z = this.f59533f;
        boolean z2 = this.f59534g;
        String str2 = this.f59535h;
        String str3 = this.f59536i;
        String str4 = this.f59537j;
        String str5 = this.f59538k;
        return "MccStateUiModel(cardId=" + j + ", mccGroupCode=" + str + ", mccStatus=" + z + ", accessMode=" + z2 + ", mccGroupNameKey=" + str2 + ", mccGroupName=" + str3 + ", mccGroupDescKey=" + str4 + ", mccGroupDesc=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59531d);
        parcel.writeString(this.f59532e);
        parcel.writeInt(this.f59533f ? 1 : 0);
        parcel.writeInt(this.f59534g ? 1 : 0);
        parcel.writeString(this.f59535h);
        parcel.writeString(this.f59536i);
        parcel.writeString(this.f59537j);
        parcel.writeString(this.f59538k);
    }
}

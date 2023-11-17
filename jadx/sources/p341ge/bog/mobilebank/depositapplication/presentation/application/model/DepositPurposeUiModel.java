package p341ge.bog.mobilebank.depositapplication.presentation.application.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel */
public final class DepositPurposeUiModel implements Parcelable {
    public static final Parcelable.Creator<DepositPurposeUiModel> CREATOR = new C22813a();

    /* renamed from: d */
    private final long f60134d;

    /* renamed from: e */
    private final String f60135e;

    /* renamed from: f */
    private final String f60136f;

    /* renamed from: g */
    private final String f60137g;

    /* renamed from: h */
    private final Long f60138h;

    /* renamed from: i */
    private final Long f60139i;

    /* renamed from: j */
    private final String f60140j;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel$a */
    public static final class C22813a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositPurposeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositPurposeUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* renamed from: b */
        public final DepositPurposeUiModel[] newArray(int i) {
            return new DepositPurposeUiModel[i];
        }
    }

    public DepositPurposeUiModel(long j, String str, String str2, String str3, Long l, Long l2, String str4) {
        C41536l.m120489i(str3, "lookupValue");
        C41536l.m120489i(str4, "dictionaryKey");
        this.f60134d = j;
        this.f60135e = str;
        this.f60136f = str2;
        this.f60137g = str3;
        this.f60138h = l;
        this.f60139i = l2;
        this.f60140j = str4;
    }

    /* renamed from: a */
    public final String mo56799a() {
        return this.f60140j;
    }

    /* renamed from: b */
    public final String mo56800b() {
        return this.f60135e;
    }

    /* renamed from: d */
    public final long mo56801d() {
        return this.f60134d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56803e() {
        return this.f60137g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositPurposeUiModel)) {
            return false;
        }
        DepositPurposeUiModel depositPurposeUiModel = (DepositPurposeUiModel) obj;
        return this.f60134d == depositPurposeUiModel.f60134d && C41536l.m120484d(this.f60135e, depositPurposeUiModel.f60135e) && C41536l.m120484d(this.f60136f, depositPurposeUiModel.f60136f) && C41536l.m120484d(this.f60137g, depositPurposeUiModel.f60137g) && C41536l.m120484d(this.f60138h, depositPurposeUiModel.f60138h) && C41536l.m120484d(this.f60139i, depositPurposeUiModel.f60139i) && C41536l.m120484d(this.f60140j, depositPurposeUiModel.f60140j);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f60134d) * 31;
        String str = this.f60135e;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60136f;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f60137g.hashCode()) * 31;
        Long l = this.f60138h;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f60139i;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.f60140j.hashCode();
    }

    public String toString() {
        long j = this.f60134d;
        String str = this.f60135e;
        String str2 = this.f60136f;
        String str3 = this.f60137g;
        Long l = this.f60138h;
        Long l2 = this.f60139i;
        String str4 = this.f60140j;
        return "DepositPurposeUiModel(id=" + j + ", iconUrl=" + str + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", dictionaryKeyId=" + l + ", orderNumber=" + l2 + ", dictionaryKey=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f60134d);
        parcel.writeString(this.f60135e);
        parcel.writeString(this.f60136f);
        parcel.writeString(this.f60137g);
        Long l = this.f60138h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f60139i;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f60140j);
    }
}

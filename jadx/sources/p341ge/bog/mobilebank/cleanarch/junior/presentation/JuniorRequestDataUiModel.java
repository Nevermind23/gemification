package p341ge.bog.mobilebank.cleanarch.junior.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel */
public final class JuniorRequestDataUiModel implements Parcelable {
    public static final Parcelable.Creator<JuniorRequestDataUiModel> CREATOR = new C21111a();

    /* renamed from: d */
    private final Long f56657d;

    /* renamed from: e */
    private final String f56658e;

    /* renamed from: f */
    private final Long f56659f;

    /* renamed from: g */
    private final String f56660g;

    /* renamed from: h */
    private final String f56661h;

    /* renamed from: i */
    private final Long f56662i;

    /* renamed from: j */
    private final String f56663j;

    /* renamed from: k */
    private final Long f56664k;

    /* renamed from: l */
    private final String f56665l;

    /* renamed from: m */
    private final boolean f56666m;

    /* renamed from: n */
    private final Long f56667n;

    /* renamed from: ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel$a */
    public static final class C21111a implements Parcelable.Creator {
        /* renamed from: a */
        public final JuniorRequestDataUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new JuniorRequestDataUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final JuniorRequestDataUiModel[] newArray(int i) {
            return new JuniorRequestDataUiModel[i];
        }
    }

    public JuniorRequestDataUiModel(Long l, String str, Long l2, String str2, String str3, Long l3, String str4, Long l4, String str5, boolean z, Long l5) {
        C41536l.m120489i(str2, "childFirstName");
        C41536l.m120489i(str4, "childMobileNumber");
        C41536l.m120489i(str5, "parentMobileNumber");
        this.f56657d = l;
        this.f56658e = str;
        this.f56659f = l2;
        this.f56660g = str2;
        this.f56661h = str3;
        this.f56662i = l3;
        this.f56663j = str4;
        this.f56664k = l4;
        this.f56665l = str5;
        this.f56666m = z;
        this.f56667n = l5;
    }

    /* renamed from: a */
    public final Long mo52339a() {
        return this.f56662i;
    }

    /* renamed from: b */
    public final Long mo52340b() {
        return this.f56659f;
    }

    /* renamed from: d */
    public final String mo52341d() {
        return this.f56660g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo52343e() {
        return this.f56661h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuniorRequestDataUiModel)) {
            return false;
        }
        JuniorRequestDataUiModel juniorRequestDataUiModel = (JuniorRequestDataUiModel) obj;
        return C41536l.m120484d(this.f56657d, juniorRequestDataUiModel.f56657d) && C41536l.m120484d(this.f56658e, juniorRequestDataUiModel.f56658e) && C41536l.m120484d(this.f56659f, juniorRequestDataUiModel.f56659f) && C41536l.m120484d(this.f56660g, juniorRequestDataUiModel.f56660g) && C41536l.m120484d(this.f56661h, juniorRequestDataUiModel.f56661h) && C41536l.m120484d(this.f56662i, juniorRequestDataUiModel.f56662i) && C41536l.m120484d(this.f56663j, juniorRequestDataUiModel.f56663j) && C41536l.m120484d(this.f56664k, juniorRequestDataUiModel.f56664k) && C41536l.m120484d(this.f56665l, juniorRequestDataUiModel.f56665l) && this.f56666m == juniorRequestDataUiModel.f56666m && C41536l.m120484d(this.f56667n, juniorRequestDataUiModel.f56667n);
    }

    /* renamed from: f */
    public final String mo52345f() {
        return this.f56663j;
    }

    /* renamed from: g */
    public final String mo52346g() {
        return this.f56658e;
    }

    /* renamed from: h */
    public final Long mo52347h() {
        return this.f56657d;
    }

    public int hashCode() {
        Long l = this.f56657d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f56658e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f56659f;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f56660g.hashCode()) * 31;
        String str2 = this.f56661h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f56662i;
        int hashCode5 = (((hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.f56663j.hashCode()) * 31;
        Long l4 = this.f56664k;
        int hashCode6 = (((hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31) + this.f56665l.hashCode()) * 31;
        boolean z = this.f56666m;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        Long l5 = this.f56667n;
        if (l5 != null) {
            i = l5.hashCode();
        }
        return i2 + i;
    }

    /* renamed from: i */
    public final Long mo52349i() {
        return this.f56664k;
    }

    /* renamed from: j */
    public final String mo52350j() {
        return this.f56665l;
    }

    /* renamed from: k */
    public final boolean mo52351k() {
        return this.f56666m;
    }

    /* renamed from: l */
    public final Long mo52352l() {
        return this.f56667n;
    }

    public String toString() {
        Long l = this.f56657d;
        String str = this.f56658e;
        Long l2 = this.f56659f;
        String str2 = this.f56660g;
        String str3 = this.f56661h;
        Long l3 = this.f56662i;
        String str4 = this.f56663j;
        Long l4 = this.f56664k;
        String str5 = this.f56665l;
        boolean z = this.f56666m;
        Long l5 = this.f56667n;
        return "JuniorRequestDataUiModel(id=" + l + ", childPin=" + str + ", childClientKey=" + l2 + ", childFirstName=" + str2 + ", childLastName=" + str3 + ", childBirthDate=" + l3 + ", childMobileNumber=" + str4 + ", parentClientKey=" + l4 + ", parentMobileNumber=" + str5 + ", status=" + z + ", validationRequestId=" + l5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56657d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f56658e);
        Long l2 = this.f56659f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f56660g);
        parcel.writeString(this.f56661h);
        Long l3 = this.f56662i;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.f56663j);
        Long l4 = this.f56664k;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.f56665l);
        parcel.writeInt(this.f56666m ? 1 : 0);
        Long l5 = this.f56667n;
        if (l5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l5.longValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JuniorRequestDataUiModel(Long l, String str, Long l2, String str2, String str3, Long l3, String str4, Long l4, String str5, boolean z, Long l5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, str, l2, str2, str3, l3, str4, l4, str5, z, (i & C11398b.f33141t) != 0 ? null : l5);
    }
}

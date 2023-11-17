package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel */
public final class DebitCardPayrollInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardPayrollInfoUiModel> CREATOR = new C14215a();

    /* renamed from: d */
    private final long f41696d;

    /* renamed from: e */
    private final String f41697e;

    /* renamed from: f */
    private final String f41698f;

    /* renamed from: g */
    private final Long f41699g;

    /* renamed from: h */
    private final boolean f41700h;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel$a */
    public static final class C14215a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardPayrollInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardPayrollInfoUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final DebitCardPayrollInfoUiModel[] newArray(int i) {
            return new DebitCardPayrollInfoUiModel[i];
        }
    }

    public DebitCardPayrollInfoUiModel(long j, String str, String str2, Long l, boolean z) {
        C41536l.m120489i(str, "orgNameGe");
        C41536l.m120489i(str2, "orgNameEn");
        this.f41696d = j;
        this.f41697e = str;
        this.f41698f = str2;
        this.f41699g = l;
        this.f41700h = z;
    }

    /* renamed from: a */
    public final Long mo39547a() {
        return this.f41699g;
    }

    /* renamed from: b */
    public final long mo39548b() {
        return this.f41696d;
    }

    /* renamed from: d */
    public final String mo39549d() {
        return this.f41698f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo39551e() {
        return this.f41697e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardPayrollInfoUiModel)) {
            return false;
        }
        DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel = (DebitCardPayrollInfoUiModel) obj;
        return this.f41696d == debitCardPayrollInfoUiModel.f41696d && C41536l.m120484d(this.f41697e, debitCardPayrollInfoUiModel.f41697e) && C41536l.m120484d(this.f41698f, debitCardPayrollInfoUiModel.f41698f) && C41536l.m120484d(this.f41699g, debitCardPayrollInfoUiModel.f41699g) && this.f41700h == debitCardPayrollInfoUiModel.f41700h;
    }

    /* renamed from: f */
    public final boolean mo39553f() {
        return this.f41700h;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f41696d) * 31) + this.f41697e.hashCode()) * 31) + this.f41698f.hashCode()) * 31;
        Long l = this.f41699g;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.f41700h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f41696d;
        String str = this.f41697e;
        String str2 = this.f41698f;
        Long l = this.f41699g;
        boolean z = this.f41700h;
        return "DebitCardPayrollInfoUiModel(orgId=" + j + ", orgNameGe=" + str + ", orgNameEn=" + str2 + ", acctKey=" + l + ", isArmyCard=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41696d);
        parcel.writeString(this.f41697e);
        parcel.writeString(this.f41698f);
        Long l = this.f41699g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.f41700h ? 1 : 0);
    }
}

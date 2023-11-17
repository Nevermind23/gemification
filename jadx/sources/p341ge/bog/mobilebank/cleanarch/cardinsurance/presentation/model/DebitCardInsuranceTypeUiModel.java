package p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel */
public abstract class DebitCardInsuranceTypeUiModel implements Parcelable {

    /* renamed from: ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$InsuranceType */
    public static final class InsuranceType extends DebitCardInsuranceTypeUiModel {
        public static final Parcelable.Creator<InsuranceType> CREATOR = new C20872a();

        /* renamed from: d */
        private final String f56162d;

        /* renamed from: e */
        private final String f56163e;

        /* renamed from: f */
        private final Double f56164f;

        /* renamed from: g */
        private final String f56165g;

        /* renamed from: h */
        private final String f56166h;

        /* renamed from: i */
        private final String f56167i;

        /* renamed from: j */
        private final String f56168j;

        /* renamed from: k */
        private final String f56169k;

        /* renamed from: ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$InsuranceType$a */
        public static final class C20872a implements Parcelable.Creator {
            /* renamed from: a */
            public final InsuranceType createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new InsuranceType(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final InsuranceType[] newArray(int i) {
                return new InsuranceType[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InsuranceType(String str, String str2, Double d, String str3, String str4, String str5, String str6, String str7) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(str2, "cardSubProductCode");
            C41536l.m120489i(str3, "insuranceLimitPosValue");
            C41536l.m120489i(str4, "insuranceLimitOnlinePaymentsValue");
            C41536l.m120489i(str5, "insuranceType");
            C41536l.m120489i(str6, "dictionaryKey");
            C41536l.m120489i(str7, "detailsDictionaryKey");
            this.f56162d = str;
            this.f56163e = str2;
            this.f56164f = d;
            this.f56165g = str3;
            this.f56166h = str4;
            this.f56167i = str5;
            this.f56168j = str6;
            this.f56169k = str7;
        }

        /* renamed from: a */
        public String mo49680a() {
            return this.f56169k;
        }

        /* renamed from: b */
        public String mo49681b() {
            return this.f56168j;
        }

        /* renamed from: d */
        public String mo49682d() {
            return this.f56167i;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo49684e() {
            return this.f56163e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsuranceType)) {
                return false;
            }
            InsuranceType insuranceType = (InsuranceType) obj;
            return C41536l.m120484d(this.f56162d, insuranceType.f56162d) && C41536l.m120484d(this.f56163e, insuranceType.f56163e) && C41536l.m120484d(this.f56164f, insuranceType.f56164f) && C41536l.m120484d(this.f56165g, insuranceType.f56165g) && C41536l.m120484d(this.f56166h, insuranceType.f56166h) && C41536l.m120484d(this.f56167i, insuranceType.f56167i) && C41536l.m120484d(this.f56168j, insuranceType.f56168j) && C41536l.m120484d(this.f56169k, insuranceType.f56169k);
        }

        /* renamed from: f */
        public final Double mo49686f() {
            return this.f56164f;
        }

        /* renamed from: g */
        public final String mo49687g() {
            return this.f56162d;
        }

        /* renamed from: h */
        public final String mo49688h() {
            return this.f56166h;
        }

        public int hashCode() {
            int hashCode = ((this.f56162d.hashCode() * 31) + this.f56163e.hashCode()) * 31;
            Double d = this.f56164f;
            return ((((((((((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.f56165g.hashCode()) * 31) + this.f56166h.hashCode()) * 31) + this.f56167i.hashCode()) * 31) + this.f56168j.hashCode()) * 31) + this.f56169k.hashCode();
        }

        /* renamed from: i */
        public final String mo49690i() {
            return this.f56165g;
        }

        public String toString() {
            String str = this.f56162d;
            String str2 = this.f56163e;
            Double d = this.f56164f;
            String str3 = this.f56165g;
            String str4 = this.f56166h;
            String str5 = this.f56167i;
            String str6 = this.f56168j;
            String str7 = this.f56169k;
            return "InsuranceType(id=" + str + ", cardSubProductCode=" + str2 + ", fee=" + d + ", insuranceLimitPosValue=" + str3 + ", insuranceLimitOnlinePaymentsValue=" + str4 + ", insuranceType=" + str5 + ", dictionaryKey=" + str6 + ", detailsDictionaryKey=" + str7 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f56162d);
            parcel.writeString(this.f56163e);
            Double d = this.f56164f;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            parcel.writeString(this.f56165g);
            parcel.writeString(this.f56166h);
            parcel.writeString(this.f56167i);
            parcel.writeString(this.f56168j);
            parcel.writeString(this.f56169k);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$NoInsurance */
    public static final class NoInsurance extends DebitCardInsuranceTypeUiModel {
        public static final Parcelable.Creator<NoInsurance> CREATOR = new C20873a();

        /* renamed from: d */
        public static final NoInsurance f56170d = new NoInsurance();

        /* renamed from: e */
        private static final String f56171e = null;

        /* renamed from: ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel$NoInsurance$a */
        public static final class C20873a implements Parcelable.Creator {
            /* renamed from: a */
            public final NoInsurance createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return NoInsurance.f56170d;
            }

            /* renamed from: b */
            public final NoInsurance[] newArray(int i) {
                return new NoInsurance[i];
            }
        }

        private NoInsurance() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public String mo49680a() {
            return "card.applications.no.insurance.description";
        }

        /* renamed from: b */
        public String mo49681b() {
            return "card.applications.no.insurance.header";
        }

        /* renamed from: d */
        public String mo49682d() {
            return f56171e;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    private DebitCardInsuranceTypeUiModel() {
    }

    public /* synthetic */ DebitCardInsuranceTypeUiModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo49680a();

    /* renamed from: b */
    public abstract String mo49681b();

    /* renamed from: d */
    public abstract String mo49682d();
}

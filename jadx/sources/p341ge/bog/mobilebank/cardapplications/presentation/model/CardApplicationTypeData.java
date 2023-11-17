package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p537nm.C17071b;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData */
public abstract class CardApplicationTypeData implements Parcelable {

    /* renamed from: d */
    private final C17071b f41611d;

    /* renamed from: e */
    private final StringSource f41612e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData */
    public static final class PayRollCardOrderData extends CardApplicationTypeData {
        public static final Parcelable.Creator<PayRollCardOrderData> CREATOR = new C14192a();

        /* renamed from: f */
        private final long f41613f;

        /* renamed from: g */
        private final Long f41614g;

        /* renamed from: h */
        private final RecoverCardUiModel f41615h;

        /* renamed from: i */
        private final StringSource f41616i;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$PayRollCardOrderData$a */
        public static final class C14192a implements Parcelable.Creator {
            /* renamed from: a */
            public final PayRollCardOrderData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                long readLong = parcel.readLong();
                RecoverCardUiModel recoverCardUiModel = null;
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    recoverCardUiModel = RecoverCardUiModel.CREATOR.createFromParcel(parcel);
                }
                return new PayRollCardOrderData(readLong, valueOf, recoverCardUiModel, (StringSource) parcel.readParcelable(PayRollCardOrderData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final PayRollCardOrderData[] newArray(int i) {
                return new PayRollCardOrderData[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PayRollCardOrderData(long j, Long l, RecoverCardUiModel recoverCardUiModel, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, l, (i & 4) != 0 ? null : recoverCardUiModel, (i & 8) != 0 ? null : stringSource);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayRollCardOrderData)) {
                return false;
            }
            PayRollCardOrderData payRollCardOrderData = (PayRollCardOrderData) obj;
            return this.f41613f == payRollCardOrderData.f41613f && C41536l.m120484d(this.f41614g, payRollCardOrderData.f41614g) && C41536l.m120484d(this.f41615h, payRollCardOrderData.f41615h) && C41536l.m120484d(this.f41616i, payRollCardOrderData.f41616i);
        }

        public int hashCode() {
            int a = C7397t.m28148a(this.f41613f) * 31;
            Long l = this.f41614g;
            int i = 0;
            int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
            RecoverCardUiModel recoverCardUiModel = this.f41615h;
            int hashCode2 = (hashCode + (recoverCardUiModel == null ? 0 : recoverCardUiModel.hashCode())) * 31;
            StringSource stringSource = this.f41616i;
            if (stringSource != null) {
                i = stringSource.hashCode();
            }
            return hashCode2 + i;
        }

        /* renamed from: i */
        public final Long mo39296i() {
            return this.f41614g;
        }

        /* renamed from: j */
        public final long mo39297j() {
            return this.f41613f;
        }

        /* renamed from: k */
        public final RecoverCardUiModel mo39298k() {
            return this.f41615h;
        }

        public String toString() {
            long j = this.f41613f;
            Long l = this.f41614g;
            RecoverCardUiModel recoverCardUiModel = this.f41615h;
            StringSource stringSource = this.f41616i;
            return "PayRollCardOrderData(organizationId=" + j + ", acctKey=" + l + ", recoverCard=" + recoverCardUiModel + ", header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f41613f);
            Long l = this.f41614g;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            RecoverCardUiModel recoverCardUiModel = this.f41615h;
            if (recoverCardUiModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                recoverCardUiModel.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f41616i, i);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PayRollCardOrderData(long r4, java.lang.Long r6, p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r7, p341ge.bog.mobilebank.shared.helper.StringSource r8) {
            /*
                r3 = this;
                nm.b r0 = p537nm.C17071b.PAYROLL
                if (r8 != 0) goto L_0x0010
                java.lang.String r1 = r0.mo44269c()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r2)
                goto L_0x0011
            L_0x0010:
                r1 = r8
            L_0x0011:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f41613f = r4
                r3.f41614g = r6
                r3.f41615h = r7
                r3.f41616i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.PayRollCardOrderData.<init>(long, java.lang.Long, ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel, ge.bog.mobilebank.shared.helper.StringSource):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData */
    public static final class RecoverCardOrderData extends CardApplicationTypeData {
        public static final Parcelable.Creator<RecoverCardOrderData> CREATOR = new C14193a();

        /* renamed from: f */
        private final RecoverCardUiModel f41617f;

        /* renamed from: g */
        private final StringSource f41618g;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData$a */
        public static final class C14193a implements Parcelable.Creator {
            /* renamed from: a */
            public final RecoverCardOrderData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new RecoverCardOrderData(RecoverCardUiModel.CREATOR.createFromParcel(parcel), (StringSource) parcel.readParcelable(RecoverCardOrderData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final RecoverCardOrderData[] newArray(int i) {
                return new RecoverCardOrderData[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RecoverCardOrderData(RecoverCardUiModel recoverCardUiModel, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(recoverCardUiModel, (i & 2) != 0 ? null : stringSource);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecoverCardOrderData)) {
                return false;
            }
            RecoverCardOrderData recoverCardOrderData = (RecoverCardOrderData) obj;
            return C41536l.m120484d(this.f41617f, recoverCardOrderData.f41617f) && C41536l.m120484d(this.f41618g, recoverCardOrderData.f41618g);
        }

        public int hashCode() {
            int hashCode = this.f41617f.hashCode() * 31;
            StringSource stringSource = this.f41618g;
            return hashCode + (stringSource == null ? 0 : stringSource.hashCode());
        }

        /* renamed from: i */
        public final RecoverCardUiModel mo39308i() {
            return this.f41617f;
        }

        public String toString() {
            RecoverCardUiModel recoverCardUiModel = this.f41617f;
            StringSource stringSource = this.f41618g;
            return "RecoverCardOrderData(recoverCard=" + recoverCardUiModel + ", header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            this.f41617f.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f41618g, i);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public RecoverCardOrderData(p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r4, p341ge.bog.mobilebank.shared.helper.StringSource r5) {
            /*
                r3 = this;
                java.lang.String r0 = "recoverCard"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                nm.b r0 = p537nm.C17071b.RECOVER
                if (r5 != 0) goto L_0x0015
                java.lang.String r1 = r0.mo44269c()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r2)
                goto L_0x0016
            L_0x0015:
                r1 = r5
            L_0x0016:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f41617f = r4
                r3.f41618g = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.RecoverCardOrderData.<init>(ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel, ge.bog.mobilebank.shared.helper.StringSource):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$SchoolCardOrderData */
    public static final class SchoolCardOrderData extends CardApplicationTypeData {
        public static final Parcelable.Creator<SchoolCardOrderData> CREATOR = new C14194a();

        /* renamed from: f */
        private final long f41619f;

        /* renamed from: g */
        private final ScoolCardInfoUiModel f41620g;

        /* renamed from: h */
        private final JuniorRequestDataUiModel f41621h;

        /* renamed from: i */
        private final StringSource f41622i;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$SchoolCardOrderData$a */
        public static final class C14194a implements Parcelable.Creator {
            /* renamed from: a */
            public final SchoolCardOrderData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                Class<SchoolCardOrderData> cls = SchoolCardOrderData.class;
                return new SchoolCardOrderData(parcel.readLong(), ScoolCardInfoUiModel.CREATOR.createFromParcel(parcel), (JuniorRequestDataUiModel) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()));
            }

            /* renamed from: b */
            public final SchoolCardOrderData[] newArray(int i) {
                return new SchoolCardOrderData[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SchoolCardOrderData(long j, ScoolCardInfoUiModel scoolCardInfoUiModel, JuniorRequestDataUiModel juniorRequestDataUiModel, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, scoolCardInfoUiModel, (i & 4) != 0 ? null : juniorRequestDataUiModel, (i & 8) != 0 ? null : stringSource);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SchoolCardOrderData)) {
                return false;
            }
            SchoolCardOrderData schoolCardOrderData = (SchoolCardOrderData) obj;
            return this.f41619f == schoolCardOrderData.f41619f && C41536l.m120484d(this.f41620g, schoolCardOrderData.f41620g) && C41536l.m120484d(this.f41621h, schoolCardOrderData.f41621h) && C41536l.m120484d(this.f41622i, schoolCardOrderData.f41622i);
        }

        public int hashCode() {
            int a = ((C7397t.m28148a(this.f41619f) * 31) + this.f41620g.hashCode()) * 31;
            JuniorRequestDataUiModel juniorRequestDataUiModel = this.f41621h;
            int i = 0;
            int hashCode = (a + (juniorRequestDataUiModel == null ? 0 : juniorRequestDataUiModel.hashCode())) * 31;
            StringSource stringSource = this.f41622i;
            if (stringSource != null) {
                i = stringSource.hashCode();
            }
            return hashCode + i;
        }

        /* renamed from: i */
        public final long mo39318i() {
            return this.f41619f;
        }

        /* renamed from: j */
        public final JuniorRequestDataUiModel mo39319j() {
            return this.f41621h;
        }

        /* renamed from: k */
        public final ScoolCardInfoUiModel mo39320k() {
            return this.f41620g;
        }

        public String toString() {
            long j = this.f41619f;
            ScoolCardInfoUiModel scoolCardInfoUiModel = this.f41620g;
            JuniorRequestDataUiModel juniorRequestDataUiModel = this.f41621h;
            StringSource stringSource = this.f41622i;
            return "SchoolCardOrderData(childKey=" + j + ", scoolCardInfo=" + scoolCardInfoUiModel + ", juniorRequestData=" + juniorRequestDataUiModel + ", header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.f41619f);
            this.f41620g.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f41621h, i);
            parcel.writeParcelable(this.f41622i, i);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SchoolCardOrderData(long r4, p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel r6, p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r7, p341ge.bog.mobilebank.shared.helper.StringSource r8) {
            /*
                r3 = this;
                java.lang.String r0 = "scoolCardInfo"
                kotlin.jvm.internal.C41536l.m120489i(r6, r0)
                nm.b r0 = p537nm.C17071b.SCHOOL
                if (r8 != 0) goto L_0x0015
                java.lang.String r1 = r0.mo44269c()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r2)
                goto L_0x0016
            L_0x0015:
                r1 = r8
            L_0x0016:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f41619f = r4
                r3.f41620g = r6
                r3.f41621h = r7
                r3.f41622i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData.<init>(long, ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel, ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel, ge.bog.mobilebank.shared.helper.StringSource):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StandardCardData */
    public static final class StandardCardData extends CardApplicationTypeData {
        public static final Parcelable.Creator<StandardCardData> CREATOR = new C14195a();

        /* renamed from: f */
        private final String f41623f;

        /* renamed from: g */
        private final StringSource f41624g;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StandardCardData$a */
        public static final class C14195a implements Parcelable.Creator {
            /* renamed from: a */
            public final StandardCardData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new StandardCardData(parcel.readString(), (StringSource) parcel.readParcelable(StandardCardData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final StandardCardData[] newArray(int i) {
                return new StandardCardData[i];
            }
        }

        public StandardCardData() {
            this((String) null, (StringSource) null, 3, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardCardData)) {
                return false;
            }
            StandardCardData standardCardData = (StandardCardData) obj;
            return C41536l.m120484d(this.f41623f, standardCardData.f41623f) && C41536l.m120484d(this.f41624g, standardCardData.f41624g);
        }

        public int hashCode() {
            String str = this.f41623f;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            StringSource stringSource = this.f41624g;
            if (stringSource != null) {
                i = stringSource.hashCode();
            }
            return hashCode + i;
        }

        /* renamed from: i */
        public final String mo39330i() {
            return this.f41623f;
        }

        public String toString() {
            String str = this.f41623f;
            StringSource stringSource = this.f41624g;
            return "StandardCardData(cardSubProductCode=" + str + ", header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f41623f);
            parcel.writeParcelable(this.f41624g, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StandardCardData(String str, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : stringSource);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public StandardCardData(java.lang.String r4, p341ge.bog.mobilebank.shared.helper.StringSource r5) {
            /*
                r3 = this;
                nm.b r0 = p537nm.C17071b.STANDARD
                if (r5 != 0) goto L_0x0010
                java.lang.String r1 = r0.mo44269c()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r2)
                goto L_0x0011
            L_0x0010:
                r1 = r5
            L_0x0011:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f41623f = r4
                r3.f41624g = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StandardCardData.<init>(java.lang.String, ge.bog.mobilebank.shared.helper.StringSource):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StudentCardOrderData */
    public static final class StudentCardOrderData extends CardApplicationTypeData {
        public static final Parcelable.Creator<StudentCardOrderData> CREATOR = new C14196a();

        /* renamed from: f */
        private final List f41625f;

        /* renamed from: g */
        private final StringSource f41626g;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$StudentCardOrderData$a */
        public static final class C14196a implements Parcelable.Creator {
            /* renamed from: a */
            public final StudentCardOrderData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(RegionUiModel.CREATOR.createFromParcel(parcel));
                }
                return new StudentCardOrderData(arrayList, (StringSource) parcel.readParcelable(StudentCardOrderData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final StudentCardOrderData[] newArray(int i) {
                return new StudentCardOrderData[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public StudentCardOrderData(java.util.List r4, p341ge.bog.mobilebank.shared.helper.StringSource r5) {
            /*
                r3 = this;
                java.lang.String r0 = "regions"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                nm.b r0 = p537nm.C17071b.STUDENT
                if (r5 != 0) goto L_0x0015
                java.lang.String r1 = r0.mo44269c()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r2)
                goto L_0x0016
            L_0x0015:
                r1 = r5
            L_0x0016:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f41625f = r4
                r3.f41626g = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData.<init>(java.util.List, ge.bog.mobilebank.shared.helper.StringSource):void");
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StudentCardOrderData)) {
                return false;
            }
            StudentCardOrderData studentCardOrderData = (StudentCardOrderData) obj;
            return C41536l.m120484d(this.f41625f, studentCardOrderData.f41625f) && C41536l.m120484d(this.f41626g, studentCardOrderData.f41626g);
        }

        public int hashCode() {
            int hashCode = this.f41625f.hashCode() * 31;
            StringSource stringSource = this.f41626g;
            return hashCode + (stringSource == null ? 0 : stringSource.hashCode());
        }

        /* renamed from: i */
        public final List mo39340i() {
            return this.f41625f;
        }

        public String toString() {
            List list = this.f41625f;
            StringSource stringSource = this.f41626g;
            return "StudentCardOrderData(regions=" + list + ", header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<RegionUiModel> list = this.f41625f;
            parcel.writeInt(list.size());
            for (RegionUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.f41626g, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$VisaConciergeCardOrderData */
    public static final class VisaConciergeCardOrderData extends CardApplicationTypeData {
        public static final Parcelable.Creator<VisaConciergeCardOrderData> CREATOR = new C14197a();

        /* renamed from: f */
        public static final VisaConciergeCardOrderData f41627f = new VisaConciergeCardOrderData();

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$VisaConciergeCardOrderData$a */
        public static final class C14197a implements Parcelable.Creator {
            /* renamed from: a */
            public final VisaConciergeCardOrderData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                parcel.readInt();
                return VisaConciergeCardOrderData.f41627f;
            }

            /* renamed from: b */
            public final VisaConciergeCardOrderData[] newArray(int i) {
                return new VisaConciergeCardOrderData[i];
            }
        }

        private VisaConciergeCardOrderData() {
            super(C17071b.STANDARD, (StringSource) null, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$WishCardData */
    public static final class WishCardData extends CardApplicationTypeData {
        public static final Parcelable.Creator<WishCardData> CREATOR = new C14198a();

        /* renamed from: f */
        private final StringSource f41628f;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$WishCardData$a */
        public static final class C14198a implements Parcelable.Creator {
            /* renamed from: a */
            public final WishCardData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new WishCardData((StringSource) parcel.readParcelable(WishCardData.class.getClassLoader()));
            }

            /* renamed from: b */
            public final WishCardData[] newArray(int i) {
                return new WishCardData[i];
            }
        }

        public WishCardData() {
            this((StringSource) null, 1, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WishCardData) && C41536l.m120484d(this.f41628f, ((WishCardData) obj).f41628f);
        }

        public int hashCode() {
            StringSource stringSource = this.f41628f;
            if (stringSource == null) {
                return 0;
            }
            return stringSource.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f41628f;
            return "WishCardData(header=" + stringSource + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeParcelable(this.f41628f, i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WishCardData(StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stringSource);
        }

        public WishCardData(StringSource stringSource) {
            super(C17071b.WISHCARD, (StringSource) null, 2, (DefaultConstructorMarker) null);
            this.f41628f = stringSource;
        }
    }

    public /* synthetic */ CardApplicationTypeData(C17071b bVar, StringSource stringSource, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, stringSource);
    }

    /* renamed from: a */
    public final RecoverCardOrderData mo39286a() {
        RecoverCardOrderData recoverCardOrderData;
        PayRollCardOrderData payRollCardOrderData;
        RecoverCardUiModel k;
        if (this instanceof RecoverCardOrderData) {
            recoverCardOrderData = (RecoverCardOrderData) this;
        } else {
            recoverCardOrderData = null;
        }
        if (recoverCardOrderData != null) {
            return recoverCardOrderData;
        }
        if (this instanceof PayRollCardOrderData) {
            payRollCardOrderData = (PayRollCardOrderData) this;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData == null || (k = payRollCardOrderData.mo39298k()) == null) {
            return null;
        }
        return new RecoverCardOrderData(k, (StringSource) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public StringSource mo39287b() {
        return this.f41612e;
    }

    /* renamed from: d */
    public final C17071b mo39288d() {
        return this.f41611d;
    }

    /* renamed from: e */
    public final boolean mo39289e() {
        return this instanceof PayRollCardOrderData;
    }

    /* renamed from: f */
    public final boolean mo39290f() {
        if (!(this instanceof RecoverCardOrderData)) {
            RecoverCardUiModel recoverCardUiModel = null;
            PayRollCardOrderData payRollCardOrderData = this instanceof PayRollCardOrderData ? (PayRollCardOrderData) this : null;
            if (payRollCardOrderData != null) {
                recoverCardUiModel = payRollCardOrderData.mo39298k();
            }
            return recoverCardUiModel != null;
        }
    }

    /* renamed from: g */
    public final boolean mo39291g() {
        return this instanceof SchoolCardOrderData;
    }

    /* renamed from: h */
    public final boolean mo39292h() {
        return this instanceof StudentCardOrderData;
    }

    private CardApplicationTypeData(C17071b bVar, StringSource stringSource) {
        this.f41611d = bVar;
        this.f41612e = stringSource;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardApplicationTypeData(C17071b bVar, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? C34646b.m101748b(bVar.mo44269c(), new Object[0]) : stringSource, (DefaultConstructorMarker) null);
    }
}

package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p852ov.C27088c;
import qq0.C38236b;
import wp0.C39628a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel */
public final class GetDecisionDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<GetDecisionDetailsUiModel> CREATOR = new C32482a();

    /* renamed from: d */
    private final C39628a f80024d;

    /* renamed from: e */
    private final Long f80025e;

    /* renamed from: f */
    private final String f80026f;

    /* renamed from: g */
    private final Double f80027g;

    /* renamed from: h */
    private final Double f80028h;

    /* renamed from: i */
    private final Double f80029i;

    /* renamed from: j */
    private final Double f80030j;

    /* renamed from: k */
    private final Double f80031k;

    /* renamed from: l */
    private final C38236b f80032l;

    /* renamed from: m */
    private final Double f80033m;

    /* renamed from: n */
    private final double f80034n;

    /* renamed from: o */
    private final String f80035o;

    /* renamed from: p */
    private final Long f80036p;

    /* renamed from: q */
    private final Integer f80037q;

    /* renamed from: r */
    private final int f80038r;

    /* renamed from: s */
    private final int f80039s;

    /* renamed from: t */
    private final C27088c f80040t;

    /* renamed from: u */
    private final Integer f80041u;

    /* renamed from: v */
    private final Double f80042v;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel$a */
    public static final class C32482a implements Parcelable.Creator {
        /* renamed from: a */
        public final GetDecisionDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GetDecisionDetailsUiModel(C39628a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), C38236b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), C27088c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final GetDecisionDetailsUiModel[] newArray(int i) {
            return new GetDecisionDetailsUiModel[i];
        }
    }

    public GetDecisionDetailsUiModel(C39628a aVar, Long l, String str, Double d, Double d2, Double d3, Double d4, Double d5, C38236b bVar, Double d6, double d7, String str2, Long l2, Integer num, int i, int i2, C27088c cVar, Integer num2, Double d8) {
        String str3 = str2;
        C27088c cVar2 = cVar;
        C41536l.m120489i(aVar, "accessType");
        C41536l.m120489i(bVar, "insIncFlag");
        C41536l.m120489i(str3, "loanCcy");
        C41536l.m120489i(cVar2, "operationType");
        this.f80024d = aVar;
        this.f80025e = l;
        this.f80026f = str;
        this.f80027g = d;
        this.f80028h = d2;
        this.f80029i = d3;
        this.f80030j = d4;
        this.f80031k = d5;
        this.f80032l = bVar;
        this.f80033m = d6;
        this.f80034n = d7;
        this.f80035o = str3;
        this.f80036p = l2;
        this.f80037q = num;
        this.f80038r = i;
        this.f80039s = i2;
        this.f80040t = cVar2;
        this.f80041u = num2;
        this.f80042v = d8;
    }

    /* renamed from: a */
    public final C39628a mo73408a() {
        return this.f80024d;
    }

    /* renamed from: b */
    public final Long mo73409b() {
        return this.f80025e;
    }

    /* renamed from: d */
    public final String mo73410d() {
        return this.f80026f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Double mo73412e() {
        return this.f80028h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDecisionDetailsUiModel)) {
            return false;
        }
        GetDecisionDetailsUiModel getDecisionDetailsUiModel = (GetDecisionDetailsUiModel) obj;
        return this.f80024d == getDecisionDetailsUiModel.f80024d && C41536l.m120484d(this.f80025e, getDecisionDetailsUiModel.f80025e) && C41536l.m120484d(this.f80026f, getDecisionDetailsUiModel.f80026f) && C41536l.m120484d(this.f80027g, getDecisionDetailsUiModel.f80027g) && C41536l.m120484d(this.f80028h, getDecisionDetailsUiModel.f80028h) && C41536l.m120484d(this.f80029i, getDecisionDetailsUiModel.f80029i) && C41536l.m120484d(this.f80030j, getDecisionDetailsUiModel.f80030j) && C41536l.m120484d(this.f80031k, getDecisionDetailsUiModel.f80031k) && this.f80032l == getDecisionDetailsUiModel.f80032l && C41536l.m120484d(this.f80033m, getDecisionDetailsUiModel.f80033m) && Double.compare(this.f80034n, getDecisionDetailsUiModel.f80034n) == 0 && C41536l.m120484d(this.f80035o, getDecisionDetailsUiModel.f80035o) && C41536l.m120484d(this.f80036p, getDecisionDetailsUiModel.f80036p) && C41536l.m120484d(this.f80037q, getDecisionDetailsUiModel.f80037q) && this.f80038r == getDecisionDetailsUiModel.f80038r && this.f80039s == getDecisionDetailsUiModel.f80039s && this.f80040t == getDecisionDetailsUiModel.f80040t && C41536l.m120484d(this.f80041u, getDecisionDetailsUiModel.f80041u) && C41536l.m120484d(this.f80042v, getDecisionDetailsUiModel.f80042v);
    }

    /* renamed from: f */
    public final Double mo73414f() {
        return this.f80029i;
    }

    /* renamed from: g */
    public final Double mo73415g() {
        return this.f80030j;
    }

    /* renamed from: h */
    public final C38236b mo73416h() {
        return this.f80032l;
    }

    public int hashCode() {
        int hashCode = this.f80024d.hashCode() * 31;
        Long l = this.f80025e;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f80026f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f80027g;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f80028h;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f80029i;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f80030j;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f80031k;
        int hashCode8 = (((hashCode7 + (d5 == null ? 0 : d5.hashCode())) * 31) + this.f80032l.hashCode()) * 31;
        Double d6 = this.f80033m;
        int hashCode9 = (((((hashCode8 + (d6 == null ? 0 : d6.hashCode())) * 31) + Double.doubleToLongBits(this.f80034n)) * 31) + this.f80035o.hashCode()) * 31;
        Long l2 = this.f80036p;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f80037q;
        int hashCode11 = (((((((hashCode10 + (num == null ? 0 : num.hashCode())) * 31) + this.f80038r) * 31) + this.f80039s) * 31) + this.f80040t.hashCode()) * 31;
        Integer num2 = this.f80041u;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d7 = this.f80042v;
        if (d7 != null) {
            i = d7.hashCode();
        }
        return hashCode12 + i;
    }

    /* renamed from: i */
    public final Double mo73418i() {
        return this.f80033m;
    }

    /* renamed from: j */
    public final double mo73419j() {
        return this.f80034n;
    }

    /* renamed from: k */
    public final String mo73420k() {
        return this.f80035o;
    }

    /* renamed from: l */
    public final int mo73421l() {
        return this.f80038r;
    }

    /* renamed from: m */
    public final int mo73422m() {
        return this.f80039s;
    }

    /* renamed from: p */
    public final C27088c mo73423p() {
        return this.f80040t;
    }

    /* renamed from: q */
    public final Integer mo73424q() {
        return this.f80041u;
    }

    /* renamed from: r */
    public final Double mo73425r() {
        return this.f80042v;
    }

    public String toString() {
        C39628a aVar = this.f80024d;
        Long l = this.f80025e;
        String str = this.f80026f;
        Double d = this.f80027g;
        Double d2 = this.f80028h;
        Double d3 = this.f80029i;
        Double d4 = this.f80030j;
        Double d5 = this.f80031k;
        C38236b bVar = this.f80032l;
        Double d6 = this.f80033m;
        double d7 = this.f80034n;
        String str2 = this.f80035o;
        Long l2 = this.f80036p;
        Integer num = this.f80037q;
        int i = this.f80038r;
        int i2 = this.f80039s;
        C27088c cVar = this.f80040t;
        Integer num2 = this.f80041u;
        Double d8 = this.f80042v;
        return "GetDecisionDetailsUiModel(accessType=" + aVar + ", decisionNo=" + l + ", decisionScheme=" + str + ", downPayment=" + d + ", forgiveFeeAmount=" + d2 + ", forgiveIntAmount=" + d3 + ", forgiveOdiAmount=" + d4 + ", insIncAmount=" + d5 + ", insIncFlag=" + bVar + ", insLifeAmount=" + d6 + ", loanAmount=" + d7 + ", loanCcy=" + str2 + ", loanMaturity=" + l2 + ", loanTerm=" + num + ", maxTerm=" + i + ", minTerm=" + i2 + ", operationType=" + cVar + ", payDay=" + num2 + ", rqstDownPayment=" + d8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80024d.name());
        Long l = this.f80025e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f80026f);
        Double d = this.f80027g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f80028h;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f80029i;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f80030j;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f80031k;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        parcel.writeString(this.f80032l.name());
        Double d6 = this.f80033m;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        parcel.writeDouble(this.f80034n);
        parcel.writeString(this.f80035o);
        Long l2 = this.f80036p;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num = this.f80037q;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f80038r);
        parcel.writeInt(this.f80039s);
        parcel.writeString(this.f80040t.name());
        Integer num2 = this.f80041u;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Double d7 = this.f80042v;
        if (d7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d7.doubleValue());
    }
}

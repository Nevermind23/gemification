package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import wp0.C39628a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel */
public final class CheckDecisionDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<CheckDecisionDetailsUiModel> CREATOR = new C32479a();

    /* renamed from: d */
    private final Double f79995d;

    /* renamed from: e */
    private final Double f79996e;

    /* renamed from: f */
    private final Double f79997f;

    /* renamed from: g */
    private final Double f79998g;

    /* renamed from: h */
    private final Double f79999h;

    /* renamed from: i */
    private final Double f80000i;

    /* renamed from: j */
    private final Double f80001j;

    /* renamed from: k */
    private final double f80002k;

    /* renamed from: l */
    private final Double f80003l;

    /* renamed from: m */
    private final Double f80004m;

    /* renamed from: n */
    private final String f80005n;

    /* renamed from: o */
    private final Double f80006o;

    /* renamed from: p */
    private final int f80007p;

    /* renamed from: q */
    private final int f80008q;

    /* renamed from: r */
    private final Double f80009r;

    /* renamed from: s */
    private final Double f80010s;

    /* renamed from: t */
    private final String f80011t;

    /* renamed from: u */
    private final String f80012u;

    /* renamed from: v */
    private final Integer f80013v;

    /* renamed from: w */
    private final Double f80014w;

    /* renamed from: x */
    private final Double f80015x;

    /* renamed from: y */
    private final Long f80016y;

    /* renamed from: z */
    private final C39628a f80017z;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionDetailsUiModel$a */
    public static final class C32479a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckDecisionDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Long l = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            double readDouble = parcel.readDouble();
            Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString = parcel.readString();
            Double valueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Double valueOf11 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf12 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double valueOf14 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf15 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new CheckDecisionDetailsUiModel(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, readDouble, valueOf8, valueOf9, readString, valueOf10, readInt, readInt2, valueOf11, valueOf12, readString2, readString3, valueOf13, valueOf14, valueOf15, l, C39628a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final CheckDecisionDetailsUiModel[] newArray(int i) {
            return new CheckDecisionDetailsUiModel[i];
        }
    }

    public CheckDecisionDetailsUiModel(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, double d8, Double d9, Double d12, String str, Double d13, int i, int i2, Double d14, Double d15, String str2, String str3, Integer num, Double d16, Double d17, Long l, C39628a aVar) {
        String str4 = str;
        C39628a aVar2 = aVar;
        C41536l.m120489i(str4, "loanCcy");
        C41536l.m120489i(aVar2, "accessType");
        this.f79995d = d;
        this.f79996e = d2;
        this.f79997f = d3;
        this.f79998g = d4;
        this.f79999h = d5;
        this.f80000i = d6;
        this.f80001j = d7;
        this.f80002k = d8;
        this.f80003l = d9;
        this.f80004m = d12;
        this.f80005n = str4;
        this.f80006o = d13;
        this.f80007p = i;
        this.f80008q = i2;
        this.f80009r = d14;
        this.f80010s = d15;
        this.f80011t = str2;
        this.f80012u = str3;
        this.f80013v = num;
        this.f80014w = d16;
        this.f80015x = d17;
        this.f80016y = l;
        this.f80017z = aVar2;
    }

    /* renamed from: a */
    public final C39628a mo73355a() {
        return this.f80017z;
    }

    /* renamed from: b */
    public final Double mo73356b() {
        return this.f79995d;
    }

    /* renamed from: d */
    public final Integer mo73357d() {
        return this.f80013v;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Double mo73359e() {
        return this.f80014w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDecisionDetailsUiModel)) {
            return false;
        }
        CheckDecisionDetailsUiModel checkDecisionDetailsUiModel = (CheckDecisionDetailsUiModel) obj;
        return C41536l.m120484d(this.f79995d, checkDecisionDetailsUiModel.f79995d) && C41536l.m120484d(this.f79996e, checkDecisionDetailsUiModel.f79996e) && C41536l.m120484d(this.f79997f, checkDecisionDetailsUiModel.f79997f) && C41536l.m120484d(this.f79998g, checkDecisionDetailsUiModel.f79998g) && C41536l.m120484d(this.f79999h, checkDecisionDetailsUiModel.f79999h) && C41536l.m120484d(this.f80000i, checkDecisionDetailsUiModel.f80000i) && C41536l.m120484d(this.f80001j, checkDecisionDetailsUiModel.f80001j) && Double.compare(this.f80002k, checkDecisionDetailsUiModel.f80002k) == 0 && C41536l.m120484d(this.f80003l, checkDecisionDetailsUiModel.f80003l) && C41536l.m120484d(this.f80004m, checkDecisionDetailsUiModel.f80004m) && C41536l.m120484d(this.f80005n, checkDecisionDetailsUiModel.f80005n) && C41536l.m120484d(this.f80006o, checkDecisionDetailsUiModel.f80006o) && this.f80007p == checkDecisionDetailsUiModel.f80007p && this.f80008q == checkDecisionDetailsUiModel.f80008q && C41536l.m120484d(this.f80009r, checkDecisionDetailsUiModel.f80009r) && C41536l.m120484d(this.f80010s, checkDecisionDetailsUiModel.f80010s) && C41536l.m120484d(this.f80011t, checkDecisionDetailsUiModel.f80011t) && C41536l.m120484d(this.f80012u, checkDecisionDetailsUiModel.f80012u) && C41536l.m120484d(this.f80013v, checkDecisionDetailsUiModel.f80013v) && C41536l.m120484d(this.f80014w, checkDecisionDetailsUiModel.f80014w) && C41536l.m120484d(this.f80015x, checkDecisionDetailsUiModel.f80015x) && C41536l.m120484d(this.f80016y, checkDecisionDetailsUiModel.f80016y) && this.f80017z == checkDecisionDetailsUiModel.f80017z;
    }

    /* renamed from: f */
    public final Double mo73361f() {
        return this.f80015x;
    }

    /* renamed from: g */
    public final Long mo73362g() {
        return this.f80016y;
    }

    /* renamed from: h */
    public final Double mo73363h() {
        return this.f79999h;
    }

    public int hashCode() {
        Double d = this.f79995d;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f79996e;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f79997f;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f79998g;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f79999h;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f80000i;
        int hashCode6 = (hashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f80001j;
        int hashCode7 = (((hashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31) + Double.doubleToLongBits(this.f80002k)) * 31;
        Double d8 = this.f80003l;
        int hashCode8 = (hashCode7 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.f80004m;
        int hashCode9 = (((hashCode8 + (d9 == null ? 0 : d9.hashCode())) * 31) + this.f80005n.hashCode()) * 31;
        Double d12 = this.f80006o;
        int hashCode10 = (((((hashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31) + this.f80007p) * 31) + this.f80008q) * 31;
        Double d13 = this.f80009r;
        int hashCode11 = (hashCode10 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f80010s;
        int hashCode12 = (hashCode11 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f80011t;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80012u;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f80013v;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Double d15 = this.f80014w;
        int hashCode16 = (hashCode15 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f80015x;
        int hashCode17 = (hashCode16 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Long l = this.f80016y;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode17 + i) * 31) + this.f80017z.hashCode();
    }

    /* renamed from: i */
    public final Double mo73365i() {
        return this.f80000i;
    }

    /* renamed from: j */
    public final Double mo73366j() {
        return this.f80001j;
    }

    /* renamed from: k */
    public final Double mo73367k() {
        return this.f79996e;
    }

    /* renamed from: l */
    public final double mo73368l() {
        return this.f80002k;
    }

    /* renamed from: m */
    public final String mo73369m() {
        return this.f80005n;
    }

    /* renamed from: p */
    public final Double mo73370p() {
        return this.f80006o;
    }

    /* renamed from: q */
    public final Double mo73371q() {
        return this.f79997f;
    }

    /* renamed from: r */
    public final int mo73372r() {
        return this.f80007p;
    }

    /* renamed from: s */
    public final String mo73373s() {
        return this.f80011t;
    }

    /* renamed from: t */
    public final int mo73374t() {
        return this.f80008q;
    }

    public String toString() {
        Double d = this.f79995d;
        Double d2 = this.f79996e;
        Double d3 = this.f79997f;
        Double d4 = this.f79998g;
        Double d5 = this.f79999h;
        Double d6 = this.f80000i;
        Double d7 = this.f80001j;
        double d8 = this.f80002k;
        Double d9 = this.f80003l;
        Double d12 = this.f80004m;
        String str = this.f80005n;
        Double d13 = this.f80006o;
        int i = this.f80007p;
        int i2 = this.f80008q;
        Double d14 = this.f80009r;
        Double d15 = this.f80010s;
        String str2 = this.f80011t;
        String str3 = this.f80012u;
        Integer num = this.f80013v;
        Double d16 = this.f80014w;
        Double d17 = this.f80015x;
        Long l = this.f80016y;
        C39628a aVar = this.f80017z;
        return "CheckDecisionDetailsUiModel(comisAmount=" + d + ", keepAmount=" + d2 + ", loanRate=" + d3 + ", rfncAmount=" + d4 + ", forgiveFeeAmount=" + d5 + ", forgiveIntAmount=" + d6 + ", forgiveOdiAmount=" + d7 + ", loanAmount=" + d8 + ", minLoanAmount=" + d9 + ", maxLoanAmount=" + d12 + ", loanCcy=" + str + ", loanIrr=" + d13 + ", loanTerm=" + i + ", payDay=" + i2 + ", pmtAmount=" + d14 + ", rqstDownPayment=" + d15 + ", operationType=" + str2 + ", insIncFlag=" + str3 + ", conditionDays=" + num + ", drawAmount=" + d16 + ", drawAmount2=" + d17 + ", firstPayDate=" + l + ", accessType=" + aVar + ")";
    }

    /* renamed from: u */
    public final Double mo73376u() {
        return this.f80009r;
    }

    /* renamed from: v */
    public final Double mo73377v() {
        return this.f79998g;
    }

    /* renamed from: w */
    public final Double mo73378w() {
        return this.f80010s;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Double d = this.f79995d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f79996e;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f79997f;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f79998g;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f79999h;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        Double d6 = this.f80000i;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        Double d7 = this.f80001j;
        if (d7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d7.doubleValue());
        }
        parcel.writeDouble(this.f80002k);
        Double d8 = this.f80003l;
        if (d8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d8.doubleValue());
        }
        Double d9 = this.f80004m;
        if (d9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d9.doubleValue());
        }
        parcel.writeString(this.f80005n);
        Double d12 = this.f80006o;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d12.doubleValue());
        }
        parcel.writeInt(this.f80007p);
        parcel.writeInt(this.f80008q);
        Double d13 = this.f80009r;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d13.doubleValue());
        }
        Double d14 = this.f80010s;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d14.doubleValue());
        }
        parcel.writeString(this.f80011t);
        parcel.writeString(this.f80012u);
        Integer num = this.f80013v;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Double d15 = this.f80014w;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d15.doubleValue());
        }
        Double d16 = this.f80015x;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d16.doubleValue());
        }
        Long l = this.f80016y;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f80017z.name());
    }
}

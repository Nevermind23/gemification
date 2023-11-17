package p341ge.bog.mobilebank.depositapplication.presentation.application.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel */
public final class InterestRateUiModel implements Parcelable {
    public static final Parcelable.Creator<InterestRateUiModel> CREATOR = new C22815b();

    /* renamed from: i */
    public static final C22814a f60141i = new C22814a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final InterestRateUiModel f60142j = new InterestRateUiModel((Double) null, (Double) null, (Double) null, (Double) null, Boolean.FALSE);

    /* renamed from: d */
    private final Double f60143d;

    /* renamed from: e */
    private final Double f60144e;

    /* renamed from: f */
    private final Double f60145f;

    /* renamed from: g */
    private final Double f60146g;

    /* renamed from: h */
    private final Boolean f60147h;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel$a */
    public static final class C22814a {
        private C22814a() {
        }

        public /* synthetic */ C22814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterestRateUiModel mo56821a() {
            return InterestRateUiModel.f60142j;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel$b */
    public static final class C22815b implements Parcelable.Creator {
        /* renamed from: a */
        public final InterestRateUiModel createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InterestRateUiModel(valueOf, valueOf2, valueOf3, valueOf4, bool);
        }

        /* renamed from: b */
        public final InterestRateUiModel[] newArray(int i) {
            return new InterestRateUiModel[i];
        }
    }

    public InterestRateUiModel(Double d, Double d2, Double d3, Double d4, Boolean bool) {
        this.f60143d = d;
        this.f60144e = d2;
        this.f60145f = d3;
        this.f60146g = d4;
        this.f60147h = bool;
    }

    /* renamed from: b */
    public final Double mo56812b() {
        return this.f60144e;
    }

    /* renamed from: d */
    public final Double mo56813d() {
        return this.f60143d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Double mo56815e() {
        return this.f60145f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestRateUiModel)) {
            return false;
        }
        InterestRateUiModel interestRateUiModel = (InterestRateUiModel) obj;
        return C41536l.m120484d(this.f60143d, interestRateUiModel.f60143d) && C41536l.m120484d(this.f60144e, interestRateUiModel.f60144e) && C41536l.m120484d(this.f60145f, interestRateUiModel.f60145f) && C41536l.m120484d(this.f60146g, interestRateUiModel.f60146g) && C41536l.m120484d(this.f60147h, interestRateUiModel.f60147h);
    }

    /* renamed from: f */
    public final Double mo56817f() {
        return this.f60146g;
    }

    public int hashCode() {
        Double d = this.f60143d;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f60144e;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f60145f;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f60146g;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool = this.f60147h;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Double d = this.f60143d;
        Double d2 = this.f60144e;
        Double d3 = this.f60145f;
        Double d4 = this.f60146g;
        Boolean bool = this.f60147h;
        return "InterestRateUiModel(interestRate=" + d + ", effectiveInterestRate=" + d2 + ", possibleProfit=" + d3 + ", spreadRate=" + d4 + ", hasSpreadRate=" + bool + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Double d = this.f60143d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f60144e;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f60145f;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f60146g;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Boolean bool = this.f60147h;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }
}

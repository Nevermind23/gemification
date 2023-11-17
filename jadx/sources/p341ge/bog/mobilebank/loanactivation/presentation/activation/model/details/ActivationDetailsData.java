package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;
import lq0.C37124a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionUiModel;
import wp0.C39628a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData */
public final class ActivationDetailsData implements Parcelable {
    public static final Parcelable.Creator<ActivationDetailsData> CREATOR = new C32477a();

    /* renamed from: d */
    private final String f79972d;

    /* renamed from: e */
    private final String f79973e;

    /* renamed from: f */
    private final Long f79974f;

    /* renamed from: g */
    private final String f79975g;

    /* renamed from: h */
    private final String f79976h;

    /* renamed from: i */
    private final Long f79977i;

    /* renamed from: j */
    private final String f79978j;

    /* renamed from: k */
    private final boolean f79979k;

    /* renamed from: l */
    private final boolean f79980l;

    /* renamed from: m */
    private final CheckDecisionUiModel f79981m;

    /* renamed from: n */
    private final C37124a f79982n;

    /* renamed from: o */
    private final String f79983o;

    /* renamed from: p */
    private final C39628a f79984p;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData$a */
    public static final class C32477a implements Parcelable.Creator {
        /* renamed from: a */
        public final ActivationDetailsData createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString5 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ActivationDetailsData(readString, readString2, valueOf, readString3, readString4, valueOf2, readString5, z2, z, CheckDecisionUiModel.CREATOR.createFromParcel(parcel2), C37124a.valueOf(parcel.readString()), parcel.readString(), C39628a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final ActivationDetailsData[] newArray(int i) {
            return new ActivationDetailsData[i];
        }
    }

    public ActivationDetailsData(String str, String str2, Long l, String str3, String str4, Long l2, String str5, boolean z, boolean z2, CheckDecisionUiModel checkDecisionUiModel, C37124a aVar, String str6, C39628a aVar2) {
        C41536l.m120489i(str5, "limitId");
        C41536l.m120489i(checkDecisionUiModel, "decision");
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        C41536l.m120489i(str6, "rawRefinanceInfo");
        C41536l.m120489i(aVar2, "accessType");
        this.f79972d = str;
        this.f79973e = str2;
        this.f79974f = l;
        this.f79975g = str3;
        this.f79976h = str4;
        this.f79977i = l2;
        this.f79978j = str5;
        this.f79979k = z;
        this.f79980l = z2;
        this.f79981m = checkDecisionUiModel;
        this.f79982n = aVar;
        this.f79983o = str6;
        this.f79984p = aVar2;
    }

    /* renamed from: a */
    public final C39628a mo73315a() {
        return this.f79984p;
    }

    /* renamed from: b */
    public final Long mo73316b() {
        return this.f79974f;
    }

    /* renamed from: d */
    public final String mo73317d() {
        return this.f79975g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo73319e() {
        return this.f79976h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationDetailsData)) {
            return false;
        }
        ActivationDetailsData activationDetailsData = (ActivationDetailsData) obj;
        return C41536l.m120484d(this.f79972d, activationDetailsData.f79972d) && C41536l.m120484d(this.f79973e, activationDetailsData.f79973e) && C41536l.m120484d(this.f79974f, activationDetailsData.f79974f) && C41536l.m120484d(this.f79975g, activationDetailsData.f79975g) && C41536l.m120484d(this.f79976h, activationDetailsData.f79976h) && C41536l.m120484d(this.f79977i, activationDetailsData.f79977i) && C41536l.m120484d(this.f79978j, activationDetailsData.f79978j) && this.f79979k == activationDetailsData.f79979k && this.f79980l == activationDetailsData.f79980l && C41536l.m120484d(this.f79981m, activationDetailsData.f79981m) && this.f79982n == activationDetailsData.f79982n && C41536l.m120484d(this.f79983o, activationDetailsData.f79983o) && this.f79984p == activationDetailsData.f79984p;
    }

    /* renamed from: f */
    public final Long mo73321f() {
        return this.f79977i;
    }

    /* renamed from: g */
    public final CheckDecisionUiModel mo73322g() {
        return this.f79981m;
    }

    /* renamed from: h */
    public final String mo73323h() {
        return this.f79972d;
    }

    public int hashCode() {
        String str = this.f79972d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f79973e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f79974f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f79975g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f79976h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f79977i;
        if (l2 != null) {
            i = l2.hashCode();
        }
        int hashCode6 = (((hashCode5 + i) * 31) + this.f79978j.hashCode()) * 31;
        boolean z = this.f79979k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f79980l;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((i2 + (z2 ? 1 : 0)) * 31) + this.f79981m.hashCode()) * 31) + this.f79982n.hashCode()) * 31) + this.f79983o.hashCode()) * 31) + this.f79984p.hashCode();
    }

    /* renamed from: i */
    public final boolean mo73325i() {
        return this.f79979k;
    }

    /* renamed from: j */
    public final boolean mo73326j() {
        return this.f79980l;
    }

    /* renamed from: k */
    public final C37124a mo73327k() {
        return this.f79982n;
    }

    /* renamed from: l */
    public final String mo73328l() {
        return this.f79978j;
    }

    /* renamed from: m */
    public final String mo73329m() {
        return this.f79973e;
    }

    /* renamed from: p */
    public final String mo73330p() {
        return this.f79983o;
    }

    public String toString() {
        String str = this.f79972d;
        String str2 = this.f79973e;
        Long l = this.f79974f;
        String str3 = this.f79975g;
        String str4 = this.f79976h;
        Long l2 = this.f79977i;
        String str5 = this.f79978j;
        boolean z = this.f79979k;
        boolean z2 = this.f79980l;
        CheckDecisionUiModel checkDecisionUiModel = this.f79981m;
        C37124a aVar = this.f79982n;
        String str6 = this.f79983o;
        C39628a aVar2 = this.f79984p;
        return "ActivationDetailsData(decisionScheme=" + str + ", providerId=" + str2 + ", acctKey=" + l + ", acctNo=" + str3 + ", cardPan=" + str4 + ", decNo=" + l2 + ", limitId=" + str5 + ", hasLifeInsuranceToggled=" + z + ", hasPaymentInsuranceToggled=" + z2 + ", decision=" + checkDecisionUiModel + ", keys=" + aVar + ", rawRefinanceInfo=" + str6 + ", accessType=" + aVar2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f79972d);
        parcel.writeString(this.f79973e);
        Long l = this.f79974f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f79975g);
        parcel.writeString(this.f79976h);
        Long l2 = this.f79977i;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f79978j);
        parcel.writeInt(this.f79979k ? 1 : 0);
        parcel.writeInt(this.f79980l ? 1 : 0);
        this.f79981m.writeToParcel(parcel, i);
        parcel.writeString(this.f79982n.name());
        parcel.writeString(this.f79983o);
        parcel.writeString(this.f79984p.name());
    }
}

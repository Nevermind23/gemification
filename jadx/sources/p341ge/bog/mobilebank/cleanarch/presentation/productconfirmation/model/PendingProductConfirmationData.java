package p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p813kw.C25783a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData */
public final class PendingProductConfirmationData implements Parcelable {
    public static final Parcelable.Creator<PendingProductConfirmationData> CREATOR = new C22279b();

    /* renamed from: m */
    public static final C22278a f59104m = new C22278a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final long f59105d;

    /* renamed from: e */
    private final long f59106e;

    /* renamed from: f */
    private final String f59107f;

    /* renamed from: g */
    private final String f59108g;

    /* renamed from: h */
    private final String f59109h;

    /* renamed from: i */
    private final String f59110i;

    /* renamed from: j */
    private final boolean f59111j;

    /* renamed from: k */
    private final String f59112k;

    /* renamed from: l */
    private final String f59113l;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData$a */
    public static final class C22278a {
        private C22278a() {
        }

        public /* synthetic */ C22278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PendingProductConfirmationData mo55162a(C25783a aVar) {
            C41536l.m120489i(aVar, "p");
            return new PendingProductConfirmationData(aVar.mo64410f(), aVar.mo64411g(), aVar.mo64412h(), aVar.mo64406b(), aVar.mo64405a(), aVar.mo64408d(), aVar.mo64413i(), aVar.mo64409e(), aVar.mo64407c());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData$b */
    public static final class C22279b implements Parcelable.Creator {
        /* renamed from: a */
        public final PendingProductConfirmationData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PendingProductConfirmationData(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PendingProductConfirmationData[] newArray(int i) {
            return new PendingProductConfirmationData[i];
        }
    }

    public PendingProductConfirmationData(long j, long j2, String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        C41536l.m120489i(str, "responseKey");
        C41536l.m120489i(str2, "appType");
        C41536l.m120489i(str3, "appDetails");
        C41536l.m120489i(str4, "appTypeName");
        C41536l.m120489i(str5, "langCode");
        this.f59105d = j;
        this.f59106e = j2;
        this.f59107f = str;
        this.f59108g = str2;
        this.f59109h = str3;
        this.f59110i = str4;
        this.f59111j = z;
        this.f59112k = str5;
        this.f59113l = str6;
    }

    /* renamed from: a */
    public final String mo55153a() {
        return this.f59113l;
    }

    /* renamed from: b */
    public final String mo55154b() {
        return this.f59110i;
    }

    /* renamed from: d */
    public final long mo55155d() {
        return this.f59105d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo55157e() {
        return this.f59107f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingProductConfirmationData)) {
            return false;
        }
        PendingProductConfirmationData pendingProductConfirmationData = (PendingProductConfirmationData) obj;
        return this.f59105d == pendingProductConfirmationData.f59105d && this.f59106e == pendingProductConfirmationData.f59106e && C41536l.m120484d(this.f59107f, pendingProductConfirmationData.f59107f) && C41536l.m120484d(this.f59108g, pendingProductConfirmationData.f59108g) && C41536l.m120484d(this.f59109h, pendingProductConfirmationData.f59109h) && C41536l.m120484d(this.f59110i, pendingProductConfirmationData.f59110i) && this.f59111j == pendingProductConfirmationData.f59111j && C41536l.m120484d(this.f59112k, pendingProductConfirmationData.f59112k) && C41536l.m120484d(this.f59113l, pendingProductConfirmationData.f59113l);
    }

    public int hashCode() {
        int a = ((((((((((C7397t.m28148a(this.f59105d) * 31) + C7397t.m28148a(this.f59106e)) * 31) + this.f59107f.hashCode()) * 31) + this.f59108g.hashCode()) * 31) + this.f59109h.hashCode()) * 31) + this.f59110i.hashCode()) * 31;
        boolean z = this.f59111j;
        if (z) {
            z = true;
        }
        int hashCode = (((a + (z ? 1 : 0)) * 31) + this.f59112k.hashCode()) * 31;
        String str = this.f59113l;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f59105d;
        long j2 = this.f59106e;
        String str = this.f59107f;
        String str2 = this.f59108g;
        String str3 = this.f59109h;
        String str4 = this.f59110i;
        boolean z = this.f59111j;
        String str5 = this.f59112k;
        String str6 = this.f59113l;
        return "PendingProductConfirmationData(responseDetId=" + j + ", responseId=" + j2 + ", responseKey=" + str + ", appType=" + str2 + ", appDetails=" + str3 + ", appTypeName=" + str4 + ", verificationRequired=" + z + ", langCode=" + str5 + ", appTypeIconUrl=" + str6 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59105d);
        parcel.writeLong(this.f59106e);
        parcel.writeString(this.f59107f);
        parcel.writeString(this.f59108g);
        parcel.writeString(this.f59109h);
        parcel.writeString(this.f59110i);
        parcel.writeInt(this.f59111j ? 1 : 0);
        parcel.writeString(this.f59112k);
        parcel.writeString(this.f59113l);
    }
}

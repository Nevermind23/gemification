package p341ge.bog.mobilebank.shared.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.shared.actionsheet.TermsAgreementActionSheet$Data */
final class TermsAgreementActionSheet$Data implements Parcelable {
    public static final Parcelable.Creator<TermsAgreementActionSheet$Data> CREATOR = new C34629a();

    /* renamed from: d */
    private final StringSource f83675d;

    /* renamed from: e */
    private final StringSource f83676e;

    /* renamed from: f */
    private final StringSource f83677f;

    /* renamed from: g */
    private final StringSource f83678g;

    /* renamed from: h */
    private final StringSource f83679h;

    /* renamed from: i */
    private final boolean f83680i;

    /* renamed from: j */
    private final String f83681j;

    /* renamed from: ge.bog.mobilebank.shared.actionsheet.TermsAgreementActionSheet$Data$a */
    public static final class C34629a implements Parcelable.Creator {
        /* renamed from: a */
        public final TermsAgreementActionSheet$Data createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<TermsAgreementActionSheet$Data> cls = TermsAgreementActionSheet$Data.class;
            return new TermsAgreementActionSheet$Data((StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), (StringSource) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final TermsAgreementActionSheet$Data[] newArray(int i) {
            return new TermsAgreementActionSheet$Data[i];
        }
    }

    public TermsAgreementActionSheet$Data(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, StringSource stringSource4, StringSource stringSource5, boolean z, String str) {
        C41536l.m120489i(stringSource, "description");
        C41536l.m120489i(stringSource2, "title");
        C41536l.m120489i(stringSource3, "buttonText");
        C41536l.m120489i(stringSource4, "checkBoxLeadingText");
        C41536l.m120489i(str, "requestKey");
        this.f83675d = stringSource;
        this.f83676e = stringSource2;
        this.f83677f = stringSource3;
        this.f83678g = stringSource4;
        this.f83679h = stringSource5;
        this.f83680i = z;
        this.f83681j = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAgreementActionSheet$Data)) {
            return false;
        }
        TermsAgreementActionSheet$Data termsAgreementActionSheet$Data = (TermsAgreementActionSheet$Data) obj;
        return C41536l.m120484d(this.f83675d, termsAgreementActionSheet$Data.f83675d) && C41536l.m120484d(this.f83676e, termsAgreementActionSheet$Data.f83676e) && C41536l.m120484d(this.f83677f, termsAgreementActionSheet$Data.f83677f) && C41536l.m120484d(this.f83678g, termsAgreementActionSheet$Data.f83678g) && C41536l.m120484d(this.f83679h, termsAgreementActionSheet$Data.f83679h) && this.f83680i == termsAgreementActionSheet$Data.f83680i && C41536l.m120484d(this.f83681j, termsAgreementActionSheet$Data.f83681j);
    }

    public int hashCode() {
        int hashCode = ((((((this.f83675d.hashCode() * 31) + this.f83676e.hashCode()) * 31) + this.f83677f.hashCode()) * 31) + this.f83678g.hashCode()) * 31;
        StringSource stringSource = this.f83679h;
        int hashCode2 = (hashCode + (stringSource == null ? 0 : stringSource.hashCode())) * 31;
        boolean z = this.f83680i;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f83681j.hashCode();
    }

    public String toString() {
        StringSource stringSource = this.f83675d;
        StringSource stringSource2 = this.f83676e;
        StringSource stringSource3 = this.f83677f;
        StringSource stringSource4 = this.f83678g;
        StringSource stringSource5 = this.f83679h;
        boolean z = this.f83680i;
        String str = this.f83681j;
        return "Data(description=" + stringSource + ", title=" + stringSource2 + ", buttonText=" + stringSource3 + ", checkBoxLeadingText=" + stringSource4 + ", checkboxClickableText=" + stringSource5 + ", checkboxIsChecked=" + z + ", requestKey=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f83675d, i);
        parcel.writeParcelable(this.f83676e, i);
        parcel.writeParcelable(this.f83677f, i);
        parcel.writeParcelable(this.f83678g, i);
        parcel.writeParcelable(this.f83679h, i);
        parcel.writeInt(this.f83680i ? 1 : 0);
        parcel.writeString(this.f83681j);
    }
}

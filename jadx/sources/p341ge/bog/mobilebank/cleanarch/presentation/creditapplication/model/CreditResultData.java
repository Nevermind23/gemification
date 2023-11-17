package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p913uu.C28942h;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditResultData */
public final class CreditResultData implements Parcelable {
    public static final Parcelable.Creator<CreditResultData> CREATOR = new C21689a();

    /* renamed from: d */
    private final OfferProductCode f57902d;

    /* renamed from: e */
    private final String f57903e;

    /* renamed from: f */
    private final String f57904f;

    /* renamed from: g */
    private final String f57905g;

    /* renamed from: h */
    private final String f57906h;

    /* renamed from: i */
    private final List f57907i;

    /* renamed from: j */
    private final String f57908j;

    /* renamed from: k */
    private final C28942h f57909k;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditResultData$a */
    public static final class C21689a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditResultData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            OfferProductCode offerProductCode = (OfferProductCode) parcel.readParcelable(CreditResultData.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(CreditOfferRefinanceUiModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CreditResultData(offerProductCode, readString, readString2, readString3, readString4, arrayList, parcel.readString(), C28942h.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final CreditResultData[] newArray(int i) {
            return new CreditResultData[i];
        }
    }

    public CreditResultData(OfferProductCode offerProductCode, String str, String str2, String str3, String str4, List list, String str5, C28942h hVar) {
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(str2, "cardLimit");
        C41536l.m120489i(str3, "cardCcy");
        C41536l.m120489i(hVar, "operationType");
        this.f57902d = offerProductCode;
        this.f57903e = str;
        this.f57904f = str2;
        this.f57905g = str3;
        this.f57906h = str4;
        this.f57907i = list;
        this.f57908j = str5;
        this.f57909k = hVar;
    }

    /* renamed from: a */
    public final String mo54118a() {
        return this.f57905g;
    }

    /* renamed from: b */
    public final String mo54119b() {
        return this.f57904f;
    }

    /* renamed from: d */
    public final String mo54120d() {
        return this.f57906h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54122e() {
        return this.f57903e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditResultData)) {
            return false;
        }
        CreditResultData creditResultData = (CreditResultData) obj;
        return C41536l.m120484d(this.f57902d, creditResultData.f57902d) && C41536l.m120484d(this.f57903e, creditResultData.f57903e) && C41536l.m120484d(this.f57904f, creditResultData.f57904f) && C41536l.m120484d(this.f57905g, creditResultData.f57905g) && C41536l.m120484d(this.f57906h, creditResultData.f57906h) && C41536l.m120484d(this.f57907i, creditResultData.f57907i) && C41536l.m120484d(this.f57908j, creditResultData.f57908j) && this.f57909k == creditResultData.f57909k;
    }

    /* renamed from: f */
    public final OfferProductCode mo54124f() {
        return this.f57902d;
    }

    /* renamed from: g */
    public final C28942h mo54125g() {
        return this.f57909k;
    }

    /* renamed from: h */
    public final List mo54126h() {
        return this.f57907i;
    }

    public int hashCode() {
        int hashCode = this.f57902d.hashCode() * 31;
        String str = this.f57903e;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f57904f.hashCode()) * 31) + this.f57905g.hashCode()) * 31;
        String str2 = this.f57906h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f57907i;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f57908j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode4 + i) * 31) + this.f57909k.hashCode();
    }

    /* renamed from: i */
    public final String mo54128i() {
        return this.f57908j;
    }

    public String toString() {
        OfferProductCode offerProductCode = this.f57902d;
        String str = this.f57903e;
        String str2 = this.f57904f;
        String str3 = this.f57905g;
        String str4 = this.f57906h;
        List list = this.f57907i;
        String str5 = this.f57908j;
        C28942h hVar = this.f57909k;
        return "CreditResultData(limitCategory=" + offerProductCode + ", cardTypeDictionaryKey=" + str + ", cardLimit=" + str2 + ", cardCcy=" + str3 + ", cardType=" + str4 + ", refinanceInfo=" + list + ", serviceCenter=" + str5 + ", operationType=" + hVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f57902d, i);
        parcel.writeString(this.f57903e);
        parcel.writeString(this.f57904f);
        parcel.writeString(this.f57905g);
        parcel.writeString(this.f57906h);
        List<CreditOfferRefinanceUiModel> list = this.f57907i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (CreditOfferRefinanceUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f57908j);
        parcel.writeString(this.f57909k.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditResultData(OfferProductCode offerProductCode, String str, String str2, String str3, String str4, List list, String str5, C28942h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerProductCode, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, hVar);
    }
}

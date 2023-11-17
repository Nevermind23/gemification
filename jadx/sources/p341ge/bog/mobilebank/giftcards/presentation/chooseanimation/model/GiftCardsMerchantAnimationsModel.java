package p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel */
public final class GiftCardsMerchantAnimationsModel implements Parcelable {
    public static final Parcelable.Creator<GiftCardsMerchantAnimationsModel> CREATOR = new C24171a();

    /* renamed from: d */
    private final Long f62599d;

    /* renamed from: e */
    private final BigDecimal f62600e;

    /* renamed from: f */
    private final Long f62601f;

    /* renamed from: g */
    private final long f62602g;

    /* renamed from: h */
    private final String f62603h;

    /* renamed from: i */
    private final String f62604i;

    /* renamed from: j */
    private final List f62605j;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel$a */
    public static final class C24171a implements Parcelable.Creator {
        /* renamed from: a */
        public final GiftCardsMerchantAnimationsModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GiftCardsMerchantAnimationsModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final GiftCardsMerchantAnimationsModel[] newArray(int i) {
            return new GiftCardsMerchantAnimationsModel[i];
        }
    }

    public GiftCardsMerchantAnimationsModel(Long l, BigDecimal bigDecimal, Long l2, long j, String str, String str2, List list) {
        this.f62599d = l;
        this.f62600e = bigDecimal;
        this.f62601f = l2;
        this.f62602g = j;
        this.f62603h = str;
        this.f62604i = str2;
        this.f62605j = list;
    }

    /* renamed from: a */
    public final BigDecimal mo61771a() {
        return this.f62600e;
    }

    /* renamed from: b */
    public final Long mo61772b() {
        return this.f62601f;
    }

    /* renamed from: d */
    public final Long mo61773d() {
        return this.f62599d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo61775e() {
        return this.f62605j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardsMerchantAnimationsModel)) {
            return false;
        }
        GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel = (GiftCardsMerchantAnimationsModel) obj;
        return C41536l.m120484d(this.f62599d, giftCardsMerchantAnimationsModel.f62599d) && C41536l.m120484d(this.f62600e, giftCardsMerchantAnimationsModel.f62600e) && C41536l.m120484d(this.f62601f, giftCardsMerchantAnimationsModel.f62601f) && this.f62602g == giftCardsMerchantAnimationsModel.f62602g && C41536l.m120484d(this.f62603h, giftCardsMerchantAnimationsModel.f62603h) && C41536l.m120484d(this.f62604i, giftCardsMerchantAnimationsModel.f62604i) && C41536l.m120484d(this.f62605j, giftCardsMerchantAnimationsModel.f62605j);
    }

    /* renamed from: f */
    public final long mo61777f() {
        return this.f62602g;
    }

    /* renamed from: g */
    public final String mo61778g() {
        return this.f62604i;
    }

    /* renamed from: h */
    public final String mo61779h() {
        return this.f62603h;
    }

    public int hashCode() {
        Long l = this.f62599d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        BigDecimal bigDecimal = this.f62600e;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l2 = this.f62601f;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + C7397t.m28148a(this.f62602g)) * 31;
        String str = this.f62603h;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f62604i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f62605j;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f62599d;
        BigDecimal bigDecimal = this.f62600e;
        Long l2 = this.f62601f;
        long j = this.f62602g;
        String str = this.f62603h;
        String str2 = this.f62604i;
        List list = this.f62605j;
        return "GiftCardsMerchantAnimationsModel(giftCardId=" + l + ", availableAmount=" + bigDecimal + ", cardExpirationDate=" + l2 + ", offerId=" + j + ", offerName=" + str + ", offerLogoStorageUrl=" + str2 + ", offerBrandList=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f62599d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.f62600e);
        Long l2 = this.f62601f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeLong(this.f62602g);
        parcel.writeString(this.f62603h);
        parcel.writeString(this.f62604i);
        parcel.writeStringList(this.f62605j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GiftCardsMerchantAnimationsModel(Long l, BigDecimal bigDecimal, Long l2, long j, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : l2, j, str, str2, list);
    }
}

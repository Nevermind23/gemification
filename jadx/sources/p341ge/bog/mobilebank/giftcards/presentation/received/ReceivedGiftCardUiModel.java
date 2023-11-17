package p341ge.bog.mobilebank.giftcards.presentation.received;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel */
public final class ReceivedGiftCardUiModel implements Parcelable {
    public static final Parcelable.Creator<ReceivedGiftCardUiModel> CREATOR = new C24361a();

    /* renamed from: d */
    private final String f62913d;

    /* renamed from: e */
    private final long f62914e;

    /* renamed from: f */
    private final Image f62915f;

    /* renamed from: g */
    private final String f62916g;

    /* renamed from: h */
    private final List f62917h;

    /* renamed from: i */
    private final Image f62918i;

    /* renamed from: j */
    private final String f62919j;

    /* renamed from: k */
    private final String f62920k;

    /* renamed from: l */
    private final String f62921l;

    /* renamed from: m */
    private final String f62922m;

    /* renamed from: n */
    private final String f62923n;

    /* renamed from: o */
    private final List f62924o;

    /* renamed from: p */
    private final String f62925p;

    /* renamed from: q */
    private final boolean f62926q;

    /* renamed from: r */
    private final Boolean f62927r;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel$a */
    public static final class C24361a implements Parcelable.Creator {
        /* renamed from: a */
        public final ReceivedGiftCardUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            Class<ReceivedGiftCardUiModel> cls = ReceivedGiftCardUiModel.class;
            Image image = (Image) parcel2.readParcelable(cls.getClassLoader());
            String readString2 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel2.readParcelable(cls.getClassLoader()));
                }
            }
            Image image2 = (Image) parcel2.readParcelable(cls.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString8 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new ReceivedGiftCardUiModel(readString, readLong, image, readString2, arrayList, image2, readString3, readString4, readString5, readString6, readString7, createStringArrayList, readString8, z2, bool);
        }

        /* renamed from: b */
        public final ReceivedGiftCardUiModel[] newArray(int i) {
            return new ReceivedGiftCardUiModel[i];
        }
    }

    public ReceivedGiftCardUiModel(String str, long j, Image image, String str2, List list, Image image2, String str3, String str4, String str5, String str6, String str7, List list2, String str8, boolean z, Boolean bool) {
        Image image3 = image;
        Image image4 = image2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        List list3 = list2;
        C41536l.m120489i(str, "offerName");
        C41536l.m120489i(image3, "animationImage");
        C41536l.m120489i(image4, "merchantLogo");
        C41536l.m120489i(str9, "amountText");
        C41536l.m120489i(str10, "usedAmountText");
        C41536l.m120489i(str11, "giftText");
        C41536l.m120489i(str12, "sender");
        C41536l.m120489i(str13, "giftCardPaymentCode");
        C41536l.m120489i(list3, "offerBrandList");
        this.f62913d = str;
        this.f62914e = j;
        this.f62915f = image3;
        this.f62916g = str2;
        this.f62917h = list;
        this.f62918i = image4;
        this.f62919j = str9;
        this.f62920k = str10;
        this.f62921l = str11;
        this.f62922m = str12;
        this.f62923n = str13;
        this.f62924o = list3;
        this.f62925p = str8;
        this.f62926q = z;
        this.f62927r = bool;
    }

    /* renamed from: a */
    public final String mo62059a() {
        return this.f62919j;
    }

    /* renamed from: b */
    public final Image mo62060b() {
        return this.f62915f;
    }

    /* renamed from: d */
    public final long mo62061d() {
        return this.f62914e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo62063e() {
        return this.f62917h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedGiftCardUiModel)) {
            return false;
        }
        ReceivedGiftCardUiModel receivedGiftCardUiModel = (ReceivedGiftCardUiModel) obj;
        return C41536l.m120484d(this.f62913d, receivedGiftCardUiModel.f62913d) && this.f62914e == receivedGiftCardUiModel.f62914e && C41536l.m120484d(this.f62915f, receivedGiftCardUiModel.f62915f) && C41536l.m120484d(this.f62916g, receivedGiftCardUiModel.f62916g) && C41536l.m120484d(this.f62917h, receivedGiftCardUiModel.f62917h) && C41536l.m120484d(this.f62918i, receivedGiftCardUiModel.f62918i) && C41536l.m120484d(this.f62919j, receivedGiftCardUiModel.f62919j) && C41536l.m120484d(this.f62920k, receivedGiftCardUiModel.f62920k) && C41536l.m120484d(this.f62921l, receivedGiftCardUiModel.f62921l) && C41536l.m120484d(this.f62922m, receivedGiftCardUiModel.f62922m) && C41536l.m120484d(this.f62923n, receivedGiftCardUiModel.f62923n) && C41536l.m120484d(this.f62924o, receivedGiftCardUiModel.f62924o) && C41536l.m120484d(this.f62925p, receivedGiftCardUiModel.f62925p) && this.f62926q == receivedGiftCardUiModel.f62926q && C41536l.m120484d(this.f62927r, receivedGiftCardUiModel.f62927r);
    }

    /* renamed from: f */
    public final String mo62065f() {
        return this.f62916g;
    }

    /* renamed from: g */
    public final String mo62066g() {
        return this.f62921l;
    }

    /* renamed from: h */
    public final Image mo62067h() {
        return this.f62918i;
    }

    public int hashCode() {
        int hashCode = ((((this.f62913d.hashCode() * 31) + C7397t.m28148a(this.f62914e)) * 31) + this.f62915f.hashCode()) * 31;
        String str = this.f62916g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f62917h;
        int hashCode3 = (((((((((((((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f62918i.hashCode()) * 31) + this.f62919j.hashCode()) * 31) + this.f62920k.hashCode()) * 31) + this.f62921l.hashCode()) * 31) + this.f62922m.hashCode()) * 31) + this.f62923n.hashCode()) * 31) + this.f62924o.hashCode()) * 31;
        String str2 = this.f62925p;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.f62926q;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        Boolean bool = this.f62927r;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    /* renamed from: i */
    public final String mo62069i() {
        return this.f62922m;
    }

    /* renamed from: j */
    public final Boolean mo62070j() {
        return this.f62927r;
    }

    public String toString() {
        String str = this.f62913d;
        long j = this.f62914e;
        Image image = this.f62915f;
        String str2 = this.f62916g;
        List list = this.f62917h;
        Image image2 = this.f62918i;
        String str3 = this.f62919j;
        String str4 = this.f62920k;
        String str5 = this.f62921l;
        String str6 = this.f62922m;
        String str7 = this.f62923n;
        List list2 = this.f62924o;
        String str8 = this.f62925p;
        boolean z = this.f62926q;
        Boolean bool = this.f62927r;
        return "ReceivedGiftCardUiModel(offerName=" + str + ", cardId=" + j + ", animationImage=" + image + ", designJson=" + str2 + ", designGyro=" + list + ", merchantLogo=" + image2 + ", amountText=" + str3 + ", usedAmountText=" + str4 + ", giftText=" + str5 + ", sender=" + str6 + ", giftCardPaymentCode=" + str7 + ", offerBrandList=" + list2 + ", expirationDate=" + str8 + ", giveAwayPossible=" + z + ", isDark=" + bool + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f62913d);
        parcel.writeLong(this.f62914e);
        parcel.writeParcelable(this.f62915f, i);
        parcel.writeString(this.f62916g);
        List<Parcelable> list = this.f62917h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.f62918i, i);
        parcel.writeString(this.f62919j);
        parcel.writeString(this.f62920k);
        parcel.writeString(this.f62921l);
        parcel.writeString(this.f62922m);
        parcel.writeString(this.f62923n);
        parcel.writeStringList(this.f62924o);
        parcel.writeString(this.f62925p);
        parcel.writeInt(this.f62926q ? 1 : 0);
        Boolean bool = this.f62927r;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }
}

package p341ge.bog.mobilebank.payments.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentCard */
public final class PaymentCard implements Parcelable {
    public static final Parcelable.Creator<PaymentCard> CREATOR = new C33629a();

    /* renamed from: A */
    private final CardImage f81988A;

    /* renamed from: B */
    private final CardImage f81989B;

    /* renamed from: d */
    private final long f81990d;

    /* renamed from: e */
    private final String f81991e;

    /* renamed from: f */
    private final String f81992f;

    /* renamed from: g */
    private final String f81993g;

    /* renamed from: h */
    private final String f81994h;

    /* renamed from: i */
    private final Long f81995i;

    /* renamed from: j */
    private final String f81996j;

    /* renamed from: k */
    private final long f81997k;

    /* renamed from: l */
    private final String f81998l;

    /* renamed from: m */
    private final Long f81999m;

    /* renamed from: n */
    private final String f82000n;

    /* renamed from: o */
    private final String f82001o;

    /* renamed from: p */
    private final String f82002p;

    /* renamed from: q */
    private final BigDecimal f82003q;

    /* renamed from: r */
    private final BigDecimal f82004r;

    /* renamed from: s */
    private final boolean f82005s;

    /* renamed from: t */
    private final String f82006t;

    /* renamed from: u */
    private final String f82007u;

    /* renamed from: v */
    private final String f82008v;

    /* renamed from: w */
    private final String f82009w;

    /* renamed from: x */
    private final String f82010x;

    /* renamed from: y */
    private final String f82011y;

    /* renamed from: z */
    private final String f82012z;

    /* renamed from: ge.bog.mobilebank.payments.domain.model.PaymentCard$a */
    public static final class C33629a implements Parcelable.Creator {
        /* renamed from: a */
        public final PaymentCard createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            CardImage cardImage = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString5 = parcel.readString();
            long readLong2 = parcel.readLong();
            String readString6 = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            CardImage createFromParcel = parcel.readInt() == 0 ? null : CardImage.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                cardImage = CardImage.CREATOR.createFromParcel(parcel2);
            }
            return new PaymentCard(readLong, readString, readString2, readString3, readString4, valueOf, readString5, readLong2, readString6, valueOf2, readString7, readString8, readString9, bigDecimal, bigDecimal2, z, readString10, readString11, readString12, readString13, readString14, readString15, readString16, createFromParcel, cardImage);
        }

        /* renamed from: b */
        public final PaymentCard[] newArray(int i) {
            return new PaymentCard[i];
        }
    }

    public PaymentCard(long j, String str, String str2, String str3, String str4, Long l, String str5, long j2, String str6, Long l2, String str7, String str8, String str9, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, String str10, String str11, String str12, String str13, String str14, String str15, String str16, CardImage cardImage, CardImage cardImage2) {
        C41536l.m120489i(str5, "lastFour");
        this.f81990d = j;
        this.f81991e = str;
        this.f81992f = str2;
        this.f81993g = str3;
        this.f81994h = str4;
        this.f81995i = l;
        this.f81996j = str5;
        this.f81997k = j2;
        this.f81998l = str6;
        this.f81999m = l2;
        this.f82000n = str7;
        this.f82001o = str8;
        this.f82002p = str9;
        this.f82003q = bigDecimal;
        this.f82004r = bigDecimal2;
        this.f82005s = z;
        this.f82006t = str10;
        this.f82007u = str11;
        this.f82008v = str12;
        this.f82009w = str13;
        this.f82010x = str14;
        this.f82011y = str15;
        this.f82012z = str16;
        this.f81988A = cardImage;
        this.f81989B = cardImage2;
    }

    /* renamed from: a */
    public final BigDecimal mo80145a() {
        return this.f82004r;
    }

    /* renamed from: b */
    public final String mo80146b() {
        return this.f81991e;
    }

    /* renamed from: d */
    public final long mo80147d() {
        return this.f81990d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final CardImage mo80149e() {
        return this.f81988A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCard)) {
            return false;
        }
        PaymentCard paymentCard = (PaymentCard) obj;
        return this.f81990d == paymentCard.f81990d && C41536l.m120484d(this.f81991e, paymentCard.f81991e) && C41536l.m120484d(this.f81992f, paymentCard.f81992f) && C41536l.m120484d(this.f81993g, paymentCard.f81993g) && C41536l.m120484d(this.f81994h, paymentCard.f81994h) && C41536l.m120484d(this.f81995i, paymentCard.f81995i) && C41536l.m120484d(this.f81996j, paymentCard.f81996j) && this.f81997k == paymentCard.f81997k && C41536l.m120484d(this.f81998l, paymentCard.f81998l) && C41536l.m120484d(this.f81999m, paymentCard.f81999m) && C41536l.m120484d(this.f82000n, paymentCard.f82000n) && C41536l.m120484d(this.f82001o, paymentCard.f82001o) && C41536l.m120484d(this.f82002p, paymentCard.f82002p) && C41536l.m120484d(this.f82003q, paymentCard.f82003q) && C41536l.m120484d(this.f82004r, paymentCard.f82004r) && this.f82005s == paymentCard.f82005s && C41536l.m120484d(this.f82006t, paymentCard.f82006t) && C41536l.m120484d(this.f82007u, paymentCard.f82007u) && C41536l.m120484d(this.f82008v, paymentCard.f82008v) && C41536l.m120484d(this.f82009w, paymentCard.f82009w) && C41536l.m120484d(this.f82010x, paymentCard.f82010x) && C41536l.m120484d(this.f82011y, paymentCard.f82011y) && C41536l.m120484d(this.f82012z, paymentCard.f82012z) && C41536l.m120484d(this.f81988A, paymentCard.f81988A) && C41536l.m120484d(this.f81989B, paymentCard.f81989B);
    }

    /* renamed from: f */
    public final String mo80151f() {
        return this.f82002p;
    }

    /* renamed from: g */
    public final String mo80152g() {
        return this.f82008v;
    }

    /* renamed from: h */
    public final CardImage mo80153h() {
        return this.f81989B;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f81990d) * 31;
        String str = this.f81991e;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81992f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81993g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81994h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f81995i;
        int hashCode5 = (((((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.f81996j.hashCode()) * 31) + C7397t.m28148a(this.f81997k)) * 31;
        String str5 = this.f81998l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.f81999m;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.f82000n;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82001o;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82002p;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal = this.f82003q;
        int hashCode11 = (hashCode10 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f82004r;
        int hashCode12 = (hashCode11 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        boolean z = this.f82005s;
        if (z) {
            z = true;
        }
        int i2 = (hashCode12 + (z ? 1 : 0)) * 31;
        String str9 = this.f82006t;
        int hashCode13 = (i2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82007u;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f82008v;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f82009w;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f82010x;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f82011y;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f82012z;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        CardImage cardImage = this.f81988A;
        int hashCode20 = (hashCode19 + (cardImage == null ? 0 : cardImage.hashCode())) * 31;
        CardImage cardImage2 = this.f81989B;
        if (cardImage2 != null) {
            i = cardImage2.hashCode();
        }
        return hashCode20 + i;
    }

    /* renamed from: i */
    public final long mo80155i() {
        return this.f81997k;
    }

    /* renamed from: j */
    public final String mo80156j() {
        return this.f81996j;
    }

    /* renamed from: k */
    public final String mo80157k() {
        return this.f82001o;
    }

    /* renamed from: l */
    public final boolean mo80158l() {
        return this.f82005s;
    }

    public String toString() {
        long j = this.f81990d;
        String str = this.f81991e;
        String str2 = this.f81992f;
        String str3 = this.f81993g;
        String str4 = this.f81994h;
        Long l = this.f81995i;
        String str5 = this.f81996j;
        long j2 = this.f81997k;
        String str6 = this.f81998l;
        Long l2 = this.f81999m;
        String str7 = this.f82000n;
        String str8 = this.f82001o;
        String str9 = this.f82002p;
        BigDecimal bigDecimal = this.f82003q;
        BigDecimal bigDecimal2 = this.f82004r;
        boolean z = this.f82005s;
        String str10 = this.f82006t;
        String str11 = this.f82007u;
        String str12 = this.f82008v;
        String str13 = this.f82009w;
        String str14 = this.f82010x;
        String str15 = this.f82011y;
        String str16 = this.f82012z;
        CardImage cardImage = this.f81988A;
        CardImage cardImage2 = this.f81989B;
        return "PaymentCard(cardId=" + j + ", cardClass=" + str + ", cardType=" + str2 + ", productCode=" + str3 + ", subProductCode=" + str4 + ", clientKey=" + l + ", lastFour=" + str5 + ", expDate=" + j2 + ", mainCur=" + str6 + ", acctKey=" + l2 + ", ccy=" + str7 + ", pan2=" + str8 + ", cardName=" + str9 + ", availableAmount=" + bigDecimal + ", availableAmountBaseCcy=" + bigDecimal2 + ", isDefault=" + z + ", isHidden=" + str10 + ", groupCode=" + str11 + ", cardNameDictionaryKey=" + str12 + ", extMerchantId=" + str13 + ", isLocalCard=" + str14 + ", cardData=" + str15 + ", paymentCardType=" + str16 + ", cardImage=" + cardImage + ", cardSmallImage=" + cardImage2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81990d);
        parcel.writeString(this.f81991e);
        parcel.writeString(this.f81992f);
        parcel.writeString(this.f81993g);
        parcel.writeString(this.f81994h);
        Long l = this.f81995i;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f81996j);
        parcel.writeLong(this.f81997k);
        parcel.writeString(this.f81998l);
        Long l2 = this.f81999m;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f82000n);
        parcel.writeString(this.f82001o);
        parcel.writeString(this.f82002p);
        parcel.writeSerializable(this.f82003q);
        parcel.writeSerializable(this.f82004r);
        parcel.writeInt(this.f82005s ? 1 : 0);
        parcel.writeString(this.f82006t);
        parcel.writeString(this.f82007u);
        parcel.writeString(this.f82008v);
        parcel.writeString(this.f82009w);
        parcel.writeString(this.f82010x);
        parcel.writeString(this.f82011y);
        parcel.writeString(this.f82012z);
        CardImage cardImage = this.f81988A;
        if (cardImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardImage.writeToParcel(parcel, i);
        }
        CardImage cardImage2 = this.f81989B;
        if (cardImage2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        cardImage2.writeToParcel(parcel, i);
    }
}

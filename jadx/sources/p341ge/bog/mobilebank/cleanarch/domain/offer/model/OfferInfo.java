package p341ge.bog.mobilebank.cleanarch.domain.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo */
public final class OfferInfo implements Parcelable {
    public static final Parcelable.Creator<OfferInfo> CREATOR = new C20998a();
    private final String attachmentFileBase64;
    private final boolean displayBannerOnHome;
    private final String effectiveInterestRate;
    private final String extraCode;
    private final boolean hasPromotion;

    /* renamed from: id */
    private final long f56461id;
    private final String langCode;
    private final String offerAmount;
    private final String offerCcy;
    private final String offerNo;
    private final String offerProduct;
    private final C20999b offerScheme;
    private final String offerText;
    private final String operType;
    private final Integer orderNo;
    private final OfferProductCode productCode;
    private final String productName;
    private final String productText;
    private final OfferProductType productType;
    private final String requestedAmount;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo$a */
    public static final class C20998a implements Parcelable.Creator {
        /* renamed from: a */
        public final OfferInfo createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            Class<OfferInfo> cls = OfferInfo.class;
            return new OfferInfo(parcel.readLong(), parcel.readString(), (OfferProductType) parcel2.readParcelable(cls.getClassLoader()), (OfferProductCode) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), C20999b.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final OfferInfo[] newArray(int i) {
            return new OfferInfo[i];
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo$b */
    public enum C20999b {
        BNPL,
        UNKNOWN
    }

    public OfferInfo(long j, String str, OfferProductType offerProductType, OfferProductCode offerProductCode, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, boolean z, String str11, String str12, boolean z2, String str13, C20999b bVar) {
        String str14 = str9;
        String str15 = str10;
        String str16 = str12;
        C20999b bVar2 = bVar;
        C41536l.m120489i(offerProductCode, "productCode");
        C41536l.m120489i(str14, "offerNo");
        C41536l.m120489i(str15, "effectiveInterestRate");
        C41536l.m120489i(str16, "offerCcy");
        C41536l.m120489i(bVar2, "offerScheme");
        this.f56461id = j;
        this.langCode = str;
        this.productType = offerProductType;
        this.productCode = offerProductCode;
        this.productName = str2;
        this.productText = str3;
        this.offerText = str4;
        this.offerProduct = str5;
        this.operType = str6;
        this.extraCode = str7;
        this.attachmentFileBase64 = str8;
        this.offerNo = str14;
        this.orderNo = num;
        this.effectiveInterestRate = str15;
        this.hasPromotion = z;
        this.offerAmount = str11;
        this.offerCcy = str16;
        this.displayBannerOnHome = z2;
        this.requestedAmount = str13;
        this.offerScheme = bVar2;
    }

    public static /* synthetic */ OfferInfo copy$default(OfferInfo offerInfo, long j, String str, OfferProductType offerProductType, OfferProductCode offerProductCode, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, boolean z, String str11, String str12, boolean z2, String str13, C20999b bVar, int i, Object obj) {
        OfferInfo offerInfo2 = offerInfo;
        int i2 = i;
        return offerInfo.copy((i2 & 1) != 0 ? offerInfo2.f56461id : j, (i2 & 2) != 0 ? offerInfo2.langCode : str, (i2 & 4) != 0 ? offerInfo2.productType : offerProductType, (i2 & 8) != 0 ? offerInfo2.productCode : offerProductCode, (i2 & 16) != 0 ? offerInfo2.productName : str2, (i2 & 32) != 0 ? offerInfo2.productText : str3, (i2 & 64) != 0 ? offerInfo2.offerText : str4, (i2 & 128) != 0 ? offerInfo2.offerProduct : str5, (i2 & C11398b.f33139r) != 0 ? offerInfo2.operType : str6, (i2 & C11398b.f33140s) != 0 ? offerInfo2.extraCode : str7, (i2 & C11398b.f33141t) != 0 ? offerInfo2.attachmentFileBase64 : str8, (i2 & C11398b.f33142u) != 0 ? offerInfo2.offerNo : str9, (i2 & C11398b.f33143v) != 0 ? offerInfo2.orderNo : num, (i2 & 8192) != 0 ? offerInfo2.effectiveInterestRate : str10, (i2 & 16384) != 0 ? offerInfo2.hasPromotion : z, (i2 & 32768) != 0 ? offerInfo2.offerAmount : str11, (i2 & 65536) != 0 ? offerInfo2.offerCcy : str12, (i2 & 131072) != 0 ? offerInfo2.displayBannerOnHome : z2, (i2 & 262144) != 0 ? offerInfo2.requestedAmount : str13, (i2 & 524288) != 0 ? offerInfo2.offerScheme : bVar);
    }

    public final long component1() {
        return this.f56461id;
    }

    public final String component10() {
        return this.extraCode;
    }

    public final String component11() {
        return this.attachmentFileBase64;
    }

    public final String component12() {
        return this.offerNo;
    }

    public final Integer component13() {
        return this.orderNo;
    }

    public final String component14() {
        return this.effectiveInterestRate;
    }

    public final boolean component15() {
        return this.hasPromotion;
    }

    public final String component16() {
        return this.offerAmount;
    }

    public final String component17() {
        return this.offerCcy;
    }

    public final boolean component18() {
        return this.displayBannerOnHome;
    }

    public final String component19() {
        return this.requestedAmount;
    }

    public final String component2() {
        return this.langCode;
    }

    public final C20999b component20() {
        return this.offerScheme;
    }

    public final OfferProductType component3() {
        return this.productType;
    }

    public final OfferProductCode component4() {
        return this.productCode;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.productText;
    }

    public final String component7() {
        return this.offerText;
    }

    public final String component8() {
        return this.offerProduct;
    }

    public final String component9() {
        return this.operType;
    }

    public final OfferInfo copy(long j, String str, OfferProductType offerProductType, OfferProductCode offerProductCode, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, boolean z, String str11, String str12, boolean z2, String str13, C20999b bVar) {
        long j2 = j;
        C41536l.m120489i(offerProductCode, "productCode");
        C41536l.m120489i(str9, "offerNo");
        C41536l.m120489i(str10, "effectiveInterestRate");
        C41536l.m120489i(str12, "offerCcy");
        C41536l.m120489i(bVar, "offerScheme");
        return new OfferInfo(j, str, offerProductType, offerProductCode, str2, str3, str4, str5, str6, str7, str8, str9, num, str10, z, str11, str12, z2, str13, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferInfo)) {
            return false;
        }
        OfferInfo offerInfo = (OfferInfo) obj;
        return this.f56461id == offerInfo.f56461id && C41536l.m120484d(this.langCode, offerInfo.langCode) && C41536l.m120484d(this.productType, offerInfo.productType) && C41536l.m120484d(this.productCode, offerInfo.productCode) && C41536l.m120484d(this.productName, offerInfo.productName) && C41536l.m120484d(this.productText, offerInfo.productText) && C41536l.m120484d(this.offerText, offerInfo.offerText) && C41536l.m120484d(this.offerProduct, offerInfo.offerProduct) && C41536l.m120484d(this.operType, offerInfo.operType) && C41536l.m120484d(this.extraCode, offerInfo.extraCode) && C41536l.m120484d(this.attachmentFileBase64, offerInfo.attachmentFileBase64) && C41536l.m120484d(this.offerNo, offerInfo.offerNo) && C41536l.m120484d(this.orderNo, offerInfo.orderNo) && C41536l.m120484d(this.effectiveInterestRate, offerInfo.effectiveInterestRate) && this.hasPromotion == offerInfo.hasPromotion && C41536l.m120484d(this.offerAmount, offerInfo.offerAmount) && C41536l.m120484d(this.offerCcy, offerInfo.offerCcy) && this.displayBannerOnHome == offerInfo.displayBannerOnHome && C41536l.m120484d(this.requestedAmount, offerInfo.requestedAmount) && this.offerScheme == offerInfo.offerScheme;
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final boolean getDisplayBannerOnHome() {
        return this.displayBannerOnHome;
    }

    public final String getEffectiveInterestRate() {
        return this.effectiveInterestRate;
    }

    public final String getExtraCode() {
        return this.extraCode;
    }

    public final boolean getHasPromotion() {
        return this.hasPromotion;
    }

    public final long getId() {
        return this.f56461id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getOfferAmount() {
        return this.offerAmount;
    }

    public final String getOfferCcy() {
        return this.offerCcy;
    }

    public final String getOfferNo() {
        return this.offerNo;
    }

    public final String getOfferProduct() {
        return this.offerProduct;
    }

    public final C20999b getOfferScheme() {
        return this.offerScheme;
    }

    public final String getOfferText() {
        return this.offerText;
    }

    public final String getOperType() {
        return this.operType;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final OfferProductCode getProductCode() {
        return this.productCode;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductText() {
        return this.productText;
    }

    public final OfferProductType getProductType() {
        return this.productType;
    }

    public final String getRequestedAmount() {
        return this.requestedAmount;
    }

    public final String getUID() {
        String str;
        int i;
        OfferProductType offerProductType = this.productType;
        if (offerProductType == null || (str = offerProductType.mo52056a()) == null) {
            str = "productType";
        }
        String a = this.productCode.mo51954a();
        String str2 = this.offerText;
        if (str2 != null) {
            i = str2.hashCode();
        } else {
            i = 0;
        }
        return str + "#" + a + "#" + i;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56461id) * 31;
        String str = this.langCode;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        OfferProductType offerProductType = this.productType;
        int hashCode2 = (((hashCode + (offerProductType == null ? 0 : offerProductType.hashCode())) * 31) + this.productCode.hashCode()) * 31;
        String str2 = this.productName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerProduct;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.operType;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.extraCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.attachmentFileBase64;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.offerNo.hashCode()) * 31;
        Integer num = this.orderNo;
        int hashCode10 = (((hashCode9 + (num == null ? 0 : num.hashCode())) * 31) + this.effectiveInterestRate.hashCode()) * 31;
        boolean z = this.hasPromotion;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode10 + (z ? 1 : 0)) * 31;
        String str9 = this.offerAmount;
        int hashCode11 = (((i2 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.offerCcy.hashCode()) * 31;
        boolean z3 = this.displayBannerOnHome;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode11 + (z2 ? 1 : 0)) * 31;
        String str10 = this.requestedAmount;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return ((i3 + i) * 31) + this.offerScheme.hashCode();
    }

    public String toString() {
        long j = this.f56461id;
        String str = this.langCode;
        OfferProductType offerProductType = this.productType;
        OfferProductCode offerProductCode = this.productCode;
        String str2 = this.productName;
        String str3 = this.productText;
        String str4 = this.offerText;
        String str5 = this.offerProduct;
        String str6 = this.operType;
        String str7 = this.extraCode;
        String str8 = this.attachmentFileBase64;
        String str9 = this.offerNo;
        Integer num = this.orderNo;
        String str10 = this.effectiveInterestRate;
        boolean z = this.hasPromotion;
        String str11 = this.offerAmount;
        String str12 = this.offerCcy;
        boolean z2 = this.displayBannerOnHome;
        String str13 = this.requestedAmount;
        C20999b bVar = this.offerScheme;
        return "OfferInfo(id=" + j + ", langCode=" + str + ", productType=" + offerProductType + ", productCode=" + offerProductCode + ", productName=" + str2 + ", productText=" + str3 + ", offerText=" + str4 + ", offerProduct=" + str5 + ", operType=" + str6 + ", extraCode=" + str7 + ", attachmentFileBase64=" + str8 + ", offerNo=" + str9 + ", orderNo=" + num + ", effectiveInterestRate=" + str10 + ", hasPromotion=" + z + ", offerAmount=" + str11 + ", offerCcy=" + str12 + ", displayBannerOnHome=" + z2 + ", requestedAmount=" + str13 + ", offerScheme=" + bVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56461id);
        parcel.writeString(this.langCode);
        parcel.writeParcelable(this.productType, i);
        parcel.writeParcelable(this.productCode, i);
        parcel.writeString(this.productName);
        parcel.writeString(this.productText);
        parcel.writeString(this.offerText);
        parcel.writeString(this.offerProduct);
        parcel.writeString(this.operType);
        parcel.writeString(this.extraCode);
        parcel.writeString(this.attachmentFileBase64);
        parcel.writeString(this.offerNo);
        Integer num = this.orderNo;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.effectiveInterestRate);
        parcel.writeInt(this.hasPromotion ? 1 : 0);
        parcel.writeString(this.offerAmount);
        parcel.writeString(this.offerCcy);
        parcel.writeInt(this.displayBannerOnHome ? 1 : 0);
        parcel.writeString(this.requestedAmount);
        parcel.writeString(this.offerScheme.name());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferInfo(long r26, java.lang.String r28, p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType r29, p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.Integer r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo.C20999b r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r28
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r29
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r31
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r32
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r33
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r34
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r35
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r14 = r2
            goto L_0x0043
        L_0x0041:
            r14 = r36
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r15 = r2
            goto L_0x004b
        L_0x0049:
            r15 = r37
        L_0x004b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0052
            r17 = r2
            goto L_0x0054
        L_0x0052:
            r17 = r39
        L_0x0054:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005c
            r23 = r2
            goto L_0x005e
        L_0x005c:
            r23 = r45
        L_0x005e:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0068
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo$b r0 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo.C20999b.UNKNOWN
            r24 = r0
            goto L_0x006a
        L_0x0068:
            r24 = r46
        L_0x006a:
            r3 = r25
            r4 = r26
            r8 = r30
            r16 = r38
            r18 = r40
            r19 = r41
            r20 = r42
            r21 = r43
            r22 = r44
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo.<init>(long, java.lang.String, ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType, ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

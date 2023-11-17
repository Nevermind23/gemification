package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

/* renamed from: ge.bog.mobilebank.model.CardApplicationDetails */
public final class CardApplicationDetails implements Parcelable {
    public static final Parcelable.Creator<CardApplicationDetails> CREATOR = new Creator();
    public final String activationDepartment;
    public final long appId;
    public final String appNo;
    public final Long appRegDate;
    public final String appType;
    public final long cardAppId;
    public final String cardClass;
    public final String cardNameKey;
    public final String cardPeriod;
    public final String cardStatus;
    public final String cardStatusKey;
    public final String cardType;
    public final long clientKey;
    public final YesNoApiEntity closeFlag;
    public final String creditLimit;
    public final String creditLimitCcy;
    public final String csAddress;
    public final String csOwnerFirstName;
    public final String csOwnerLastName;
    public final String csOwnerPhoneNumber;
    public final String designCode;
    public final String dictionaryKey;
    public final Long expDate;
    public final String feeAmount;
    public final String feeCcy;
    public final String mainAcctNo;
    public final String mainCurrency;
    public final String nameOnCard;
    public final String pinDeliveryPhone;
    public final String pinDeliveryType;
    public final String pinDeliveryTypeKey;
    public final String prodGroup;
    public final String scAddress;
    public final String scheme;
    public final String status;
    public final String statusDescKey;
    public final String subProductCode;
    public final String subProductDictionaryKey;

    /* renamed from: ge.bog.mobilebank.model.CardApplicationDetails$Creator */
    public static final class Creator implements Parcelable.Creator<CardApplicationDetails> {
        public final CardApplicationDetails createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardApplicationDetails(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : YesNoApiEntity.valueOf(parcel.readString()));
        }

        public final CardApplicationDetails[] newArray(int i) {
            return new CardApplicationDetails[i];
        }
    }

    public CardApplicationDetails(long j, String str, String str2, String str3, long j2, long j3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l, Long l2, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str4, "nameOnCard");
        this.appId = j;
        this.prodGroup = str;
        this.appType = str2;
        this.status = str3;
        this.clientKey = j2;
        this.cardAppId = j3;
        this.nameOnCard = str4;
        this.cardClass = str5;
        this.cardType = str6;
        this.activationDepartment = str7;
        this.mainCurrency = str8;
        this.mainAcctNo = str9;
        this.creditLimit = str10;
        this.creditLimitCcy = str11;
        this.appNo = str12;
        this.scheme = str13;
        this.designCode = str14;
        this.feeAmount = str15;
        this.feeCcy = str16;
        this.expDate = l;
        this.appRegDate = l2;
        this.cardPeriod = str17;
        this.cardStatus = str18;
        this.subProductCode = str19;
        this.subProductDictionaryKey = str20;
        this.dictionaryKey = str21;
        this.cardStatusKey = str22;
        this.statusDescKey = str23;
        this.scAddress = str24;
        this.cardNameKey = str25;
        this.pinDeliveryTypeKey = str26;
        this.pinDeliveryPhone = str27;
        this.pinDeliveryType = str28;
        this.csOwnerFirstName = str29;
        this.csOwnerLastName = str30;
        this.csOwnerPhoneNumber = str31;
        this.csAddress = str32;
        this.closeFlag = yesNoApiEntity;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean isCloseFlag() {
        return this.closeFlag == YesNoApiEntity.YES;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.appId);
        parcel.writeString(this.prodGroup);
        parcel.writeString(this.appType);
        parcel.writeString(this.status);
        parcel.writeLong(this.clientKey);
        parcel.writeLong(this.cardAppId);
        parcel.writeString(this.nameOnCard);
        parcel.writeString(this.cardClass);
        parcel.writeString(this.cardType);
        parcel.writeString(this.activationDepartment);
        parcel.writeString(this.mainCurrency);
        parcel.writeString(this.mainAcctNo);
        parcel.writeString(this.creditLimit);
        parcel.writeString(this.creditLimitCcy);
        parcel.writeString(this.appNo);
        parcel.writeString(this.scheme);
        parcel.writeString(this.designCode);
        parcel.writeString(this.feeAmount);
        parcel.writeString(this.feeCcy);
        Long l = this.expDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.appRegDate;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.cardPeriod);
        parcel.writeString(this.cardStatus);
        parcel.writeString(this.subProductCode);
        parcel.writeString(this.subProductDictionaryKey);
        parcel.writeString(this.dictionaryKey);
        parcel.writeString(this.cardStatusKey);
        parcel.writeString(this.statusDescKey);
        parcel.writeString(this.scAddress);
        parcel.writeString(this.cardNameKey);
        parcel.writeString(this.pinDeliveryTypeKey);
        parcel.writeString(this.pinDeliveryPhone);
        parcel.writeString(this.pinDeliveryType);
        parcel.writeString(this.csOwnerFirstName);
        parcel.writeString(this.csOwnerLastName);
        parcel.writeString(this.csOwnerPhoneNumber);
        parcel.writeString(this.csAddress);
        YesNoApiEntity yesNoApiEntity = this.closeFlag;
        if (yesNoApiEntity == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(yesNoApiEntity.name());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardApplicationDetails(long r47, java.lang.String r49, java.lang.String r50, java.lang.String r51, long r52, long r54, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.Long r69, java.lang.Long r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r87, int r88, int r89, kotlin.jvm.internal.DefaultConstructorMarker r90) {
        /*
            r46 = this;
            r0 = r88
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r5 = r2
            goto L_0x000c
        L_0x000a:
            r5 = r47
        L_0x000c:
            r1 = r0 & 2
            r4 = 0
            if (r1 == 0) goto L_0x0013
            r7 = r4
            goto L_0x0015
        L_0x0013:
            r7 = r49
        L_0x0015:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            r8 = r4
            goto L_0x001d
        L_0x001b:
            r8 = r50
        L_0x001d:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0023
            r9 = r4
            goto L_0x0025
        L_0x0023:
            r9 = r51
        L_0x0025:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002b
            r10 = r2
            goto L_0x002d
        L_0x002b:
            r10 = r52
        L_0x002d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0033
            r12 = r2
            goto L_0x0035
        L_0x0033:
            r12 = r54
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r15 = r4
            goto L_0x003d
        L_0x003b:
            r15 = r57
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0044
            r16 = r4
            goto L_0x0046
        L_0x0044:
            r16 = r58
        L_0x0046:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004d
            r17 = r4
            goto L_0x004f
        L_0x004d:
            r17 = r59
        L_0x004f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0056
            r18 = r4
            goto L_0x0058
        L_0x0056:
            r18 = r60
        L_0x0058:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005f
            r19 = r4
            goto L_0x0061
        L_0x005f:
            r19 = r61
        L_0x0061:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0068
            r20 = r4
            goto L_0x006a
        L_0x0068:
            r20 = r62
        L_0x006a:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0071
            r21 = r4
            goto L_0x0073
        L_0x0071:
            r21 = r63
        L_0x0073:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007a
            r22 = r4
            goto L_0x007c
        L_0x007a:
            r22 = r64
        L_0x007c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0085
            r23 = r4
            goto L_0x0087
        L_0x0085:
            r23 = r65
        L_0x0087:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008f
            r24 = r4
            goto L_0x0091
        L_0x008f:
            r24 = r66
        L_0x0091:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0099
            r25 = r4
            goto L_0x009b
        L_0x0099:
            r25 = r67
        L_0x009b:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a3
            r26 = r4
            goto L_0x00a5
        L_0x00a3:
            r26 = r68
        L_0x00a5:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00ad
            r27 = r4
            goto L_0x00af
        L_0x00ad:
            r27 = r69
        L_0x00af:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b7
            r28 = r4
            goto L_0x00b9
        L_0x00b7:
            r28 = r70
        L_0x00b9:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c1
            r29 = r4
            goto L_0x00c3
        L_0x00c1:
            r29 = r71
        L_0x00c3:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00cb
            r30 = r4
            goto L_0x00cd
        L_0x00cb:
            r30 = r72
        L_0x00cd:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d5
            r31 = r4
            goto L_0x00d7
        L_0x00d5:
            r31 = r73
        L_0x00d7:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00df
            r32 = r4
            goto L_0x00e1
        L_0x00df:
            r32 = r74
        L_0x00e1:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e9
            r33 = r4
            goto L_0x00eb
        L_0x00e9:
            r33 = r75
        L_0x00eb:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00f3
            r34 = r4
            goto L_0x00f5
        L_0x00f3:
            r34 = r76
        L_0x00f5:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00fd
            r35 = r4
            goto L_0x00ff
        L_0x00fd:
            r35 = r77
        L_0x00ff:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0107
            r36 = r4
            goto L_0x0109
        L_0x0107:
            r36 = r78
        L_0x0109:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0111
            r37 = r4
            goto L_0x0113
        L_0x0111:
            r37 = r79
        L_0x0113:
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x011b
            r38 = r4
            goto L_0x011d
        L_0x011b:
            r38 = r80
        L_0x011d:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0125
            r39 = r4
            goto L_0x0127
        L_0x0125:
            r39 = r81
        L_0x0127:
            r0 = r89 & 1
            if (r0 == 0) goto L_0x012e
            r40 = r4
            goto L_0x0130
        L_0x012e:
            r40 = r82
        L_0x0130:
            r0 = r89 & 2
            if (r0 == 0) goto L_0x0137
            r41 = r4
            goto L_0x0139
        L_0x0137:
            r41 = r83
        L_0x0139:
            r0 = r89 & 4
            if (r0 == 0) goto L_0x0140
            r42 = r4
            goto L_0x0142
        L_0x0140:
            r42 = r84
        L_0x0142:
            r0 = r89 & 8
            if (r0 == 0) goto L_0x0149
            r43 = r4
            goto L_0x014b
        L_0x0149:
            r43 = r85
        L_0x014b:
            r0 = r89 & 16
            if (r0 == 0) goto L_0x0152
            r44 = r4
            goto L_0x0154
        L_0x0152:
            r44 = r86
        L_0x0154:
            r0 = r89 & 32
            if (r0 == 0) goto L_0x015b
            r45 = r4
            goto L_0x015d
        L_0x015b:
            r45 = r87
        L_0x015d:
            r4 = r46
            r14 = r56
            r4.<init>(r5, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.CardApplicationDetails.<init>(long, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

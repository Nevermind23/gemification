package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import g91.C32289b0;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.ImageSource;
import p411em.C12487d;
import p537nm.C17075c0;
import p537nm.C17078d0;
import p709au.C19277a;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel */
public final class DebitCardUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardUiModel> CREATOR = new C14224a();
    private final String advantagesKey;
    private final String appType;
    private final List<String> cardAdditionalParams;
    private final List<CardBenefitUiModel> cardBenefits;
    private final String cardDetailsKey;
    private final String cardLimitCheck;
    private final String cardNameKey;
    private final String cardNameValue;
    private final String cardPriceKey;
    private final String cardPriceValue;
    private final CardSmallImageUiModel cardSmallImage;
    private final List<CardSubTypeUiModel> cardSubTypes;
    private final List<ScoolCardOwnerUiModel> clientChildren;
    private final List<DebitCardPayrollInfoUiModel> clientPayrollInfo;
    private final boolean csFlag;
    private final String customDesignFlag;
    private final C17078d0 defaultCard;
    private final String designId;
    private final String detailsUrl;
    private final String digitalCardFlag;
    private final String digitalCardPriceKey;
    private final String digitalCardPriceValue;
    private final String expDateKey;
    private final boolean hasConciergeFlag;
    private final String isCreditCard;
    private final boolean isStudentCard;
    private final long linkId;
    private final String minAmountKey;
    private final String objectUrl;
    private final String plcClass;
    private final boolean plcSchoolFlag;
    private final String plcType;
    private final String prodGroup;
    private final String product;
    private final String regionId;
    private final String subProductCode;
    private final DebitCardTextContainerUiModel texts;
    private final String typeName;
    private final String useClientNickname;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel$a */
    public static final class C14224a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardUiModel createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            long readLong = parcel.readLong();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            DebitCardTextContainerUiModel createFromParcel = DebitCardTextContainerUiModel.CREATOR.createFromParcel(parcel2);
            CardSmallImageUiModel cardSmallImageUiModel = null;
            if (parcel.readInt() == 0) {
                z = z2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                z = z2;
                int i = 0;
                while (i != readInt) {
                    arrayList2.add(CardSubTypeUiModel.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            boolean z3 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            ArrayList arrayList4 = arrayList;
            int i2 = 0;
            while (i2 != readInt2) {
                arrayList3.add(DebitCardPayrollInfoUiModel.CREATOR.createFromParcel(parcel2));
                i2++;
                readInt2 = readInt2;
            }
            String readString22 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            String str = readString22;
            ArrayList arrayList5 = new ArrayList(readInt3);
            ArrayList arrayList6 = arrayList3;
            int i3 = 0;
            while (i3 != readInt3) {
                arrayList5.add(ScoolCardOwnerUiModel.CREATOR.createFromParcel(parcel2));
                i3++;
                readInt3 = readInt3;
            }
            String readString23 = parcel.readString();
            if (parcel.readInt() != 0) {
                cardSmallImageUiModel = CardSmallImageUiModel.CREATOR.createFromParcel(parcel2);
            }
            CardSmallImageUiModel cardSmallImageUiModel2 = cardSmallImageUiModel;
            C17078d0 valueOf = C17078d0.valueOf(parcel.readString());
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            boolean z5 = parcel.readInt() != 0;
            String readString26 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt4 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt4);
            ArrayList arrayList8 = arrayList5;
            int i4 = 0;
            while (i4 != readInt4) {
                arrayList7.add(CardBenefitUiModel.CREATOR.createFromParcel(parcel2));
                i4++;
                readInt4 = readInt4;
            }
            return new DebitCardUiModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, readLong, readString8, readString9, readString10, z, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, createFromParcel, arrayList4, z3, arrayList6, str, z4, arrayList8, readString23, cardSmallImageUiModel2, valueOf, readString24, readString25, z5, readString26, createStringArrayList, arrayList7);
        }

        /* renamed from: b */
        public final DebitCardUiModel[] newArray(int i) {
            return new DebitCardUiModel[i];
        }
    }

    public DebitCardUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerUiModel debitCardTextContainerUiModel, List<CardSubTypeUiModel> list, boolean z2, List<DebitCardPayrollInfoUiModel> list2, String str22, boolean z3, List<ScoolCardOwnerUiModel> list3, String str23, CardSmallImageUiModel cardSmallImageUiModel, C17078d0 d0Var, String str24, String str25, boolean z4, String str26, List<String> list4, List<CardBenefitUiModel> list5) {
        String str27 = str;
        String str28 = str2;
        String str29 = str3;
        String str30 = str4;
        String str31 = str5;
        String str32 = str6;
        String str33 = str7;
        String str34 = str8;
        String str35 = str9;
        String str36 = str16;
        DebitCardTextContainerUiModel debitCardTextContainerUiModel2 = debitCardTextContainerUiModel;
        List<DebitCardPayrollInfoUiModel> list6 = list2;
        List<ScoolCardOwnerUiModel> list7 = list3;
        C17078d0 d0Var2 = d0Var;
        C41536l.m120489i(str27, "plcClass");
        C41536l.m120489i(str28, "plcType");
        C41536l.m120489i(str29, "typeName");
        C41536l.m120489i(str30, "isCreditCard");
        C41536l.m120489i(str31, "appType");
        C41536l.m120489i(str32, "prodGroup");
        C41536l.m120489i(str33, "product");
        C41536l.m120489i(str34, "customDesignFlag");
        C41536l.m120489i(str35, "subProductCode");
        C41536l.m120489i(str36, "useClientNickname");
        C41536l.m120489i(debitCardTextContainerUiModel2, "texts");
        C41536l.m120489i(list6, "clientPayrollInfo");
        C41536l.m120489i(list7, "clientChildren");
        C41536l.m120489i(d0Var2, "defaultCard");
        C41536l.m120489i(list4, "cardAdditionalParams");
        List<CardBenefitUiModel> list8 = list5;
        C41536l.m120489i(list8, "cardBenefits");
        this.plcClass = str27;
        this.plcType = str28;
        this.typeName = str29;
        this.isCreditCard = str30;
        this.appType = str31;
        this.prodGroup = str32;
        this.product = str33;
        this.linkId = j;
        this.customDesignFlag = str34;
        this.subProductCode = str35;
        this.objectUrl = str10;
        this.isStudentCard = z;
        this.cardNameKey = str11;
        this.advantagesKey = str12;
        this.cardDetailsKey = str13;
        this.cardPriceKey = str14;
        this.expDateKey = str15;
        this.useClientNickname = str36;
        this.minAmountKey = str17;
        this.digitalCardFlag = str18;
        this.digitalCardPriceKey = str19;
        this.digitalCardPriceValue = str20;
        this.cardPriceValue = str21;
        this.texts = debitCardTextContainerUiModel2;
        this.cardSubTypes = list;
        this.csFlag = z2;
        this.clientPayrollInfo = list6;
        this.cardNameValue = str22;
        this.plcSchoolFlag = z3;
        this.clientChildren = list7;
        this.cardLimitCheck = str23;
        this.cardSmallImage = cardSmallImageUiModel;
        this.defaultCard = d0Var2;
        this.regionId = str24;
        this.detailsUrl = str25;
        this.hasConciergeFlag = z4;
        this.designId = str26;
        this.cardAdditionalParams = list4;
        this.cardBenefits = list8;
    }

    public static /* synthetic */ DebitCardUiModel copy$default(DebitCardUiModel debitCardUiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerUiModel debitCardTextContainerUiModel, List list, boolean z2, List list2, String str22, boolean z3, List list3, String str23, CardSmallImageUiModel cardSmallImageUiModel, C17078d0 d0Var, String str24, String str25, boolean z4, String str26, List list4, List list5, int i, int i2, Object obj) {
        DebitCardUiModel debitCardUiModel2 = debitCardUiModel;
        int i3 = i;
        return debitCardUiModel.copy((i3 & 1) != 0 ? debitCardUiModel2.plcClass : str, (i3 & 2) != 0 ? debitCardUiModel2.plcType : str2, (i3 & 4) != 0 ? debitCardUiModel2.typeName : str3, (i3 & 8) != 0 ? debitCardUiModel2.isCreditCard : str4, (i3 & 16) != 0 ? debitCardUiModel2.appType : str5, (i3 & 32) != 0 ? debitCardUiModel2.prodGroup : str6, (i3 & 64) != 0 ? debitCardUiModel2.product : str7, (i3 & 128) != 0 ? debitCardUiModel2.linkId : j, (i3 & C11398b.f33139r) != 0 ? debitCardUiModel2.customDesignFlag : str8, (i3 & C11398b.f33140s) != 0 ? debitCardUiModel2.subProductCode : str9, (i3 & C11398b.f33141t) != 0 ? debitCardUiModel2.objectUrl : str10, (i3 & C11398b.f33142u) != 0 ? debitCardUiModel2.isStudentCard : z, (i3 & C11398b.f33143v) != 0 ? debitCardUiModel2.cardNameKey : str11, (i3 & 8192) != 0 ? debitCardUiModel2.advantagesKey : str12, (i3 & 16384) != 0 ? debitCardUiModel2.cardDetailsKey : str13, (i3 & 32768) != 0 ? debitCardUiModel2.cardPriceKey : str14, (i3 & 65536) != 0 ? debitCardUiModel2.expDateKey : str15, (i3 & 131072) != 0 ? debitCardUiModel2.useClientNickname : str16, (i3 & 262144) != 0 ? debitCardUiModel2.minAmountKey : str17, (i3 & 524288) != 0 ? debitCardUiModel2.digitalCardFlag : str18, (i3 & 1048576) != 0 ? debitCardUiModel2.digitalCardPriceKey : str19, (i3 & 2097152) != 0 ? debitCardUiModel2.digitalCardPriceValue : str20, (i3 & 4194304) != 0 ? debitCardUiModel2.cardPriceValue : str21, (i3 & 8388608) != 0 ? debitCardUiModel2.texts : debitCardTextContainerUiModel, (i3 & 16777216) != 0 ? debitCardUiModel2.cardSubTypes : list, (i3 & 33554432) != 0 ? debitCardUiModel2.csFlag : z2, (i3 & 67108864) != 0 ? debitCardUiModel2.clientPayrollInfo : list2, (i3 & 134217728) != 0 ? debitCardUiModel2.cardNameValue : str22, (i3 & 268435456) != 0 ? debitCardUiModel2.plcSchoolFlag : z3, (i3 & 536870912) != 0 ? debitCardUiModel2.clientChildren : list3, (i3 & 1073741824) != 0 ? debitCardUiModel2.cardLimitCheck : str23, (i3 & Integer.MIN_VALUE) != 0 ? debitCardUiModel2.cardSmallImage : cardSmallImageUiModel, (i2 & 1) != 0 ? debitCardUiModel2.defaultCard : d0Var, (i2 & 2) != 0 ? debitCardUiModel2.regionId : str24, (i2 & 4) != 0 ? debitCardUiModel2.detailsUrl : str25, (i2 & 8) != 0 ? debitCardUiModel2.hasConciergeFlag : z4, (i2 & 16) != 0 ? debitCardUiModel2.designId : str26, (i2 & 32) != 0 ? debitCardUiModel2.cardAdditionalParams : list4, (i2 & 64) != 0 ? debitCardUiModel2.cardBenefits : list5);
    }

    public final boolean canUseClientNickname() {
        return C40439w.m117115s(this.useClientNickname, C24978b.YES.mo63391e(), true);
    }

    public final String component1() {
        return this.plcClass;
    }

    public final String component10() {
        return this.subProductCode;
    }

    public final String component11() {
        return this.objectUrl;
    }

    public final boolean component12() {
        return this.isStudentCard;
    }

    public final String component13() {
        return this.cardNameKey;
    }

    public final String component14() {
        return this.advantagesKey;
    }

    public final String component15() {
        return this.cardDetailsKey;
    }

    public final String component16() {
        return this.cardPriceKey;
    }

    public final String component17() {
        return this.expDateKey;
    }

    public final String component18() {
        return this.useClientNickname;
    }

    public final String component19() {
        return this.minAmountKey;
    }

    public final String component2() {
        return this.plcType;
    }

    public final String component20() {
        return this.digitalCardFlag;
    }

    public final String component21() {
        return this.digitalCardPriceKey;
    }

    public final String component22() {
        return this.digitalCardPriceValue;
    }

    public final String component23() {
        return this.cardPriceValue;
    }

    public final DebitCardTextContainerUiModel component24() {
        return this.texts;
    }

    public final List<CardSubTypeUiModel> component25() {
        return this.cardSubTypes;
    }

    public final boolean component26() {
        return this.csFlag;
    }

    public final List<DebitCardPayrollInfoUiModel> component27() {
        return this.clientPayrollInfo;
    }

    public final String component28() {
        return this.cardNameValue;
    }

    public final boolean component29() {
        return this.plcSchoolFlag;
    }

    public final String component3() {
        return this.typeName;
    }

    public final List<ScoolCardOwnerUiModel> component30() {
        return this.clientChildren;
    }

    public final String component31() {
        return this.cardLimitCheck;
    }

    public final CardSmallImageUiModel component32() {
        return this.cardSmallImage;
    }

    public final C17078d0 component33() {
        return this.defaultCard;
    }

    public final String component34() {
        return this.regionId;
    }

    public final String component35() {
        return this.detailsUrl;
    }

    public final boolean component36() {
        return this.hasConciergeFlag;
    }

    public final String component37() {
        return this.designId;
    }

    public final List<String> component38() {
        return this.cardAdditionalParams;
    }

    public final List<CardBenefitUiModel> component39() {
        return this.cardBenefits;
    }

    public final String component4() {
        return this.isCreditCard;
    }

    public final String component5() {
        return this.appType;
    }

    public final String component6() {
        return this.prodGroup;
    }

    public final String component7() {
        return this.product;
    }

    public final long component8() {
        return this.linkId;
    }

    public final String component9() {
        return this.customDesignFlag;
    }

    public final DebitCardUiModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, DebitCardTextContainerUiModel debitCardTextContainerUiModel, List<CardSubTypeUiModel> list, boolean z2, List<DebitCardPayrollInfoUiModel> list2, String str22, boolean z3, List<ScoolCardOwnerUiModel> list3, String str23, CardSmallImageUiModel cardSmallImageUiModel, C17078d0 d0Var, String str24, String str25, boolean z4, String str26, List<String> list4, List<CardBenefitUiModel> list5) {
        String str27 = str;
        C41536l.m120489i(str27, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(str3, "typeName");
        C41536l.m120489i(str4, "isCreditCard");
        C41536l.m120489i(str5, "appType");
        C41536l.m120489i(str6, "prodGroup");
        C41536l.m120489i(str7, "product");
        C41536l.m120489i(str8, "customDesignFlag");
        C41536l.m120489i(str9, "subProductCode");
        C41536l.m120489i(str16, "useClientNickname");
        C41536l.m120489i(debitCardTextContainerUiModel, "texts");
        C41536l.m120489i(list2, "clientPayrollInfo");
        C41536l.m120489i(list3, "clientChildren");
        C41536l.m120489i(d0Var, "defaultCard");
        C41536l.m120489i(list4, "cardAdditionalParams");
        C41536l.m120489i(list5, "cardBenefits");
        return new DebitCardUiModel(str27, str2, str3, str4, str5, str6, str7, j, str8, str9, str10, z, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, debitCardTextContainerUiModel, list, z2, list2, str22, z3, list3, str23, cardSmallImageUiModel, d0Var, str24, str25, z4, str26, list4, list5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardUiModel)) {
            return false;
        }
        DebitCardUiModel debitCardUiModel = (DebitCardUiModel) obj;
        return C41536l.m120484d(this.plcClass, debitCardUiModel.plcClass) && C41536l.m120484d(this.plcType, debitCardUiModel.plcType) && C41536l.m120484d(this.typeName, debitCardUiModel.typeName) && C41536l.m120484d(this.isCreditCard, debitCardUiModel.isCreditCard) && C41536l.m120484d(this.appType, debitCardUiModel.appType) && C41536l.m120484d(this.prodGroup, debitCardUiModel.prodGroup) && C41536l.m120484d(this.product, debitCardUiModel.product) && this.linkId == debitCardUiModel.linkId && C41536l.m120484d(this.customDesignFlag, debitCardUiModel.customDesignFlag) && C41536l.m120484d(this.subProductCode, debitCardUiModel.subProductCode) && C41536l.m120484d(this.objectUrl, debitCardUiModel.objectUrl) && this.isStudentCard == debitCardUiModel.isStudentCard && C41536l.m120484d(this.cardNameKey, debitCardUiModel.cardNameKey) && C41536l.m120484d(this.advantagesKey, debitCardUiModel.advantagesKey) && C41536l.m120484d(this.cardDetailsKey, debitCardUiModel.cardDetailsKey) && C41536l.m120484d(this.cardPriceKey, debitCardUiModel.cardPriceKey) && C41536l.m120484d(this.expDateKey, debitCardUiModel.expDateKey) && C41536l.m120484d(this.useClientNickname, debitCardUiModel.useClientNickname) && C41536l.m120484d(this.minAmountKey, debitCardUiModel.minAmountKey) && C41536l.m120484d(this.digitalCardFlag, debitCardUiModel.digitalCardFlag) && C41536l.m120484d(this.digitalCardPriceKey, debitCardUiModel.digitalCardPriceKey) && C41536l.m120484d(this.digitalCardPriceValue, debitCardUiModel.digitalCardPriceValue) && C41536l.m120484d(this.cardPriceValue, debitCardUiModel.cardPriceValue) && C41536l.m120484d(this.texts, debitCardUiModel.texts) && C41536l.m120484d(this.cardSubTypes, debitCardUiModel.cardSubTypes) && this.csFlag == debitCardUiModel.csFlag && C41536l.m120484d(this.clientPayrollInfo, debitCardUiModel.clientPayrollInfo) && C41536l.m120484d(this.cardNameValue, debitCardUiModel.cardNameValue) && this.plcSchoolFlag == debitCardUiModel.plcSchoolFlag && C41536l.m120484d(this.clientChildren, debitCardUiModel.clientChildren) && C41536l.m120484d(this.cardLimitCheck, debitCardUiModel.cardLimitCheck) && C41536l.m120484d(this.cardSmallImage, debitCardUiModel.cardSmallImage) && this.defaultCard == debitCardUiModel.defaultCard && C41536l.m120484d(this.regionId, debitCardUiModel.regionId) && C41536l.m120484d(this.detailsUrl, debitCardUiModel.detailsUrl) && this.hasConciergeFlag == debitCardUiModel.hasConciergeFlag && C41536l.m120484d(this.designId, debitCardUiModel.designId) && C41536l.m120484d(this.cardAdditionalParams, debitCardUiModel.cardAdditionalParams) && C41536l.m120484d(this.cardBenefits, debitCardUiModel.cardBenefits);
    }

    public final String getAdvantagesKey() {
        return this.advantagesKey;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final List<String> getCardAdditionalParams() {
        return this.cardAdditionalParams;
    }

    public final List<CardBenefitUiModel> getCardBenefits() {
        return this.cardBenefits;
    }

    public final String getCardDetailsKey() {
        return this.cardDetailsKey;
    }

    public final Image getCardImage() {
        String a;
        int a2 = C19277a.m64731a(this.subProductCode, C12487d.f37160a);
        CardSmallImageUiModel cardSmallImageUiModel = this.cardSmallImage;
        if (cardSmallImageUiModel == null || (a = cardSmallImageUiModel.mo39453a()) == null) {
            return new Image.Resource(a2, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        String c = C32289b0.m95091c(a);
        C41536l.m120488h(c, "generateImageUrl(it)");
        return new Image.Url(c, new Image.Resource(a2, (Boolean) null, 2, (DefaultConstructorMarker) null), new Image.Resource(a2, (Boolean) null, 2, (DefaultConstructorMarker) null), (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 120, (DefaultConstructorMarker) null);
    }

    public final ImageSource getCardImageResource() {
        String a;
        int a2 = C19277a.m64731a(this.subProductCode, C12487d.f37160a);
        CardSmallImageUiModel cardSmallImageUiModel = this.cardSmallImage;
        if (cardSmallImageUiModel == null || (a = cardSmallImageUiModel.mo39453a()) == null) {
            return new ImageSource.Resource(a2);
        }
        String c = C32289b0.m95091c(a);
        C41536l.m120488h(c, "generateImageUrl(it)");
        return new ImageSource.Url(c, Integer.valueOf(a2), Integer.valueOf(a2));
    }

    public final String getCardLimitCheck() {
        return this.cardLimitCheck;
    }

    public final String getCardNameKey() {
        return this.cardNameKey;
    }

    public final String getCardNameValue() {
        return this.cardNameValue;
    }

    public final String getCardPriceKey() {
        return this.cardPriceKey;
    }

    public final String getCardPriceValue() {
        return this.cardPriceValue;
    }

    public final CardSmallImageUiModel getCardSmallImage() {
        return this.cardSmallImage;
    }

    public final List<CardSubTypeUiModel> getCardSubTypes() {
        return this.cardSubTypes;
    }

    public final List<ScoolCardOwnerUiModel> getClientChildren() {
        return this.clientChildren;
    }

    public final List<DebitCardPayrollInfoUiModel> getClientPayrollInfo() {
        return this.clientPayrollInfo;
    }

    public final boolean getCsFlag() {
        return this.csFlag;
    }

    public final String getCustomDesignFlag() {
        return this.customDesignFlag;
    }

    public final C17078d0 getDefaultCard() {
        return this.defaultCard;
    }

    public final String getDesignId() {
        return this.designId;
    }

    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    public final String getDigitalCardFlag() {
        return this.digitalCardFlag;
    }

    public final String getDigitalCardPriceKey() {
        return this.digitalCardPriceKey;
    }

    public final String getDigitalCardPriceValue() {
        return this.digitalCardPriceValue;
    }

    public final String getExpDateKey() {
        return this.expDateKey;
    }

    public final boolean getHasConciergeFlag() {
        return this.hasConciergeFlag;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final String getMinAmountKey() {
        return this.minAmountKey;
    }

    public final String getObjectUrl() {
        return this.objectUrl;
    }

    public final String getPlcClass() {
        return this.plcClass;
    }

    public final boolean getPlcSchoolFlag() {
        return this.plcSchoolFlag;
    }

    public final String getPlcType() {
        return this.plcType;
    }

    public final String getProdGroup() {
        return this.prodGroup;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRegionId() {
        return this.regionId;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public final DebitCardTextContainerUiModel getTexts() {
        return this.texts;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final String getUseClientNickname() {
        return this.useClientNickname;
    }

    public final boolean hasCardLimitCheck() {
        return C41536l.m120484d(this.cardLimitCheck, "Y");
    }

    public final boolean hasDigitalCardFlag() {
        if (C40439w.m117115s(this.digitalCardFlag, C17075c0.DIGITAL.mo44292b(), true) || C40439w.m117115s(this.digitalCardFlag, C17075c0.BOTH.mo44292b(), true)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.plcClass.hashCode() * 31) + this.plcType.hashCode()) * 31) + this.typeName.hashCode()) * 31) + this.isCreditCard.hashCode()) * 31) + this.appType.hashCode()) * 31) + this.prodGroup.hashCode()) * 31) + this.product.hashCode()) * 31) + C7397t.m28148a(this.linkId)) * 31) + this.customDesignFlag.hashCode()) * 31) + this.subProductCode.hashCode()) * 31;
        String str = this.objectUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isStudentCard;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.cardNameKey;
        int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advantagesKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardDetailsKey;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardPriceKey;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expDateKey;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.useClientNickname.hashCode()) * 31;
        String str7 = this.minAmountKey;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.digitalCardFlag;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.digitalCardPriceKey;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.digitalCardPriceValue;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cardPriceValue;
        int hashCode12 = (((hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.texts.hashCode()) * 31;
        List<CardSubTypeUiModel> list = this.cardSubTypes;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z3 = this.csFlag;
        if (z3) {
            z3 = true;
        }
        int hashCode14 = (((hashCode13 + (z3 ? 1 : 0)) * 31) + this.clientPayrollInfo.hashCode()) * 31;
        String str12 = this.cardNameValue;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        boolean z4 = this.plcSchoolFlag;
        if (z4) {
            z4 = true;
        }
        int hashCode16 = (((hashCode15 + (z4 ? 1 : 0)) * 31) + this.clientChildren.hashCode()) * 31;
        String str13 = this.cardLimitCheck;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        CardSmallImageUiModel cardSmallImageUiModel = this.cardSmallImage;
        int hashCode18 = (((hashCode17 + (cardSmallImageUiModel == null ? 0 : cardSmallImageUiModel.hashCode())) * 31) + this.defaultCard.hashCode()) * 31;
        String str14 = this.regionId;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.detailsUrl;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        boolean z5 = this.hasConciergeFlag;
        if (!z5) {
            z2 = z5;
        }
        int i3 = (hashCode20 + (z2 ? 1 : 0)) * 31;
        String str16 = this.designId;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return ((((i3 + i) * 31) + this.cardAdditionalParams.hashCode()) * 31) + this.cardBenefits.hashCode();
    }

    public final boolean isAmericanExpress() {
        return C41536l.m120484d(this.plcClass, "AMEX");
    }

    public final String isCreditCard() {
        return this.isCreditCard;
    }

    public final boolean isStudentCard() {
        return this.isStudentCard;
    }

    public String toString() {
        String str = this.plcClass;
        String str2 = this.plcType;
        String str3 = this.typeName;
        String str4 = this.isCreditCard;
        String str5 = this.appType;
        String str6 = this.prodGroup;
        String str7 = this.product;
        long j = this.linkId;
        String str8 = this.customDesignFlag;
        String str9 = this.subProductCode;
        String str10 = this.objectUrl;
        boolean z = this.isStudentCard;
        String str11 = this.cardNameKey;
        String str12 = this.advantagesKey;
        String str13 = this.cardDetailsKey;
        String str14 = this.cardPriceKey;
        String str15 = this.expDateKey;
        String str16 = this.useClientNickname;
        String str17 = this.minAmountKey;
        String str18 = this.digitalCardFlag;
        String str19 = this.digitalCardPriceKey;
        String str20 = this.digitalCardPriceValue;
        String str21 = this.cardPriceValue;
        DebitCardTextContainerUiModel debitCardTextContainerUiModel = this.texts;
        List<CardSubTypeUiModel> list = this.cardSubTypes;
        boolean z2 = this.csFlag;
        List<DebitCardPayrollInfoUiModel> list2 = this.clientPayrollInfo;
        String str22 = this.cardNameValue;
        boolean z3 = this.plcSchoolFlag;
        List<ScoolCardOwnerUiModel> list3 = this.clientChildren;
        String str23 = this.cardLimitCheck;
        CardSmallImageUiModel cardSmallImageUiModel = this.cardSmallImage;
        C17078d0 d0Var = this.defaultCard;
        String str24 = this.regionId;
        String str25 = this.detailsUrl;
        boolean z4 = this.hasConciergeFlag;
        String str26 = this.designId;
        List<String> list4 = this.cardAdditionalParams;
        List<CardBenefitUiModel> list5 = this.cardBenefits;
        return "DebitCardUiModel(plcClass=" + str + ", plcType=" + str2 + ", typeName=" + str3 + ", isCreditCard=" + str4 + ", appType=" + str5 + ", prodGroup=" + str6 + ", product=" + str7 + ", linkId=" + j + ", customDesignFlag=" + str8 + ", subProductCode=" + str9 + ", objectUrl=" + str10 + ", isStudentCard=" + z + ", cardNameKey=" + str11 + ", advantagesKey=" + str12 + ", cardDetailsKey=" + str13 + ", cardPriceKey=" + str14 + ", expDateKey=" + str15 + ", useClientNickname=" + str16 + ", minAmountKey=" + str17 + ", digitalCardFlag=" + str18 + ", digitalCardPriceKey=" + str19 + ", digitalCardPriceValue=" + str20 + ", cardPriceValue=" + str21 + ", texts=" + debitCardTextContainerUiModel + ", cardSubTypes=" + list + ", csFlag=" + z2 + ", clientPayrollInfo=" + list2 + ", cardNameValue=" + str22 + ", plcSchoolFlag=" + z3 + ", clientChildren=" + list3 + ", cardLimitCheck=" + str23 + ", cardSmallImage=" + cardSmallImageUiModel + ", defaultCard=" + d0Var + ", regionId=" + str24 + ", detailsUrl=" + str25 + ", hasConciergeFlag=" + z4 + ", designId=" + str26 + ", cardAdditionalParams=" + list4 + ", cardBenefits=" + list5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.plcClass);
        parcel.writeString(this.plcType);
        parcel.writeString(this.typeName);
        parcel.writeString(this.isCreditCard);
        parcel.writeString(this.appType);
        parcel.writeString(this.prodGroup);
        parcel.writeString(this.product);
        parcel.writeLong(this.linkId);
        parcel.writeString(this.customDesignFlag);
        parcel.writeString(this.subProductCode);
        parcel.writeString(this.objectUrl);
        parcel.writeInt(this.isStudentCard ? 1 : 0);
        parcel.writeString(this.cardNameKey);
        parcel.writeString(this.advantagesKey);
        parcel.writeString(this.cardDetailsKey);
        parcel.writeString(this.cardPriceKey);
        parcel.writeString(this.expDateKey);
        parcel.writeString(this.useClientNickname);
        parcel.writeString(this.minAmountKey);
        parcel.writeString(this.digitalCardFlag);
        parcel.writeString(this.digitalCardPriceKey);
        parcel.writeString(this.digitalCardPriceValue);
        parcel.writeString(this.cardPriceValue);
        this.texts.writeToParcel(parcel, i);
        List<CardSubTypeUiModel> list = this.cardSubTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (CardSubTypeUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.csFlag ? 1 : 0);
        List<DebitCardPayrollInfoUiModel> list2 = this.clientPayrollInfo;
        parcel.writeInt(list2.size());
        for (DebitCardPayrollInfoUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.cardNameValue);
        parcel.writeInt(this.plcSchoolFlag ? 1 : 0);
        List<ScoolCardOwnerUiModel> list3 = this.clientChildren;
        parcel.writeInt(list3.size());
        for (ScoolCardOwnerUiModel writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.cardLimitCheck);
        CardSmallImageUiModel cardSmallImageUiModel = this.cardSmallImage;
        if (cardSmallImageUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardSmallImageUiModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultCard.name());
        parcel.writeString(this.regionId);
        parcel.writeString(this.detailsUrl);
        parcel.writeInt(this.hasConciergeFlag ? 1 : 0);
        parcel.writeString(this.designId);
        parcel.writeStringList(this.cardAdditionalParams);
        List<CardBenefitUiModel> list4 = this.cardBenefits;
        parcel.writeInt(list4.size());
        for (CardBenefitUiModel writeToParcel4 : list4) {
            writeToParcel4.writeToParcel(parcel, i);
        }
    }
}

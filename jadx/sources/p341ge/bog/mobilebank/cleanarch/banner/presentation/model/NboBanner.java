package p341ge.bog.mobilebank.cleanarch.banner.presentation.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanner */
public final class NboBanner {
    private final String androidCheckFunction;
    private final Boolean bannerClosable;
    private final Long bannerEndDate;
    private final String bannerName;
    private final List<BannerParameterData> bannerParameters;
    private final String bannerType;
    private final String clickCallBackService;
    private final String closeCallBackService;
    private final BannerDeepLinkData deepLinkData;
    private final String facebookClickEventName;
    private final String facebookCloseEventName;
    private final String facebookImpressionEventName;
    private final String firebaseClickEventName;
    private final List<BannerTypedParameterData> firebaseClickEventParams;
    private final String firebaseCloseEventName;
    private final List<BannerTypedParameterData> firebaseCloseEventParams;
    private final String firebaseImpressionEventName;
    private final List<BannerTypedParameterData> firebaseImpressionEventParams;
    private final String iOSCheckFunction;
    private final String impressionActivityType;
    private final Long impressionTargetId;
    private final String layoutType;
    private final Integer orderNo;

    public NboBanner(String str, Boolean bool, String str2, Integer num, String str3, Long l, BannerDeepLinkData bannerDeepLinkData, String str4, String str5, String str6, String str7, Long l2, String str8, List<BannerParameterData> list, String str9, List<BannerTypedParameterData> list2, String str10, List<BannerTypedParameterData> list3, String str11, List<BannerTypedParameterData> list4, String str12, String str13, String str14) {
        this.bannerName = str;
        this.bannerClosable = bool;
        this.layoutType = str2;
        this.orderNo = num;
        this.bannerType = str3;
        this.bannerEndDate = l;
        this.deepLinkData = bannerDeepLinkData;
        this.clickCallBackService = str4;
        this.closeCallBackService = str5;
        this.iOSCheckFunction = str6;
        this.androidCheckFunction = str7;
        this.impressionTargetId = l2;
        this.impressionActivityType = str8;
        this.bannerParameters = list;
        this.firebaseClickEventName = str9;
        this.firebaseClickEventParams = list2;
        this.firebaseCloseEventName = str10;
        this.firebaseCloseEventParams = list3;
        this.firebaseImpressionEventName = str11;
        this.firebaseImpressionEventParams = list4;
        this.facebookClickEventName = str12;
        this.facebookCloseEventName = str13;
        this.facebookImpressionEventName = str14;
    }

    public static /* synthetic */ NboBanner copy$default(NboBanner nboBanner, String str, Boolean bool, String str2, Integer num, String str3, Long l, BannerDeepLinkData bannerDeepLinkData, String str4, String str5, String str6, String str7, Long l2, String str8, List list, String str9, List list2, String str10, List list3, String str11, List list4, String str12, String str13, String str14, int i, Object obj) {
        NboBanner nboBanner2 = nboBanner;
        int i2 = i;
        return nboBanner.copy((i2 & 1) != 0 ? nboBanner2.bannerName : str, (i2 & 2) != 0 ? nboBanner2.bannerClosable : bool, (i2 & 4) != 0 ? nboBanner2.layoutType : str2, (i2 & 8) != 0 ? nboBanner2.orderNo : num, (i2 & 16) != 0 ? nboBanner2.bannerType : str3, (i2 & 32) != 0 ? nboBanner2.bannerEndDate : l, (i2 & 64) != 0 ? nboBanner2.deepLinkData : bannerDeepLinkData, (i2 & 128) != 0 ? nboBanner2.clickCallBackService : str4, (i2 & C11398b.f33139r) != 0 ? nboBanner2.closeCallBackService : str5, (i2 & C11398b.f33140s) != 0 ? nboBanner2.iOSCheckFunction : str6, (i2 & C11398b.f33141t) != 0 ? nboBanner2.androidCheckFunction : str7, (i2 & C11398b.f33142u) != 0 ? nboBanner2.impressionTargetId : l2, (i2 & C11398b.f33143v) != 0 ? nboBanner2.impressionActivityType : str8, (i2 & 8192) != 0 ? nboBanner2.bannerParameters : list, (i2 & 16384) != 0 ? nboBanner2.firebaseClickEventName : str9, (i2 & 32768) != 0 ? nboBanner2.firebaseClickEventParams : list2, (i2 & 65536) != 0 ? nboBanner2.firebaseCloseEventName : str10, (i2 & 131072) != 0 ? nboBanner2.firebaseCloseEventParams : list3, (i2 & 262144) != 0 ? nboBanner2.firebaseImpressionEventName : str11, (i2 & 524288) != 0 ? nboBanner2.firebaseImpressionEventParams : list4, (i2 & 1048576) != 0 ? nboBanner2.facebookClickEventName : str12, (i2 & 2097152) != 0 ? nboBanner2.facebookCloseEventName : str13, (i2 & 4194304) != 0 ? nboBanner2.facebookImpressionEventName : str14);
    }

    public final String component1() {
        return this.bannerName;
    }

    public final String component10() {
        return this.iOSCheckFunction;
    }

    public final String component11() {
        return this.androidCheckFunction;
    }

    public final Long component12() {
        return this.impressionTargetId;
    }

    public final String component13() {
        return this.impressionActivityType;
    }

    public final List<BannerParameterData> component14() {
        return this.bannerParameters;
    }

    public final String component15() {
        return this.firebaseClickEventName;
    }

    public final List<BannerTypedParameterData> component16() {
        return this.firebaseClickEventParams;
    }

    public final String component17() {
        return this.firebaseCloseEventName;
    }

    public final List<BannerTypedParameterData> component18() {
        return this.firebaseCloseEventParams;
    }

    public final String component19() {
        return this.firebaseImpressionEventName;
    }

    public final Boolean component2() {
        return this.bannerClosable;
    }

    public final List<BannerTypedParameterData> component20() {
        return this.firebaseImpressionEventParams;
    }

    public final String component21() {
        return this.facebookClickEventName;
    }

    public final String component22() {
        return this.facebookCloseEventName;
    }

    public final String component23() {
        return this.facebookImpressionEventName;
    }

    public final String component3() {
        return this.layoutType;
    }

    public final Integer component4() {
        return this.orderNo;
    }

    public final String component5() {
        return this.bannerType;
    }

    public final Long component6() {
        return this.bannerEndDate;
    }

    public final BannerDeepLinkData component7() {
        return this.deepLinkData;
    }

    public final String component8() {
        return this.clickCallBackService;
    }

    public final String component9() {
        return this.closeCallBackService;
    }

    public final NboBanner copy(String str, Boolean bool, String str2, Integer num, String str3, Long l, BannerDeepLinkData bannerDeepLinkData, String str4, String str5, String str6, String str7, Long l2, String str8, List<BannerParameterData> list, String str9, List<BannerTypedParameterData> list2, String str10, List<BannerTypedParameterData> list3, String str11, List<BannerTypedParameterData> list4, String str12, String str13, String str14) {
        return new NboBanner(str, bool, str2, num, str3, l, bannerDeepLinkData, str4, str5, str6, str7, l2, str8, list, str9, list2, str10, list3, str11, list4, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NboBanner)) {
            return false;
        }
        NboBanner nboBanner = (NboBanner) obj;
        return C41536l.m120484d(this.bannerName, nboBanner.bannerName) && C41536l.m120484d(this.bannerClosable, nboBanner.bannerClosable) && C41536l.m120484d(this.layoutType, nboBanner.layoutType) && C41536l.m120484d(this.orderNo, nboBanner.orderNo) && C41536l.m120484d(this.bannerType, nboBanner.bannerType) && C41536l.m120484d(this.bannerEndDate, nboBanner.bannerEndDate) && C41536l.m120484d(this.deepLinkData, nboBanner.deepLinkData) && C41536l.m120484d(this.clickCallBackService, nboBanner.clickCallBackService) && C41536l.m120484d(this.closeCallBackService, nboBanner.closeCallBackService) && C41536l.m120484d(this.iOSCheckFunction, nboBanner.iOSCheckFunction) && C41536l.m120484d(this.androidCheckFunction, nboBanner.androidCheckFunction) && C41536l.m120484d(this.impressionTargetId, nboBanner.impressionTargetId) && C41536l.m120484d(this.impressionActivityType, nboBanner.impressionActivityType) && C41536l.m120484d(this.bannerParameters, nboBanner.bannerParameters) && C41536l.m120484d(this.firebaseClickEventName, nboBanner.firebaseClickEventName) && C41536l.m120484d(this.firebaseClickEventParams, nboBanner.firebaseClickEventParams) && C41536l.m120484d(this.firebaseCloseEventName, nboBanner.firebaseCloseEventName) && C41536l.m120484d(this.firebaseCloseEventParams, nboBanner.firebaseCloseEventParams) && C41536l.m120484d(this.firebaseImpressionEventName, nboBanner.firebaseImpressionEventName) && C41536l.m120484d(this.firebaseImpressionEventParams, nboBanner.firebaseImpressionEventParams) && C41536l.m120484d(this.facebookClickEventName, nboBanner.facebookClickEventName) && C41536l.m120484d(this.facebookCloseEventName, nboBanner.facebookCloseEventName) && C41536l.m120484d(this.facebookImpressionEventName, nboBanner.facebookImpressionEventName);
    }

    public final String getAndroidCheckFunction() {
        return this.androidCheckFunction;
    }

    public final Boolean getBannerClosable() {
        return this.bannerClosable;
    }

    public final Long getBannerEndDate() {
        return this.bannerEndDate;
    }

    public final String getBannerName() {
        return this.bannerName;
    }

    public final List<BannerParameterData> getBannerParameters() {
        return this.bannerParameters;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getClickCallBackService() {
        return this.clickCallBackService;
    }

    public final String getCloseCallBackService() {
        return this.closeCallBackService;
    }

    public final BannerDeepLinkData getDeepLinkData() {
        return this.deepLinkData;
    }

    public final String getFacebookClickEventName() {
        return this.facebookClickEventName;
    }

    public final String getFacebookCloseEventName() {
        return this.facebookCloseEventName;
    }

    public final String getFacebookImpressionEventName() {
        return this.facebookImpressionEventName;
    }

    public final String getFirebaseClickEventName() {
        return this.firebaseClickEventName;
    }

    public final List<BannerTypedParameterData> getFirebaseClickEventParams() {
        return this.firebaseClickEventParams;
    }

    public final String getFirebaseCloseEventName() {
        return this.firebaseCloseEventName;
    }

    public final List<BannerTypedParameterData> getFirebaseCloseEventParams() {
        return this.firebaseCloseEventParams;
    }

    public final String getFirebaseImpressionEventName() {
        return this.firebaseImpressionEventName;
    }

    public final List<BannerTypedParameterData> getFirebaseImpressionEventParams() {
        return this.firebaseImpressionEventParams;
    }

    public final String getIOSCheckFunction() {
        return this.iOSCheckFunction;
    }

    public final String getImpressionActivityType() {
        return this.impressionActivityType;
    }

    public final Long getImpressionTargetId() {
        return this.impressionTargetId;
    }

    public final String getLayoutType() {
        return this.layoutType;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        String str = this.bannerName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.bannerClosable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.layoutType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.orderNo;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.bannerType;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.bannerEndDate;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        BannerDeepLinkData bannerDeepLinkData = this.deepLinkData;
        int hashCode7 = (hashCode6 + (bannerDeepLinkData == null ? 0 : bannerDeepLinkData.hashCode())) * 31;
        String str4 = this.clickCallBackService;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.closeCallBackService;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iOSCheckFunction;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.androidCheckFunction;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.impressionTargetId;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.impressionActivityType;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<BannerParameterData> list = this.bannerParameters;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.firebaseClickEventName;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<BannerTypedParameterData> list2 = this.firebaseClickEventParams;
        int hashCode16 = (hashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.firebaseCloseEventName;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<BannerTypedParameterData> list3 = this.firebaseCloseEventParams;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str11 = this.firebaseImpressionEventName;
        int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<BannerTypedParameterData> list4 = this.firebaseImpressionEventParams;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str12 = this.facebookClickEventName;
        int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.facebookCloseEventName;
        int hashCode22 = (hashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.facebookImpressionEventName;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode22 + i;
    }

    public String toString() {
        String str = this.bannerName;
        Boolean bool = this.bannerClosable;
        String str2 = this.layoutType;
        Integer num = this.orderNo;
        String str3 = this.bannerType;
        Long l = this.bannerEndDate;
        BannerDeepLinkData bannerDeepLinkData = this.deepLinkData;
        String str4 = this.clickCallBackService;
        String str5 = this.closeCallBackService;
        String str6 = this.iOSCheckFunction;
        String str7 = this.androidCheckFunction;
        Long l2 = this.impressionTargetId;
        String str8 = this.impressionActivityType;
        List<BannerParameterData> list = this.bannerParameters;
        String str9 = this.firebaseClickEventName;
        List<BannerTypedParameterData> list2 = this.firebaseClickEventParams;
        String str10 = this.firebaseCloseEventName;
        List<BannerTypedParameterData> list3 = this.firebaseCloseEventParams;
        String str11 = this.firebaseImpressionEventName;
        List<BannerTypedParameterData> list4 = this.firebaseImpressionEventParams;
        String str12 = this.facebookClickEventName;
        String str13 = this.facebookCloseEventName;
        String str14 = this.facebookImpressionEventName;
        return "NboBanner(bannerName=" + str + ", bannerClosable=" + bool + ", layoutType=" + str2 + ", orderNo=" + num + ", bannerType=" + str3 + ", bannerEndDate=" + l + ", deepLinkData=" + bannerDeepLinkData + ", clickCallBackService=" + str4 + ", closeCallBackService=" + str5 + ", iOSCheckFunction=" + str6 + ", androidCheckFunction=" + str7 + ", impressionTargetId=" + l2 + ", impressionActivityType=" + str8 + ", bannerParameters=" + list + ", firebaseClickEventName=" + str9 + ", firebaseClickEventParams=" + list2 + ", firebaseCloseEventName=" + str10 + ", firebaseCloseEventParams=" + list3 + ", firebaseImpressionEventName=" + str11 + ", firebaseImpressionEventParams=" + list4 + ", facebookClickEventName=" + str12 + ", facebookCloseEventName=" + str13 + ", facebookImpressionEventName=" + str14 + ")";
    }
}

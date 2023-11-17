package p341ge.bog.mobilebank.kyc.data.network.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.kyc.data.network.model.Client */
public final class Client {
    private final String activityDesc;
    private final String activityDescInt;
    private final Integer activityTypeId;
    private final String answerId;
    private final String businessActivityField;
    private final String cliType;
    private final Integer clientKey;
    private final String employeePosition;
    private final String facAddressCountry;
    private final String facAddressCountryDesc;
    private final String facAddressCountryDescInt;
    private final String facAddressLine;
    private final String facAddressLineInt;
    private final String facAddressRegion;
    private final String facAddressRegionDesc;
    private final String facAddressRegionDescInt;
    private final String homeAddressCountry;
    private final String homeAddressCountryDesc;
    private final String homeAddressCountryDescInt;
    private final String homeAddressLine;
    private final String homeAddressLineInt;
    private final String homeAddressRegion;
    private final String homeAddressRegionDesc;
    private final String homeAddressRegionDescInt;
    private final String nameOfOrganization;
    private final String nameOfOrganizationInt;
    private final String nameOfPosition;
    private final String nameOfPositionInt;
    private final long questId;
    private final String resident;
    private final List<QuestSourceAmount> sourceAmount;
    private final List<QuestSourceProperty> sourceProperty;
    private final String srcCountry;
    private final String srcCountry2;
    private final String srcCountry2Desc;
    private final String srcCountry2DescInt;
    private final String srcCountryDesc;
    private final String srcCountryDescInt;

    public Client(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List<QuestSourceAmount> list, List<QuestSourceProperty> list2, long j) {
        List<QuestSourceAmount> list3 = list;
        List<QuestSourceProperty> list4 = list2;
        C41536l.m120489i(list3, "sourceAmount");
        C41536l.m120489i(list4, "sourceProperty");
        this.homeAddressCountry = str;
        this.homeAddressCountryDesc = str2;
        this.homeAddressCountryDescInt = str3;
        this.homeAddressRegion = str4;
        this.homeAddressRegionDesc = str5;
        this.homeAddressRegionDescInt = str6;
        this.homeAddressLine = str7;
        this.homeAddressLineInt = str8;
        this.clientKey = num;
        this.resident = str9;
        this.facAddressCountry = str10;
        this.facAddressCountryDesc = str11;
        this.facAddressCountryDescInt = str12;
        this.facAddressRegion = str13;
        this.facAddressRegionDesc = str14;
        this.facAddressRegionDescInt = str15;
        this.facAddressLine = str16;
        this.facAddressLineInt = str17;
        this.srcCountry = str18;
        this.srcCountryDesc = str19;
        this.srcCountryDescInt = str20;
        this.srcCountry2 = str21;
        this.srcCountry2Desc = str22;
        this.srcCountry2DescInt = str23;
        this.cliType = str24;
        this.activityTypeId = num2;
        this.activityDesc = str25;
        this.activityDescInt = str26;
        this.nameOfOrganization = str27;
        this.nameOfOrganizationInt = str28;
        this.employeePosition = str29;
        this.businessActivityField = str30;
        this.nameOfPosition = str31;
        this.nameOfPositionInt = str32;
        this.answerId = str33;
        this.sourceAmount = list3;
        this.sourceProperty = list4;
        this.questId = j;
    }

    public static /* synthetic */ Client copy$default(Client client, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List list, List list2, long j, int i, int i2, Object obj) {
        Client client2 = client;
        int i3 = i;
        return client.copy((i3 & 1) != 0 ? client2.homeAddressCountry : str, (i3 & 2) != 0 ? client2.homeAddressCountryDesc : str2, (i3 & 4) != 0 ? client2.homeAddressCountryDescInt : str3, (i3 & 8) != 0 ? client2.homeAddressRegion : str4, (i3 & 16) != 0 ? client2.homeAddressRegionDesc : str5, (i3 & 32) != 0 ? client2.homeAddressRegionDescInt : str6, (i3 & 64) != 0 ? client2.homeAddressLine : str7, (i3 & 128) != 0 ? client2.homeAddressLineInt : str8, (i3 & C11398b.f33139r) != 0 ? client2.clientKey : num, (i3 & C11398b.f33140s) != 0 ? client2.resident : str9, (i3 & C11398b.f33141t) != 0 ? client2.facAddressCountry : str10, (i3 & C11398b.f33142u) != 0 ? client2.facAddressCountryDesc : str11, (i3 & C11398b.f33143v) != 0 ? client2.facAddressCountryDescInt : str12, (i3 & 8192) != 0 ? client2.facAddressRegion : str13, (i3 & 16384) != 0 ? client2.facAddressRegionDesc : str14, (i3 & 32768) != 0 ? client2.facAddressRegionDescInt : str15, (i3 & 65536) != 0 ? client2.facAddressLine : str16, (i3 & 131072) != 0 ? client2.facAddressLineInt : str17, (i3 & 262144) != 0 ? client2.srcCountry : str18, (i3 & 524288) != 0 ? client2.srcCountryDesc : str19, (i3 & 1048576) != 0 ? client2.srcCountryDescInt : str20, (i3 & 2097152) != 0 ? client2.srcCountry2 : str21, (i3 & 4194304) != 0 ? client2.srcCountry2Desc : str22, (i3 & 8388608) != 0 ? client2.srcCountry2DescInt : str23, (i3 & 16777216) != 0 ? client2.cliType : str24, (i3 & 33554432) != 0 ? client2.activityTypeId : num2, (i3 & 67108864) != 0 ? client2.activityDesc : str25, (i3 & 134217728) != 0 ? client2.activityDescInt : str26, (i3 & 268435456) != 0 ? client2.nameOfOrganization : str27, (i3 & 536870912) != 0 ? client2.nameOfOrganizationInt : str28, (i3 & 1073741824) != 0 ? client2.employeePosition : str29, (i3 & Integer.MIN_VALUE) != 0 ? client2.businessActivityField : str30, (i2 & 1) != 0 ? client2.nameOfPosition : str31, (i2 & 2) != 0 ? client2.nameOfPositionInt : str32, (i2 & 4) != 0 ? client2.answerId : str33, (i2 & 8) != 0 ? client2.sourceAmount : list, (i2 & 16) != 0 ? client2.sourceProperty : list2, (i2 & 32) != 0 ? client2.questId : j);
    }

    public final String component1() {
        return this.homeAddressCountry;
    }

    public final String component10() {
        return this.resident;
    }

    public final String component11() {
        return this.facAddressCountry;
    }

    public final String component12() {
        return this.facAddressCountryDesc;
    }

    public final String component13() {
        return this.facAddressCountryDescInt;
    }

    public final String component14() {
        return this.facAddressRegion;
    }

    public final String component15() {
        return this.facAddressRegionDesc;
    }

    public final String component16() {
        return this.facAddressRegionDescInt;
    }

    public final String component17() {
        return this.facAddressLine;
    }

    public final String component18() {
        return this.facAddressLineInt;
    }

    public final String component19() {
        return this.srcCountry;
    }

    public final String component2() {
        return this.homeAddressCountryDesc;
    }

    public final String component20() {
        return this.srcCountryDesc;
    }

    public final String component21() {
        return this.srcCountryDescInt;
    }

    public final String component22() {
        return this.srcCountry2;
    }

    public final String component23() {
        return this.srcCountry2Desc;
    }

    public final String component24() {
        return this.srcCountry2DescInt;
    }

    public final String component25() {
        return this.cliType;
    }

    public final Integer component26() {
        return this.activityTypeId;
    }

    public final String component27() {
        return this.activityDesc;
    }

    public final String component28() {
        return this.activityDescInt;
    }

    public final String component29() {
        return this.nameOfOrganization;
    }

    public final String component3() {
        return this.homeAddressCountryDescInt;
    }

    public final String component30() {
        return this.nameOfOrganizationInt;
    }

    public final String component31() {
        return this.employeePosition;
    }

    public final String component32() {
        return this.businessActivityField;
    }

    public final String component33() {
        return this.nameOfPosition;
    }

    public final String component34() {
        return this.nameOfPositionInt;
    }

    public final String component35() {
        return this.answerId;
    }

    public final List<QuestSourceAmount> component36() {
        return this.sourceAmount;
    }

    public final List<QuestSourceProperty> component37() {
        return this.sourceProperty;
    }

    public final long component38() {
        return this.questId;
    }

    public final String component4() {
        return this.homeAddressRegion;
    }

    public final String component5() {
        return this.homeAddressRegionDesc;
    }

    public final String component6() {
        return this.homeAddressRegionDescInt;
    }

    public final String component7() {
        return this.homeAddressLine;
    }

    public final String component8() {
        return this.homeAddressLineInt;
    }

    public final Integer component9() {
        return this.clientKey;
    }

    public final Client copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, List<QuestSourceAmount> list, List<QuestSourceProperty> list2, long j) {
        String str34 = str;
        C41536l.m120489i(list, "sourceAmount");
        C41536l.m120489i(list2, "sourceProperty");
        return new Client(str, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, num2, str25, str26, str27, str28, str29, str30, str31, str32, str33, list, list2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Client)) {
            return false;
        }
        Client client = (Client) obj;
        return C41536l.m120484d(this.homeAddressCountry, client.homeAddressCountry) && C41536l.m120484d(this.homeAddressCountryDesc, client.homeAddressCountryDesc) && C41536l.m120484d(this.homeAddressCountryDescInt, client.homeAddressCountryDescInt) && C41536l.m120484d(this.homeAddressRegion, client.homeAddressRegion) && C41536l.m120484d(this.homeAddressRegionDesc, client.homeAddressRegionDesc) && C41536l.m120484d(this.homeAddressRegionDescInt, client.homeAddressRegionDescInt) && C41536l.m120484d(this.homeAddressLine, client.homeAddressLine) && C41536l.m120484d(this.homeAddressLineInt, client.homeAddressLineInt) && C41536l.m120484d(this.clientKey, client.clientKey) && C41536l.m120484d(this.resident, client.resident) && C41536l.m120484d(this.facAddressCountry, client.facAddressCountry) && C41536l.m120484d(this.facAddressCountryDesc, client.facAddressCountryDesc) && C41536l.m120484d(this.facAddressCountryDescInt, client.facAddressCountryDescInt) && C41536l.m120484d(this.facAddressRegion, client.facAddressRegion) && C41536l.m120484d(this.facAddressRegionDesc, client.facAddressRegionDesc) && C41536l.m120484d(this.facAddressRegionDescInt, client.facAddressRegionDescInt) && C41536l.m120484d(this.facAddressLine, client.facAddressLine) && C41536l.m120484d(this.facAddressLineInt, client.facAddressLineInt) && C41536l.m120484d(this.srcCountry, client.srcCountry) && C41536l.m120484d(this.srcCountryDesc, client.srcCountryDesc) && C41536l.m120484d(this.srcCountryDescInt, client.srcCountryDescInt) && C41536l.m120484d(this.srcCountry2, client.srcCountry2) && C41536l.m120484d(this.srcCountry2Desc, client.srcCountry2Desc) && C41536l.m120484d(this.srcCountry2DescInt, client.srcCountry2DescInt) && C41536l.m120484d(this.cliType, client.cliType) && C41536l.m120484d(this.activityTypeId, client.activityTypeId) && C41536l.m120484d(this.activityDesc, client.activityDesc) && C41536l.m120484d(this.activityDescInt, client.activityDescInt) && C41536l.m120484d(this.nameOfOrganization, client.nameOfOrganization) && C41536l.m120484d(this.nameOfOrganizationInt, client.nameOfOrganizationInt) && C41536l.m120484d(this.employeePosition, client.employeePosition) && C41536l.m120484d(this.businessActivityField, client.businessActivityField) && C41536l.m120484d(this.nameOfPosition, client.nameOfPosition) && C41536l.m120484d(this.nameOfPositionInt, client.nameOfPositionInt) && C41536l.m120484d(this.answerId, client.answerId) && C41536l.m120484d(this.sourceAmount, client.sourceAmount) && C41536l.m120484d(this.sourceProperty, client.sourceProperty) && this.questId == client.questId;
    }

    public final String getActivityDesc() {
        return this.activityDesc;
    }

    public final String getActivityDescInt() {
        return this.activityDescInt;
    }

    public final Integer getActivityTypeId() {
        return this.activityTypeId;
    }

    public final String getAnswerId() {
        return this.answerId;
    }

    public final String getBusinessActivityField() {
        return this.businessActivityField;
    }

    public final String getCliType() {
        return this.cliType;
    }

    public final Integer getClientKey() {
        return this.clientKey;
    }

    public final String getEmployeePosition() {
        return this.employeePosition;
    }

    public final String getFacAddressCountry() {
        return this.facAddressCountry;
    }

    public final String getFacAddressCountryDesc() {
        return this.facAddressCountryDesc;
    }

    public final String getFacAddressCountryDescInt() {
        return this.facAddressCountryDescInt;
    }

    public final String getFacAddressLine() {
        return this.facAddressLine;
    }

    public final String getFacAddressLineInt() {
        return this.facAddressLineInt;
    }

    public final String getFacAddressRegion() {
        return this.facAddressRegion;
    }

    public final String getFacAddressRegionDesc() {
        return this.facAddressRegionDesc;
    }

    public final String getFacAddressRegionDescInt() {
        return this.facAddressRegionDescInt;
    }

    public final String getHomeAddressCountry() {
        return this.homeAddressCountry;
    }

    public final String getHomeAddressCountryDesc() {
        return this.homeAddressCountryDesc;
    }

    public final String getHomeAddressCountryDescInt() {
        return this.homeAddressCountryDescInt;
    }

    public final String getHomeAddressLine() {
        return this.homeAddressLine;
    }

    public final String getHomeAddressLineInt() {
        return this.homeAddressLineInt;
    }

    public final String getHomeAddressRegion() {
        return this.homeAddressRegion;
    }

    public final String getHomeAddressRegionDesc() {
        return this.homeAddressRegionDesc;
    }

    public final String getHomeAddressRegionDescInt() {
        return this.homeAddressRegionDescInt;
    }

    public final String getNameOfOrganization() {
        return this.nameOfOrganization;
    }

    public final String getNameOfOrganizationInt() {
        return this.nameOfOrganizationInt;
    }

    public final String getNameOfPosition() {
        return this.nameOfPosition;
    }

    public final String getNameOfPositionInt() {
        return this.nameOfPositionInt;
    }

    public final long getQuestId() {
        return this.questId;
    }

    public final String getResident() {
        return this.resident;
    }

    public final List<QuestSourceAmount> getSourceAmount() {
        return this.sourceAmount;
    }

    public final List<QuestSourceProperty> getSourceProperty() {
        return this.sourceProperty;
    }

    public final String getSrcCountry() {
        return this.srcCountry;
    }

    public final String getSrcCountry2() {
        return this.srcCountry2;
    }

    public final String getSrcCountry2Desc() {
        return this.srcCountry2Desc;
    }

    public final String getSrcCountry2DescInt() {
        return this.srcCountry2DescInt;
    }

    public final String getSrcCountryDesc() {
        return this.srcCountryDesc;
    }

    public final String getSrcCountryDescInt() {
        return this.srcCountryDescInt;
    }

    public int hashCode() {
        String str = this.homeAddressCountry;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeAddressCountryDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeAddressCountryDescInt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeAddressRegion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.homeAddressRegionDesc;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.homeAddressRegionDescInt;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.homeAddressLine;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.homeAddressLineInt;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.clientKey;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.resident;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.facAddressCountry;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.facAddressCountryDesc;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.facAddressCountryDescInt;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.facAddressRegion;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.facAddressRegionDesc;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.facAddressRegionDescInt;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.facAddressLine;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.facAddressLineInt;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.srcCountry;
        int hashCode19 = (hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.srcCountryDesc;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.srcCountryDescInt;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.srcCountry2;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.srcCountry2Desc;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.srcCountry2DescInt;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.cliType;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Integer num2 = this.activityTypeId;
        int hashCode26 = (hashCode25 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str25 = this.activityDesc;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.activityDescInt;
        int hashCode28 = (hashCode27 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.nameOfOrganization;
        int hashCode29 = (hashCode28 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.nameOfOrganizationInt;
        int hashCode30 = (hashCode29 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.employeePosition;
        int hashCode31 = (hashCode30 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.businessActivityField;
        int hashCode32 = (hashCode31 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.nameOfPosition;
        int hashCode33 = (hashCode32 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.nameOfPositionInt;
        int hashCode34 = (hashCode33 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.answerId;
        if (str33 != null) {
            i = str33.hashCode();
        }
        return ((((((hashCode34 + i) * 31) + this.sourceAmount.hashCode()) * 31) + this.sourceProperty.hashCode()) * 31) + C7397t.m28148a(this.questId);
    }

    public String toString() {
        String str = this.homeAddressCountry;
        String str2 = this.homeAddressCountryDesc;
        String str3 = this.homeAddressCountryDescInt;
        String str4 = this.homeAddressRegion;
        String str5 = this.homeAddressRegionDesc;
        String str6 = this.homeAddressRegionDescInt;
        String str7 = this.homeAddressLine;
        String str8 = this.homeAddressLineInt;
        Integer num = this.clientKey;
        String str9 = this.resident;
        String str10 = this.facAddressCountry;
        String str11 = this.facAddressCountryDesc;
        String str12 = this.facAddressCountryDescInt;
        String str13 = this.facAddressRegion;
        String str14 = this.facAddressRegionDesc;
        String str15 = this.facAddressRegionDescInt;
        String str16 = this.facAddressLine;
        String str17 = this.facAddressLineInt;
        String str18 = this.srcCountry;
        String str19 = this.srcCountryDesc;
        String str20 = this.srcCountryDescInt;
        String str21 = this.srcCountry2;
        String str22 = this.srcCountry2Desc;
        String str23 = this.srcCountry2DescInt;
        String str24 = this.cliType;
        Integer num2 = this.activityTypeId;
        String str25 = this.activityDesc;
        String str26 = this.activityDescInt;
        String str27 = this.nameOfOrganization;
        String str28 = this.nameOfOrganizationInt;
        String str29 = this.employeePosition;
        String str30 = this.businessActivityField;
        String str31 = this.nameOfPosition;
        String str32 = this.nameOfPositionInt;
        String str33 = this.answerId;
        List<QuestSourceAmount> list = this.sourceAmount;
        String str34 = str13;
        long j = this.questId;
        return "Client(homeAddressCountry=" + str + ", homeAddressCountryDesc=" + str2 + ", homeAddressCountryDescInt=" + str3 + ", homeAddressRegion=" + str4 + ", homeAddressRegionDesc=" + str5 + ", homeAddressRegionDescInt=" + str6 + ", homeAddressLine=" + str7 + ", homeAddressLineInt=" + str8 + ", clientKey=" + num + ", resident=" + str9 + ", facAddressCountry=" + str10 + ", facAddressCountryDesc=" + str11 + ", facAddressCountryDescInt=" + str12 + ", facAddressRegion=" + str34 + ", facAddressRegionDesc=" + str14 + ", facAddressRegionDescInt=" + str15 + ", facAddressLine=" + str16 + ", facAddressLineInt=" + str17 + ", srcCountry=" + str18 + ", srcCountryDesc=" + str19 + ", srcCountryDescInt=" + str20 + ", srcCountry2=" + str21 + ", srcCountry2Desc=" + str22 + ", srcCountry2DescInt=" + str23 + ", cliType=" + str24 + ", activityTypeId=" + num2 + ", activityDesc=" + str25 + ", activityDescInt=" + str26 + ", nameOfOrganization=" + str27 + ", nameOfOrganizationInt=" + str28 + ", employeePosition=" + str29 + ", businessActivityField=" + str30 + ", nameOfPosition=" + str31 + ", nameOfPositionInt=" + str32 + ", answerId=" + str33 + ", sourceAmount=" + list + ", sourceProperty=" + this.sourceProperty + ", questId=" + j + ")";
    }
}

package cn0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.kyc.data.network.model.CityApiModel;
import p341ge.bog.mobilebank.kyc.data.network.model.KycDataApiModel;

/* renamed from: cn0.a */
public interface C10519a {
    @C40458f(".?serviceId=KYC_GET_QUEST_REGION")
    /* renamed from: b */
    C40762x<List<CityApiModel>> mo27246b(@C40472t("country") String str);

    @C40458f(".?serviceId=KYC_SAVE_QUEST_ANSWER_INDVL")
    /* renamed from: c */
    C40734b mo27247c(@C40472t("questId") long j, @C40472t("homeAddressCountry") String str, @C40472t("homeAddressRegion") String str2, @C40472t("homeAddressLine") String str3, @C40472t("facAddressCountry") String str4, @C40472t("facAddressRegion") String str5, @C40472t("facAddressLine") String str6, @C40472t("srcCountry") String str7, @C40472t("srcCountry2") String str8, @C40472t("activityTypeId") int i, @C40472t("nameOfOrganization") String str9, @C40472t("employeePosition") Integer num, @C40472t("dualCitizenship") int i2, @C40472t("propertySource") String str10, @C40472t("propertyOtherNote") String str11, @C40472t("amountSource") String str12, @C40472t("amountOtherNote") String str13);

    @C40458f(".?serviceId=KYC_GET_DATA")
    C40762x<KycDataApiModel> getData();
}

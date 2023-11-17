package mm0;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.junior.data.model.ChildApprovalEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildOtpRequestEntity;
import p341ge.bog.mobilebank.junior.data.model.ChildRequestApproveEntity;
import p341ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity;

/* renamed from: mm0.a */
public interface C26255a {
    @C40458f(".?serviceId=COMMON_SEND_OTP_TO_CHILD")
    /* renamed from: B2 */
    C40762x<ChildOtpRequestEntity> mo65345B2(@C40472t("phone") String str);

    @C40458f(".?serviceId=COMMON_REJECT_CHILD_ONBOARDING_REQUEST")
    /* renamed from: C0 */
    C40734b mo65346C0(@C40472t("childRequestId") long j);

    @C40458f(".?serviceId=IDENTITY_REQUEST_FINANCIAL_CONTACT_APPROVAL_PARENT")
    /* renamed from: E2 */
    C40762x<ChildApprovalEntity> mo65347E2(@C40472t("contact") String str, @C40472t("childClientKey") long j);

    @C40458f(".?serviceId=COMMON_VALIDATE_CHILD_OTP")
    /* renamed from: K2 */
    C40734b mo65348K2(@C40472t("phone") String str, @C40472t("otp") String str2, @C40472t("notificationId") long j, @C40472t("validationRequestId") long j2);

    @C40458f(".")
    /* renamed from: N0 */
    C40734b mo65349N0(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".")
    /* renamed from: T1 */
    C40762x<ChildRequestApproveEntity> mo65350T1(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=COMMON_PROCESS_CHILD_ONBOARDING_REGISTRATION")
    /* renamed from: h3 */
    C40734b mo65351h3(@C40472t("childRequestId") String str);

    @C40458f(".?serviceId=COMMON_GET_CHILD_ONBOARDING_REQUEST")
    /* renamed from: i3 */
    C40749p<List<JuniorRequestDataEntity>> mo65352i3(@C40472t("customerId") String str);
}

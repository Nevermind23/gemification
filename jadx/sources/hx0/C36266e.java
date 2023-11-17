package hx0;

import ci1.C40455c;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.payments.data.model.PaymentCardApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentCommissionApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentDebtApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentPackageObjectApiModel;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;

/* renamed from: hx0.e */
public interface C36266e {
    @C40457e
    @C40467o(".?serviceId=PAYMENTS_EXECUTE")
    /* renamed from: A */
    C40762x<PaymentDebtApiModel> mo88992A(@C40455c("requestId") String str, @C40472t("essServiceId") String str2, @C40455c("essParameters") String str3);

    @C40458f(".?serviceId=CARDS_GET_PAYMENT_AND_EXTERNAL_CARDS")
    /* renamed from: N */
    C40762x<List<PaymentCardApiModel>> mo88993N(@C40472t("providerIds") List<String> list);

    @C40457e
    @C40467o(".?serviceId=PAYMENTS_CALCULATE_COMMISSION")
    /* renamed from: W */
    C40762x<PaymentCommissionApiModel> mo88994W(@C40472t("essServiceId") String str, @C40472t("randomString") String str2, @C40455c("executeParameters") String str3);

    @C40458f(".?serviceId=PAYMENTS_GET_PROVIDER_CONFIGURATIONS&categoryId=&requestId=&newVersion=1")
    /* renamed from: X */
    C40762x<List<PaymentConfigDetailsApiModel>> mo88995X(@C40472t("essServiceId") String str);

    @C40458f(".?serviceId=COMMON_GET_SERVICE_OPERATION_ID&serviceKey=PAYMENTS_BATCH_EXECUTE_NEW")
    /* renamed from: q */
    C40762x<Long> mo88996q();

    @C40458f(".?serviceId=COLLECTOR_GET_SERVICE_PACKAGE_LIST")
    /* renamed from: z */
    C40762x<List<PaymentPackageObjectApiModel>> mo88997z(@C40472t("essServiceId") String str);
}

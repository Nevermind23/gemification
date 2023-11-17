package g01;

import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.QrCashOutApiModel;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.QrDailyLimitApiModel;

/* renamed from: g01.a */
public interface C32039a {
    @C40467o(".")
    /* renamed from: a */
    C40734b mo72530a(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CARDS_GET_DAILY_LIMITS")
    /* renamed from: b */
    C40762x<List<QrDailyLimitApiModel>> mo72531b(@C40472t("cardId") String str);

    @C40458f(".?serviceId=INITIATE_QR_CASHOUT")
    /* renamed from: c */
    C40762x<QrCashOutApiModel> mo72532c(@C40472t("atmId") String str, @C40472t("atmEncryptedData") String str2);
}

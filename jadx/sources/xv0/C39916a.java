package xv0;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.p2p.data.model.AmountLimitApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CardsApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CommissionApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CreateInComeTopUpPaymentApiModel;
import p341ge.bog.mobilebank.p2p.data.model.MoneyTransferResponseApiModel;

/* renamed from: xv0.a */
public interface C39916a {

    /* renamed from: xv0.a$a */
    public static final class C39917a {
        /* renamed from: a */
        public static /* synthetic */ C40734b m115709a(C39916a aVar, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "PHONE";
                }
                return aVar.mo93608e(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPhoneNumber");
        }

        /* renamed from: b */
        public static /* synthetic */ C40762x m115710b(C39916a aVar, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "GEL";
                }
                return aVar.mo93605b(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOneTimeAmountLimit");
        }
    }

    @C40458f(".")
    /* renamed from: a */
    C40762x<MoneyTransferResponseApiModel> mo93604a(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=P2P_GET_ONE_TIME_AMOUNT_LIMIT")
    /* renamed from: b */
    C40762x<AmountLimitApiModel> mo93605b(@C40472t("p2pOpType") String str, @C40472t("ccy") String str2);

    @C40458f(".?serviceId=P2P_GET_CARDS")
    /* renamed from: c */
    C40762x<List<CardsApiModel>> mo93606c(@C40472t("p2pOpType") String str);

    @C40458f(".?serviceId=P2P_GET_COMMISSION")
    /* renamed from: d */
    C40762x<CommissionApiModel> mo93607d(@C40472t("p2pOpType") String str, @C40472t("opAmount") double d, @C40472t("cardId") String str2);

    @C40458f(".?serviceId=P2P_CHECK_NUMBER")
    /* renamed from: e */
    C40734b mo93608e(@C40472t("contactId") String str, @C40472t("contactType") String str2);

    @C40458f(".?serviceId=P2P_CREATE_INCOMING_TOPUP_PAYMENT_REQUEST")
    /* renamed from: f */
    C40762x<CreateInComeTopUpPaymentApiModel> mo93609f(@C40472t("cardId") long j, @C40472t("acctKey") long j2, @C40472t("amount") double d, @C40472t("ccy") String str);

    @C40458f(".?serviceId=P2P_GET_CARD_LIMIT")
    /* renamed from: g */
    C40734b mo93610g(@C40472t("cardId") long j, @C40472t("p2pOpType") String str);
}

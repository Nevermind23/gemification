package e71;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.transportcard.data.model.ActiveCardApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.ActivePassDeviceApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.GetCardsCardsApiResponseModel;
import p341ge.bog.mobilebank.transportcard.data.model.GetPurchasedPassApiResponseModel;
import p341ge.bog.mobilebank.transportcard.data.model.TransportCardPassTypeApiModel;

/* renamed from: e71.a */
public interface C31683a {
    @C40458f(".?serviceId=TCC_PROCESS_CARD_SUBSTITUTION")
    /* renamed from: f0 */
    C40762x<Object> mo72103f0(@C40472t("oldDeviceId") String str, @C40472t("oldDeviceType") String str2, @C40472t("newDeviceId") String str3, @C40472t("newDeviceType") String str4);

    @C40458f(".?serviceId=CARDS_GET_TCC_CARDS")
    /* renamed from: g3 */
    C40749p<GetCardsCardsApiResponseModel> mo72104g3();

    @C40458f(".?serviceId=TCC_GET_PASS_TYPES")
    /* renamed from: h3 */
    C40749p<List<TransportCardPassTypeApiModel>> mo72105h3();

    @C40458f(".")
    /* renamed from: i3 */
    C40762x<GetPurchasedPassApiResponseModel> mo72106i3(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=TCC_GET_PASS_MIGRATED_DEVICES")
    /* renamed from: j3 */
    C40749p<List<ActiveCardApiModel>> mo72107j3();

    @C40458f(".?serviceId=TCC_GET_PASS_DEVICES")
    /* renamed from: k3 */
    C40749p<List<ActiveCardApiModel>> mo72108k3();

    @C40458f(".?serviceId=TCC_GET_ACTIVE_PASSES")
    /* renamed from: l3 */
    C40749p<List<ActivePassDeviceApiModel>> mo72109l3();
}

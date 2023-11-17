package p454hn;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardBenefitsEntity;
import p341ge.bog.mobilebank.cardproducts.data.entity.ChildInfoApiModel;

/* renamed from: hn.a */
public interface C15535a {
    @C40458f("?serviceId=COMMON_GET_CHILD_INFO")
    /* renamed from: a */
    C40762x<List<ChildInfoApiModel>> mo42646a(@C40472t("childClientKey") long j);

    @C40458f(".")
    /* renamed from: b */
    C40734b mo42647b(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CARDS_CLOSE_ORDERED_CARD")
    /* renamed from: c */
    C40734b mo42648c(@C40472t("appId") long j, @C40472t("customerId") long j2);

    @C40458f(".?serviceId=CARDS_CLOSE_CARD")
    /* renamed from: d */
    C40734b mo42649d(@C40472t("cardId") long j, @C40472t("customerId") long j2);

    @C40458f("?serviceId=CARDS_GET_CARD_BENEFITS")
    /* renamed from: e */
    C40762x<List<CardBenefitsEntity>> mo42650e(@C40472t("subProductCode") String str);
}

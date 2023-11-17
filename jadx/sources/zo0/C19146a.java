package zo0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.linksharing.data.model.P2PAccountApiModel;
import p341ge.bog.mobilebank.linksharing.data.model.P2PLinkApiModel;

/* renamed from: zo0.a */
public interface C19146a {
    @C40458f(".?serviceId=P2P_PUBLIC_LINK_CREATE_LINK")
    /* renamed from: a */
    C40734b mo47340a(@C40472t("nickname") String str, @C40472t("acctKey") long j);

    @C40458f(".?serviceId=P2P_PUBLIC_LINK_VALIDATE_NICKNAME")
    /* renamed from: b */
    C40734b mo47341b(@C40472t("nickname") String str);

    @C40458f(".?serviceId=P2P_PUBLIC_LINK_UPDATE_ACCT")
    /* renamed from: c */
    C40734b mo47342c(@C40472t("acctKey") long j, @C40472t("nickname") String str);

    @C40458f(".?serviceId=P2P_PUBLIC_LINK_GET_LINK")
    /* renamed from: d */
    C40762x<P2PLinkApiModel> mo47343d();

    @C40458f(".?serviceId=P2P_PUBLIC_LINK_GET_ACCOUNTS_LOV")
    /* renamed from: j0 */
    C40762x<List<P2PAccountApiModel>> mo47344j0();
}

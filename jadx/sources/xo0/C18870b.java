package xo0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.linksharing.data.model.P2PLinkApiModel;
import p341ge.bog.mobilebank.linksharing.domain.model.P2PLink;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: xo0.b */
public final class C18870b {
    /* renamed from: a */
    public final P2PLink mo46841a(P2PLinkApiModel p2PLinkApiModel) {
        C41536l.m120489i(p2PLinkApiModel, "p2PLinkApiModel");
        Long clientKey = p2PLinkApiModel.getClientKey();
        String linkNickName = p2PLinkApiModel.getLinkNickName();
        if (linkNickName == null) {
            linkNickName = "";
        }
        return new P2PLink(clientKey, linkNickName, p2PLinkApiModel.getLinkUrl(), C41536l.m120484d(p2PLinkApiModel.isLinkActive(), "Y"), C41536l.m120484d(p2PLinkApiModel.isLinkValid(), "Y"), Boolean.valueOf(C41536l.m120484d(p2PLinkApiModel.getLinkStatus(), PensionStatusResult.STATUS_ACTIVE)), p2PLinkApiModel.getLinkEndDate(), p2PLinkApiModel.getAcctKey(), p2PLinkApiModel.getAcctNo());
    }
}

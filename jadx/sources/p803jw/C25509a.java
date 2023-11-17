package p803jw;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationParams;
import p833mw.C26309a;

/* renamed from: jw.a */
public final class C25509a {

    /* renamed from: a */
    private final C26309a f65178a;

    public C25509a(C26309a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f65178a = aVar;
    }

    /* renamed from: a */
    public final C40734b mo64059a(PendingProductConfirmationParams pendingProductConfirmationParams) {
        String str;
        C41536l.m120489i(pendingProductConfirmationParams, "params");
        C26309a aVar = this.f65178a;
        long responseDetId = pendingProductConfirmationParams.getResponseDetId();
        String responseKey = pendingProductConfirmationParams.getResponseKey();
        boolean accept = pendingProductConfirmationParams.getAccept();
        String operationReference = pendingProductConfirmationParams.getOperationReference();
        if (operationReference == null) {
            operationReference = "";
        }
        String scaAuthCode = pendingProductConfirmationParams.getScaAuthCode();
        if (scaAuthCode == null) {
            str = "";
        } else {
            str = scaAuthCode;
        }
        return aVar.mo64044a(responseDetId, responseKey, accept, operationReference, str);
    }
}

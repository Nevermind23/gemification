package dv0;

import iv0.C36551c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.openbanking.data.model.ConsentApiModel;

/* renamed from: dv0.b */
public final class C31609b {
    /* renamed from: a */
    public final C36551c mo72023a(ConsentApiModel consentApiModel) {
        C41536l.m120489i(consentApiModel, "consent");
        return new C36551c(consentApiModel.getConsentId(), consentApiModel.getAuthorizationUrl());
    }
}

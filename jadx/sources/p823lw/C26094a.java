package p823lw;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.productconfirmation.entity.PendingProductConfirmationEntity;
import p813kw.C25783a;

/* renamed from: lw.a */
public final class C26094a {
    /* renamed from: a */
    public final C25783a mo65012a(PendingProductConfirmationEntity pendingProductConfirmationEntity) {
        C41536l.m120489i(pendingProductConfirmationEntity, "p");
        return new C25783a(pendingProductConfirmationEntity.getResponseDetId(), pendingProductConfirmationEntity.getResponseId(), pendingProductConfirmationEntity.getResponseKey(), pendingProductConfirmationEntity.getAppType(), pendingProductConfirmationEntity.getAppDetails(), pendingProductConfirmationEntity.getAppTypeName(), pendingProductConfirmationEntity.isVerificationRequired(), pendingProductConfirmationEntity.getLangCode(), pendingProductConfirmationEntity.getIconUrl());
    }
}

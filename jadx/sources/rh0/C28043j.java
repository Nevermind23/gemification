package rh0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.data.model.PhoneNumberValidationResultApiModel;
import xh0.C29800p;

/* renamed from: rh0.j */
public final class C28043j {
    /* renamed from: a */
    public final C29800p mo67585a(PhoneNumberValidationResultApiModel phoneNumberValidationResultApiModel) {
        C41536l.m120489i(phoneNumberValidationResultApiModel, "apiModel");
        return new C29800p(phoneNumberValidationResultApiModel.getResultCode(), phoneNumberValidationResultApiModel.getResultMessage(), phoneNumberValidationResultApiModel.isBankCustomer(), phoneNumberValidationResultApiModel.getOwner(), phoneNumberValidationResultApiModel.getClientKey());
    }
}

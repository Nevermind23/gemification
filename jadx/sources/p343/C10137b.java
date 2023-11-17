package p343;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p366bk.C10320i;

/* renamed from: b */
public final class C10137b {

    /* renamed from: a */
    public static final C10137b f28117a = new C10137b();

    private C10137b() {
    }

    /* renamed from: a */
    public static final Integer m37077a(OfferProductCode offerProductCode, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        int i2;
        C41536l.m120489i(offerProductCode, "productCode");
        if (C41536l.m120484d(offerProductCode, OfferProductCode.C21021PL.f56478f)) {
            return Integer.valueOf(C10320i.ic_offer_installment);
        }
        boolean z8 = true;
        if (C41536l.m120484d(offerProductCode, OfferProductCode.C21019ML.f56477f)) {
            z2 = true;
        } else {
            z2 = C41536l.m120484d(offerProductCode, OfferProductCode.C21025SL.f56480f);
        }
        if (z2) {
            return Integer.valueOf(C10320i.ic_offer_ml);
        }
        if (C41536l.m120484d(offerProductCode, OfferProductCode.C21000AC.f56467f)) {
            z3 = true;
        } else {
            z3 = C41536l.m120484d(offerProductCode, OfferProductCode.C21014EX.f56474f);
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = C41536l.m120484d(offerProductCode, OfferProductCode.C21010EC.f56472f);
        }
        if (z4) {
            return Integer.valueOf(C10320i.ic_offer_credit_card);
        }
        if (C41536l.m120484d(offerProductCode, OfferProductCode.C21008CL.f56471f)) {
            if (z) {
                i2 = C10320i.ic_sms_loan_offer_promotion;
            } else {
                i2 = C10320i.ic_sms_loan_offer;
            }
            return Integer.valueOf(i2);
        }
        if (C41536l.m120484d(offerProductCode, OfferProductCode.C21004BE.f56469f)) {
            z5 = true;
        } else {
            z5 = C41536l.m120484d(offerProductCode, OfferProductCode.C21006BL.f56470f);
        }
        if (z5) {
            z6 = true;
        } else {
            z6 = C41536l.m120484d(offerProductCode, OfferProductCode.C21002BA.f56468f);
        }
        if (z6) {
            z7 = true;
        } else {
            z7 = C41536l.m120484d(offerProductCode, OfferProductCode.C21023RL.f56479f);
        }
        if (!z7) {
            z8 = C41536l.m120484d(offerProductCode, OfferProductCode.C21017LC.f56476f);
        }
        if (z8) {
            return Integer.valueOf(C10320i.ic_sms_loan_offer);
        }
        if (!C41536l.m120484d(offerProductCode, OfferProductCode.C21012EL.f56473f)) {
            return null;
        }
        if (z) {
            i = C10320i.ic_express_loan_offer_promotion;
        } else {
            i = C10320i.ic_express_loan_offer;
        }
        return Integer.valueOf(i);
    }
}

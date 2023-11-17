package m90;

import android.content.Context;
import java.util.Arrays;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import u70.C28605a;
import u70.C28608d;

/* renamed from: m90.a */
public abstract class C26160a {

    /* renamed from: m90.a$a */
    public /* synthetic */ class C26161a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66362a;

        static {
            int[] iArr = new int[OfferInfo.C20999b.values().length];
            try {
                iArr[OfferInfo.C20999b.BNPL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66362a = iArr;
        }
    }

    /* renamed from: a */
    public static final int m81961a(OfferInfo offerInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C41536l.m120489i(offerInfo, "<this>");
        boolean z8 = true;
        if (C26161a.f66362a[offerInfo.getOfferScheme().ordinal()] == 1) {
            return C28605a.f72556a;
        }
        OfferProductCode productCode = offerInfo.getProductCode();
        if (C41536l.m120484d(productCode, OfferProductCode.C21004BE.f56469f)) {
            z = true;
        } else {
            z = C41536l.m120484d(productCode, OfferProductCode.C21006BL.f56470f);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = C41536l.m120484d(productCode, OfferProductCode.C21002BA.f56468f);
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = C41536l.m120484d(productCode, OfferProductCode.C21021PL.f56478f);
        }
        if (z3) {
            return C28605a.f72557d;
        }
        if (C41536l.m120484d(productCode, OfferProductCode.C21019ML.f56477f)) {
            z4 = true;
        } else {
            z4 = C41536l.m120484d(productCode, OfferProductCode.C21025SL.f56480f);
        }
        if (z4) {
            return C28605a.ic_mortgage_loan_offer;
        }
        if (C41536l.m120484d(productCode, OfferProductCode.C21000AC.f56467f)) {
            z5 = true;
        } else {
            z5 = C41536l.m120484d(productCode, OfferProductCode.C21014EX.f56474f);
        }
        if (z5) {
            z6 = true;
        } else {
            z6 = C41536l.m120484d(productCode, OfferProductCode.C21010EC.f56472f);
        }
        if (z6) {
            return C28605a.ic_credit_card_offer;
        }
        if (C41536l.m120484d(productCode, OfferProductCode.C21008CL.f56471f)) {
            z7 = true;
        } else {
            z7 = C41536l.m120484d(productCode, OfferProductCode.C21023RL.f56479f);
        }
        if (!z7) {
            z8 = C41536l.m120484d(productCode, OfferProductCode.C21017LC.f56476f);
        }
        if (z8) {
            return C28605a.ic_consumer_loan_offer;
        }
        return 0;
    }

    /* renamed from: b */
    public static final String m81962b(OfferInfo offerInfo, Context context) {
        int i;
        C41536l.m120489i(offerInfo, "<this>");
        C41536l.m120489i(context, "context");
        C41524c0 c0Var = C41524c0.f97701a;
        if (C26161a.f66362a[offerInfo.getOfferScheme().ordinal()] == 1) {
            i = C28608d.product_offer_effective_bnpl;
        } else {
            i = C28608d.f72617c;
        }
        String string = context.getString(i);
        C41536l.m120488h(string, "context.getString(\n     …e\n            }\n        )");
        String format = String.format(string, Arrays.copyOf(new Object[]{offerInfo.getEffectiveInterestRate()}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        return format;
    }
}

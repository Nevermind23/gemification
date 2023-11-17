package p782hu;

import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;

/* renamed from: hu.b */
public abstract class C25066b {
    /* renamed from: a */
    public static final C25065a m80021a(OfferInfo offerInfo) {
        double d;
        boolean z;
        Double h;
        C41536l.m120489i(offerInfo, "<this>");
        String offerAmount = offerInfo.getOfferAmount();
        if (offerAmount == null || (h = C40437u.m117096h(offerAmount)) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = h.doubleValue();
        }
        String offerCcy = offerInfo.getOfferCcy();
        if (offerInfo.getOfferScheme() == OfferInfo.C20999b.BNPL) {
            z = true;
        } else {
            z = false;
        }
        return new C25065a(d, offerCcy, z);
    }
}

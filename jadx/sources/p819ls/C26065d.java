package p819ls;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity;
import p739dv.C20105d;

/* renamed from: ls.d */
public final class C26065d {
    /* renamed from: a */
    public final C20105d mo64984a(UpcomingPaymentApiEntity upcomingPaymentApiEntity) {
        C41536l.m120489i(upcomingPaymentApiEntity, "data");
        return new C20105d(upcomingPaymentApiEntity.getProductGroup(), upcomingPaymentApiEntity.getProductType(), upcomingPaymentApiEntity.getProductKey(), upcomingPaymentApiEntity.getSubProductCode(), upcomingPaymentApiEntity.getName(), upcomingPaymentApiEntity.getPayDate(), upcomingPaymentApiEntity.getAmount(), upcomingPaymentApiEntity.getCcy(), upcomingPaymentApiEntity.isCustom(), upcomingPaymentApiEntity.getOverdueFlag(), upcomingPaymentApiEntity.getProductDictionaryKey(), upcomingPaymentApiEntity.getPfmId());
    }
}

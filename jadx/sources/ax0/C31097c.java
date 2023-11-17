package ax0;

import cx0.C31453a;
import g91.C32343x;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiModel;
import p717bs.C19401a;
import ue1.C43075l;
import zc0.C30288a;

/* renamed from: ax0.c */
public final class C31097c {

    /* renamed from: a */
    private final C30288a f77298a;

    /* renamed from: ax0.c$a */
    static final class C31098a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31098a f77299d = new C31098a();

        C31098a() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: ax0.c$b */
    static final class C31099b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C31099b f77300d = new C31099b();

        C31099b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    public C31097c(C30288a aVar) {
        C41536l.m120489i(aVar, "getDictionaryPopulatedObservable");
        this.f77298a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m92527d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m92528e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* renamed from: c */
    public final List mo71296c(List list) {
        int i;
        boolean z;
        C24978b a;
        List list2 = list;
        C41536l.m120489i(list2, "configs");
        this.f77298a.mo70625a().mo94997P0(new C31095a(C31098a.f77299d)).mo94990M(new C31096b(C31099b.f77300d)).mo95020e();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentConfigApiModel paymentConfigApiModel = (PaymentConfigApiModel) it.next();
            boolean isDDAllowed = paymentConfigApiModel.isDDAllowed();
            boolean templateAllowed = paymentConfigApiModel.getTemplateAllowed();
            long id = paymentConfigApiModel.getId();
            String serviceId = paymentConfigApiModel.getServiceId();
            String paymentServiceId = paymentConfigApiModel.getPaymentServiceId();
            String serviceType = paymentConfigApiModel.getServiceType();
            String debtServiceId = paymentConfigApiModel.getDebtServiceId();
            String commission = paymentConfigApiModel.getCommission();
            String serviceCategory = paymentConfigApiModel.getServiceCategory();
            String serviceName = paymentConfigApiModel.getServiceName();
            Iterator it2 = it;
            ArrayList arrayList2 = arrayList;
            String E = C32343x.m95386E(paymentConfigApiModel.getServiceName(), true, new Object[0]);
            String channel = paymentConfigApiModel.getChannel();
            Integer orderingNumber = paymentConfigApiModel.getOrderingNumber();
            if (orderingNumber != null) {
                i = orderingNumber.intValue();
            } else {
                i = 0;
            }
            String logo = paymentConfigApiModel.getLogo();
            Double payAmountLimit = paymentConfigApiModel.getPayAmountLimit();
            boolean isTemplateAccessAllowed = paymentConfigApiModel.isTemplateAccessAllowed();
            boolean isCarTemplateAllowed = paymentConfigApiModel.isCarTemplateAllowed();
            boolean hasDebt = paymentConfigApiModel.getHasDebt();
            String additionalData = paymentConfigApiModel.getAdditionalData();
            String bonusProductTypes = paymentConfigApiModel.getBonusProductTypes();
            String categoryColor = paymentConfigApiModel.getCategoryColor();
            String categoryIconColor = paymentConfigApiModel.getCategoryIconColor();
            Boolean valueOf = Boolean.valueOf(C41536l.m120484d(paymentConfigApiModel.getCategoryType(), "M"));
            String oldLogo = paymentConfigApiModel.getOldLogo();
            YesNoApiEntity ddEnabled = paymentConfigApiModel.getDdEnabled();
            if (ddEnabled == null || (a = C19401a.m64892a(ddEnabled)) == null) {
                z = false;
            } else {
                z = a.mo63390c();
            }
            C31453a aVar = r4;
            C31453a aVar2 = new C31453a(isDDAllowed, templateAllowed, id, serviceId, paymentServiceId, serviceType, debtServiceId, commission, serviceCategory, serviceName, E, channel, i, logo, payAmountLimit, isTemplateAccessAllowed, isCarTemplateAllowed, hasDebt, additionalData, bonusProductTypes, categoryColor, categoryIconColor, valueOf, oldLogo, z, paymentConfigApiModel.getSearchKeysDictionaryKey(), C32343x.m95386E(paymentConfigApiModel.getSearchKeysDictionaryKey(), false, new Object[0]));
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(aVar);
            arrayList = arrayList3;
            it = it2;
        }
        return arrayList;
    }
}

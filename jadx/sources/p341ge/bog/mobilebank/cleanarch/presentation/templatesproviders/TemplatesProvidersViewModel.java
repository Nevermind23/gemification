package p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import f60.C20439a;
import f60.C20441c;
import f60.C20442d;
import f60.C20443e;
import g91.C32343x;
import hd1.C41204a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateGroupEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesProvidersViewModel */
public final class TemplatesProvidersViewModel extends C21481a {

    /* renamed from: j */
    public static final C22463a f59438j = new C22463a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Client f59439d;

    /* renamed from: e */
    private final C1644x f59440e = new C1644x();

    /* renamed from: f */
    private final C1644x f59441f = new C1644x();

    /* renamed from: g */
    private final C1644x f59442g = new C1644x();

    /* renamed from: h */
    private final C1644x f59443h = new C1644x();

    /* renamed from: i */
    private TemplateBasketItemsWithPaymentConfig f59444i;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesProvidersViewModel$a */
    public static final class C22463a {
        private C22463a() {
        }

        public /* synthetic */ C22463a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplatesProvidersViewModel(C41438c cVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "eventBus");
        C41536l.m120489i(client, "client");
        this.f59439d = client;
        cVar.mo96185q(this);
        client.requestTemplatesWithConfig(false);
    }

    /* renamed from: jw */
    private final void m72839jw(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f59444i = templateBasketItemsWithPaymentConfig;
        ArrayList arrayList4 = new ArrayList();
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig2 = this.f59444i;
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig3 = null;
        if (templateBasketItemsWithPaymentConfig2 == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig2 = null;
        }
        ArrayList<TemplateGroup> templateGroups = templateBasketItemsWithPaymentConfig2.getTemplateGroups();
        if (templateGroups != null) {
            ArrayList<TemplateGroup> arrayList5 = new ArrayList<>();
            for (T next : templateGroups) {
                if (C41536l.m120484d(((TemplateGroup) next).getGroupType(), "C")) {
                    arrayList5.add(next);
                }
            }
            arrayList = new ArrayList(C41343r.m119925u(arrayList5, 10));
            for (TemplateGroup templateGroup : arrayList5) {
                C41536l.m120488h(templateGroup, "it");
                TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig4 = this.f59444i;
                if (templateBasketItemsWithPaymentConfig4 == null) {
                    C41536l.m120506z("templatesAndPayments");
                    templateBasketItemsWithPaymentConfig4 = null;
                }
                arrayList.add(new C20441c(templateGroup, templateBasketItemsWithPaymentConfig4));
            }
        } else {
            arrayList = new ArrayList();
        }
        arrayList4.addAll(arrayList);
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig5 = this.f59444i;
        if (templateBasketItemsWithPaymentConfig5 == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig5 = null;
        }
        ArrayList<TemplateBasketItem> templates = templateBasketItemsWithPaymentConfig5.getTemplates();
        if (templates != null) {
            arrayList2 = new ArrayList(C41343r.m119925u(templates, 10));
            for (TemplateBasketItem templateBasketItem : templates) {
                C41536l.m120488h(templateBasketItem, "it");
                Client client = this.f59439d;
                TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig6 = this.f59444i;
                if (templateBasketItemsWithPaymentConfig6 == null) {
                    C41536l.m120506z("templatesAndPayments");
                    templateBasketItemsWithPaymentConfig6 = null;
                }
                C20442d dVar = new C20442d(templateBasketItem, client, templateBasketItemsWithPaymentConfig6);
                dVar.mo48961h(dVar.mo48955c());
                arrayList2.add(dVar);
            }
        } else {
            arrayList2 = new ArrayList();
        }
        arrayList4.addAll(arrayList2);
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig7 = this.f59444i;
        if (templateBasketItemsWithPaymentConfig7 == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig7 = null;
        }
        Map<String, PaymentProviderConfiguration> recentPayments = templateBasketItemsWithPaymentConfig7.getRecentPayments();
        if (recentPayments != null) {
            ArrayList arrayList6 = new ArrayList(recentPayments.size());
            for (Map.Entry<String, PaymentProviderConfiguration> value : recentPayments.entrySet()) {
                Object value2 = value.getValue();
                C41536l.m120488h(value2, "it.value");
                arrayList6.add(new C20439a((PaymentProviderConfiguration) value2));
            }
            HashSet hashSet = new HashSet();
            arrayList3 = new ArrayList();
            for (Object next2 : arrayList6) {
                if (hashSet.add(Long.valueOf(((C20439a) next2).mo48944b().f81344id))) {
                    arrayList3.add(next2);
                }
            }
        } else {
            arrayList3 = new ArrayList();
        }
        arrayList4.addAll(arrayList3);
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig8 = this.f59444i;
        if (templateBasketItemsWithPaymentConfig8 == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig8 = null;
        }
        if (templateBasketItemsWithPaymentConfig8.getTransportPass() != null) {
            PaymentProviderConfiguration paymentProviderConfiguration = new PaymentProviderConfiguration();
            paymentProviderConfiguration.serviceId = "TRANSPORT_PASS";
            TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig9 = this.f59444i;
            if (templateBasketItemsWithPaymentConfig9 == null) {
                C41536l.m120506z("templatesAndPayments");
                templateBasketItemsWithPaymentConfig9 = null;
            }
            paymentProviderConfiguration.logo = templateBasketItemsWithPaymentConfig9.getTransportPass().getLogo();
            TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig10 = this.f59444i;
            if (templateBasketItemsWithPaymentConfig10 == null) {
                C41536l.m120506z("templatesAndPayments");
            } else {
                templateBasketItemsWithPaymentConfig3 = templateBasketItemsWithPaymentConfig10;
            }
            paymentProviderConfiguration.serviceName = C32343x.m95388F(templateBasketItemsWithPaymentConfig3.getTransportPass().getTitleDictionaryKey(), new Object[0]);
            arrayList4.add(new C20439a(paymentProviderConfiguration));
        }
        if (arrayList4.isEmpty()) {
            this.f59441f.mo4823o(C20443e.EmptyData);
        } else {
            this.f59440e.mo4823o(arrayList4);
        }
    }

    /* renamed from: dw */
    public final void mo55456dw(TemplateGroup templateGroup) {
        C41536l.m120489i(templateGroup, "templateGroup");
        this.f59439d.deleteTemplateGroup(true, templateGroup.getId());
    }

    /* renamed from: ew */
    public final void mo55457ew(C20442d dVar) {
        C41536l.m120489i(dVar, "templateItem");
        this.f59439d.deleteTemplate(true, dVar.mo48956d().getId());
    }

    /* renamed from: fw */
    public final LiveData mo55458fw() {
        return this.f59442g;
    }

    /* renamed from: gw */
    public final LiveData mo55459gw() {
        return this.f59443h;
    }

    /* renamed from: hw */
    public final LiveData mo55460hw() {
        return this.f59440e;
    }

    /* renamed from: iw */
    public final LiveData mo55461iw() {
        return this.f59441f;
    }

    /* renamed from: kw */
    public final void mo55462kw(C20442d dVar) {
        C41536l.m120489i(dVar, "templateItem");
        this.f59439d.refreshDebt(dVar.mo48956d().getId());
    }

    /* renamed from: lw */
    public final void mo55463lw() {
        this.f59439d.requestTemplatesWithConfig(true);
    }

    @C41452l
    public final void onDeleteTemplateEvent(DeleteTemplateEvent deleteTemplateEvent) {
        C41536l.m120489i(deleteTemplateEvent, "event");
        this.f59442g.mo4823o(Integer.valueOf(deleteTemplateEvent.getState()));
    }

    @C41452l
    public final void onDeleteTemplateGroupEvent(DeleteTemplateGroupEvent deleteTemplateGroupEvent) {
        C41536l.m120489i(deleteTemplateGroupEvent, "event");
        this.f59442g.mo4823o(Integer.valueOf(deleteTemplateGroupEvent.getState()));
    }

    @C41452l
    public final void onTemplateBasketItemChanged(TemplateBasketItem templateBasketItem) {
        if (templateBasketItem != null) {
            C1644x xVar = this.f59443h;
            Client client = this.f59439d;
            TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f59444i;
            if (templateBasketItemsWithPaymentConfig == null) {
                C41536l.m120506z("templatesAndPayments");
                templateBasketItemsWithPaymentConfig = null;
            }
            C20442d dVar = new C20442d(templateBasketItem, client, templateBasketItemsWithPaymentConfig);
            dVar.mo48961h(dVar.mo48955c());
            xVar.mo4823o(dVar);
        }
    }

    @C41452l
    public final void onTemplatesAndPaymentsEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        C41536l.m120489i(templatesAndConfigEvent, "event");
        int state = templatesAndConfigEvent.getState();
        if (state == 10) {
            this.f59441f.mo4823o(C20443e.Loading);
        } else if (state == 20) {
            TemplateBasketItemsWithPaymentConfig templatesWithPaymentConfig = templatesAndConfigEvent.getTemplatesWithPaymentConfig();
            C41536l.m120488h(templatesWithPaymentConfig, "event.templatesWithPaymentConfig");
            m72839jw(templatesWithPaymentConfig);
        } else if (state == 30 || state == 40) {
            this.f59441f.mo4823o(C20443e.Error);
        }
    }
}

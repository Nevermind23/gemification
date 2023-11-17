package qw0;

import g91.C32343x;
import iu0.C36546y;
import jg1.C41438c;
import jg1.C41452l;
import nw0.C37487b;
import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p530nf.C16919b;
import r90.C27950a;

/* renamed from: qw0.c */
public class C38254c {

    /* renamed from: a */
    public PaymentDebtEvent f91740a;

    /* renamed from: b */
    public ProviderConfigurationEvent f91741b;

    /* renamed from: c */
    protected C37487b f91742c;

    /* renamed from: d */
    public Client f91743d;

    /* renamed from: e */
    public RootBankApiManager f91744e;

    /* renamed from: f */
    public C41438c f91745f;

    /* renamed from: qw0.c$a */
    interface C38255a {
        /* renamed from: b */
        C41438c mo32852b();

        /* renamed from: c */
        Client mo32853c();

        /* renamed from: g */
        RootBankApiManager mo32857g();
    }

    public C38254c(C37487b bVar) {
        C38255a aVar = (C38255a) C16919b.m59518a(C36546y.m108285N(), C38255a.class);
        this.f91745f = aVar.mo32852b();
        this.f91744e = aVar.mo32857g();
        this.f91743d = aVar.mo32853c();
        this.f91742c = bVar;
    }

    /* renamed from: a */
    public RootBankApiManager mo91793a() {
        return this.f91744e;
    }

    /* renamed from: b */
    public Client mo91794b() {
        return this.f91743d;
    }

    /* renamed from: c */
    public void mo91795c() {
        C32343x.m95423W0(this.f91745f, this);
    }

    /* renamed from: d */
    public void mo91796d() {
        C32343x.m95489t1(this.f91745f, this);
    }

    @C41452l
    public void onDebtResponse(PaymentDebtEvent paymentDebtEvent) {
        if (paymentDebtEvent != this.f91740a && paymentDebtEvent.getInstance() == this.f91742c) {
            this.f91740a = paymentDebtEvent;
            int state = paymentDebtEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(false);
            } else if (state == 20) {
                this.f91742c.onDebtEventSuccess(paymentDebtEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86286c(paymentDebtEvent.getErrorKey(), false));
            }
        }
    }

    @C41452l
    public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
        this.f91742c.onPointExchangeEvent(pointValueExchangeEvent);
    }

    @C41452l
    public void onProviderConfigurationEvent(ProviderConfigurationEvent providerConfigurationEvent) {
        if (this.f91741b != providerConfigurationEvent && providerConfigurationEvent.getInstance() == this.f91742c) {
            this.f91741b = providerConfigurationEvent;
            int state = providerConfigurationEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                this.f91742c.onProviderConfigurationEventSuccess(providerConfigurationEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86286c(providerConfigurationEvent.getErrorKey(), false));
            }
        }
    }
}

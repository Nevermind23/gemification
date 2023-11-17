package qw0;

import jg1.C41452l;
import nw0.C37486a;
import nw0.C37488c;
import p341ge.bog.mobilebank.eventbus.event.DDAccountsEvent;
import p341ge.bog.mobilebank.eventbus.event.DDPeriodTypesEvent;
import p341ge.bog.mobilebank.eventbus.events.DDProvidersListEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyDDEvent;
import p341ge.bog.mobilebank.eventbus.events.OperationHistoryEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;
import p341ge.bog.mobilebank.eventbus.events.TerminateDDSTOEvent;
import r90.C27950a;

/* renamed from: qw0.a */
public class C38252a extends C38256d {

    /* renamed from: i */
    ModifyDDEvent f91736i;

    /* renamed from: j */
    DDPeriodTypesEvent f91737j;

    /* renamed from: k */
    DDAccountsEvent f91738k;

    /* renamed from: l */
    public long f91739l;

    public C38252a(C37488c cVar) {
        super(cVar);
    }

    @C41452l
    public void onDDAccountsEvent(DDAccountsEvent dDAccountsEvent) {
        if (this.f91738k != dDAccountsEvent) {
            this.f91738k = dDAccountsEvent;
            int state = dDAccountsEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                DDPeriodTypesEvent dDPeriodTypesEvent = this.f91737j;
                if (dDPeriodTypesEvent != null && dDPeriodTypesEvent.getState() == 20) {
                    ((C37486a) this.f91742c).mo90624f();
                }
            } else if (state == 30) {
                ((C37486a) this.f91742c).mo90627k((String) null);
            } else if (state == 40) {
                ((C37486a) this.f91742c).mo90627k(C27950a.m86284a(dDAccountsEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onDDPeriodTypesEvent(DDPeriodTypesEvent dDPeriodTypesEvent) {
        if (this.f91737j != dDPeriodTypesEvent) {
            this.f91737j = dDPeriodTypesEvent;
            int state = dDPeriodTypesEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                DDAccountsEvent dDAccountsEvent = this.f91738k;
                if (dDAccountsEvent != null && dDAccountsEvent.getState() == 20) {
                    ((C37486a) this.f91742c).mo90624f();
                }
            } else if (state == 30) {
                ((C37486a) this.f91742c).mo90627k((String) null);
            } else if (state == 40) {
                ((C37486a) this.f91742c).mo90627k(C27950a.m86284a(dDPeriodTypesEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onDDProviders(DDProvidersListEvent dDProvidersListEvent) {
        int state = dDProvidersListEvent.getState();
        if (state == 10) {
            this.f91742c.onLoading(true);
        } else if (state == 20) {
            ((C37486a) this.f91742c).mo90626j(dDProvidersListEvent);
        } else if (state == 30) {
            ((C37486a) this.f91742c).mo90627k((String) null);
        } else if (state == 40) {
            ((C37486a) this.f91742c).mo90627k(C27950a.m86284a(dDProvidersListEvent.getErrorKey()));
        }
    }

    @C41452l
    public void onDDSTOTerminateEvent(TerminateDDSTOEvent terminateDDSTOEvent) {
        if (terminateDDSTOEvent.itemId == this.f91739l) {
            int state = terminateDDSTOEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                ((C37486a) this.f91742c).mo90625h();
                this.f91743d.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
                this.f91743d.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86284a(terminateDDSTOEvent.getErrorKey()));
                this.f91743d.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
            }
        }
    }

    @C41452l
    public void onModifyDDEvent(ModifyDDEvent modifyDDEvent) {
        if (this.f91736i != modifyDDEvent && modifyDDEvent.getInstance() == this.f91742c) {
            this.f91736i = modifyDDEvent;
            int state = modifyDDEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                ((C37486a) this.f91742c).mo90623e(modifyDDEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86284a(modifyDDEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onOperationHistory(OperationHistoryEvent operationHistoryEvent) {
        String str;
        if (this.f91746g != operationHistoryEvent && (str = this.f91747h) != null && str.equals(operationHistoryEvent.getEssId())) {
            this.f91746g = operationHistoryEvent;
            int state = operationHistoryEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(false);
            } else if (state == 20) {
                ((C37488c) this.f91742c).mo90629g(operationHistoryEvent);
            } else if (state == 30) {
                ((C37486a) this.f91742c).mo90627k((String) null);
            } else if (state == 40) {
                ((C37486a) this.f91742c).mo90627k(C27950a.m86284a(operationHistoryEvent.getErrorKey()));
            }
        }
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
                ((C37486a) this.f91742c).mo90627k((String) null);
            } else if (state == 40) {
                ((C37486a) this.f91742c).mo90627k(C27950a.m86284a(providerConfigurationEvent.getErrorKey()));
            }
        }
    }
}

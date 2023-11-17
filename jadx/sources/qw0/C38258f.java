package qw0;

import jg1.C41452l;
import nw0.C37490e;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import r90.C27950a;

/* renamed from: qw0.f */
public class C38258f extends C38256d {

    /* renamed from: i */
    private long f91748i;

    /* renamed from: j */
    private boolean f91749j;

    /* renamed from: k */
    private DeleteTemplateEvent f91750k;

    /* renamed from: l */
    private ModifyTemplateEvent f91751l;

    public C38258f(C37490e eVar) {
        super(eVar);
    }

    /* renamed from: e */
    public void mo91800e(boolean z) {
        this.f91749j = z;
    }

    /* renamed from: f */
    public void mo91801f(long j) {
        this.f91748i = j;
    }

    @C41452l
    public void onDeleteTemplateEvent(DeleteTemplateEvent deleteTemplateEvent) {
        if (this.f91750k != deleteTemplateEvent && deleteTemplateEvent.getTemplateId() == this.f91748i) {
            this.f91750k = deleteTemplateEvent;
            int state = deleteTemplateEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                ((C37490e) this.f91742c).mo90632b(deleteTemplateEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86284a(deleteTemplateEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onModifyTemplateEvent(ModifyTemplateEvent modifyTemplateEvent) {
        if (this.f91751l == modifyTemplateEvent) {
            return;
        }
        if (modifyTemplateEvent.getTemplate().getId() == this.f91748i || this.f91749j) {
            this.f91751l = modifyTemplateEvent;
            int state = modifyTemplateEvent.getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                ((C37490e) this.f91742c).mo90631a(modifyTemplateEvent);
            } else if (state == 30) {
                this.f91742c.onNetworkError();
            } else if (state == 40) {
                this.f91742c.onDataError(C27950a.m86284a(modifyTemplateEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onTemplateDebt(TemplateBasketItem templateBasketItem) {
        if ((this.f91748i == templateBasketItem.getId() || templateBasketItem.getId() == 0) && templateBasketItem.canGetDebt()) {
            int state = templateBasketItem.getTemplateDebtEvent().getState();
            if (state == 10) {
                this.f91742c.onLoading(true);
            } else if (state == 20) {
                ((C37490e) this.f91742c).mo90633c(templateBasketItem);
            }
        }
    }
}

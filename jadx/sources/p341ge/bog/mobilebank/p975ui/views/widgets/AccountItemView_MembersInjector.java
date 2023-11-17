package p341ge.bog.mobilebank.p975ui.views.widgets;

import ge1.C41084a;
import jg1.C41438c;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView_MembersInjector */
public final class AccountItemView_MembersInjector implements C16560a {
    private final C41084a mEventBusProvider;

    public AccountItemView_MembersInjector(C41084a aVar) {
        this.mEventBusProvider = aVar;
    }

    public static C16560a create(C41084a aVar) {
        return new AccountItemView_MembersInjector(aVar);
    }

    public static void injectMEventBus(AccountItemView accountItemView, C41438c cVar) {
        accountItemView.mEventBus = cVar;
    }

    public void injectMembers(AccountItemView accountItemView) {
        injectMEventBus(accountItemView, (C41438c) this.mEventBusProvider.get());
    }
}

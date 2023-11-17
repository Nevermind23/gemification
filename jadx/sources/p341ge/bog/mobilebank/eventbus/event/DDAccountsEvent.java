package p341ge.bog.mobilebank.eventbus.event;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;

/* renamed from: ge.bog.mobilebank.eventbus.event.DDAccountsEvent */
public class DDAccountsEvent extends RootEvent {
    public ArrayList<DDPaymentAccount> ddAccounts;
}

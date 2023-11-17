package p341ge.bog.mobilebank.giftcards.presentation.success;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.success.C24374a;
import p341ge.bog.mobilebank.model.Client;
import wh0.C29397e;
import wh0.C29398f;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.success.GiftCardsSuccessViewModel$ViewModel */
public final class GiftCardsSuccessViewModel$ViewModel extends C21481a {

    /* renamed from: d */
    private final C29397e f62946d;

    /* renamed from: e */
    private final Client f62947e;

    /* renamed from: f */
    private final C1644x f62948f;

    /* renamed from: g */
    private final C1644x f62949g = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftCardsSuccessViewModel$ViewModel(C29398f fVar, C29397e eVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getDraftPurchaseModel");
        C41536l.m120489i(eVar, "clientGiftCardsUseCase");
        C41536l.m120489i(client, "client");
        this.f62946d = eVar;
        this.f62947e = client;
        this.f62948f = new C1644x(fVar.mo69239a());
    }

    /* renamed from: dw */
    public LiveData mo62081dw() {
        return this.f62948f;
    }

    /* renamed from: ew */
    public LiveData mo62082ew() {
        return this.f62949g;
    }

    /* renamed from: fw */
    public void mo62083fw() {
        C37224b.m109966e(this.f62949g, C24374a.C24376b.f62951a);
    }

    /* renamed from: gw */
    public void mo62084gw() {
        C29397e eVar = this.f62946d;
        String clientKey = this.f62947e.getUserInfo().getClient().getClientKey();
        C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
        eVar.mo69238a(clientKey, true).mo94979E0();
        C37224b.m109966e(this.f62949g, C24374a.C24375a.f62950a);
    }

    /* renamed from: l */
    public void mo62085l() {
        C29397e eVar = this.f62946d;
        String clientKey = this.f62947e.getUserInfo().getClient().getClientKey();
        C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
        eVar.mo69238a(clientKey, true).mo94979E0();
        C37224b.m109966e(this.f62949g, C24374a.C24375a.f62950a);
    }
}

package p341ge.bog.mobilebank.transfers.other_transfer_type;

import androidx.lifecycle.C1644x;
import b71.C31139e;
import b71.C31140f;
import b71.C31141g;
import b71.C31145k;
import b71.C31146l;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34951c;
import p366bk.C10320i;
import p738du.C20101a;
import p748eu.C20292b;
import p748eu.C20294d;
import p881ru.C28106n;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.f */
public final class C34968f extends C21481a {

    /* renamed from: d */
    private final PreferencesApiManager f84420d;

    /* renamed from: e */
    private final C28106n f84421e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C34948a f84422f;

    /* renamed from: g */
    private final C20292b f84423g;

    /* renamed from: h */
    private final OtherTransferTypeState f84424h;

    /* renamed from: i */
    private final C1644x f84425i = new C1644x();

    /* renamed from: j */
    private final C1644x f84426j = new C1644x();

    /* renamed from: k */
    private final C1644x f84427k = new C1644x();

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.f$a */
    static final class C34969a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34968f f84428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34969a(C34968f fVar) {
            super(1);
            this.f84428d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "loaded");
            if (bool.booleanValue()) {
                this.f84428d.mo85506kw().mo4823o(this.f84428d.m102819jw());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.f$b */
    static final class C34970b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34968f f84429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34970b(C34968f fVar) {
            super(1);
            this.f84429d = fVar;
        }

        /* renamed from: a */
        public final void mo85508a(List list) {
            C1644x hw = this.f84429d.mo85504hw();
            C34948a fw = this.f84429d.f84422f;
            C41536l.m120488h(list, "it");
            hw.mo4823o(fw.mo85473b(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85508a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34968f(PreferencesApiManager preferencesApiManager, C28106n nVar, C34948a aVar, C20292b bVar, C20294d dVar, OtherTransferTypeState otherTransferTypeState) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(nVar, "loadContactsUseCase");
        C41536l.m120489i(aVar, "contactsMapper");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(dVar, "internalAppSettingsLoadedUseCase");
        C41536l.m120489i(otherTransferTypeState, "otherTransferTypeState");
        this.f84420d = preferencesApiManager;
        this.f84421e = nVar;
        this.f84422f = aVar;
        this.f84423g = bVar;
        this.f84424h = otherTransferTypeState;
        C41205b F0 = dVar.mo48777a().mo94981F0(new C31140f(new C34969a(this)));
        C41536l.m120488h(F0, "internalAppSettingsLoade…          }\n            }");
        bindToLifecycle(F0);
        if (otherTransferTypeState.mo84141b()) {
            mo85505iw().mo4823o(Boolean.TRUE);
            m102820lw();
        }
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public final List m102819jw() {
        boolean z;
        int i = C10320i.icons_16_payment_category_government;
        int i2 = C10320i.icons_16_payment_category_mobile_all;
        List p = C41341q.m119913p(new C34951c.C34952a.C34957e(C32343x.m95388F("text.transfer.withinbank", new Object[0]), C31145k.TRANSFER_WITHIN_BOG), new C34951c.C34952a.C34958f(i, C32343x.m95388F("text.transfer.withinbank.byacct", new Object[0]), C31146l.BOG_ACC_NO), new C34951c.C34952a.C34958f(i2, C32343x.m95388F("text.transfer.withinbank.byphone", new Object[0]), C31146l.BOG_PHONE), new C34951c.C34952a.C34958f(C10320i.icons_16_general_id, C32343x.m95388F("text.transfer.withinbank.bypin", new Object[0]), C31146l.BOG_PIN), new C34951c.C34952a.C34957e(C32343x.m95388F("text.transfer.external", new Object[0]), C31145k.TRANSFER_EXTERNAL), new C34951c.C34952a.C34956d(i, C32343x.m95388F("text.transfer.external.byacct.desc", new Object[0]), C32343x.m95388F("text.transfer.external.byacct", new Object[0]), C31141g.EXTERNAL_ACC_NO, false, false, (Integer) null, 112, (DefaultConstructorMarker) null));
        if (C20101a.f54724a.mo48500d(this.f84423g) && this.f84424h.mo84142d()) {
            if (!this.f84424h.mo84141b()) {
                int p2pToolTipCounter = this.f84420d.getP2pToolTipCounter();
                if (p2pToolTipCounter <= 3) {
                    this.f84420d.setP2pToolTipCounter(p2pToolTipCounter + 1);
                }
                if (p2pToolTipCounter <= 3) {
                    z = true;
                    p.add(new C34951c.C34952a.C34956d(i2, C32343x.m95388F("text.transfer.external.byphone.desc", new Object[0]), C32343x.m95388F("text.transfer.external.byphone", new Object[0]), C31141g.EXTERNAL__PHONE, z, true, Integer.valueOf(C10320i.f28671N4)));
                }
            }
            z = false;
            p.add(new C34951c.C34952a.C34956d(i2, C32343x.m95388F("text.transfer.external.byphone.desc", new Object[0]), C32343x.m95388F("text.transfer.external.byphone", new Object[0]), C31141g.EXTERNAL__PHONE, z, true, Integer.valueOf(C10320i.f28671N4)));
        }
        return p;
    }

    /* renamed from: lw */
    private final void m102820lw() {
        C40749p O = this.f84421e.mo67641b(false, 10L).mo95075O();
        C41536l.m120488h(O, "loadContactsUseCase(false, 10).toObservable()");
        C41205b F0 = C32343x.m95462k1(O).mo94981F0(new C31139e(new C34970b(this)));
        C41536l.m120488h(F0, "private fun loadContacts…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m102821mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public C1644x mo85504hw() {
        return this.f84425i;
    }

    /* renamed from: iw */
    public C1644x mo85505iw() {
        return this.f84427k;
    }

    /* renamed from: kw */
    public C1644x mo85506kw() {
        return this.f84426j;
    }
}

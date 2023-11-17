package p341ge.bog.mobilebank.linksharing.presentation.link;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cp0.C12023b;
import cp0.C12024c;
import cp0.C12027f;
import dp0.C12419a;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp0.C16534e;
import kp0.C16535f;
import kp0.C16536g;
import kp0.C16537h;
import kp0.C16538i;
import kp0.C16539j;
import m41.C37224b;
import mp0.C16889a;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.linksharing.domain.model.P2PLink;
import p341ge.bog.mobilebank.linksharing.presentation.link.C15173b;
import p341ge.bog.mobilebank.linksharing.presentation.link.C15178c;
import p380ck.C10464h;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel */
public final class P2PLinkSharingViewModel$ViewModel extends C21481a implements C16534e, C16535f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12023b f43476d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12024c f43477e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12027f f43478f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16889a f43479g;

    /* renamed from: h */
    private final C16534e f43480h = this;

    /* renamed from: i */
    private final C16535f f43481i = this;

    /* renamed from: j */
    private final C1644x f43482j = new C1644x(C15178c.C15182c.f43507b);

    /* renamed from: k */
    private final C1644x f43483k = new C1644x();

    /* renamed from: l */
    private final C40767b f43484l;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$a */
    static final class C15158a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43485d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$a$a */
        static final class C15159a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C15159a f43486d = new C15159a();

            C15159a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(List list, P2PLink p2PLink) {
                C41536l.m120489i(list, "accounts");
                C41536l.m120489i(p2PLink, "link");
                return C41233s.m119492a(list, p2PLink);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15158a(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
            super(1);
            this.f43485d = p2PLinkSharingViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m55399c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40762x T = C40762x.m118154T(this.f43485d.f43476d.mo32117a(true), this.f43485d.f43477e.mo32118a(true), new C15191f(C15159a.f43486d));
            C41536l.m120488h(T, "zip(\n                   …ink -> accounts to link }");
            return C31270e.m92880i(T, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$b */
    static final class C15160b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43487d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$b$a */
        static final class C15161a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43488d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15161a(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(1);
                this.f43488d = p2PLinkSharingViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f43488d.mo42195Y0().mo4826r(C15178c.C15181b.f43506b);
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$b$b */
        static final class C15162b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43489d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15162b(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(1);
                this.f43489d = p2PLinkSharingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42204a(C41224m mVar) {
                this.f43489d.mo42195Y0().mo4826r(C15178c.C15182c.f43507b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42204a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$b$c */
        static final class C15163c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43490d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15163c(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(1);
                this.f43490d = p2PLinkSharingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42205a(C41224m mVar) {
                Object obj;
                CreditCardSmallPickerView.C13279b bVar;
                int i;
                String str;
                boolean z;
                boolean z2;
                List list = (List) mVar.mo95675a();
                P2PLink p2PLink = (P2PLink) mVar.mo95676b();
                C41536l.m120488h(list, "accounts");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long b = ((C12419a) obj).mo33018b();
                    Long b2 = p2PLink.mo42132b();
                    if (b2 != null && b == b2.longValue()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                C12419a aVar = (C12419a) obj;
                C1644x ow = this.f43490d.mo42195Y0();
                if (!p2PLink.mo42137f()) {
                    bVar = CreditCardSmallPickerView.C13279b.C13280a.f39265a;
                } else if (aVar == null || (bVar = this.f43490d.f43479g.mo44058a(aVar)) == null) {
                    bVar = CreditCardSmallPickerView.C13279b.C13280a.f39265a;
                }
                CreditCardSmallPickerView.C13279b bVar2 = bVar;
                if (p2PLink.mo42137f()) {
                    i = C41358y.m120012b0(list, aVar);
                } else {
                    i = -1;
                }
                int i2 = i;
                if (aVar == null || !p2PLink.mo42137f()) {
                    str = C32343x.m95388F("text.p2p.link.choose.account", new Object[0]);
                } else {
                    str = aVar.mo33017a();
                    if (str == null) {
                        str = aVar.mo33019c();
                    }
                }
                String str2 = str;
                String e = p2PLink.mo42135e();
                if (e == null) {
                    e = "";
                }
                String str3 = e;
                if (!p2PLink.mo42137f() || aVar == null) {
                    z = false;
                } else {
                    z = true;
                }
                ow.mo4826r(new C15178c.C15185e(bVar2, i2, str2, str3, z, p2PLink.mo42138g()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42205a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15160b(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
            super(1);
            this.f43487d = p2PLinkSharingViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42202a(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92643e(aVar, (int[]) null, new C15161a(this.f43487d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C15162b(this.f43487d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C15163c(this.f43487d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42202a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$c */
    static final class C15164c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43491d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$c$a */
        static final class C15165a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ Integer f43492d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15165a(Integer num) {
                super(1);
                this.f43492d = num;
            }

            /* renamed from: a */
            public final Long invoke(List list) {
                C41536l.m120489i(list, "it");
                Integer num = this.f43492d;
                C41536l.m120488h(num, "position");
                return Long.valueOf(((C12419a) list.get(num.intValue())).mo33018b());
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$c$b */
        static final class C15166b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C15166b f43493d = new C15166b();

            C15166b() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(P2PLink p2PLink) {
                C41536l.m120489i(p2PLink, "it");
                return p2PLink.mo42133d();
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$c$c */
        static final class C15167c extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C15167c f43494d = new C15167c();

            C15167c() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(Long l, String str) {
                C41536l.m120489i(l, "acctKey");
                C41536l.m120489i(str, "linkNickName");
                return C41233s.m119492a(l, str);
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$c$d */
        static final class C15168d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43495d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15168d(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(1);
                this.f43495d = p2PLinkSharingViewModel$ViewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public static final C41238w m55418d() {
                return C41238w.f97225a;
            }

            /* renamed from: c */
            public final C40735b0 invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                Long l = (Long) mVar.mo95675a();
                String str = (String) mVar.mo95676b();
                C12027f kw = this.f43495d.f43478f;
                C41536l.m120488h(l, "acctKey");
                long longValue = l.longValue();
                C41536l.m120488h(str, "linkNickName");
                return kw.mo32121a(longValue, str).mo94892L(new C15196k());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15164c(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
            super(1);
            this.f43491d = p2PLinkSharingViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final Long m55409f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Long) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final String m55410g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (String) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final C41224m m55411h(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final C40735b0 m55412i(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* renamed from: e */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "position");
            C40762x r = C40762x.m118154T(C12023b.m44158b(this.f43491d.f43476d, false, 1, (Object) null).mo95062A(new C15192g(new C15165a(num))), C12024c.m44160b(this.f43491d.f43477e, false, 1, (Object) null).mo95062A(new C15193h(C15166b.f43493d)), new C15194i(C15167c.f43494d)).mo95087r(new C15195j(new C15168d(this.f43491d)));
            C41536l.m120488h(r, "private fun subscribeToU…ndToLifecycle()\n        }");
            return C31270e.m92880i(r, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$d */
    static final class C15169d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43496d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$d$a */
        static final class C15170a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43497d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15170a(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(1);
                this.f43497d = p2PLinkSharingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42212a(C41238w wVar) {
                this.f43497d.onRefresh(2);
                C37224b.m109965d(this.f43497d.mo42194R6(), new C15173b.C15177c(C32343x.m95388F("text.p2p.link.active.link.update.acct", new Object[0])));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo42212a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.P2PLinkSharingViewModel$ViewModel$d$b */
        static final class C15171b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ P2PLinkSharingViewModel$ViewModel f43498d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15171b(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
                super(2);
                this.f43498d = p2PLinkSharingViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo42213a(Throwable th, C41238w wVar) {
                C41536l.m120489i(th, "error");
                C1644x lw = this.f43498d.mo42194R6();
                String Z = C32343x.m95428Z(th, C32343x.m95388F("text.p2p.link.active.link.update.acct.error", new Object[0]));
                if (Z == null) {
                    Z = "";
                }
                C37224b.m109965d(lw, new C15173b.C15176b(Z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo42213a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15169d(P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel) {
            super(1);
            this.f43496d = p2PLinkSharingViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42211a(C31128a aVar) {
            P2PLinkSharingViewModel$ViewModel p2PLinkSharingViewModel$ViewModel = this.f43496d;
            C41536l.m120488h(aVar, "invoke$lambda$0");
            C31132b.m92648j(aVar, (int[]) null, new C15170a(p2PLinkSharingViewModel$ViewModel), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C15171b(p2PLinkSharingViewModel$ViewModel), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42211a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2PLinkSharingViewModel$ViewModel(C12023b bVar, C12024c cVar, C12027f fVar, C16889a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "p2pGetAccountsUseCase");
        C41536l.m120489i(cVar, "p2pGetLinkUseCase");
        C41536l.m120489i(fVar, "updateLinkAccountUseCase");
        C41536l.m120489i(aVar, "mapper");
        this.f43476d = bVar;
        this.f43477e = cVar;
        this.f43478f = fVar;
        this.f43479g = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f43484l = h1;
        C32343x.m95397J0(this, "P2P_link", (String) null, "P2P_link_intro_view", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m55385pw();
        m55388sw();
    }

    /* renamed from: pw */
    private final void m55385pw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16538i(new C15158a(this)));
        C41536l.m120488h(L0, "private fun prepareP2PLi…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16539j(new C15160b(this)));
        C41536l.m120488h(F0, "private fun prepareP2PLi…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final C40754t m55386qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m55387rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: sw */
    private final void m55388sw() {
        C40749p L0 = this.f43484l.mo94989L0(new C16536g(new C15164c(this)));
        C41536l.m120488h(L0, "private fun subscribeToU…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16537h(new C15169d(this)));
        C41536l.m120488h(F0, "private fun subscribeToU…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m55389tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m55390uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hd */
    public void mo42193Hd(int i) {
        C15178c cVar = (C15178c) mo42195Y0().mo4814f();
        if (cVar != null && cVar.mo42225c() && cVar.mo42224b() != i) {
            this.f43484l.onNext(Integer.valueOf(i));
        }
    }

    /* renamed from: lw */
    public C1644x mo42194R6() {
        return this.f43483k;
    }

    /* renamed from: mw */
    public final C16534e mo42197mw() {
        return this.f43480h;
    }

    /* renamed from: nw */
    public final C16535f mo42198nw() {
        return this.f43481i;
    }

    /* renamed from: ow */
    public C1644x mo42195Y0() {
        return this.f43482j;
    }
}

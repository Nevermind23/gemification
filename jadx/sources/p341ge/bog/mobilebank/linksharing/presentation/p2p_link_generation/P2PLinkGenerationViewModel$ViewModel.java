package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import cp0.C12022a;
import cp0.C12023b;
import cp0.C12028g;
import dp0.C12419a;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import mp0.C16889a;
import mp0.C16897i;
import mp0.C16898j;
import mp0.C16899k;
import mp0.C16900l;
import mp0.C16901m;
import mp0.C16902n;
import mp0.C16903o;
import mp0.C16904p;
import mp0.C16907s;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.list.C13368e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p380ck.C10464h;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel */
public final class P2PLinkGenerationViewModel$ViewModel extends C21481a implements C16897i, C15263g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12023b f43586d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12028g f43587e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12022a f43588f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16889a f43589g;

    /* renamed from: h */
    private final C16907s f43590h;

    /* renamed from: i */
    private final C16897i f43591i = this;

    /* renamed from: j */
    private final C15263g f43592j = this;

    /* renamed from: k */
    private final C1644x f43593k;

    /* renamed from: l */
    private final C1644x f43594l;

    /* renamed from: m */
    private final C1644x f43595m;

    /* renamed from: n */
    private final C1644x f43596n;

    /* renamed from: o */
    private final C40765a f43597o;

    /* renamed from: p */
    private final C40767b f43598p;

    /* renamed from: q */
    private final C40767b f43599q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C40767b f43600r;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$b */
    static final class C15240b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15240b(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(2);
            this.f43610d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42300a(String str, String str2) {
            C41536l.m120489i(str, "nickname");
            C41536l.m120489i(str2, "cardId");
            this.f43610d.f43600r.onNext(C41233s.m119492a(str, Long.valueOf(Long.parseLong(str2))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo42300a((String) obj, (String) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$c */
    static final class C15241c extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15241c(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(2);
            this.f43611d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42301a(String str, String str2) {
            C41536l.m120489i(str, "<anonymous parameter 0>");
            C41536l.m120489i(str2, "<anonymous parameter 1>");
            C37224b.m109965d(this.f43611d.mo42281uw(), C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo42301a((String) obj, (String) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$d */
    static final class C15242d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43612d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$d$a */
        static final class C15243a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ Integer f43613d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C15243a(Integer num) {
                super(1);
                this.f43613d = num;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "accounts");
                return C41233s.m119492a(this.f43613d, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15242d(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43612d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m55579c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "position");
            return C12023b.m44158b(this.f43612d.f43586d, false, 1, (Object) null).mo95075O().mo95026k0(new C15264h(new C15243a(num)));
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$e */
    static final class C15244e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15244e(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43614d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42304a(C41224m mVar) {
            int i;
            String str;
            Object obj;
            Integer num = (Integer) mVar.mo95675a();
            List list = (List) mVar.mo95676b();
            C15239a aVar = null;
            if (num != null && num.intValue() == -1) {
                C41536l.m120488h(list, "accounts");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C12419a) obj).mo33025h()) {
                        break;
                    }
                }
                C12419a aVar2 = (C12419a) obj;
                if (aVar2 != null) {
                    i = list.indexOf(aVar2);
                } else {
                    i = 0;
                }
            } else {
                C41536l.m120488h(num, "position");
                i = num.intValue();
            }
            int i2 = i;
            C1644x xw = this.f43614d.mo42277Mj();
            C15239a aVar3 = (C15239a) this.f43614d.mo42277Mj().mo4814f();
            if (aVar3 != null) {
                CreditCardSmallPickerView.C13279b.C13281b a = this.f43614d.f43589g.mo44058a((C12419a) list.get(i2));
                String a2 = ((C12419a) list.get(i2)).mo33017a();
                if (a2 == null) {
                    str = ((C12419a) list.get(i2)).mo33019c();
                } else {
                    str = a2;
                }
                aVar = C15239a.m55565b(aVar3, a, i2, (String) null, (List) null, false, (String) null, str, false, false, 444, (Object) null);
            }
            xw.mo4826r(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42304a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$f */
    static final class C15245f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15245f(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43615d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            long longValue = ((Number) mVar.mo95676b()).longValue();
            return C31270e.m92878g(this.f43615d.f43588f.mo32116a((String) mVar.mo95675a(), longValue), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$g */
    static final class C15246g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15246g(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43616d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42306a(C31128a aVar) {
            P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel = this.f43616d;
            C41536l.m120488h(aVar, "it");
            p2PLinkGenerationViewModel$ViewModel.m55551zw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42306a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$h */
    static final class C15247h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15247h(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43617d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42307a(C41238w wVar) {
            this.f43617d.m55534Pw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42307a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$i */
    static final class C15248i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15248i(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43618d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "nickname");
            return C31270e.m92878g(this.f43618d.f43587e.mo32122a(str), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$j */
    static final class C15249j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkGenerationViewModel$ViewModel f43619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15249j(P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel) {
            super(1);
            this.f43619d = p2PLinkGenerationViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo42309a(C31128a aVar) {
            P2PLinkGenerationViewModel$ViewModel p2PLinkGenerationViewModel$ViewModel = this.f43619d;
            C41536l.m120488h(aVar, "requestedResult");
            p2PLinkGenerationViewModel$ViewModel.m55521Aw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42309a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2PLinkGenerationViewModel$ViewModel(C12023b bVar, C12028g gVar, C12022a aVar, C16889a aVar2, C16907s sVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C12023b bVar2 = bVar;
        C12028g gVar2 = gVar;
        C12022a aVar3 = aVar;
        C16889a aVar4 = aVar2;
        C16907s sVar2 = sVar;
        C41536l.m120489i(bVar2, "p2pGetAccountsUseCase");
        C41536l.m120489i(gVar2, "validateNicknameUseCase");
        C41536l.m120489i(aVar3, "createLinkUseCase");
        C41536l.m120489i(aVar4, "mapper");
        C41536l.m120489i(sVar2, "validationMapper");
        this.f43586d = bVar2;
        this.f43587e = gVar2;
        this.f43588f = aVar3;
        this.f43589g = aVar4;
        this.f43590h = sVar2;
        this.f43593k = new C1644x(new C15239a((CreditCardSmallPickerView.C13279b) null, 0, (String) null, sVar2.mo44063a(""), false, (String) null, (String) null, false, false, 503, (DefaultConstructorMarker) null));
        this.f43594l = new C1644x();
        this.f43595m = new C1644x();
        this.f43596n = new C1644x();
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f43597o = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f43598p = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f43599q = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Pair<String, Long>>()");
        this.f43600r = h14;
        C32343x.m95397J0(this, "P2P_link", (String) null, "P2P_link_main_view", C10464h.C10465a.FACEBOOK, (Bundle) null, 18, (Object) null);
        m55523Ew();
        m55531Mw();
        m55529Kw();
        m55526Hw();
        h1.onNext(-1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m55521Aw(C31128a aVar) {
        C15239a aVar2;
        C15239a aVar3;
        boolean z;
        C15239a aVar4;
        String str;
        String a0;
        C31128a aVar5 = aVar;
        C1644x xw = mo42277Mj();
        C15239a aVar6 = (C15239a) mo42277Mj().mo4814f();
        C15239a aVar7 = null;
        if (aVar6 != null) {
            aVar2 = C15239a.m55565b(aVar6, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, false, (String) null, (String) null, false, true, C11051p3.f31759c, (Object) null);
        } else {
            aVar2 = null;
        }
        xw.mo4826r(aVar2);
        if (aVar5 instanceof C31128a.C31130b) {
            C1644x xw2 = mo42277Mj();
            C15239a aVar8 = (C15239a) mo42277Mj().mo4814f();
            if (aVar8 != null) {
                aVar7 = C15239a.m55565b(aVar8, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, false, (String) null, (String) null, true, false, 383, (Object) null);
            }
            xw2.mo4826r(aVar7);
        } else {
            boolean z2 = true;
            if (aVar5 instanceof C31128a.C31129a) {
                C1644x xw3 = mo42277Mj();
                C15239a aVar9 = (C15239a) mo42277Mj().mo4814f();
                if (aVar9 != null) {
                    C31128a.C31129a aVar10 = (C31128a.C31129a) aVar5;
                    if (!(aVar10.mo71342c() instanceof ApiError) || (a0 = C32343x.m95431a0(aVar10.mo71342c(), (String) null, 1, (Object) null)) == null) {
                        str = "";
                    } else {
                        str = a0;
                    }
                    aVar4 = C15239a.m55565b(aVar9, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, false, str, (String) null, false, false, 335, (Object) null);
                } else {
                    aVar4 = null;
                }
                xw3.mo4826r(aVar4);
                C31128a.C31129a aVar11 = (C31128a.C31129a) aVar5;
                if (!(aVar11.mo71342c() instanceof ApiError)) {
                    m55522Dw(C32343x.m95431a0(aVar11.mo71342c(), (String) null, 1, (Object) null));
                    return;
                }
            } else {
                if (aVar5 instanceof C31128a.C31131c) {
                    C1644x xw4 = mo42277Mj();
                    C15239a aVar12 = (C15239a) mo42277Mj().mo4814f();
                    if (aVar12 != null) {
                        aVar3 = C15239a.m55565b(aVar12, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, false, (String) null, (String) null, false, false, 383, (Object) null);
                    } else {
                        aVar3 = null;
                    }
                    xw4.mo4826r(aVar3);
                    C15239a aVar13 = (C15239a) mo42277Mj().mo4814f();
                    if (aVar13 != null) {
                        List j = aVar13.mo42297j();
                        if (!(j instanceof Collection) || !j.isEmpty()) {
                            Iterator it = j.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C41224m) it.next()).mo95680f() == C13368e.POSITIVE) {
                                        z = true;
                                        continue;
                                    } else {
                                        z = false;
                                        continue;
                                    }
                                    if (!z) {
                                        z2 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            C1644x xw5 = mo42277Mj();
                            C15239a aVar14 = (C15239a) mo42277Mj().mo4814f();
                            if (aVar14 != null) {
                                C41536l.m120488h(aVar14, C11755a.C11756a.f34100b);
                                aVar7 = C15239a.m55565b(aVar14, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, true, C32343x.m95388F("text.p2p.link.customize.link.success.validation", new Object[0]), (String) null, false, false, 463, (Object) null);
                            }
                            xw5.mo4826r(aVar7);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Dw */
    private final void m55522Dw(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C1644x yw = mo42286z9();
            if (str == null) {
                str = "";
            }
            C37224b.m109965d(yw, str);
        }
    }

    /* renamed from: Ew */
    private final void m55523Ew() {
        C40749p L0 = this.f43597o.mo94989L0(new C16898j(new C15242d(this)));
        C41536l.m120488h(L0, "private fun subscribeToA…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16899k(new C15244e(this)));
        C41536l.m120488h(F0, "private fun subscribeToA…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m55524Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m55525Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hw */
    private final void m55526Hw() {
        C40749p L0 = this.f43600r.mo94989L0(new C16903o(new C15245f(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16904p(new C15246g(this)));
        C41536l.m120488h(F0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C40754t m55527Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m55528Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m55529Kw() {
        C41205b F0 = this.f43599q.mo95032s(500, TimeUnit.MILLISECONDS).mo94981F0(new C16902n(new C15247h(this)));
        C41536l.m120488h(F0, "private fun subscribeToN…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final void m55530Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final void m55531Mw() {
        C40749p L0 = this.f43598p.mo94989L0(new C16900l(new C15248i(this)));
        C41536l.m120488h(L0, "private fun subscribeToN…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16901m(new C15249j(this)));
        C41536l.m120488h(F0, "private fun subscribeToN…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m55532Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m55533Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public final void m55534Pw() {
        boolean z;
        C15239a aVar = (C15239a) mo42277Mj().mo4814f();
        if (aVar != null) {
            List j = aVar.mo42297j();
            boolean z2 = true;
            if (!(j instanceof Collection) || !j.isEmpty()) {
                Iterator it = j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C41224m) it.next()).mo95680f() == C13368e.POSITIVE) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                this.f43598p.onNext(aVar.mo42292f());
            }
        }
    }

    /* renamed from: sw */
    private final void m55550sw(C43079p pVar) {
        C15239a aVar = (C15239a) mo42277Mj().mo4814f();
        if (aVar != null && aVar.mo42298k() && (aVar.mo42294h() instanceof CreditCardSmallPickerView.C13279b.C13281b)) {
            String f = aVar.mo42292f();
            String a = ((CreditCardSmallPickerView.C13279b.C13281b) aVar.mo42294h()).mo35473a();
            if (a == null) {
                a = "";
            }
            pVar.invoke(f, a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m55551zw(C31128a aVar) {
        C15239a aVar2;
        C1644x xw = mo42277Mj();
        C15239a aVar3 = (C15239a) mo42277Mj().mo4814f();
        if (aVar3 != null) {
            aVar2 = C15239a.m55565b(aVar3, (CreditCardSmallPickerView.C13279b) null, 0, (String) null, (List) null, false, (String) null, (String) null, aVar instanceof C31128a.C31130b, false, 383, (Object) null);
        } else {
            aVar2 = null;
        }
        xw.mo4826r(aVar2);
        if (aVar instanceof C31128a.C31129a) {
            m55522Dw(C32343x.m95431a0(((C31128a.C31129a) aVar).mo71342c(), (String) null, 1, (Object) null));
        }
        if (aVar instanceof C31128a.C31131c) {
            C37224b.m109965d(mo42279Yj(), C41238w.f97225a);
        }
    }

    /* renamed from: Bw */
    public void mo42274Bw() {
        m55550sw(new C15240b(this));
    }

    /* renamed from: Cw */
    public void mo42275Cw() {
        m55550sw(new C15241c(this));
    }

    /* renamed from: D8 */
    public void mo42276D8(int i) {
        this.f43597o.onNext(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* renamed from: Xr */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42278Xr(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "nickname"
            kotlin.jvm.internal.C41536l.m120489i(r15, r0)
            androidx.lifecycle.x r0 = r14.mo42277Mj()
            androidx.lifecycle.x r1 = r14.mo42277Mj()
            java.lang.Object r1 = r1.mo4814f()
            r2 = r1
            ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$a r2 = (p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel.C15239a) r2
            if (r2 == 0) goto L_0x005c
            r3 = 0
            r4 = 0
            mp0.s r1 = r14.f43590h
            java.util.List r6 = r1.mo44063a(r15)
            r7 = 0
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            int r1 = r15.length()
            r5 = 1
            r11 = 0
            if (r1 <= 0) goto L_0x002d
            r1 = r5
            goto L_0x002e
        L_0x002d:
            r1 = r11
        L_0x002e:
            if (r1 == 0) goto L_0x0053
            androidx.lifecycle.x r1 = r14.mo42277Mj()
            java.lang.Object r1 = r1.mo4814f()
            ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$a r1 = (p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel.C15239a) r1
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r1.mo42293g()
            if (r1 == 0) goto L_0x004f
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x004a
            r1 = r5
            goto L_0x004b
        L_0x004a:
            r1 = r11
        L_0x004b:
            if (r1 != r5) goto L_0x004f
            r1 = r5
            goto L_0x0050
        L_0x004f:
            r1 = r11
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            r11 = r5
        L_0x0053:
            r12 = 195(0xc3, float:2.73E-43)
            r13 = 0
            r5 = r15
            ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$a r15 = p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel.C15239a.m55565b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            r0.mo4826r(r15)
            ee1.b r15 = r14.f43599q
            he1.w r0 = he1.C41238w.f97225a
            r15.onNext(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel.mo42278Xr(java.lang.String):void");
    }

    /* renamed from: tw */
    public final C16897i mo42280tw() {
        return this.f43591i;
    }

    /* renamed from: uw */
    public C1644x mo42281uw() {
        return this.f43596n;
    }

    /* renamed from: vw */
    public C1644x mo42279Yj() {
        return this.f43595m;
    }

    /* renamed from: ww */
    public final C15263g mo42283ww() {
        return this.f43592j;
    }

    /* renamed from: xw */
    public C1644x mo42277Mj() {
        return this.f43593k;
    }

    /* renamed from: yw */
    public C1644x mo42286z9() {
        return this.f43594l;
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel$a */
    public static final class C15239a {

        /* renamed from: a */
        private final CreditCardSmallPickerView.C13279b f43601a;

        /* renamed from: b */
        private final int f43602b;

        /* renamed from: c */
        private final String f43603c;

        /* renamed from: d */
        private final List f43604d;

        /* renamed from: e */
        private final boolean f43605e;

        /* renamed from: f */
        private final String f43606f;

        /* renamed from: g */
        private final String f43607g;

        /* renamed from: h */
        private final boolean f43608h;

        /* renamed from: i */
        private final boolean f43609i;

        public C15239a(CreditCardSmallPickerView.C13279b bVar, int i, String str, List list, boolean z, String str2, String str3, boolean z2, boolean z3) {
            C41536l.m120489i(bVar, "selectedAccount");
            C41536l.m120489i(str, "nickname");
            C41536l.m120489i(list, "validationsList");
            C41536l.m120489i(str2, "nicknameInputInfo");
            C41536l.m120489i(str3, "cardPickerTitle");
            this.f43601a = bVar;
            this.f43602b = i;
            this.f43603c = str;
            this.f43604d = list;
            this.f43605e = z;
            this.f43606f = str2;
            this.f43607g = str3;
            this.f43608h = z2;
            this.f43609i = z3;
        }

        /* renamed from: b */
        public static /* synthetic */ C15239a m55565b(C15239a aVar, CreditCardSmallPickerView.C13279b bVar, int i, String str, List list, boolean z, String str2, String str3, boolean z2, boolean z3, int i2, Object obj) {
            C15239a aVar2 = aVar;
            int i3 = i2;
            return aVar.mo42287a((i3 & 1) != 0 ? aVar2.f43601a : bVar, (i3 & 2) != 0 ? aVar2.f43602b : i, (i3 & 4) != 0 ? aVar2.f43603c : str, (i3 & 8) != 0 ? aVar2.f43604d : list, (i3 & 16) != 0 ? aVar2.f43605e : z, (i3 & 32) != 0 ? aVar2.f43606f : str2, (i3 & 64) != 0 ? aVar2.f43607g : str3, (i3 & 128) != 0 ? aVar2.f43608h : z2, (i3 & C11398b.f33139r) != 0 ? aVar2.f43609i : z3);
        }

        /* renamed from: a */
        public final C15239a mo42287a(CreditCardSmallPickerView.C13279b bVar, int i, String str, List list, boolean z, String str2, String str3, boolean z2, boolean z3) {
            C41536l.m120489i(bVar, "selectedAccount");
            C41536l.m120489i(str, "nickname");
            C41536l.m120489i(list, "validationsList");
            String str4 = str2;
            C41536l.m120489i(str4, "nicknameInputInfo");
            String str5 = str3;
            C41536l.m120489i(str5, "cardPickerTitle");
            return new C15239a(bVar, i, str, list, z, str4, str5, z2, z3);
        }

        /* renamed from: c */
        public final String mo42288c() {
            return this.f43607g;
        }

        /* renamed from: d */
        public final boolean mo42289d() {
            return this.f43609i;
        }

        /* renamed from: e */
        public final boolean mo42290e() {
            return this.f43608h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15239a)) {
                return false;
            }
            C15239a aVar = (C15239a) obj;
            return C41536l.m120484d(this.f43601a, aVar.f43601a) && this.f43602b == aVar.f43602b && C41536l.m120484d(this.f43603c, aVar.f43603c) && C41536l.m120484d(this.f43604d, aVar.f43604d) && this.f43605e == aVar.f43605e && C41536l.m120484d(this.f43606f, aVar.f43606f) && C41536l.m120484d(this.f43607g, aVar.f43607g) && this.f43608h == aVar.f43608h && this.f43609i == aVar.f43609i;
        }

        /* renamed from: f */
        public final String mo42292f() {
            return this.f43603c;
        }

        /* renamed from: g */
        public final String mo42293g() {
            return this.f43606f;
        }

        /* renamed from: h */
        public final CreditCardSmallPickerView.C13279b mo42294h() {
            return this.f43601a;
        }

        public int hashCode() {
            int hashCode = ((((((this.f43601a.hashCode() * 31) + this.f43602b) * 31) + this.f43603c.hashCode()) * 31) + this.f43604d.hashCode()) * 31;
            boolean z = this.f43605e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (((((hashCode + (z ? 1 : 0)) * 31) + this.f43606f.hashCode()) * 31) + this.f43607g.hashCode()) * 31;
            boolean z3 = this.f43608h;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode2 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f43609i;
            if (!z4) {
                z2 = z4;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final int mo42296i() {
            return this.f43602b;
        }

        /* renamed from: j */
        public final List mo42297j() {
            return this.f43604d;
        }

        /* renamed from: k */
        public final boolean mo42298k() {
            return this.f43605e;
        }

        public String toString() {
            CreditCardSmallPickerView.C13279b bVar = this.f43601a;
            int i = this.f43602b;
            String str = this.f43603c;
            List list = this.f43604d;
            boolean z = this.f43605e;
            String str2 = this.f43606f;
            String str3 = this.f43607g;
            boolean z2 = this.f43608h;
            boolean z3 = this.f43609i;
            return "P2PLinkGenerationUiState(selectedAccount=" + bVar + ", selectedAccountPosition=" + i + ", nickname=" + str + ", validationsList=" + list + ", isNicknameValid=" + z + ", nicknameInputInfo=" + str2 + ", cardPickerTitle=" + str3 + ", generateButtonLoading=" + z2 + ", clearInputInfo=" + z3 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C15239a(p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView.C13279b r13, int r14, java.lang.String r15, java.util.List r16, boolean r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$a r1 = p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView.C13279b.C13280a.f39265a
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r13
            L_0x000b:
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0012
                r1 = -1
                r4 = r1
                goto L_0x0013
            L_0x0012:
                r4 = r14
            L_0x0013:
                r1 = r0 & 4
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r15
            L_0x001c:
                r1 = r0 & 16
                r6 = 0
                if (r1 == 0) goto L_0x0023
                r7 = r6
                goto L_0x0025
            L_0x0023:
                r7 = r17
            L_0x0025:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x002b
                r8 = r2
                goto L_0x002d
            L_0x002b:
                r8 = r18
            L_0x002d:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0033
                r9 = r2
                goto L_0x0035
            L_0x0033:
                r9 = r19
            L_0x0035:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x003b
                r10 = r6
                goto L_0x003d
            L_0x003b:
                r10 = r20
            L_0x003d:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0043
                r11 = r6
                goto L_0x0045
            L_0x0043:
                r11 = r21
            L_0x0045:
                r2 = r12
                r6 = r16
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.P2PLinkGenerationViewModel$ViewModel.C15239a.<init>(ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b, int, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}

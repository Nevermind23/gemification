package o90;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import cf1.C40407d;
import ed1.C40762x;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import h00.C24842a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import i90.C25135a;
import i90.C25136b;
import j80.C25353a;
import j80.C25354b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k80.C25685a;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10464h;
import p871qu.C27865a;
import p942xq.C29823a;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: o90.u */
public final class C26868u extends C21481a {

    /* renamed from: o */
    public static final C26869a f67600o = new C26869a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C25354b f67601d;

    /* renamed from: e */
    private final C29823a f67602e;

    /* renamed from: f */
    private final C25353a f67603f;

    /* renamed from: g */
    private final Client f67604g;

    /* renamed from: h */
    private final PreferencesApiManager f67605h;

    /* renamed from: i */
    private final String f67606i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f67607j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f67608k = new C1644x();

    /* renamed from: l */
    private final C1644x f67609l = new C1644x(C32343x.m95466m(Boolean.FALSE));

    /* renamed from: m */
    private final C1644x f67610m = new C1644x();

    /* renamed from: n */
    private final C25135a f67611n;

    /* renamed from: o90.u$a */
    public static final class C26869a {
        private C26869a() {
        }

        public /* synthetic */ C26869a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: o90.u$b */
    public interface C26870b {
        /* renamed from: a */
        C26868u mo32787a(String str);
    }

    /* renamed from: o90.u$c */
    public /* synthetic */ class C26871c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67612a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                i90.b[] r0 = i90.C25136b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                i90.b r1 = i90.C25136b.CRI_APP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                i90.b r1 = i90.C25136b.CRI_OFFER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                i90.b r1 = i90.C25136b.CRI_REMITANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f67612a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o90.C26868u.C26871c.<clinit>():void");
        }
    }

    /* renamed from: o90.u$d */
    static final class C26872d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26872d(C26868u uVar) {
            super(1);
            this.f67613d = uVar;
        }

        /* renamed from: a */
        public final void mo66176a(C41205b bVar) {
            C21484c.m69417i(this.f67613d.f67608k, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66176a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$e */
    static final class C26873e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26873e(C26868u uVar) {
            super(1);
            this.f67614d = uVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f67614d.f67608k, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: o90.u$f */
    static final class C26874f extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C26874f f67615d = new C26874f();

        C26874f() {
            super(3);
        }

        /* renamed from: a */
        public final List invoke(List list, List list2, List list3) {
            C41536l.m120489i(list, "criApp");
            C41536l.m120489i(list2, "criOffer");
            C41536l.m120489i(list3, "criRemitance");
            return C41358y.m120023m0(C41358y.m120023m0(list, list2), list3);
        }
    }

    /* renamed from: o90.u$g */
    static final class C26875g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26875g(C26868u uVar) {
            super(1);
            this.f67616d = uVar;
        }

        /* renamed from: a */
        public final void mo66179a(C41205b bVar) {
            C21484c.m69417i(this.f67616d.f67607j, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66179a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$h */
    static final class C26876h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26876h(C26868u uVar) {
            super(1);
            this.f67617d = uVar;
        }

        /* renamed from: a */
        public final void mo66180a(List list) {
            C21484c.m69418j(this.f67617d.f67607j, C41238w.f97225a);
            C26868u uVar = this.f67617d;
            C41536l.m120488h(list, "it");
            uVar.m83553Vw(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66180a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$i */
    /* synthetic */ class C26877i extends C41519a implements C43075l {
        C26877i(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo66181b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66181b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$j */
    static final class C26878j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26878j(C26868u uVar) {
            super(1);
            this.f67618d = uVar;
        }

        /* renamed from: a */
        public final List invoke(C27865a aVar) {
            C41536l.m120489i(aVar, "it");
            return C41339p.m119900e(this.f67618d.m83554Ww(aVar, C25136b.CRI_APP));
        }
    }

    /* renamed from: o90.u$k */
    static final class C26879k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26879k(C26868u uVar) {
            super(1);
            this.f67619d = uVar;
        }

        /* renamed from: a */
        public final List invoke(C27865a aVar) {
            C41536l.m120489i(aVar, "it");
            return C41339p.m119900e(this.f67619d.m83554Ww(aVar, C25136b.CRI_OFFER));
        }
    }

    /* renamed from: o90.u$l */
    static final class C26880l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26880l(C26868u uVar) {
            super(1);
            this.f67620d = uVar;
        }

        /* renamed from: a */
        public final List invoke(C27865a aVar) {
            C41536l.m120489i(aVar, "it");
            return C41339p.m119900e(this.f67620d.m83554Ww(aVar, C25136b.CRI_REMITANCE));
        }
    }

    /* renamed from: o90.u$m */
    static final class C26881m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26868u f67621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26881m(C26868u uVar) {
            super(1);
            this.f67621d = uVar;
        }

        /* renamed from: a */
        public final void mo66185a(C41205b bVar) {
            C21484c.m69417i(this.f67621d.f67607j, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66185a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$n */
    /* synthetic */ class C26882n extends C41535k implements C43075l {
        C26882n(Object obj) {
            super(1, obj, C26868u.class, "getCreditInfoContracts", "getCreditInfoContracts(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo66186b(List list) {
            C41536l.m120489i(list, "p0");
            ((C26868u) this.receiver).m83538Dw(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66186b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.u$o */
    /* synthetic */ class C26883o extends C41519a implements C43075l {
        C26883o(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo66187b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66187b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26868u(C25354b bVar, C29823a aVar, C25353a aVar2, Client client, PreferencesApiManager preferencesApiManager, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getCreditInfoStatus");
        C41536l.m120489i(aVar, "getContract");
        C41536l.m120489i(aVar2, "confirmCri");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(str, "limitType");
        this.f67601d = bVar;
        this.f67602e = aVar;
        this.f67603f = aVar2;
        this.f67604g = client;
        this.f67605h = preferencesApiManager;
        this.f67606i = str;
        C25136b bVar2 = C25136b.RS;
        String Pw = m83549Pw();
        C41536l.m120488h(Pw, "customerName");
        String Rw = m83550Rw();
        C41536l.m120488h(Rw, "pin");
        this.f67611n = new C25135a(bVar2, C32343x.m95388F("text.credit.applications.rsge.popup.confirmation.text", Pw, Rw), (String) null, C32343x.m95388F("credit.application.CL.CRI.and.RS.action.sheet.checkbox.1", new Object[0]), false);
        mo66171Lw();
    }

    /* renamed from: Bw */
    private final List m83537Bw() {
        return (List) mo66172Q1().mo4814f();
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m83538Dw(List list) {
        C40762x xVar;
        C40762x xVar2;
        C40762x xVar3 = null;
        if (m83551Sw(list)) {
            xVar = this.f67602e.mo70086a("CREDIT_INFO_CHECK_PERMISSION_APPL_CL").mo95062A(new C26850q(new C26878j(this)));
        } else {
            xVar = null;
        }
        if (m83552Tw(list)) {
            xVar2 = this.f67602e.mo70086a("CREDIT_INFO_CHECK_PERMISSION_OFFERS_CL").mo95062A(new C26853r(new C26879k(this)));
        } else {
            xVar2 = null;
        }
        if (m83552Tw(list)) {
            xVar3 = this.f67602e.mo70086a("CRI_PERMISSION_ONREMITANCE_DATA_PROCESSING").mo95062A(new C26856s(new C26880l(this)));
        }
        if (xVar == null) {
            xVar = C40762x.m118162z(C41341q.m119907j());
        }
        if (xVar2 == null) {
            xVar2 = C40762x.m118162z(C41341q.m119907j());
        }
        if (xVar3 == null) {
            xVar3 = C40762x.m118162z(C41341q.m119907j());
        }
        C41205b I = C40762x.m118153S(xVar, xVar2, xVar3, new C26859t(C26874f.f67615d)).mo95063B(C40992a.m118827a()).mo95083l(new C26820i(new C26875g(this))).mo95070I(new C26824j(new C26876h(this)), new C26828k(new C26877i(this.f67607j)));
        C41536l.m120488h(I, "private fun getCreditInf… .bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m83539Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final List m83540Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final List m83541Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final List m83542Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final List m83543Iw(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (List) qVar.invoke(obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m83544Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final void m83545Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m83546Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m83547Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m83548Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Pw */
    private final String m83549Pw() {
        return this.f67604g.getUserInfo().getClient().getName(this.f67605h.getLanguage());
    }

    /* renamed from: Rw */
    private final String m83550Rw() {
        return this.f67604g.getUserInfo().getClient().pin;
    }

    /* renamed from: Sw */
    private final boolean m83551Sw(List list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25685a aVar = (C25685a) it.next();
            if (!C41536l.m120484d(aVar.mo64188a(), "CREDIT_INFO_GET_CUSTOMER_INFO") || !C41536l.m120484d(aVar.mo64189b(), PensionStatusResult.STATUS_INACTIVE)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Tw */
    private final boolean m83552Tw(List list) {
        boolean z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25685a aVar = (C25685a) it.next();
            if (!C41536l.m120484d(aVar.mo64188a(), " CREDIT_INFO_GET_CUSTOMER_INFO_OFFER") || !C41536l.m120484d(aVar.mo64189b(), PensionStatusResult.STATUS_INACTIVE)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public final void m83553Vw(List list) {
        this.f67610m.mo4823o(C41358y.m120023m0(C41339p.m119900e(this.f67611n), list));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public final C25135a m83554Ww(C27865a aVar, C25136b bVar) {
        String str;
        int i = C26871c.f67612a[bVar.ordinal()];
        if (i == 1) {
            str = C32343x.m95388F("credit.application.CL.CRI.and.RS.action.sheet.checkbox.2", new Object[0]);
        } else if (i == 2) {
            str = C32343x.m95388F("credit.application.CL.CRI.and.RS.action.sheet.checkbox.3", new Object[0]);
        } else if (i != 3) {
            str = "";
        } else {
            str = C32343x.m95388F("cri.permission.on.remitance", new Object[0]);
        }
        String a = aVar.mo67391a();
        C41536l.m120486f(a);
        return new C25135a(bVar, a, aVar.mo67395e(), str, false, 16, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m83573ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m83574xw(String str, C26868u uVar) {
        byte[] bArr;
        C41536l.m120489i(uVar, "this$0");
        if (str != null) {
            bArr = str.getBytes(C40407d.f95989b);
            C41536l.m120488h(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        String y = C32359z0.m95597y(bArr);
        C1644x xVar = uVar.f67608k;
        C41536l.m120488h(y, "rsEncodedContract");
        C21484c.m69418j(xVar, y);
        if (C41536l.m120484d(uVar.f67606i, C24842a.BNPL_LIMIT_APP.mo63277b())) {
            C32343x.m95397J0(uVar, "bnpl_check_my_limit", (String) null, "bnpl_check_my_limit_send_app", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        } else {
            C32343x.m95397J0(uVar, "check_my_limit", (String) null, "check_my_limit_send_app", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m83575yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final boolean m83576zw() {
        boolean z;
        List Bw = m83537Bw();
        boolean z2 = false;
        if (Bw == null) {
            return false;
        }
        if (!Bw.isEmpty()) {
            Iterator it = Bw.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C25135a aVar = (C25135a) it.next();
                if (aVar.mo63684e() != C25136b.CRI_OFFER && !aVar.mo63680a()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        return !z2;
    }

    /* renamed from: Aw */
    public final LiveData mo66169Aw() {
        return this.f67608k;
    }

    /* renamed from: Cw */
    public final LiveData mo66170Cw() {
        return this.f67607j;
    }

    /* renamed from: Lw */
    public final void mo66171Lw() {
        C41205b I = this.f67601d.mo63919a().mo95063B(C40992a.m118827a()).mo95083l(new C26816h(new C26881m(this))).mo95070I(new C26831l(new C26882n(this)), new C26834m(new C26883o(this.f67607j)));
        C41536l.m120488h(I, "fun getCreditInfoStatuse… .bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: Q1 */
    public final LiveData mo66172Q1() {
        return this.f67610m;
    }

    /* renamed from: Qw */
    public final LiveData mo66173Qw() {
        return this.f67609l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: i90.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: i90.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: i90.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: i90.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: i90.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Uw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66174Uw(i90.C25136b r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.util.List r0 = r4.m83537Bw()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r0.next()
            r3 = r2
            i90.a r3 = (i90.C25135a) r3
            i90.b r3 = r3.mo63684e()
            if (r3 != r5) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x0010
            r1 = r2
        L_0x0029:
            i90.a r1 = (i90.C25135a) r1
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r1.mo63686f(r6)
        L_0x0031:
            androidx.lifecycle.x r5 = r4.f67609l
            boolean r6 = r4.m83576zw()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m41.a r6 = g91.C32343x.m95466m(r6)
            r5.mo4823o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.C26868u.mo66174Uw(i90.b, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0132  */
    /* renamed from: vw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66175vw() {
        /*
            r15 = this;
            boolean r0 = r15.m83576zw()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.List r0 = r15.m83537Bw()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0039
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r0.next()
            r5 = r4
            i90.a r5 = (i90.C25135a) r5
            i90.b r5 = r5.mo63684e()
            i90.b r6 = i90.C25136b.RS
            if (r5 != r6) goto L_0x002b
            r5 = r1
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            if (r5 == 0) goto L_0x0014
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            i90.a r4 = (i90.C25135a) r4
            if (r4 == 0) goto L_0x0039
            java.lang.String r0 = r4.mo63681b()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            java.util.List r4 = r15.m83537Bw()
            if (r4 == 0) goto L_0x0063
            java.util.Iterator r4 = r4.iterator()
        L_0x0044:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005f
            java.lang.Object r5 = r4.next()
            r6 = r5
            i90.a r6 = (i90.C25135a) r6
            i90.b r6 = r6.mo63684e()
            i90.b r7 = i90.C25136b.CRI_APP
            if (r6 != r7) goto L_0x005b
            r6 = r1
            goto L_0x005c
        L_0x005b:
            r6 = r2
        L_0x005c:
            if (r6 == 0) goto L_0x0044
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            i90.a r5 = (i90.C25135a) r5
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            java.util.List r4 = r15.m83537Bw()
            if (r4 == 0) goto L_0x008d
            java.util.Iterator r4 = r4.iterator()
        L_0x006e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r4.next()
            r7 = r6
            i90.a r7 = (i90.C25135a) r7
            i90.b r7 = r7.mo63684e()
            i90.b r8 = i90.C25136b.CRI_OFFER
            if (r7 != r8) goto L_0x0085
            r7 = r1
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            if (r7 == 0) goto L_0x006e
            goto L_0x008a
        L_0x0089:
            r6 = r3
        L_0x008a:
            i90.a r6 = (i90.C25135a) r6
            goto L_0x008e
        L_0x008d:
            r6 = r3
        L_0x008e:
            java.util.List r4 = r15.m83537Bw()
            if (r4 == 0) goto L_0x00b7
            java.util.Iterator r4 = r4.iterator()
        L_0x0098:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r4.next()
            r8 = r7
            i90.a r8 = (i90.C25135a) r8
            i90.b r8 = r8.mo63684e()
            i90.b r9 = i90.C25136b.CRI_REMITANCE
            if (r8 != r9) goto L_0x00af
            r8 = r1
            goto L_0x00b0
        L_0x00af:
            r8 = r2
        L_0x00b0:
            if (r8 == 0) goto L_0x0098
            goto L_0x00b4
        L_0x00b3:
            r7 = r3
        L_0x00b4:
            i90.a r7 = (i90.C25135a) r7
            goto L_0x00b8
        L_0x00b7:
            r7 = r3
        L_0x00b8:
            if (r5 != 0) goto L_0x00c0
            if (r6 != 0) goto L_0x00c0
            if (r7 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r1 = r2
        L_0x00c0:
            if (r1 == 0) goto L_0x0132
            j80.a r8 = r15.f67603f
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            if (r5 == 0) goto L_0x00df
            java.lang.String r2 = r5.mo63681b()
            if (r2 == 0) goto L_0x00df
            java.nio.charset.Charset r4 = cf1.C40407d.f95989b
            byte[] r2 = r2.getBytes(r4)
            kotlin.jvm.internal.C41536l.m120488h(r2, r1)
            if (r2 == 0) goto L_0x00df
            java.lang.String r2 = g91.C32359z0.m95597y(r2)
            r9 = r2
            goto L_0x00e0
        L_0x00df:
            r9 = r3
        L_0x00e0:
            if (r5 == 0) goto L_0x00e8
            java.lang.String r2 = r5.mo63682c()
            r10 = r2
            goto L_0x00e9
        L_0x00e8:
            r10 = r3
        L_0x00e9:
            if (r6 == 0) goto L_0x0102
            java.lang.String r2 = r6.mo63681b()
            if (r2 == 0) goto L_0x0102
            java.nio.charset.Charset r4 = cf1.C40407d.f95989b
            byte[] r2 = r2.getBytes(r4)
            kotlin.jvm.internal.C41536l.m120488h(r2, r1)
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = g91.C32359z0.m95597y(r2)
            r11 = r2
            goto L_0x0103
        L_0x0102:
            r11 = r3
        L_0x0103:
            if (r6 == 0) goto L_0x010b
            java.lang.String r2 = r6.mo63682c()
            r12 = r2
            goto L_0x010c
        L_0x010b:
            r12 = r3
        L_0x010c:
            if (r7 == 0) goto L_0x0125
            java.lang.String r2 = r7.mo63681b()
            if (r2 == 0) goto L_0x0125
            java.nio.charset.Charset r4 = cf1.C40407d.f95989b
            byte[] r2 = r2.getBytes(r4)
            kotlin.jvm.internal.C41536l.m120488h(r2, r1)
            if (r2 == 0) goto L_0x0125
            java.lang.String r1 = g91.C32359z0.m95597y(r2)
            r13 = r1
            goto L_0x0126
        L_0x0125:
            r13 = r3
        L_0x0126:
            if (r7 == 0) goto L_0x012c
            java.lang.String r3 = r7.mo63682c()
        L_0x012c:
            r14 = r3
            ed1.b r1 = r8.mo63918a(r9, r10, r11, r12, r13, r14)
            goto L_0x0136
        L_0x0132:
            ed1.b r1 = ed1.C40734b.m117918i()
        L_0x0136:
            ed1.w r2 = gd1.C40992a.m118827a()
            ed1.b r1 = r1.mo94906z(r2)
            o90.u$d r2 = new o90.u$d
            r2.<init>(r15)
            o90.n r3 = new o90.n
            r3.<init>(r2)
            ed1.b r1 = r1.mo94904r(r3)
            o90.o r2 = new o90.o
            r2.<init>(r0, r15)
            o90.u$e r0 = new o90.u$e
            r0.<init>(r15)
            o90.p r3 = new o90.p
            r3.<init>(r0)
            hd1.b r0 = r1.mo94888G(r2, r3)
            java.lang.String r1 = "fun confirmCri() {\n     …).bindToLifecycle()\n    }"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r15.bindToLifecycle((hd1.C41205b) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.C26868u.mo66175vw():void");
    }
}

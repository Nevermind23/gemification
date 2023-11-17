package ic1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ba1.C10214s;
import cd1.C40393c;
import ce1.C40398b;
import dd1.C40484a4;
import dd1.C40511e4;
import dd1.C40520g1;
import dd1.C40529h4;
import dd1.C40561m4;
import dd1.C40578p1;
import dd1.C40621w0;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40762x;
import ee1.C40767b;
import gb1.C32381m;
import gb1.C32383o;
import gd1.C40992a;
import ha1.C15458b;
import hd1.C41204a;
import he1.C41238w;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kc1.C41463a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.sso_client.models.C35936d;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35963s;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.models.PasswordRules;
import pc1.C42117a;
import qa1.C27700a1;
import sso.type.AuthElementType;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ic1.h */
public final class C41286h extends C15458b implements C42117a {

    /* renamed from: h */
    private final Context f97321h;

    /* renamed from: i */
    private final C40621w0 f97322i;

    /* renamed from: j */
    private final C40529h4 f97323j;

    /* renamed from: k */
    private final C42117a f97324k;

    /* renamed from: l */
    private final C40520g1 f97325l;

    /* renamed from: m */
    private final C40561m4 f97326m;

    /* renamed from: n */
    private final C40484a4 f97327n;

    /* renamed from: o */
    private final C40511e4 f97328o;

    /* renamed from: p */
    private final C40393c f97329p;

    /* renamed from: q */
    private final C27700a1 f97330q;

    /* renamed from: r */
    private final C1644x f97331r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f97332s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f97333t = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C32383o f97334u = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C32383o f97335v = new C32383o();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f97336w = new C1644x();

    /* renamed from: x */
    private final ArrayList f97337x = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C32383o f97338y = new C32383o();

    /* renamed from: ic1.h$a */
    static final class C41287a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41287a f97339d = new C41287a();

        C41287a() {
            super(1);
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.h$b */
    static final class C41288b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41288b(C41286h hVar) {
            super(1);
            this.f97340d = hVar;
        }

        /* renamed from: a */
        public final void mo95772a(List list) {
            this.f97340d.f97336w.mo4823o(list);
            this.f97340d.mo95766vw().clear();
            ArrayList vw = this.f97340d.mo95766vw();
            C41286h hVar = this.f97340d;
            C41536l.m120488h(list, "it");
            vw.addAll(hVar.mo95760ow(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95772a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.h$c */
    static final class C41289c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41289c(C41286h hVar) {
            super(1);
            this.f97341d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f97341d.f97332s.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ic1.h$d */
    static final class C41290d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41290d(C41286h hVar) {
            super(1);
            this.f97342d = hVar;
        }

        /* renamed from: a */
        public final void mo95774a(PasswordRules passwordRules) {
            C41536l.m120489i(passwordRules, "passwordRules");
            this.f97342d.f97332s.mo4823o(new C35947l.C35951d(passwordRules));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95774a((PasswordRules) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.h$e */
    static final class C41291e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41291e(C41286h hVar) {
            super(1);
            this.f97343d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97343d.f97338y.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ic1.h$f */
    static final class C41292f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41292f(C41286h hVar) {
            super(1);
            this.f97344d = hVar;
        }

        /* renamed from: a */
        public final void mo95776a(C35963s sVar) {
            this.f97344d.f97338y.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo95776a((C35963s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ic1.h$g */
    static final class C41293g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41293g(C41286h hVar) {
            super(1);
            this.f97345d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97345d.f97334u.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ic1.h$h */
    static final class C41294h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41286h f97346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41294h(C41286h hVar) {
            super(0);
            this.f97346d = hVar;
        }

        public final void invoke() {
            this.f97346d.f97334u.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: ic1.h$i */
    static final class C41295i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41295i(C41286h hVar) {
            super(1);
            this.f97347d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97347d.f97335v.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* renamed from: ic1.h$j */
    static final class C41296j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41286h f97348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41296j(C41286h hVar) {
            super(0);
            this.f97348d = hVar;
        }

        public final void invoke() {
            this.f97348d.f97335v.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: ic1.h$k */
    static final class C41297k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41286h f97349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41297k(C41286h hVar) {
            super(0);
            this.f97349d = hVar;
        }

        public final void invoke() {
            this.f97349d.f97333t.mo4823o(C35947l.C35950c.f86976a);
        }
    }

    /* renamed from: ic1.h$l */
    static final class C41298l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41286h f97350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41298l(C41286h hVar) {
            super(0);
            this.f97350d = hVar;
        }

        public final void invoke() {
            this.f97350d.f97333t.mo4823o(new C35947l.C35951d(C41238w.f97225a));
        }
    }

    /* renamed from: ic1.h$m */
    static final class C41299m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41286h f97351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41299m(C41286h hVar) {
            super(1);
            this.f97351d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f97351d.f97333t.mo4823o(new C35947l.C35949b(th));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41286h(Context context, C40621w0 w0Var, C40529h4 h4Var, C42117a aVar, C40520g1 g1Var, C40561m4 m4Var, C40484a4 a4Var, C40511e4 e4Var, C40393c cVar, C27700a1 a1Var) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(w0Var, "getCustomerDevicesUseCase");
        C41536l.m120489i(h4Var, "untrustDeviceUseCase");
        C41536l.m120489i(aVar, "setUserNamePasswordDelegate");
        C41536l.m120489i(g1Var, "getPasswordRules");
        C41536l.m120489i(m4Var, "updatePasswordUseCase");
        C41536l.m120489i(a4Var, "setupSecurityParametersUseCase");
        C41536l.m120489i(e4Var, "trustDeviceUseCase");
        C41536l.m120489i(cVar, "startTMXProfilingUseCase");
        C41536l.m120489i(a1Var, "storage");
        this.f97321h = context;
        this.f97322i = w0Var;
        this.f97323j = h4Var;
        this.f97324k = aVar;
        this.f97325l = g1Var;
        this.f97326m = m4Var;
        this.f97327n = a4Var;
        this.f97328o = e4Var;
        this.f97329p = cVar;
        this.f97330q = a1Var;
    }

    /* renamed from: pw */
    private final Set m119623pw() {
        return C10146d0.C10159c.m37143b().getAvailableAuthTypes$sso_client_release();
    }

    /* renamed from: Aw */
    public final LiveData mo95750Aw() {
        return this.f97334u;
    }

    /* renamed from: Bw */
    public final LiveData mo95751Bw() {
        return this.f97335v;
    }

    /* renamed from: Cw */
    public final LiveData mo95752Cw() {
        return this.f97333t;
    }

    /* renamed from: Dw */
    public final boolean mo95753Dw() {
        return m119623pw().contains(AuthElementType.TRUSTED_DEVICE);
    }

    /* renamed from: Ew */
    public final boolean mo95754Ew() {
        String f = this.f97330q.mo67245f();
        return !(f == null || C40439w.m117118v(f)) && C41536l.m120484d(this.f97330q.mo67245f(), C10146d0.C10159c.m37143b().getUsername());
    }

    /* renamed from: Fw */
    public final void mo95755Fw(boolean z, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        C40762x B = this.f97327n.mo94537d(z, str, str2, str3, str4).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "setupSecurityParametersU…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, new C41291e(this), new C41292f(this)));
    }

    /* renamed from: Gw */
    public final void mo95756Gw(String str) {
        C41536l.m120489i(str, "tmxFlagKey");
        mo42540ew(this.f97329p.mo94454b(str));
    }

    /* renamed from: Hw */
    public final void mo95757Hw(String str, BigDecimal bigDecimal, boolean z, String str2, String str3, String str4) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(bigDecimal, "deviceReference");
        C41536l.m120489i(str2, "operationId");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        C40734b z2 = this.f97328o.mo94554c(str, bigDecimal, z, str2, str3, str4).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z2, "trustDeviceUseCase(\n    …dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z2, new C41293g(this), new C41294h(this)));
    }

    /* renamed from: Iw */
    public final void mo95758Iw(String str) {
        C41536l.m120489i(str, "deviceId");
        C40734b z = this.f97323j.mo94565c(str).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "untrustDeviceUseCase(\n  …dSchedulers.mainThread())");
        mo42540ew(C40398b.m116971d(z, new C41295i(this), new C41296j(this)));
    }

    /* renamed from: Jw */
    public final void mo95759Jw(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "password");
        C41536l.m120489i(str4, "scaAuthCode");
        C40734b z = this.f97326m.mo94589c(str, str2, str3, str4).mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a());
        C41536l.m120488h(z, "updatePasswordUseCase(\n …dSchedulers.mainThread())");
        mo42540ew(C32381m.m95618g(z, new C41297k(this), new C41298l(this), new C41299m(this)));
    }

    /* renamed from: S5 */
    public LiveData mo89145S5() {
        return this.f97324k.mo89145S5();
    }

    /* renamed from: Wk */
    public LiveData mo89149Wk() {
        return this.f97332s;
    }

    /* renamed from: Y4 */
    public void mo89152Y4() {
        this.f97324k.mo89152Y4();
    }

    /* renamed from: Zc */
    public LiveData mo89154Zc() {
        return this.f97324k.mo89154Zc();
    }

    /* renamed from: Zu */
    public void mo89155Zu() {
        this.f97324k.mo89155Zu();
    }

    /* renamed from: ao */
    public void mo89156ao(String str, String str2) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        this.f97324k.mo89156ao(str, str2);
    }

    /* renamed from: ij */
    public C40762x mo89168ij(String str) {
        C41536l.m120489i(str, "reference");
        return this.f97324k.mo89168ij(str);
    }

    /* renamed from: ni */
    public LiveData mo89179ni() {
        return this.f97324k.mo89179ni();
    }

    /* renamed from: ow */
    public final List mo95760ow(List list) {
        String str;
        Drawable b;
        C41536l.m120489i(list, "list");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy, HH:mm");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35936d dVar = (C35936d) it.next();
            BigDecimal e = dVar.mo88480e();
            String str2 = null;
            if (e != null) {
                str = simpleDateFormat.format(new Date(e.longValue()));
            } else {
                str = null;
            }
            String c = dVar.mo88478c();
            if (c != null) {
                Locale locale = Locale.ROOT;
                C41536l.m120488h(locale, "ROOT");
                str2 = c.toUpperCase(locale);
                C41536l.m120488h(str2, "this as java.lang.String).toUpperCase(locale)");
            }
            if (C41536l.m120484d(str2, "ANDROID")) {
                b = C0767a.m2895e(this.f97321h, C10214s.icon_customer_device_android);
            } else if (C41536l.m120484d(str2, "IOS")) {
                b = C5769a.m23210b(this.f97321h, C10214s.icon_customer_device_apple);
            } else {
                b = C5769a.m23210b(this.f97321h, C10214s.icon_customer_device_desktop);
            }
            Drawable drawable = b;
            BigDecimal bigDecimal = new BigDecimal(-1);
            if (dVar.mo88479d() != null) {
                bigDecimal = new BigDecimal(dVar.mo88479d().toString());
            }
            BigDecimal bigDecimal2 = bigDecimal;
            boolean d = C41536l.m120484d(dVar.mo88482f(), "Y");
            String b2 = dVar.mo88477b();
            if (str == null) {
                str = "";
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new C41463a(d, b2, str, C41536l.m120484d(dVar.mo88476a(), Boolean.TRUE), drawable, bigDecimal2))));
        }
        return arrayList;
    }

    /* renamed from: qo */
    public C41204a mo89184qo() {
        return this.f97324k.mo89184qo();
    }

    /* renamed from: qw */
    public final boolean mo95761qw() {
        return C10146d0.C10159c.m37143b().getBiometricEnabled$sso_client_release();
    }

    /* renamed from: rw */
    public final void mo95762rw() {
        C40762x B = this.f97322i.mo94625c().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a());
        C41536l.m120488h(B, "getCustomerDevicesUseCas…dSchedulers.mainThread())");
        mo42540ew(C40398b.m116972e(B, C41287a.f97339d, new C41288b(this)));
    }

    public void setUserName(String str) {
        C41536l.m120489i(str, "userName");
        this.f97324k.setUserName(str);
    }

    /* renamed from: sw */
    public final LiveData mo95763sw() {
        return this.f97336w;
    }

    /* renamed from: tw */
    public final Long mo95764tw() {
        DeviceIdentifier c = this.f97330q.mo67242c();
        if (c != null) {
            return c.getDeviceId();
        }
        return null;
    }

    /* renamed from: up */
    public void mo89195up(Throwable th) {
        C41536l.m120489i(th, "err");
        this.f97324k.mo89195up(th);
    }

    /* renamed from: uw */
    public final String mo95765uw() {
        DeviceIdentifier c = this.f97330q.mo67242c();
        if (c != null) {
            return c.getExtCustomerId();
        }
        return null;
    }

    /* renamed from: vw */
    public final ArrayList mo95766vw() {
        return this.f97337x;
    }

    /* renamed from: wb */
    public LiveData mo89200wb() {
        return this.f97324k.mo89200wb();
    }

    /* renamed from: ww */
    public final boolean mo95767ww() {
        return C10146d0.C10159c.m37143b().getPassCodeEnabled$sso_client_release();
    }

    /* renamed from: xw */
    public final void mo95768xw() {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            mo42540ew(C40398b.m116972e(this.f97325l.mo94559a(processReference$sso_client_release), new C41289c(this), new C41290d(this)));
        }
    }

    /* renamed from: yj */
    public C40767b mo89204yj() {
        return this.f97324k.mo89204yj();
    }

    /* renamed from: yw */
    public final LiveData mo95769yw() {
        return this.f97331r;
    }

    /* renamed from: zw */
    public final LiveData mo95770zw() {
        return this.f97338y;
    }
}

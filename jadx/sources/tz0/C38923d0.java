package tz0;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j70.C25337a;
import j70.C25341c;
import j70.C25352k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l70.C25846a;
import m41.C37223a;
import m70.C26148a;
import md0.C26186e;
import o70.C26765d;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.domain.AccountIsNullException;
import p843nw.C26636q;
import ty0.C38851b;
import ty0.C38853c;
import ty0.C38864h;
import ty0.C38881o;
import ty0.C38882o0;
import ty0.C38884p0;
import ty0.C38886q0;
import ty0.C38888r0;
import ty0.C38898w;
import ue1.C43075l;

/* renamed from: tz0.d0 */
public final class C38923d0 extends C21481a implements C38976m, C38986n {

    /* renamed from: A */
    private final C40767b f93003A;

    /* renamed from: B */
    private final C40767b f93004B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C26148a f93005C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C26765d f93006D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C26765d f93007E;

    /* renamed from: F */
    private final C1644x f93008F;

    /* renamed from: G */
    private final C1644x f93009G;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26636q f93010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25352k f93011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C38884p0 f93012f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38864h f93013g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38886q0 f93014h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C38888r0 f93015i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C38882o0 f93016j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C38851b f93017k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C38853c f93018l;

    /* renamed from: m */
    private final C38898w f93019m;

    /* renamed from: n */
    private final C38881o f93020n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final long f93021o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final long f93022p;

    /* renamed from: q */
    private final C38976m f93023q = this;

    /* renamed from: r */
    private final C38986n f93024r = this;

    /* renamed from: s */
    private final C1644x f93025s = new C1644x();

    /* renamed from: t */
    private final C1644x f93026t = new C1644x();

    /* renamed from: u */
    private final C1644x f93027u = new C1644x();

    /* renamed from: v */
    private final C1644x f93028v = new C1644x();

    /* renamed from: w */
    private final C1644x f93029w = new C1644x();

    /* renamed from: x */
    private final C1644x f93030x = new C1644x();

    /* renamed from: y */
    private final C40767b f93031y;

    /* renamed from: z */
    private final C40767b f93032z;

    /* renamed from: tz0.d0$a */
    static final class C38924a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C38924a f93033d = new C38924a();

        C38924a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: tz0.d0$b */
    static final class C38925b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38925b(C38923d0 d0Var) {
            super(1);
            this.f93034d = d0Var;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return C26186e.m81987e(C25337a.C25338a.m80510a(this.f93034d.f93013g, false, 1, (Object) null));
        }
    }

    /* renamed from: tz0.d0$c */
    static final class C38926c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38926c(C38923d0 d0Var) {
            super(1);
            this.f93035d = d0Var;
        }

        /* renamed from: a */
        public final void mo92636a(C25846a aVar) {
            boolean z;
            String str;
            Object obj;
            String str2;
            boolean z2;
            List a = aVar.mo64628a().mo65188a().mo65182a();
            C38923d0 d0Var = this.f93035d;
            Iterator it = a.iterator();
            while (true) {
                z = true;
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C26148a) obj).mo65087b() == d0Var.f93021o) {
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
            C26148a aVar2 = (C26148a) obj;
            C1644x Ow = this.f93035d.mo92632ts();
            if (aVar2 != null) {
                str2 = aVar2.mo65088c();
            } else {
                str2 = null;
            }
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                if (aVar2 != null) {
                    str = aVar2.mo65113y();
                }
                str = C32343x.m95388F(str, new Object[0]);
            } else if (aVar2 != null) {
                str = aVar2.mo65088c();
            }
            Ow.mo4826r(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92636a((C25846a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$d */
    static final class C38927d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38927d(C38923d0 d0Var) {
            super(1);
            this.f93036d = d0Var;
        }

        /* renamed from: a */
        public final void mo92637a(C26148a aVar) {
            this.f93036d.f93005C = aVar;
            C1644x Qw = this.f93036d.mo92612Hu();
            C26148a Cw = this.f93036d.f93005C;
            boolean z = false;
            if (Cw != null && Cw.mo65087b() == this.f93036d.f93021o) {
                z = true;
            }
            Qw.mo4826r(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92637a((C26148a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$e */
    static final class C38928e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38928e(C38923d0 d0Var) {
            super(1);
            this.f93037d = d0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            if (th instanceof AccountIsNullException) {
                this.f93037d.f93005C = null;
                this.f93037d.mo92612Hu().mo4826r(Boolean.FALSE);
            }
        }
    }

    /* renamed from: tz0.d0$f */
    static final class C38929f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38929f(C38923d0 d0Var) {
            super(1);
            this.f93038d = d0Var;
        }

        /* renamed from: a */
        public final void mo92639a(C26766e eVar) {
            C26765d dVar;
            Boolean bool;
            String str;
            String A;
            Object obj;
            boolean z;
            C38923d0 d0Var = this.f93038d;
            List list = (List) eVar.mo66048a().get(Long.valueOf(this.f93038d.f93021o));
            boolean z2 = true;
            String str2 = null;
            if (list != null) {
                C38923d0 d0Var2 = this.f93038d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C26765d) obj).mo66030j() == d0Var2.f93022p) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                dVar = (C26765d) obj;
            } else {
                dVar = null;
            }
            d0Var.f93007E = dVar;
            for (Map.Entry value : eVar.mo66048a().entrySet()) {
                C38923d0 d0Var3 = this.f93038d;
                for (C26765d dVar2 : (Iterable) value.getValue()) {
                    if (dVar2.mo66013R()) {
                        d0Var3.f93006D = dVar2;
                    }
                }
            }
            C1644x Qw = this.f93038d.mo92612Hu();
            C26765d Jw = this.f93038d.f93007E;
            if (Jw != null) {
                bool = Boolean.valueOf(Jw.mo66013R());
            } else {
                bool = Boolean.FALSE;
            }
            Qw.mo4826r(bool);
            C1644x Ow = this.f93038d.mo92632ts();
            C26765d Jw2 = this.f93038d.f93007E;
            if (Jw2 != null) {
                str = Jw2.mo66032l();
            } else {
                str = null;
            }
            if (!(str == null || str.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                C26765d Jw3 = this.f93038d.f93007E;
                if (!(Jw3 == null || (A = Jw3.mo65996A()) == null)) {
                    str2 = C32343x.m95388F(A, new Object[0]);
                }
            } else {
                C26765d Jw4 = this.f93038d.f93007E;
                if (Jw4 != null) {
                    str2 = Jw4.mo66032l();
                }
            }
            Ow.mo4826r(str2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92639a((C26766e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$g */
    static final class C38930g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C38930g f93039d = new C38930g();

        C38930g() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$h */
    public interface C38931h {
        /* renamed from: a */
        C38923d0 mo32797a(long j, long j2);
    }

    /* renamed from: tz0.d0$i */
    static final class C38932i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93040d;

        /* renamed from: tz0.d0$i$a */
        static final class C38933a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C38933a f93041d = new C38933a();

            C38933a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38932i(C38923d0 d0Var) {
            super(1);
            this.f93040d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m113826c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "isDefault");
            return this.f93040d.f93017k.mo92560a(String.valueOf(this.f93040d.f93021o), bool.booleanValue()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C38949e0(C38933a.f93041d));
        }
    }

    /* renamed from: tz0.d0$j */
    static final class C38934j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93042d;

        /* renamed from: tz0.d0$j$a */
        static final class C38935a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C38923d0 f93043d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38935a(C38923d0 d0Var) {
                super(1);
                this.f93043d = d0Var;
            }

            /* renamed from: a */
            public final void mo92644a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f93043d.f93010d.mo65889a();
                this.f93043d.f93011e.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92644a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38934j(C38923d0 d0Var) {
            super(1);
            this.f93042d = d0Var;
        }

        /* renamed from: a */
        public final void mo92643a(C31128a aVar) {
            this.f93042d.mo92630cp().mo4826r(new C37223a(aVar));
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C38935a(this.f93042d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92643a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$k */
    static final class C38936k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93044d;

        /* renamed from: tz0.d0$k$a */
        static final class C38937a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C38937a f93045d = new C38937a();

            C38937a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38936k(C38923d0 d0Var) {
            super(1);
            this.f93044d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m113832c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Boolean bool) {
            C41536l.m120489i(bool, "isDefault");
            return this.f93044d.f93018l.mo92561a(String.valueOf(this.f93044d.f93022p), bool.booleanValue()).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C38951f0(C38937a.f93045d));
        }
    }

    /* renamed from: tz0.d0$l */
    static final class C38938l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93046d;

        /* renamed from: tz0.d0$l$a */
        static final class C38939a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C38923d0 f93047d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38939a(C38923d0 d0Var) {
                super(1);
                this.f93047d = d0Var;
            }

            /* renamed from: a */
            public final void mo92648a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f93047d.f93012f.mo92581a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92648a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38938l(C38923d0 d0Var) {
            super(1);
            this.f93046d = d0Var;
        }

        /* renamed from: a */
        public final void mo92647a(C31128a aVar) {
            this.f93046d.mo92630cp().mo4826r(new C37223a(aVar));
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C38939a(this.f93046d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92647a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$m */
    static final class C38940m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93048d;

        /* renamed from: tz0.d0$m$a */
        static final class C38941a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C38941a f93049d = new C38941a();

            C38941a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38940m(C38923d0 d0Var) {
            super(1);
            this.f93048d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m113838c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f93048d.f93016j.mo92579a(String.valueOf(this.f93048d.f93021o)).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C38953g0(C38941a.f93049d));
        }
    }

    /* renamed from: tz0.d0$n */
    static final class C38942n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93050d;

        /* renamed from: tz0.d0$n$a */
        static final class C38943a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C38923d0 f93051d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38943a(C38923d0 d0Var) {
                super(1);
                this.f93051d = d0Var;
            }

            /* renamed from: a */
            public final void mo92652a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f93051d.mo92611Er().mo4826r(new C37223a(C41238w.f97225a));
                this.f93051d.f93010d.mo65889a();
                this.f93051d.f93011e.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92652a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38942n(C38923d0 d0Var) {
            super(1);
            this.f93050d = d0Var;
        }

        /* renamed from: a */
        public final void mo92651a(C31128a aVar) {
            this.f93050d.mo92630cp().mo4826r(new C37223a(aVar));
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C38943a(this.f93050d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92651a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.d0$o */
    static final class C38944o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93052d;

        /* renamed from: tz0.d0$o$a */
        static final class C38945a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C38945a f93053d = new C38945a();

            C38945a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38944o(C38923d0 d0Var) {
            super(1);
            this.f93052d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m113844c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C40734b bVar;
            C41536l.m120489i(str, "newName");
            if (this.f93052d.mo92629Yw()) {
                bVar = this.f93052d.f93015i.mo92586a(this.f93052d.f93022p, str);
            } else {
                bVar = this.f93052d.f93014h.mo92584a(this.f93052d.f93021o, str);
            }
            return bVar.mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C38955h0(C38945a.f93053d));
        }
    }

    /* renamed from: tz0.d0$p */
    static final class C38946p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38923d0 f93054d;

        /* renamed from: tz0.d0$p$a */
        static final class C38947a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C38923d0 f93055d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38947a(C38923d0 d0Var) {
                super(1);
                this.f93055d = d0Var;
            }

            /* renamed from: a */
            public final void mo92656a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                if (this.f93055d.mo92629Yw()) {
                    this.f93055d.f93012f.mo92581a();
                    return;
                }
                this.f93055d.f93010d.mo65889a();
                this.f93055d.f93011e.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92656a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38946p(C38923d0 d0Var) {
            super(1);
            this.f93054d = d0Var;
        }

        /* renamed from: a */
        public final void mo92655a(C31128a aVar) {
            this.f93054d.mo92630cp().mo4826r(new C37223a(aVar));
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C38947a(this.f93054d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92655a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38923d0(C26636q qVar, C25352k kVar, C38884p0 p0Var, C38864h hVar, C38886q0 q0Var, C38888r0 r0Var, C38882o0 o0Var, C38851b bVar, C38853c cVar, C38898w wVar, C38881o oVar, long j, long j2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C26636q qVar2 = qVar;
        C25352k kVar2 = kVar;
        C38884p0 p0Var2 = p0Var;
        C38864h hVar2 = hVar;
        C38886q0 q0Var2 = q0Var;
        C38888r0 r0Var2 = r0Var;
        C38882o0 o0Var2 = o0Var;
        C38851b bVar2 = bVar;
        C38853c cVar2 = cVar;
        C38898w wVar2 = wVar;
        C38881o oVar2 = oVar;
        long j3 = j2;
        C41536l.m120489i(qVar2, "updateAccountsUseCase");
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(p0Var2, "reloadCardsUseCase");
        C41536l.m120489i(hVar2, "getAccountsAndCardsUseCase");
        C41536l.m120489i(q0Var2, "renameAccountUseCase");
        C41536l.m120489i(r0Var2, "renameCardUseCase");
        C41536l.m120489i(o0Var2, "hideAccountUseCase");
        C41536l.m120489i(bVar2, "changeAccountDefaultUseCase");
        C41536l.m120489i(cVar2, "changeCardDefaultUseCase");
        C41536l.m120489i(wVar2, "getDefaultAccountUseCase");
        C41536l.m120489i(oVar2, "getCardsAndDetailsUseCase");
        boolean z = true;
        this.f93010d = qVar2;
        this.f93011e = kVar2;
        this.f93012f = p0Var2;
        this.f93013g = hVar2;
        this.f93014h = q0Var2;
        this.f93015i = r0Var2;
        this.f93016j = o0Var2;
        this.f93017k = bVar2;
        this.f93018l = cVar2;
        this.f93019m = wVar2;
        this.f93020n = oVar2;
        this.f93021o = j;
        this.f93022p = j3;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f93031y = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f93032z = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Boolean>()");
        this.f93003A = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Boolean>()");
        this.f93004B = h14;
        if (j3 == -1) {
            C40749p.m118049m0(onInit(), onRefresh(), kVar.mo63917a().mo95026k0(new C38988o(C38924a.f93033d))).mo94989L0(new C38994u(new C38925b(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38995v(new C38926c(this)));
            C41205b I = wVar.mo92594b().mo95063B(C40992a.m118827a()).mo95070I(new C38996w(new C38927d(this)), new C38997x(new C38928e(this)));
            C41536l.m120488h(I, "getDefaultAccountUseCase… }\n                    })");
            bindToLifecycle(I);
        } else {
            C26186e.m81987e(C25341c.C25342a.m80514a(oVar2, false, 1, (Object) null)).mo95027o0(C40992a.m118827a()).mo94983G0(new C38998y(new C38929f(this)), new C38999z(C38930g.f93039d));
        }
        m113764cx();
        m113761Zw();
        m113776ix();
        m113770fx();
        mo92620Rw().mo4826r(Boolean.valueOf(j3 != -1 ? false : z));
        this.f93008F = new C1644x();
        this.f93009G = new C1644x(new String());
    }

    /* renamed from: Zw */
    private final void m113761Zw() {
        C41205b F0 = this.f93003A.mo94998Q(new C38990q(new C38932i(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38991r(new C38934j(this)));
        C41536l.m120488h(F0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final C40754t m113762ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m113763bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: cx */
    private final void m113764cx() {
        C41205b F0 = this.f93004B.mo94998Q(new C38992s(new C38936k(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38993t(new C38938l(this)));
        C41536l.m120488h(F0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public static final C40754t m113766dx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m113768ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: fx */
    private final void m113770fx() {
        C41205b F0 = this.f93032z.mo94998Q(new C38917a0(new C38940m(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38919b0(new C38942n(this)));
        C41536l.m120488h(F0, "private fun subscribeToH…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m113772gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public static final C40754t m113774hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ix */
    private final void m113776ix() {
        C41205b F0 = this.f93031y.mo94998Q(new C38921c0(new C38944o(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C38989p(new C38946p(this)));
        C41536l.m120488h(F0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: jx */
    public static final C40754t m113778jx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final void m113780kx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final Integer m113788sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m113789tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m113790uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m113791vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m113792ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m113793xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ow */
    public C1644x mo92632ts() {
        return this.f93009G;
    }

    /* renamed from: Ps */
    public void mo92615Ps() {
        this.f93032z.onNext(C41238w.f97225a);
    }

    /* renamed from: Pt */
    public void mo92616Pt() {
        if (!mo92629Yw()) {
            C26148a aVar = this.f93005C;
            if (aVar != null) {
                boolean z = false;
                if (aVar != null && aVar.mo65087b() == this.f93021o) {
                    z = true;
                }
                if (z) {
                    mo92624V9().mo4826r(new C37223a(C41238w.f97225a));
                    return;
                }
            }
            if (this.f93005C != null) {
                mo92613M8().mo4826r(new C37223a(C41238w.f97225a));
            } else {
                this.f93003A.onNext(Boolean.TRUE);
            }
        } else if (this.f93006D == null) {
            this.f93004B.onNext(Boolean.TRUE);
        } else {
            C26765d dVar = this.f93007E;
            if (dVar == null) {
                return;
            }
            if (dVar.mo66013R()) {
                mo92624V9().mo4826r(new C37223a(C41238w.f97225a));
            } else {
                mo92613M8().mo4826r(new C37223a(C41238w.f97225a));
            }
        }
    }

    /* renamed from: Pw */
    public C1644x mo92630cp() {
        return this.f93025s;
    }

    /* renamed from: Qo */
    public void mo92618Qo(boolean z) {
        if (mo92629Yw()) {
            this.f93004B.onNext(Boolean.valueOf(z));
        } else {
            this.f93003A.onNext(Boolean.valueOf(z));
        }
    }

    /* renamed from: Qw */
    public C1644x mo92612Hu() {
        return this.f93027u;
    }

    /* renamed from: Rw */
    public C1644x mo92620Rw() {
        return this.f93028v;
    }

    /* renamed from: Sw */
    public C1644x mo92611Er() {
        return this.f93026t;
    }

    /* renamed from: Tw */
    public final C38976m mo92622Tw() {
        return this.f93023q;
    }

    /* renamed from: Uw */
    public final C38986n mo92623Uw() {
        return this.f93024r;
    }

    /* renamed from: Vw */
    public C1644x mo92633wi() {
        return this.f93008F;
    }

    /* renamed from: Wo */
    public void mo92626Wo(String str) {
        C41536l.m120489i(str, "newName");
        this.f93031y.onNext(str);
    }

    /* renamed from: Ww */
    public C1644x mo92624V9() {
        return this.f93030x;
    }

    /* renamed from: Xw */
    public C1644x mo92613M8() {
        return this.f93029w;
    }

    /* renamed from: Yw */
    public boolean mo92629Yw() {
        return this.f93022p != -1;
    }

    /* renamed from: jq */
    public void mo92631jq() {
        mo92633wi().mo4826r(new C37223a(C41238w.f97225a));
    }
}

package a61;

import b61.C31134a;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import he1.C41238w;
import i61.C36357a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26186e;
import md0.C26191f;
import nd0.C26453c;
import p341ge.bog.mobilebank.model.Client;
import pd0.C27503h;
import ru0.C38345b;
import su0.C38536a;
import ue1.C43064a;
import ue1.C43075l;
import y51.C40023a;

/* renamed from: a61.c */
public final class C30497c implements C36357a {

    /* renamed from: k */
    public static final C30498a f76499k = new C30498a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31134a f76500d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C40023a f76501e;

    /* renamed from: f */
    private final C38345b f76502f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Client f76503g;

    /* renamed from: h */
    private final C27503h f76504h = new C27503h();

    /* renamed from: i */
    private final C40765a f76505i;

    /* renamed from: j */
    private final AtomicReference f76506j;

    /* renamed from: a61.c$a */
    public static final class C30498a {
        private C30498a() {
        }

        public /* synthetic */ C30498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a61.c$b */
    static final class C30499b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30497c f76507d;

        /* renamed from: a61.c$b$a */
        /* synthetic */ class C30500a extends C41535k implements C43075l {
            C30500a(Object obj) {
                super(1, obj, C40023a.class, "transform", "transformStoriesList(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C40023a) this.receiver).mo93851e(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30499b(C30497c cVar) {
            super(1);
            this.f76507d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List m91811c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(List list) {
            String str;
            Object obj;
            boolean z;
            C41536l.m120489i(list, "nbo");
            C31134a c4 = this.f76507d.f76500d;
            Long l = this.f76507d.f76503g.getUserInfo().getClient().birthDate;
            C41536l.m120488h(l, "client.userInfo.client.birthDate");
            long longValue = l.longValue();
            String str2 = this.f76507d.f76503g.getUserInfo().getClient().categoryType;
            C41536l.m120488h(str2, "client.userInfo.client.categoryType");
            String str3 = this.f76507d.f76503g.getUserInfo().getClient().resident;
            C41536l.m120488h(str3, "client.userInfo.client.resident");
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C38536a) obj).mo92123E() != null) {
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
            C38536a aVar = (C38536a) obj;
            if (aVar != null) {
                str = aVar.mo92123E();
            }
            return c4.mo71353a("ACTIVE", longValue, str2, str3, str).mo95026k0(new C30503d(new C30500a(this.f76507d.f76501e)));
        }
    }

    /* renamed from: a61.c$c */
    /* synthetic */ class C30501c extends C41535k implements C43064a {
        C30501c(Object obj) {
            super(0, obj, C30497c.class, "getStoriesObservable", "getStoriesObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C30497c) this.receiver).m91804f4();
        }
    }

    /* renamed from: a61.c$d */
    /* synthetic */ class C30502d extends C41535k implements C43075l {
        C30502d(Object obj) {
            super(1, obj, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final void mo70845b(C26191f fVar) {
            ((AtomicReference) this.receiver).set(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70845b((C26191f) obj);
            return C41238w.f97225a;
        }
    }

    public C30497c(C31134a aVar, C40023a aVar2, C38345b bVar, Client client) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "storiesMapper");
        C41536l.m120489i(bVar, "getNboOffers");
        C41536l.m120489i(client, "client");
        this.f76500d = aVar;
        this.f76501e = aVar2;
        this.f76502f = bVar;
        this.f76503g = client;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<AsyncResult<List<StoryGroup>>>()");
        this.f76505i = h1;
        this.f76506j = new AtomicReference();
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final C40749p m91804f4() {
        C40749p u = C26186e.m81990h(this.f76502f.mo91880a(false, false)).mo95090u(new C30496b(new C30499b(this)));
        C41536l.m120488h(u, "private fun getStoriesOb…per::transform)\n        }");
        return u;
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final C40754t m91805g4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: h4 */
    private final void m91806h4(boolean z) {
        C40749p e = C26453c.m82747e(this.f76504h.mo66812m());
        this.f76504h.mo66814o(z, new C30501c(this)).mo94979E0();
        e.mo94978E(new C30495a(new C30502d(this.f76506j))).mo95016c(this.f76505i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final void m91807i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: G1 */
    public void mo70841G1(boolean z) {
        C26191f fVar = (C26191f) this.f76506j.get();
        if (z || fVar == null) {
            m91806h4(true);
        } else {
            this.f76505i.onNext(fVar);
        }
    }

    public void clean() {
        List<C27503h> e = C41339p.m119900e(this.f76504h);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(e, 10));
        for (C27503h l : e) {
            l.mo66811l();
            arrayList.add(C41238w.f97225a);
        }
    }

    /* renamed from: h0 */
    public C40749p mo70842h0(boolean z) {
        C40749p c0 = this.f76505i.mo95017c0();
        m91806h4(z);
        C41536l.m120488h(c0, "storiesSubject.hide().al…tories(refresh)\n        }");
        return c0;
    }
}

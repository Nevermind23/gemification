package p367bl;

import b41.C31128a;
import b41.C31132b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.designsystem.components.Amount;
import p353al.C10069e;
import p563pk.C17371a;
import p563pk.C17377g;
import p615tg.C17959a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: bl.a */
public final class C10332a {

    /* renamed from: bl.a$a */
    static final class C10333a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f29502d;

        /* renamed from: e */
        final /* synthetic */ C10332a f29503e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10333a(List list, C10332a aVar) {
            super(1);
            this.f29502d = list;
            this.f29503e = aVar;
        }

        /* renamed from: a */
        public final void mo26929a(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            this.f29502d.add(new C10069e.C10071b(this.f29503e.m37608e((List) mVar.mo95678e())));
            this.f29502d.addAll(this.f29503e.m37607d((List) mVar.mo95680f()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26929a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bl.a$b */
    static final class C10334b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f29504d;

        /* renamed from: e */
        final /* synthetic */ C10332a f29505e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10334b(List list, C10332a aVar) {
            super(1);
            this.f29504d = list;
            this.f29505e = aVar;
        }

        /* renamed from: a */
        public final void mo26930a(C41224m mVar) {
            List list;
            List list2 = this.f29504d;
            C10332a aVar = this.f29505e;
            if (mVar != null) {
                list = (List) mVar.mo95678e();
            } else {
                list = null;
            }
            if (list == null) {
                list = C41341q.m119907j();
            }
            list2.add(new C10069e.C10071b(aVar.m37608e(list)));
            this.f29504d.add(C10069e.C10072c.f27839a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26930a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bl.a$c */
    static final class C10335c extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ List f29506d;

        /* renamed from: e */
        final /* synthetic */ C10332a f29507e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10335c(List list, C10332a aVar) {
            super(2);
            this.f29506d = list;
            this.f29507e = aVar;
        }

        /* renamed from: a */
        public final void mo26931a(Throwable th, C41224m mVar) {
            List list;
            C41536l.m120489i(th, "<anonymous parameter 0>");
            if (mVar != null) {
                list = this.f29507e.m37608e((List) mVar.mo95675a());
            } else {
                list = null;
            }
            if (list == null) {
                list = C41341q.m119907j();
            }
            this.f29506d.add(new C10069e.C10071b(list));
            this.f29506d.add(C10069e.C10070a.f27837a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo26931a((Throwable) obj, (C41224m) obj2);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final List m37607d(List list) {
        String str;
        Amount amount;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17371a aVar = (C17371a) it.next();
            C17377g gVar = (C17377g) C41358y.m120009Y(aVar.mo44813a());
            if (gVar == null || (str = gVar.mo44855b()) == null) {
                str = "GEL";
            }
            String d = aVar.mo44816d();
            String e = aVar.mo44817e();
            Double b = aVar.mo44814b();
            if (b == null || (amount = C17959a.m61879c(b.doubleValue(), str)) == null) {
                amount = C17959a.m61880d(0, str);
            }
            List<C17377g> a = aVar.mo44813a();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
            for (C17377g gVar2 : a) {
                arrayList2.add(C17959a.m61879c(gVar2.mo44857d(), gVar2.mo44855b()));
            }
            arrayList.add(new C10069e.C10073d(d, e, amount, arrayList2));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final List m37608e(List list) {
        return list.size() <= 1 ? C41341q.m119907j() : list;
    }

    /* renamed from: c */
    public final List mo26928c(C31128a aVar) {
        C41536l.m120489i(aVar, "result");
        ArrayList arrayList = new ArrayList();
        C31132b.m92648j(aVar, (int[]) null, new C10333a(arrayList, this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C10334b(arrayList, this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C10335c(arrayList, this), 1, (Object) null);
        return arrayList;
    }
}

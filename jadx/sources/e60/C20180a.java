package e60;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import f60.C20440b;
import f60.C20442d;
import f60.C20444f;
import g60.C20740b;
import g60.C20742c;
import g60.C20743d;
import g60.C20746f;
import g60.C20749g;
import g60.C20753j;
import g60.C20760p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: e60.a */
public final class C20180a extends RecyclerView.C1736h {

    /* renamed from: p */
    public static final C20181a f54847p = new C20181a((DefaultConstructorMarker) null);

    /* renamed from: q */
    private static final C20440b f54848q = new C20440b(C20444f.C20445a.TemplateHeader);

    /* renamed from: r */
    private static final C20440b f54849r = new C20440b(C20444f.C20445a.AddTemplate);

    /* renamed from: s */
    private static final C20440b f54850s = new C20440b(C20444f.C20445a.ProviderHeader);

    /* renamed from: t */
    private static final C20440b f54851t = new C20440b(C20444f.C20445a.Separator);

    /* renamed from: d */
    private C43064a f54852d;

    /* renamed from: e */
    private C43075l f54853e;

    /* renamed from: f */
    private C43075l f54854f;

    /* renamed from: g */
    private C43075l f54855g;

    /* renamed from: h */
    private C43075l f54856h;

    /* renamed from: i */
    private C43075l f54857i;

    /* renamed from: j */
    private C43075l f54858j;

    /* renamed from: k */
    private C43075l f54859k;

    /* renamed from: l */
    private C43075l f54860l;

    /* renamed from: m */
    private C43075l f54861m;

    /* renamed from: n */
    private final List f54862n = new ArrayList();

    /* renamed from: o */
    private ArrayList f54863o;

    /* renamed from: e60.a$a */
    public static final class C20181a {
        private C20181a() {
        }

        public /* synthetic */ C20181a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    private final List m66142f() {
        boolean z;
        List list = this.f54862n;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C20444f) next).mo48943a() == C20444f.C20445a.TemplateGroup) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: f60.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m66143g() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f54863o
            if (r0 == 0) goto L_0x0008
            kotlin.jvm.internal.C41536l.m120486f(r0)
            return r0
        L_0x0008:
            java.util.List r0 = r7.f54862n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x0016:
            r0 = 1
            f60.f[] r1 = new f60.C20444f[r0]
            f60.b r2 = f54848q
            r3 = 0
            r1[r3] = r2
            java.util.ArrayList r1 = ie1.C41341q.m119903f(r1)
            r7.f54863o = r1
            if (r1 == 0) goto L_0x002b
            f60.b r2 = f54849r
            r1.add(r2)
        L_0x002b:
            java.util.ArrayList r1 = r7.f54863o
            if (r1 == 0) goto L_0x0034
            f60.b r2 = f54851t
            r1.add(r2)
        L_0x0034:
            java.util.List r1 = r7.m66142f()
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()
            f60.f r2 = (f60.C20444f) r2
            java.util.ArrayList r4 = r7.f54863o
            if (r4 == 0) goto L_0x004f
            r4.add(r2)
        L_0x004f:
            java.util.ArrayList r2 = r7.f54863o
            if (r2 == 0) goto L_0x003c
            f60.b r4 = f54851t
            r2.add(r4)
            goto L_0x003c
        L_0x0059:
            java.util.List r1 = r7.m66145i()
            java.util.Iterator r1 = r1.iterator()
        L_0x0061:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r1.next()
            f60.f r2 = (f60.C20444f) r2
            java.util.ArrayList r4 = r7.f54863o
            if (r4 == 0) goto L_0x0074
            r4.add(r2)
        L_0x0074:
            java.util.ArrayList r2 = r7.f54863o
            if (r2 == 0) goto L_0x0061
            f60.b r4 = f54851t
            r2.add(r4)
            goto L_0x0061
        L_0x007e:
            java.util.ArrayList r1 = r7.f54863o
            r2 = 0
            if (r1 == 0) goto L_0x008a
            java.lang.Object r1 = ie1.C41358y.m120019i0(r1)
            f60.f r1 = (f60.C20444f) r1
            goto L_0x008b
        L_0x008a:
            r1 = r2
        L_0x008b:
            f60.b r4 = f54851t
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r4)
            if (r1 == 0) goto L_0x009d
            java.util.ArrayList r1 = r7.f54863o
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = ie1.C41352v.m119962G(r1)
            f60.f r1 = (f60.C20444f) r1
        L_0x009d:
            java.util.List r1 = r7.m66144h()
            java.util.Iterator r1 = r1.iterator()
            r4 = r3
        L_0x00a6:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r1.next()
            f60.f r5 = (f60.C20444f) r5
            if (r4 != 0) goto L_0x00bd
            java.util.ArrayList r4 = r7.f54863o
            if (r4 == 0) goto L_0x00bd
            f60.b r6 = f54850s
            r4.add(r6)
        L_0x00bd:
            java.util.ArrayList r4 = r7.f54863o
            if (r4 == 0) goto L_0x00c4
            r4.add(r5)
        L_0x00c4:
            java.util.ArrayList r4 = r7.f54863o
            if (r4 == 0) goto L_0x00cd
            f60.b r5 = f54851t
            r4.add(r5)
        L_0x00cd:
            r4 = r0
            goto L_0x00a6
        L_0x00cf:
            java.util.ArrayList r1 = r7.f54863o
            if (r1 == 0) goto L_0x00da
            java.lang.Object r1 = ie1.C41358y.m120019i0(r1)
            r2 = r1
            f60.f r2 = (f60.C20444f) r2
        L_0x00da:
            f60.b r1 = f54851t
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r2, r1)
            if (r1 == 0) goto L_0x00f4
            java.util.ArrayList r1 = r7.f54863o
            if (r1 == 0) goto L_0x00f4
            kotlin.jvm.internal.C41536l.m120486f(r1)
            int r2 = r1.size()
            int r2 = r2 - r0
            java.lang.Object r1 = r1.remove(r2)
            f60.f r1 = (f60.C20444f) r1
        L_0x00f4:
            java.util.ArrayList r1 = r7.f54863o
            if (r1 == 0) goto L_0x00f9
            goto L_0x0108
        L_0x00f9:
            r1 = 2
            f60.b[] r1 = new f60.C20440b[r1]
            f60.b r2 = f54848q
            r1[r3] = r2
            f60.b r2 = f54849r
            r1[r0] = r2
            java.util.ArrayList r1 = ie1.C41341q.m119903f(r1)
        L_0x0108:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e60.C20180a.m66143g():java.util.List");
    }

    /* renamed from: h */
    private final List m66144h() {
        boolean z;
        List list = this.f54862n;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C20444f) next).mo48943a() == C20444f.C20445a.Provider) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private final List m66145i() {
        boolean z;
        List list = this.f54862n;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C20444f) next).mo48943a() == C20444f.C20445a.Template) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int getItemCount() {
        return m66143g().size();
    }

    public int getItemViewType(int i) {
        return ((C20444f) m66143g().get(i)).mo48943a().mo48964b();
    }

    /* renamed from: j */
    public final boolean mo48575j() {
        for (C20444f fVar : m66145i()) {
            C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.templatesproviders.model.TemplateItem");
            TemplateBasketItem d = ((C20442d) fVar).mo48956d();
            if (d.canGetDebt() && d.getTemplateDebtEvent().getState() == 10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final void mo48576k(C20442d dVar) {
        boolean z;
        C41536l.m120489i(dVar, "template");
        this.f54863o = null;
        Iterator it = this.f54862n.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C20444f fVar = (C20444f) it.next();
            if (!(fVar instanceof C20442d) || ((C20442d) fVar).mo48956d().getId() != dVar.mo48956d().getId()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        this.f54862n.remove(i);
        this.f54862n.add(i, dVar);
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public void onBindViewHolder(C20742c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        cVar.onBind(m66143g().get(i));
    }

    /* renamed from: m */
    public C20742c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20743d dVar;
        C41536l.m120489i(viewGroup, "parent");
        if (i == C20444f.C20445a.TemplateHeader.mo48964b()) {
            dVar = C20743d.f55937d.mo49285a(viewGroup);
        } else if (i == C20444f.C20445a.TemplateGroup.mo48964b()) {
            C20753j a = C20753j.f55947r.mo49298a(viewGroup);
            a.mo49297o(this.f54859k);
            a.mo49296n(this.f54861m);
            a.mo49295m(this.f54860l);
            dVar = a;
        } else if (i == C20444f.C20445a.Template.mo48964b()) {
            C20760p a2 = C20760p.f55966k.mo49308a(viewGroup);
            a2.mo49304v(this.f54858j);
            a2.mo49305w(this.f54855g);
            a2.mo49306x(this.f54856h);
            a2.mo49307y(this.f54854f);
            a2.mo49302F(this.f54857i);
            dVar = a2;
        } else if (i == C20444f.C20445a.AddTemplate.mo48964b()) {
            C20740b a3 = C20740b.f55935e.mo49283a(viewGroup);
            a3.mo49282k(this.f54852d);
            dVar = a3;
        } else if (i == C20444f.C20445a.ProviderHeader.mo48964b()) {
            dVar = C20743d.f55937d.mo49285a(viewGroup);
        } else if (i == C20444f.C20445a.Provider.mo48964b()) {
            C20746f a4 = C20746f.f55939g.mo49289a(viewGroup);
            a4.mo49288m(this.f54853e);
            dVar = a4;
        } else if (i == C20444f.C20445a.Separator.mo48964b()) {
            dVar = C20749g.f55944d.mo49292a(viewGroup);
        } else {
            dVar = C20760p.f55966k.mo49308a(viewGroup);
        }
        C41536l.m120487g(dVar, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.templatesproviders.viewholder.BaseBindViewHolder<ge.bog.mobilebank.cleanarch.presentation.templatesproviders.model.TemplateProviderItem>");
        return dVar;
    }

    /* renamed from: n */
    public final void mo48579n(C43064a aVar) {
        this.f54852d = aVar;
    }

    /* renamed from: o */
    public final void mo48580o(ArrayList arrayList) {
        try {
            this.f54863o = null;
            this.f54862n.clear();
            if (arrayList != null) {
                this.f54862n.addAll(arrayList);
            }
        } finally {
            notifyDataSetChanged();
        }
    }

    /* renamed from: p */
    public final void mo48581p(C43075l lVar) {
        this.f54859k = lVar;
    }

    /* renamed from: q */
    public final void mo48582q(C43075l lVar) {
        this.f54860l = lVar;
    }

    /* renamed from: r */
    public final void mo48583r(C43075l lVar) {
        this.f54861m = lVar;
    }

    /* renamed from: s */
    public final void mo48584s(C43075l lVar) {
        this.f54853e = lVar;
    }

    /* renamed from: t */
    public final void mo48585t(C43075l lVar) {
        this.f54858j = lVar;
    }

    /* renamed from: u */
    public final void mo48586u(C43075l lVar) {
        this.f54854f = lVar;
    }

    /* renamed from: v */
    public final void mo48587v(C43075l lVar) {
        this.f54855g = lVar;
    }

    /* renamed from: w */
    public final void mo48588w(C43075l lVar) {
        this.f54856h = lVar;
    }

    /* renamed from: x */
    public final void mo48589x(C43075l lVar) {
        this.f54857i = lVar;
    }
}

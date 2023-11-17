package n30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;
import p891su.C28269e;
import p90.C27280d6;
import r30.C27892a;
import r30.C27895b;
import r30.C27897d;
import r30.C27906g;
import r30.C27909i;
import r30.C27914j;
import u30.C28550b;
import u30.C28553c;
import u30.C28561j;
import u30.C28564k;
import u30.C28566m;
import u30.C28567n;
import u30.C28572s;
import u30.C28575u;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: n30.e */
public final class C26365e extends RecyclerView.C1736h {

    /* renamed from: t */
    public static final C26366a f66783t = new C26366a((DefaultConstructorMarker) null);

    /* renamed from: u */
    private static final C27914j f66784u = new C27914j(C27906g.C27907a.CONTACTS_HEADER);

    /* renamed from: v */
    private static final C27914j f66785v = new C27914j(C27906g.C27907a.NO_CONTACTS);

    /* renamed from: w */
    private static final C27914j f66786w = new C27914j(C27906g.C27907a.CONTACTS_LOADING);

    /* renamed from: x */
    private static final C27914j f66787x = new C27914j(C27906g.C27907a.CONTACTS_LOADING_ERROR);

    /* renamed from: d */
    private final C43075l f66788d;

    /* renamed from: e */
    private final C43075l f66789e;

    /* renamed from: f */
    private final C43064a f66790f;

    /* renamed from: g */
    private final C43064a f66791g;

    /* renamed from: h */
    private final C43064a f66792h;

    /* renamed from: i */
    private final C43064a f66793i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C43064a f66794j;

    /* renamed from: k */
    private final C43064a f66795k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C43064a f66796l;

    /* renamed from: m */
    private final C43075l f66797m;

    /* renamed from: n */
    private final C43075l f66798n;

    /* renamed from: o */
    private final C43075l f66799o;

    /* renamed from: p */
    private final C43075l f66800p;

    /* renamed from: q */
    private final C43075l f66801q;

    /* renamed from: r */
    private C43064a f66802r;

    /* renamed from: s */
    private final List f66803s = new ArrayList();

    /* renamed from: n30.e$a */
    public static final class C26366a {
        private C26366a() {
        }

        public /* synthetic */ C26366a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: n30.e$b */
    static final class C26367b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C26365e f66804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26367b(C26365e eVar) {
            super(0);
            this.f66804d = eVar;
        }

        public final void invoke() {
            C43064a h = this.f66804d.f66794j;
            if (h != null) {
                h.invoke();
            }
        }
    }

    /* renamed from: n30.e$c */
    static final class C26368c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C26365e f66805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26368c(C26365e eVar) {
            super(0);
            this.f66805d = eVar;
        }

        public final void invoke() {
            C43064a g = this.f66805d.f66796l;
            if (g != null) {
                g.invoke();
            }
        }
    }

    public C26365e(C43075l lVar, C43075l lVar2, C43064a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4, C43064a aVar5, C43064a aVar6, C43064a aVar7, C43075l lVar3, C43075l lVar4, C43075l lVar5, C43075l lVar6, C43075l lVar7, C43064a aVar8) {
        this.f66788d = lVar;
        this.f66789e = lVar2;
        this.f66790f = aVar;
        this.f66791g = aVar2;
        this.f66792h = aVar3;
        this.f66793i = aVar4;
        this.f66794j = aVar5;
        this.f66795k = aVar6;
        this.f66796l = aVar7;
        this.f66797m = lVar3;
        this.f66798n = lVar4;
        this.f66799o = lVar5;
        this.f66800p = lVar6;
        this.f66801q = lVar7;
        this.f66802r = aVar8;
    }

    /* renamed from: C */
    private final void m82404C(C27906g gVar, boolean z) {
        int p = m82414p(this.f66803s, gVar.mo67429a());
        if (p != -1) {
            C27906g gVar2 = (C27906g) this.f66803s.get(p);
            if (z || !C41536l.m120484d(gVar2, gVar)) {
                this.f66803s.set(p, gVar);
                notifyItemChanged(p);
                return;
            }
            return;
        }
        m82409i(gVar);
    }

    /* renamed from: D */
    static /* synthetic */ void m82405D(C26365e eVar, C27906g gVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eVar.m82404C(gVar, z);
    }

    /* renamed from: i */
    private final void m82409i(C27906g gVar) {
        int o = m82413o(this.f66803s, gVar.mo67429a());
        this.f66803s.add(o, gVar);
        notifyItemInserted(o);
    }

    /* renamed from: j */
    private final void m82410j(C27906g gVar) {
        int indexOf = this.f66803s.indexOf(gVar);
        if (indexOf != -1) {
            this.f66803s.remove(indexOf);
            notifyItemRemoved(indexOf);
        }
    }

    /* renamed from: k */
    private final void m82411k(C27906g.C27907a... aVarArr) {
        Set R = C41333m.m119791R(aVarArr);
        int size = this.f66803s.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (R.contains(((C27906g) this.f66803s.get(size)).mo67429a())) {
                    this.f66803s.remove(size);
                    notifyItemRemoved(size);
                }
                if (i >= 0) {
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    private final void m82412l() {
        m82411k(C27906g.C27907a.CONTACT);
    }

    /* renamed from: o */
    private final int m82413o(List list, C27906g.C27907a aVar) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (aVar.ordinal() < ((C27906g) it.next()).mo67429a().ordinal()) {
                return i;
            }
            i = i2;
        }
        return list.size();
    }

    /* renamed from: p */
    private final int m82414p(List list, C27906g.C27907a aVar) {
        boolean z;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C27906g) it.next()).mo67429a() == aVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m82415s(C26365e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C43064a aVar = eVar.f66802r;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: A */
    public final void mo65563A() {
        int n = mo65566n();
        if (n != -1) {
            Object obj = this.f66803s.get(n);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.payments2.model.ContactItem");
            ((C27895b) obj).mo67448o(true);
            notifyItemChanged(n);
        }
    }

    /* renamed from: B */
    public final void mo65564B(C27895b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "contact");
        Iterator it = this.f66803s.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C27906g gVar = (C27906g) it.next();
            if (!(gVar instanceof C27895b) || ((C27895b) gVar).mo67439g() != bVar.mo67439g()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            this.f66803s.set(i, bVar);
            notifyItemChanged(i);
        }
    }

    public int getItemCount() {
        return this.f66803s.size();
    }

    public int getItemViewType(int i) {
        return ((C27906g) this.f66803s.get(i)).mo67429a().mo67483b();
    }

    /* renamed from: m */
    public final void mo65565m(C27895b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "contact");
        Iterator it = this.f66803s.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C27906g gVar = (C27906g) it.next();
            if (!(gVar instanceof C27895b) || ((C27895b) gVar).mo67439g() != bVar.mo67439g()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            this.f66803s.remove(i);
            notifyItemRemoved(i);
        }
    }

    /* renamed from: n */
    public final int mo65566n() {
        int i = 0;
        for (C27906g gVar : this.f66803s) {
            int i2 = i + 1;
            if (gVar instanceof C27895b) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(u30.C28567n r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.util.List r0 = r4.f66803s
            java.lang.Object r0 = r0.get(r6)
            r30.g r0 = (r30.C27906g) r0
            r30.g$a r0 = r0.mo67429a()
            r30.g$a r1 = r30.C27906g.C27907a.CONTACTS_HEADER
            if (r0 != r1) goto L_0x005a
            u30.u r5 = (u30.C28575u) r5
            android.view.View r5 = r5.itemView
            int r6 = p366bk.C10322k.all_payments_text
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.List r6 = r4.f66803s
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0030
        L_0x002e:
            r3 = r1
            goto L_0x004e
        L_0x0030:
            java.util.Iterator r6 = r6.iterator()
        L_0x0034:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r6.next()
            r30.g r0 = (r30.C27906g) r0
            r30.g$a r0 = r0.mo67429a()
            r30.g$a r2 = r30.C27906g.C27907a.CONTACT
            r3 = 1
            if (r0 != r2) goto L_0x004b
            r0 = r3
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            if (r0 == 0) goto L_0x0034
        L_0x004e:
            if (r3 == 0) goto L_0x0054
            r5.setVisibility(r1)
            goto L_0x0063
        L_0x0054:
            r6 = 8
            r5.setVisibility(r6)
            goto L_0x0063
        L_0x005a:
            java.util.List r0 = r4.f66803s
            java.lang.Object r6 = r0.get(r6)
            r5.onBind(r6)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n30.C26365e.onBindViewHolder(u30.n, int):void");
    }

    /* renamed from: r */
    public C28567n onCreateViewHolder(ViewGroup viewGroup, int i) {
        C28567n kVar;
        C41536l.m120489i(viewGroup, "parent");
        if (i == C27906g.C27907a.PAYMENTS_GROUP.mo67483b()) {
            return C28572s.f72514o.mo68309a(viewGroup, this.f66788d, this.f66790f, this.f66791g, this.f66792h, this.f66795k);
        } else if (i == C27906g.C27907a.CATEGORIES_GROUP.mo67483b()) {
            return C28550b.f72473h.mo68291a(viewGroup, this.f66789e, this.f66793i);
        } else {
            if (i == C27906g.C27907a.CONTACTS_HEADER.mo67483b()) {
                C28575u a = C28575u.f72527e.mo68312a(viewGroup, C10324m.item_payments_contacts_header);
                TextView textView = (TextView) a.itemView.findViewById(C10322k.all_payments_text);
                textView.setVisibility(8);
                textView.setOnClickListener(new C26364d(this));
                return a;
            } else if (i == C27906g.C27907a.CONTACT.mo67483b()) {
                return C28561j.f72491o.mo68300a(viewGroup, this.f66797m, this.f66800p, this.f66799o, this.f66798n);
            } else if (i == C27906g.C27907a.NO_CONTACTS.mo67483b()) {
                C28575u a2 = C28575u.f72527e.mo68312a(viewGroup, C10324m.item_no_contacts);
                a2.mo68311i(C10322k.message_button, new C26367b(this));
                return a2;
            } else if (i == C27906g.C27907a.CONTACTS_LOADING.mo67483b()) {
                return C28553c.f72479h.mo68293a(viewGroup);
            } else {
                if (i == C27906g.C27907a.CONTACTS_LOADING_ERROR.mo67483b()) {
                    C28575u a3 = C28575u.f72527e.mo68312a(viewGroup, C10324m.item_contacts_loading_error);
                    a3.mo68311i(C10322k.message_button, new C26368c(this));
                    return a3;
                }
                if (i == C27906g.C27907a.MONEY_REQUEST_VERTICAL.mo67483b()) {
                    C27280d6 d = C27280d6.m84422d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                    C41536l.m120488h(d, "inflate(\n               …  false\n                )");
                    kVar = new C28566m(d, this.f66801q);
                } else if (i == C27906g.C27907a.MONEY_REQUEST_HORIZONTAL.mo67483b()) {
                    Context context = viewGroup.getContext();
                    C41536l.m120488h(context, "parent.context");
                    kVar = new C28564k(context, this.f66801q);
                } else {
                    throw new IllegalStateException("Unsupported viewType".toString());
                }
                return kVar;
            }
        }
    }

    /* renamed from: t */
    public final void mo65569t(List list) {
        C41536l.m120489i(list, "categories");
        m82404C(new C27892a.C27893a(list), true);
    }

    /* renamed from: u */
    public final void mo65570u(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "contacts");
        m82412l();
        m82410j(f66787x);
        C27914j jVar = f66785v;
        m82410j(jVar);
        if (list.isEmpty()) {
            m82405D(this, jVar, false, 2, (Object) null);
        } else {
            int o = m82413o(this.f66803s, C27906g.C27907a.CONTACT);
            this.f66803s.addAll(o, list2.subList(0, list.size() - 1));
            this.f66803s.add(C27895b.m86151c((C27895b) C41358y.m120019i0(list), 0, (String) null, (String) null, (String) null, false, (C28269e) null, false, false, false, false, true, 1023, (Object) null));
            notifyItemRangeInserted(o, list.size());
        }
        m82404C(f66784u, true);
        m82410j(f66786w);
    }

    /* renamed from: v */
    public final void mo65571v() {
        m82412l();
        m82410j(f66787x);
        m82410j(f66785v);
        m82405D(this, f66784u, false, 2, (Object) null);
        m82405D(this, f66786w, false, 2, (Object) null);
    }

    /* renamed from: w */
    public final void mo65572w() {
        m82412l();
        m82410j(f66786w);
        m82410j(f66785v);
        m82405D(this, f66784u, false, 2, (Object) null);
        m82405D(this, f66787x, false, 2, (Object) null);
    }

    /* renamed from: x */
    public final void mo65573x(List list) {
        C41536l.m120489i(list, "requests");
        C27906g.C27907a aVar = C27906g.C27907a.MONEY_REQUEST_VERTICAL;
        m82411k(C27906g.C27907a.MONEY_REQUEST_HORIZONTAL, aVar);
        m82405D(this, f66784u, false, 2, (Object) null);
        if (list.size() > 2) {
            m82404C(new C27897d(list), true);
            return;
        }
        int o = m82413o(this.f66803s, aVar);
        this.f66803s.addAll(o, list);
        notifyItemRangeInserted(o, list.size());
    }

    /* renamed from: y */
    public final void mo65574y() {
        m82404C(C27892a.C27894b.f71039b, true);
    }

    /* renamed from: z */
    public final void mo65575z(C27909i iVar) {
        C41536l.m120489i(iVar, "paymentsItem");
        m82404C(iVar, iVar instanceof C27909i.C27913d);
    }
}

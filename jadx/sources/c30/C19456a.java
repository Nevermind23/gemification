package c30;

import a30.C19151a;
import a30.C19159d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import d30.C19878a;
import f30.C20394a;
import f30.C20395b;
import f30.C20397d;
import f30.C20398e;
import f30.C20400g;
import f30.C20402i;
import f30.C20404k;
import f30.C20408o;
import f30.C20411q;
import f30.C20415u;
import g60.C20742c;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p90.C27249a5;
import p90.C27259b5;
import p90.C27269c5;
import p90.C27279d5;
import p90.C27289e5;
import p90.C27299f5;
import p90.C27309g5;
import p90.C27438u4;
import p90.C27474y4;
import p90.C27483z4;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: c30.a */
public final class C19456a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C43064a f53690f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43064a f53691g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C43075l f53692h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C43075l f53693i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C43075l f53694j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C43079p f53695k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C43064a f53696l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C43075l f53697m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C43075l f53698n;

    /* renamed from: o */
    private C43075l f53699o;

    /* renamed from: p */
    private C43064a f53700p;

    /* renamed from: c30.a$a */
    private static final class C19457a extends C1796h.C1802f {

        /* renamed from: a */
        public static final C19457a f53701a = new C19457a();

        private C19457a() {
        }

        /* renamed from: d */
        public boolean mo5976a(C19878a aVar, C19878a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            if (aVar.mo48191a() != 1 || aVar2.mo48191a() != 1) {
                return C41536l.m120484d(aVar, aVar2);
            }
            C19878a.C19886h hVar = (C19878a.C19886h) aVar;
            C19878a.C19886h hVar2 = (C19878a.C19886h) aVar2;
            if (hVar.mo48213b().size() != hVar2.mo48213b().size()) {
                return false;
            }
            int size = hVar.mo48213b().size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                if (((C19151a) hVar.mo48213b().get(i)).mo47359e() == ((C19151a) hVar2.mo48213b().get(i)).mo47359e()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            return z;
        }

        /* renamed from: e */
        public boolean mo5977b(C19878a aVar, C19878a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            if (aVar.mo48191a() == aVar2.mo48191a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c30.a$b */
    static final class C19458b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19456a f53702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19458b(C19456a aVar) {
            super(0);
            this.f53702d = aVar;
        }

        public final void invoke() {
            C43064a n = this.f53702d.f53690f;
            if (n != null) {
                n.invoke();
            }
        }
    }

    /* renamed from: c30.a$c */
    static final class C19459c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19459c(C19456a aVar) {
            super(1);
            this.f53703d = aVar;
        }

        /* renamed from: a */
        public final void mo47689a(View view) {
            C41536l.m120489i(view, "it");
            C43075l s = this.f53703d.f53692h;
            if (s != null) {
                s.invoke(view);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47689a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$d */
    static final class C19460d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19460d(C19456a aVar) {
            super(1);
            this.f53704d = aVar;
        }

        /* renamed from: a */
        public final void mo47690a(View view) {
            C41536l.m120489i(view, "it");
            C43075l r = this.f53704d.f53693i;
            if (r != null) {
                r.invoke(view);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47690a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$e */
    static final class C19461e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19461e(C19456a aVar) {
            super(1);
            this.f53705d = aVar;
        }

        /* renamed from: a */
        public final void mo47691a(C19159d dVar) {
            C41536l.m120489i(dVar, "it");
            C43075l k = this.f53705d.f53694j;
            if (k != null) {
                k.invoke(dVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47691a((C19159d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$f */
    static final class C19462f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C19456a f53706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19462f(C19456a aVar) {
            super(2);
            this.f53706d = aVar;
        }

        /* renamed from: a */
        public final void mo47692a(C19159d dVar, double d) {
            C41536l.m120489i(dVar, "receiver");
            C43079p l = this.f53706d.f53695k;
            if (l != null) {
                l.invoke(dVar, Double.valueOf(d));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo47692a((C19159d) obj, ((Number) obj2).doubleValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$g */
    static final class C19463g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19463g(C19456a aVar) {
            super(1);
            this.f53707d = aVar;
        }

        /* renamed from: a */
        public final void mo47693a(double d) {
            C43075l q = this.f53707d.f53698n;
            if (q != null) {
                q.invoke(Double.valueOf(d));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47693a(((Number) obj).doubleValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$h */
    static final class C19464h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19464h(C19456a aVar) {
            super(1);
            this.f53708d = aVar;
        }

        /* renamed from: a */
        public final void mo47694a(C19151a aVar) {
            C41536l.m120489i(aVar, "it");
            C43075l o = this.f53708d.f53697m;
            if (o != null) {
                o.invoke(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47694a((C19151a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c30.a$i */
    static final class C19465i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19456a f53709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19465i(C19456a aVar) {
            super(0);
            this.f53709d = aVar;
        }

        public final void invoke() {
            C43064a p = this.f53709d.f53696l;
            if (p != null) {
                p.invoke();
            }
        }
    }

    /* renamed from: c30.a$j */
    static final class C19466j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19456a f53710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19466j(C19456a aVar) {
            super(0);
            this.f53710d = aVar;
        }

        public final void invoke() {
            C43064a m = this.f53710d.f53691g;
            if (m != null) {
                m.invoke();
            }
        }
    }

    /* renamed from: c30.a$k */
    static final class C19467k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19456a f53711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19467k(C19456a aVar) {
            super(1);
            this.f53711d = aVar;
        }

        /* renamed from: a */
        public final void mo47695a(C19151a aVar) {
            C41536l.m120489i(aVar, "it");
            C43075l o = this.f53711d.f53697m;
            if (o != null) {
                o.invoke(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47695a((C19151a) obj);
            return C41238w.f97225a;
        }
    }

    public C19456a() {
        super(C19457a.f53701a);
    }

    /* renamed from: A */
    public final void mo47672A(C43075l lVar) {
        C41536l.m120489i(lVar, "listener");
        this.f53699o = lVar;
    }

    /* renamed from: B */
    public final void mo47673B(C43064a aVar) {
        C41536l.m120489i(aVar, "newContactClickedListener");
        this.f53691g = aVar;
    }

    /* renamed from: C */
    public final void mo47674C(C43064a aVar) {
        this.f53690f = aVar;
    }

    /* renamed from: D */
    public final void mo47675D(C43075l lVar) {
        this.f53697m = lVar;
    }

    /* renamed from: E */
    public final void mo47676E(C43064a aVar) {
        this.f53696l = aVar;
    }

    /* renamed from: F */
    public final void mo47677F(C43075l lVar) {
        this.f53698n = lVar;
    }

    /* renamed from: G */
    public final void mo47678G(C43075l lVar) {
        C41536l.m120489i(lVar, "wizardBankAccountClickedListener");
        this.f53693i = lVar;
    }

    /* renamed from: H */
    public final void mo47679H(C43075l lVar) {
        this.f53692h = lVar;
    }

    public int getItemViewType(int i) {
        return mo47680t(i).mo48191a();
    }

    /* renamed from: t */
    public C19878a mo47680t(int i) {
        Object g = super.mo6027g(i);
        C41536l.m120488h(g, "super.getItem(position)");
        return (C19878a) g;
    }

    /* renamed from: u */
    public void onBindViewHolder(C20742c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        cVar.onBind(mo47680t(i));
    }

    /* renamed from: v */
    public C20742c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        switch (i) {
            case 0:
                C27289e5 d = C27289e5.m84458d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                C20402i iVar = new C20402i(d);
                iVar.mo48885k(new C19458b(this));
                return iVar;
            case 1:
                C27279d5 d2 = C27279d5.m84418d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
                C20411q qVar = new C20411q(d2);
                qVar.mo48905k(new C19467k(this));
                return qVar;
            case 2:
                C27438u4 d3 = C27438u4.m85063d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
                return new C20394a(d3);
            case 4:
                C27483z4 d4 = C27483z4.m85239d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
                return new C20395b(d4);
            case 5:
                C27299f5 d5 = C27299f5.m84502d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d5, "inflate(\n               …lse\n                    )");
                return new C20398e(d5);
            case 6:
                C27259b5 d6 = C27259b5.m84336d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d6, "inflate(\n               …lse\n                    )");
                C20400g gVar = new C20400g(d6);
                gVar.mo48882k(new C19466j(this));
                return gVar;
            case 7:
                C27474y4 d7 = C27474y4.m85205d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d7, "inflate(\n               …lse\n                    )");
                C20404k kVar = new C20404k(d7);
                kVar.mo48888k(new C19465i(this));
                return kVar;
            case 8:
                C27249a5 d8 = C27249a5.m84296d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d8, "inflate(\n               …lse\n                    )");
                C20408o oVar = new C20408o(d8, this);
                oVar.mo48898y(new C19461e(this));
                oVar.mo48897x(new C19462f(this));
                return oVar;
            case 9:
                C27309g5 d9 = C27309g5.m84546d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d9, "inflate(\n               …lse\n                    )");
                C20415u uVar = new C20415u(d9);
                uVar.mo48911p(new C19459c(this));
                uVar.mo48910o(new C19460d(this));
                return uVar;
            case 10:
                C27269c5 d12 = C27269c5.m84377d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d12, "inflate(\n               …lse\n                    )");
                C20397d dVar = new C20397d(d12);
                dVar.mo48879k(new C19464h(this));
                return dVar;
            case 11:
                C27249a5 d13 = C27249a5.m84296d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d13, "inflate(\n               …lse\n                    )");
                C20408o oVar2 = new C20408o(d13, this);
                oVar2.mo48899z(new C19463g(this));
                oVar2.mo48896w(this.f53699o);
                return oVar2;
            default:
                C27483z4 d14 = C27483z4.m85239d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d14, "inflate(\n               …lse\n                    )");
                return new C20395b(d14);
        }
    }

    /* renamed from: w */
    public void onViewDetachedFromWindow(C20742c cVar) {
        C43064a aVar;
        C41536l.m120489i(cVar, "holder");
        super.onViewDetachedFromWindow(cVar);
        if ((cVar instanceof C20408o) && ((C20408o) cVar).mo48894t() && (aVar = this.f53700p) != null) {
            aVar.invoke();
        }
    }

    /* renamed from: x */
    public final void mo47684x(C43064a aVar) {
        C41536l.m120489i(aVar, "closeKeyboardListener");
        this.f53700p = aVar;
    }

    /* renamed from: y */
    public final void mo47685y(C43075l lVar) {
        this.f53694j = lVar;
    }

    /* renamed from: z */
    public final void mo47686z(C43079p pVar) {
        this.f53695k = pVar;
    }
}

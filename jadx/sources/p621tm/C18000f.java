package p621tm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p411em.C12489f;
import p481jm.C16241t;
import p481jm.C16242u;
import p481jm.C16243v;
import p615tg.C17963d;
import p674xm.C18799g;

/* renamed from: tm.f */
public final class C18000f extends C1819o {

    /* renamed from: tm.f$a */
    public static abstract class C18001a extends RecyclerView.C1734f0 {

        /* renamed from: tm.f$a$a */
        public static final class C18002a extends C18001a {

            /* renamed from: d */
            private final C16242u f51224d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C18002a(p481jm.C16242u r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f51224d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C18000f.C18001a.C18002a.<init>(jm.u):void");
            }

            /* renamed from: h */
            public void mo45695h(C18799g gVar) {
                C18799g.C18802c cVar;
                String str;
                StringSource c;
                C41536l.m120489i(gVar, "item");
                this.f51224d.f45992e.setTitle(C34646b.m101752f(gVar.mo46631b(), (Context) null, 1, (Object) null));
                TwoLineTextItem twoLineTextItem = this.f51224d.f45992e;
                if (gVar instanceof C18799g.C18802c) {
                    cVar = (C18799g.C18802c) gVar;
                } else {
                    cVar = null;
                }
                if (cVar == null || (c = cVar.mo46639c()) == null || (str = C34646b.m101752f(c, (Context) null, 1, (Object) null)) == null) {
                    str = "";
                }
                twoLineTextItem.setText(str);
                this.f51224d.f45993f.setImageResource(gVar.mo46630a());
            }
        }

        /* renamed from: tm.f$a$b */
        public static final class C18003b extends C18001a {

            /* renamed from: d */
            private final C16243v f51225d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C18003b(p481jm.C16243v r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f51225d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C18000f.C18001a.C18003b.<init>(jm.v):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static final void m61988k(View view) {
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public static final void m61989l(C18799g.C18800a aVar, View view) {
                C41536l.m120489i(aVar, "$this_apply");
                C32303f.m95184D(C34646b.m101752f(aVar.mo46632c(), (Context) null, 1, (Object) null), view.getContext());
            }

            /* renamed from: h */
            public void mo45695h(C18799g gVar) {
                C41536l.m120489i(gVar, "item");
                C18799g.C18800a aVar = null;
                this.f51225d.f45995e.setText(C34646b.m101752f(gVar.mo46631b(), (Context) null, 1, (Object) null));
                this.f51225d.mo3946b().setOnClickListener(new C18005g());
                if (gVar instanceof C18799g.C18800a) {
                    aVar = (C18799g.C18800a) gVar;
                }
                if (aVar != null) {
                    this.f51225d.f45998h.setImageResource(aVar.mo46630a());
                    this.f51225d.mo3946b().setOnClickListener(new C18006h(aVar));
                }
            }
        }

        /* renamed from: tm.f$a$c */
        public static final class C18004c extends C18001a {

            /* renamed from: d */
            private final C16241t f51226d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C18004c(p481jm.C16241t r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f51226d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C18000f.C18001a.C18004c.<init>(jm.t):void");
            }

            /* renamed from: h */
            public void mo45695h(C18799g gVar) {
                C41536l.m120489i(gVar, "item");
                this.f51226d.f45989e.setText(C34646b.m101752f(gVar.mo46631b(), (Context) null, 1, (Object) null));
                this.f51226d.f45990f.setImageResource(gVar.mo46630a());
            }
        }

        public /* synthetic */ C18001a(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* renamed from: h */
        public abstract void mo45695h(C18799g gVar);

        private C18001a(View view) {
            super(view);
        }
    }

    public C18000f() {
        super(C17963d.f51158a.mo45633d());
    }

    public int getItemViewType(int i) {
        C18799g gVar = (C18799g) mo6027g(i);
        if (gVar instanceof C18799g.C18800a) {
            return C12489f.item_clickable_card_term;
        }
        if (gVar instanceof C18799g.C18802c) {
            return C12489f.item_card_term;
        }
        if (gVar instanceof C18799g.C18801b) {
            return C12489f.item_card_combined_offer;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public void onBindViewHolder(C18001a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45695h((C18799g) g);
    }

    /* renamed from: l */
    public C18001a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C12489f.item_clickable_card_term) {
            C16243v d = C16243v.m57908d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C18001a.C18003b(d);
        } else if (i == C12489f.item_card_combined_offer) {
            C16241t d2 = C16241t.m57900d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C18001a.C18004c(d2);
        } else {
            C16242u d3 = C16242u.m57904d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
            return new C18001a.C18002a(d3);
        }
    }
}

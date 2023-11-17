package as0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32319m;
import g91.C32343x;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import o31.C37599g;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32648f;
import pr0.C37962m;
import pr0.C37963n;
import pr0.C37964o;
import pr0.C37965p;
import pr0.C37966q;
import pr0.C37967r;
import pr0.C37968s;
import pr0.C37969t;
import pr0.C37970u;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: as0.b */
public final class C31045b extends C1819o {

    /* renamed from: i */
    public static final C31048b f77223i = new C31048b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C43064a f77224f;

    /* renamed from: g */
    private final C43064a f77225g;

    /* renamed from: h */
    private final C43075l f77226h;

    /* renamed from: as0.b$b */
    public static final class C31048b {
        private C31048b() {
        }

        public /* synthetic */ C31048b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: as0.b$c */
    private static final class C31049c extends C31044a {

        /* renamed from: d */
        private final C37963n f77232d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31049c(pr0.C37963n r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                android.widget.LinearLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f77232d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31049c.<init>(pr0.n):void");
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
            C37963n nVar = this.f77232d;
            C32648f.C32649a aVar = (C32648f.C32649a) fVar;
            nVar.f91235e.setText(C32343x.m95388F(aVar.mo74216d(), new Object[0]));
            nVar.f91235e.setTitle(C32343x.m95388F(aVar.mo74215c(), new Object[0]));
        }
    }

    /* renamed from: as0.b$d */
    private static final class C31050d extends C31044a {

        /* renamed from: d */
        private final C37967r f77233d;

        /* renamed from: e */
        private final C43064a f77234e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31050d(pr0.C37967r r3, ue1.C43064a r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "refresh"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                android.widget.LinearLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f77233d = r3
                r2.f77234e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31050d.<init>(pr0.r, ue1.a):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m92445k(C31050d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            dVar.f77234e.invoke();
        }

        /* renamed from: j */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
            this.f77233d.f91251g.setOnClickListener(new C31059c(this));
        }
    }

    /* renamed from: as0.b$e */
    private static final class C31051e extends C31044a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31051e(pr0.C37965p r2) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r2 = r2.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31051e.<init>(pr0.p):void");
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
        }
    }

    /* renamed from: as0.b$f */
    private static final class C31052f extends C31044a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31052f(pr0.C37966q r2) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                ge.bog.designsystem.components.loading.LoadingView r2 = r2.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31052f.<init>(pr0.q):void");
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
        }
    }

    /* renamed from: as0.b$g */
    private static final class C31053g extends C31044a {

        /* renamed from: d */
        private final C37969t f77235d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31053g(pr0.C37969t r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f77235d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31053g.<init>(pr0.t):void");
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
            C37969t tVar = this.f77235d;
            C32648f.C32656h hVar = (C32648f.C32656h) fVar;
            tVar.f91261g.setTitle(C32343x.m95388F(hVar.mo74252h(), new Object[0]));
            tVar.f91261g.setText(C32319m.m95295b(hVar.mo74248e()));
            tVar.f91263i.setText(C32343x.m95408P(hVar.mo74246c(), hVar.mo74247d()));
            tVar.f91264j.setText(C32343x.m95388F(hVar.mo74251g(), new Object[0]));
            View view = tVar.f91260f;
            C41536l.m120488h(view, "loanDividerView");
            C32343x.m95483r1(view, hVar.mo74254i(), false, 2, (Object) null);
            tVar.f91262h.setImageDrawable(C0767a.m2895e(tVar.mo3946b().getContext(), hVar.mo74250f()));
        }
    }

    /* renamed from: as0.b$h */
    private final class C31054h extends C31044a {

        /* renamed from: d */
        private final C37968s f77236d;

        /* renamed from: e */
        final /* synthetic */ C31045b f77237e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31054h(as0.C31045b r2, pr0.C37968s r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                r1.f77237e = r2
                ge.bog.designsystem.components.layersandshadows.LayerView r2 = r3.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r1.<init>(r2)
                r1.f77236d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31054h.<init>(as0.b, pr0.s):void");
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            boolean z;
            C41536l.m120489i(fVar, "item");
            C37968s sVar = this.f77236d;
            C31045b bVar = this.f77237e;
            C32648f.C32657i iVar = (C32648f.C32657i) fVar;
            sVar.f91255g.setText(C32343x.m95408P(iVar.mo74256c(), iVar.mo74257d()));
            sVar.f91257i.setText(C32343x.m95388F(iVar.mo74260f(), new Object[0]));
            sVar.f91256h.setText(C32319m.m95295b(iVar.mo74258e()));
            View view = sVar.f91254f;
            C41536l.m120488h(view, "loanDivider");
            if (getBindingAdapterPosition() != bVar.mo6026f().size() - 2) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
        }
    }

    /* renamed from: as0.b$i */
    private final class C31055i extends C31046a {

        /* renamed from: f */
        private final C37964o f77238f;

        /* renamed from: g */
        private final RecyclerView f77239g;

        /* renamed from: h */
        final /* synthetic */ C31045b f77240h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31055i(C31045b bVar, C37964o oVar) {
            super(bVar, oVar, (C31062f) null, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(oVar, "binding");
            this.f77240h = bVar;
            this.f77238f = oVar;
            RecyclerView recyclerView = oVar.f91237e;
            C41536l.m120488h(recyclerView, "binding.firstItemDetailsRecyclerView");
            this.f77239g = recyclerView;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m92457m(C32648f.C32653e eVar, C31045b bVar, C31055i iVar, View view) {
            C41536l.m120489i(eVar, "$firstItem");
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(iVar, "this$1");
            eVar.mo74213a();
            bVar.notifyItemChanged(iVar.getBindingAdapterPosition());
        }

        /* renamed from: n */
        private final Drawable m92458n(int i) {
            return C0767a.m2895e(this.f77238f.mo3946b().getContext(), i);
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            String str;
            BigDecimal c;
            C41536l.m120489i(fVar, "item");
            C37964o oVar = this.f77238f;
            C31045b bVar = this.f77240h;
            C32648f.C32653e eVar = (C32648f.C32653e) fVar;
            super.mo71243i(eVar);
            mo71245k(eVar.mo74232f());
            View view = oVar.f91239g;
            C41536l.m120488h(view, "loanDividerView");
            String str2 = null;
            C32343x.m95483r1(view, eVar.mo74237j(), false, 2, (Object) null);
            oVar.f91241i.setText(C32343x.m95388F(eVar.mo74233g(), new Object[0]));
            TwoLineReverseTextItem twoLineReverseTextItem = oVar.f91241i;
            Long h = eVar.mo74234h();
            if (h != null) {
                str = C32319m.m95295b(h.longValue());
            } else {
                str = null;
            }
            twoLineReverseTextItem.setTitle(str);
            TextView textView = oVar.f91243k;
            String d = eVar.mo74229d();
            if (!(d == null || (c = eVar.mo74228c()) == null)) {
                str2 = C32343x.m95408P(c, d);
            }
            textView.setText(str2);
            oVar.f91242j.setImageDrawable(m92458n(eVar.mo74230e()));
            oVar.mo3946b().setOnClickListener(new C31060d(eVar, bVar, this));
            if (eVar.mo74236i()) {
                RecyclerView recyclerView = oVar.f91237e;
                C41536l.m120488h(recyclerView, "firstItemDetailsRecyclerView");
                C32343x.m95455i0(recyclerView);
                oVar.f91240h.setImageDrawable(m92458n(C37129d.f89408g));
                return;
            }
            RecyclerView recyclerView2 = oVar.f91237e;
            C41536l.m120488h(recyclerView2, "firstItemDetailsRecyclerView");
            C32343x.m95447f1(recyclerView2);
            oVar.f91240h.setImageDrawable(m92458n(C37129d.f89409h));
        }

        /* renamed from: j */
        public RecyclerView mo71244j() {
            return this.f77239g;
        }
    }

    /* renamed from: as0.b$j */
    private final class C31056j extends C31046a {

        /* renamed from: f */
        private final C37962m f77241f;

        /* renamed from: g */
        private final C43075l f77242g;

        /* renamed from: h */
        private final RecyclerView f77243h;

        /* renamed from: i */
        final /* synthetic */ C31045b f77244i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31056j(C31045b bVar, C37962m mVar, C43075l lVar) {
            super(bVar, mVar, (C31062f) null, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(mVar, "binding");
            C41536l.m120489i(lVar, "scrollToPosition");
            this.f77244i = bVar;
            this.f77241f = mVar;
            this.f77242g = lVar;
            RecyclerView recyclerView = mVar.f91233j;
            C41536l.m120488h(recyclerView, "binding.loansLeftItemsRecyclerView");
            this.f77243h = recyclerView;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m92463m(C31056j jVar, C32648f.C32654f fVar, C31045b bVar, View view) {
            C41536l.m120489i(jVar, "this$0");
            C41536l.m120489i(fVar, "$leftItem");
            C41536l.m120489i(bVar, "this$1");
            jVar.f77242g.invoke(Integer.valueOf(jVar.getBindingAdapterPosition()));
            fVar.mo74213a();
            bVar.notifyItemChanged(jVar.getBindingAdapterPosition());
        }

        /* renamed from: n */
        private final Drawable m92464n(int i) {
            return C0767a.m2895e(this.f77241f.mo3946b().getContext(), i);
        }

        /* renamed from: i */
        public void mo71240h(C32648f fVar) {
            boolean z;
            C41536l.m120489i(fVar, "item");
            C37962m mVar = this.f77241f;
            C31045b bVar = this.f77244i;
            C32648f.C32654f fVar2 = (C32648f.C32654f) fVar;
            super.mo71243i(fVar2);
            mo71245k(fVar2.mo74241e());
            View view = mVar.f91229f;
            C41536l.m120488h(view, "loanDivider");
            if (getBindingAdapterPosition() != bVar.mo6026f().size() - 2) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            mVar.mo3946b().setOnClickListener(new C31061e(this, fVar2, bVar));
            if (fVar2.mo74243f()) {
                RecyclerView recyclerView = mVar.f91233j;
                C41536l.m120488h(recyclerView, "loansLeftItemsRecyclerView");
                C32343x.m95455i0(recyclerView);
                mVar.f91230g.setImageDrawable(m92464n(C37129d.f89408g));
            } else {
                RecyclerView recyclerView2 = mVar.f91233j;
                C41536l.m120488h(recyclerView2, "loansLeftItemsRecyclerView");
                C32343x.m95447f1(recyclerView2);
                mVar.f91230g.setImageDrawable(m92464n(C37129d.f89409h));
            }
            mVar.f91232i.setText(fVar2.mo74240d());
            mVar.f91231h.setText(fVar2.mo74239c());
        }

        /* renamed from: j */
        public RecyclerView mo71244j() {
            return this.f77243h;
        }
    }

    /* renamed from: as0.b$k */
    private static final class C31057k extends C31044a {

        /* renamed from: d */
        private final C37970u f77245d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43064a f77246e;

        /* renamed from: as0.b$k$a */
        static final class C31058a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31057k f77247d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31058a(C31057k kVar) {
                super(0);
                this.f77247d = kVar;
            }

            public final void invoke() {
                this.f77247d.f77246e.invoke();
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31057k(pr0.C37970u r3, ue1.C43064a r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "downloadPdf"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.header.statementheader.StatementHeaderView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f77245d = r3
                r2.f77246e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31057k.<init>(pr0.u, ue1.a):void");
        }

        /* renamed from: j */
        public void mo71240h(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
            StatementHeaderView statementHeaderView = this.f77245d.f91266e;
            C32648f.C32650b bVar = (C32648f.C32650b) fVar;
            statementHeaderView.setTitle(bVar.mo74225g());
            statementHeaderView.setSubtitle(C32343x.m95388F(bVar.mo74222e(), new Object[0]));
            statementHeaderView.setText(bVar.mo74224f());
            statementHeaderView.setIncludeTopSpacing(false);
            statementHeaderView.mo35785f();
            C41536l.m120488h(statementHeaderView, "bind$lambda$0");
            StatementHeaderView.m50190c(statementHeaderView, bVar.mo74221d(), C32343x.m95388F(bVar.mo74220c(), new Object[0]), (Integer) null, new C31058a(this), 4, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31045b(C43064a aVar, C43064a aVar2, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "downloadPdf");
        C41536l.m120489i(aVar2, "refresh");
        C41536l.m120489i(lVar, "scrollToPosition");
        this.f77224f = aVar;
        this.f77225g = aVar2;
        this.f77226h = lVar;
    }

    public int getItemViewType(int i) {
        return ((C32648f) mo6027g(i)).mo74214b();
    }

    /* renamed from: k */
    public void onBindViewHolder(C31044a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo71240h(obj);
    }

    /* renamed from: l */
    public C31044a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        switch (i) {
            case 0:
                C37970u d = C37970u.m111626d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …      false\n            )");
                return new C31057k(d, this.f77224f);
            case 1:
                C37964o d2 = C37964o.m111602d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
                return new C31055i(this, d2);
            case 2:
                C37962m d3 = C37962m.m111594d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
                return new C31056j(this, d3, this.f77226h);
            case 3:
                C37967r d4 = C37967r.m111614d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d4, "inflate(\n               …      false\n            )");
                return new C31050d(d4, this.f77225g);
            case 4:
                C37966q d5 = C37966q.m111610d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d5, "inflate(\n               …      false\n            )");
                return new C31052f(d5);
            case 5:
                C37963n d6 = C37963n.m111598d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d6, "inflate(\n               …      false\n            )");
                return new C31049c(d6);
            case 6:
                C37969t d7 = C37969t.m111622d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d7, "inflate(\n               …      false\n            )");
                return new C31053g(d7);
            case 7:
                C37968s d8 = C37968s.m111618d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d8, "inflate(\n               …      false\n            )");
                return new C31054h(this, d8);
            case 8:
                C37965p d9 = C37965p.m111606d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d9, "inflate(\n               …      false\n            )");
                return new C31051e(d9);
            default:
                throw new IllegalStateException("unsupported viewType".toString());
        }
    }

    /* renamed from: as0.b$a */
    private abstract class C31046a extends C31044a {

        /* renamed from: d */
        private final C31062f f77227d;

        /* renamed from: e */
        final /* synthetic */ C31045b f77228e;

        /* renamed from: as0.b$a$a */
        public static final class C31047a implements View.OnTouchListener {

            /* renamed from: d */
            final /* synthetic */ C32648f f77229d;

            /* renamed from: e */
            final /* synthetic */ C31045b f77230e;

            /* renamed from: f */
            final /* synthetic */ C31046a f77231f;

            C31047a(C32648f fVar, C31045b bVar, C31046a aVar) {
                this.f77229d = fVar;
                this.f77230e = bVar;
                this.f77231f = aVar;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                if (motionEvent == null || motionEvent.getAction() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                this.f77229d.mo74213a();
                this.f77230e.notifyItemChanged(this.f77231f.getBindingAdapterPosition());
                return true;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31046a(as0.C31045b r2, p086g1.C6201a r3, as0.C31062f r4) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "adapter"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                r1.f77228e = r2
                android.view.View r2 = r3.mo3946b()
                java.lang.String r3 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r3)
                r1.<init>(r2)
                r1.f77227d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: as0.C31045b.C31046a.<init>(as0.b, g1.a, as0.f):void");
        }

        /* renamed from: i */
        public void mo71243i(C32648f fVar) {
            C41536l.m120489i(fVar, "item");
            mo71244j().setAdapter(this.f77227d);
            mo71244j().setItemAnimator((RecyclerView.C1742m) null);
            mo71244j().setOnTouchListener(new C31047a(fVar, this.f77228e, this));
        }

        /* renamed from: j */
        public abstract RecyclerView mo71244j();

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final void mo71245k(List list) {
            C41536l.m120489i(list, "list");
            this.f77227d.mo6029i(list);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C31046a(C31045b bVar, C6201a aVar, C31062f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, aVar, (i & 2) != 0 ? new C31062f() : fVar);
        }
    }
}

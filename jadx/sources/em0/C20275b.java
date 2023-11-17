package em0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import dm0.C20043b;
import em0.C20268a;
import g91.C32343x;
import he1.C41224m;
import he1.C41233s;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p341ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView;
import p380ck.C10463g;
import p590rj.C17618a;
import p615tg.C17963d;
import p759fv.C20559a;
import ul0.C28874a;
import y71.C40027a;
import y71.C40029c;
import z71.C40184k;
import z71.C40193t;
import z71.C40195v;
import z71.C40196w;
import z71.C40197x;

/* renamed from: em0.b */
public final class C20275b extends C1819o {

    /* renamed from: f */
    private final C20043b f55196f;

    /* renamed from: em0.b$a */
    public static abstract class C20276a extends RecyclerView.C1734f0 {
        public /* synthetic */ C20276a(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* renamed from: h */
        public abstract void mo48756h(Object obj);

        private C20276a(View view) {
            super(view);
        }
    }

    /* renamed from: em0.b$b */
    public final class C20277b extends C20276a {

        /* renamed from: d */
        private final C40193t f55197d;

        /* renamed from: e */
        private final C20043b f55198e;

        /* renamed from: f */
        final /* synthetic */ C20275b f55199f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20277b(em0.C20275b r2, z71.C40193t r3, dm0.C20043b r4) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "viewModelInput"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                r1.f55199f = r2
                ge.bog.designsystem.components.buttons.Button r2 = r3.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                r1.f55197d = r3
                r1.f55198e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C20275b.C20277b.<init>(em0.b, z71.t, dm0.b):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m66304k(C20277b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            bVar.f55198e.mo48459n7();
        }

        /* renamed from: j */
        public void mo48756h(C20268a aVar) {
            C41536l.m120489i(aVar, "item");
            C40193t tVar = this.f55197d;
            tVar.f95573e.setEnabled(((C20268a.C20269a) aVar).mo48740b());
            tVar.f95573e.setButtonText(C32343x.m95388F("text.travel.insurance.calculation.result.button.details", new Object[0]));
            tVar.f95573e.setOnClickListener(new C20282c(this));
        }
    }

    /* renamed from: em0.b$c */
    private static final class C20278c extends C20276a {

        /* renamed from: d */
        private final C40196w f55200d;

        /* renamed from: e */
        private final C20043b f55201e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20278c(z71.C40196w r3, dm0.C20043b r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "viewModelInput"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                android.widget.LinearLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f55200d = r3
                r2.f55201e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C20275b.C20278c.<init>(z71.w, dm0.b):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m66308k(C20278c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f55201e.mo48456c();
        }

        /* renamed from: j */
        public void mo48756h(C20268a aVar) {
            C41536l.m120489i(aVar, "item");
            this.f55200d.f95582f.setOnClickListener(new C20283d(this));
        }
    }

    /* renamed from: em0.b$d */
    public final class C20279d extends C20276a {

        /* renamed from: d */
        private final C40184k f55202d;

        /* renamed from: e */
        private final C20043b f55203e;

        /* renamed from: f */
        final /* synthetic */ C20275b f55204f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20279d(em0.C20275b r2, z71.C40184k r3, dm0.C20043b r4) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "viewModelInput"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                r1.f55204f = r2
                android.widget.LinearLayout r2 = r3.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                r1.f55202d = r3
                r1.f55203e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C20275b.C20279d.<init>(em0.b, z71.k, dm0.b):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m66312k(C20279d dVar, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(dVar, "this$0");
            dVar.f55203e.mo48457cg();
        }

        /* renamed from: j */
        public void mo48756h(C20268a aVar) {
            C41536l.m120489i(aVar, "item");
            C40184k kVar = this.f55202d;
            kVar.f95541h.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            kVar.f95541h.setChecked(((C20268a.C20271c) aVar).mo48741b());
            kVar.f95541h.setOnCheckedChangeListener(new C20284e(this));
            kVar.f95538e.setTitle(C32343x.m95388F("text.travel.insurance.calculation.result.additional.coverage.description", new Object[0]));
            kVar.f95538e.setText(C32343x.m95388F("text.travel.insurance.calculation.result.additional.coverage", new Object[0]));
            kVar.f95542i.setTitle(C32343x.m95388F("text.travel.insurance.calculation.result.choose.policy", new Object[0]));
            kVar.f95542i.setText(C32343x.m95388F("text.travel.insurance.calculation.result.choose.policy.description", new Object[0]));
        }
    }

    /* renamed from: em0.b$e */
    private static final class C20280e extends C20276a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20280e(z71.C40197x r2) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                ge.bog.designsystem.components.loading.LoadingView r2 = r2.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C20275b.C20280e.<init>(z71.x):void");
        }

        /* renamed from: i */
        public void mo48756h(C20268a aVar) {
            C41536l.m120489i(aVar, "item");
        }
    }

    /* renamed from: em0.b$f */
    private static final class C20281f extends C20276a {

        /* renamed from: d */
        private final C40195v f55205d;

        /* renamed from: e */
        private final C20043b f55206e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C20281f(z71.C40195v r3, dm0.C20043b r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "input"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f55205d = r3
                r2.f55206e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: em0.C20275b.C20281f.<init>(z71.v, dm0.b):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m66318k(C20268a.C20273e eVar, C20281f fVar, View view) {
            C41536l.m120489i(eVar, "$providerUiState");
            C41536l.m120489i(fVar, "this$0");
            C20559a.C20571l lVar = new C20559a.C20571l(eVar.mo48749i());
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            lVar.mo49091a(F);
            fVar.f55206e.mo48458js(eVar);
        }

        /* renamed from: l */
        private final C41224m m66319l(C20268a.C20273e eVar) {
            double g = eVar.mo48747g();
            String valueOf = String.valueOf(eVar.mo48748h());
            if (!eVar.mo48753m() || eVar.mo48745e() == null || eVar.mo48746f() == null) {
                return C41233s.m119492a(new ThumbnailBadgeCardView.C13544a(new Amount(g, valueOf), (String) null, (String) null, 6, (DefaultConstructorMarker) null), (Object) null);
            }
            return C41233s.m119492a((Object) null, m66321n(eVar, valueOf, g));
        }

        /* renamed from: m */
        private final List m66320m(C20268a.C20273e eVar) {
            int i;
            int i2;
            int i3;
            List<C28874a> b = eVar.mo48742b();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (C28874a aVar : b) {
                String a = aVar.mo68601a();
                if (a == null) {
                    a = "";
                }
                Boolean b2 = aVar.mo68602b();
                Boolean bool = Boolean.TRUE;
                if (C41536l.m120484d(b2, bool)) {
                    i = C40029c.ic_check;
                } else {
                    i = C40029c.ic_close;
                }
                int i4 = i;
                if (C41536l.m120484d(aVar.mo68602b(), bool)) {
                    i2 = C40027a.f95085d;
                } else {
                    i2 = C40027a.f95083b;
                }
                Color.Resource resource = new Color.Resource(i2);
                if (C41536l.m120484d(aVar.mo68602b(), bool)) {
                    i3 = C40027a.f95086e;
                } else {
                    i3 = C40027a.f95084c;
                }
                arrayList.add(new ThumbnailBadgeCardView.C13546c(a, new NotificationBadgeTextView.C13406a(i4, resource, (Integer) null, (Integer) null, new Color.Resource(i3), (Color) null, 44, (DefaultConstructorMarker) null)));
            }
            return arrayList;
        }

        /* renamed from: n */
        private final List m66321n(C20268a.C20273e eVar, String str, double d) {
            if (eVar.mo48745e() == null || eVar.mo48746f() == null) {
                return null;
            }
            return C41341q.m119910m(new C17618a.C17619a(C32343x.m95388F("text.travel.insurance.screen.policy.choice.insurance.sum", new Object[0]), new Amount(eVar.mo48745e().doubleValue(), str)), new C17618a.C17619a(C32343x.m95388F("text.travel.insurance.screen.policy.choice.additional.risk.sum", new Object[0]), new Amount(eVar.mo48746f().doubleValue(), str)), new C17618a.C17620b(C32343x.m95388F("text.travel.insurance.screen.policy.choice.total.sum", new Object[0]), new Amount(d, str), false, 4, (DefaultConstructorMarker) null));
        }

        /* renamed from: j */
        public void mo48756h(C20268a aVar) {
            C41536l.m120489i(aVar, "item");
            C20268a.C20273e eVar = (C20268a.C20273e) aVar;
            C41224m l = m66319l(eVar);
            this.f55205d.f95579e.setValue(new ThumbnailBadgeCardView.C13547d(new Image.Url(String.valueOf(eVar.mo48744d()), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), C32343x.m95388F(eVar.mo48751k(), new Object[0]), (ThumbnailBadgeCardView.C13544a) l.mo95678e(), (String) null, (List) null, m66320m(eVar), (List) l.mo95680f(), 24, (DefaultConstructorMarker) null));
            this.f55205d.mo3946b().setOnClickListener(new C20285f(eVar, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20275b(C20043b bVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(bVar, "viewModelInput");
        this.f55196f = bVar;
    }

    public int getItemViewType(int i) {
        return ((C20268a) mo6027g(i)).mo48739a();
    }

    /* renamed from: k */
    public void onBindViewHolder(C20276a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo48756h(obj);
    }

    /* renamed from: l */
    public C20276a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C20268a.C20274f.HEADER_UI_STATE.ordinal()) {
            C40184k d = C40184k.m116444d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C20279d(this, d, this.f55196f);
        } else if (i == C20268a.C20274f.PROVIDERS_UI_STATE.ordinal()) {
            C40195v d2 = C40195v.m116488d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C20281f(d2, this.f55196f);
        } else if (i == C20268a.C20274f.COMPARE_BUTTON_UI_STATE.ordinal()) {
            C40193t d3 = C40193t.m116480d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C20277b(this, d3, this.f55196f);
        } else if (i == C20268a.C20274f.ERROR_UI_STATE.ordinal()) {
            C40196w d4 = C40196w.m116492d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C20278c(d4, this.f55196f);
        } else if (i == C20268a.C20274f.LOADING_UI_STATE.ordinal()) {
            C40197x d5 = C40197x.m116496d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C20280e(d5);
        } else {
            throw new IllegalStateException("unsupported viewType".toString());
        }
    }
}

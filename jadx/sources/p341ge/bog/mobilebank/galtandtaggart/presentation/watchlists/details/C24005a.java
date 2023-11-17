package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32290b1;
import g91.C32335t0;
import ie0.C25183c;
import ie0.C25185e;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import ue0.C28763y0;
import ug0.C28786c;
import xe0.C29760r;
import xg0.C29767a;
import xg0.C29774h;
import xg0.C29775i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.a */
public final class C24005a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f62310f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C29767a f62311g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C24006a f62312h;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.a$a */
    public interface C24006a {
        /* renamed from: s */
        void mo60986s(C29760r rVar);

        /* renamed from: y */
        void mo60987y(C29760r rVar);
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.a$b */
    public final class C24007b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28763y0 f62313d;

        /* renamed from: e */
        final /* synthetic */ C24005a f62314e;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.a$b$a */
        public /* synthetic */ class C24008a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f62315a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    xe0.q[] r0 = xe0.C29759q.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    xe0.q r1 = xe0.C29759q.TO_ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    xe0.q r1 = xe0.C29759q.TO_REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f62315a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.C24005a.C24007b.C24008a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24007b(C24005a aVar, C28763y0 y0Var) {
            super(y0Var.mo3946b());
            C41536l.m120489i(y0Var, "binding");
            this.f62314e = aVar;
            this.f62313d = y0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m77445k(C24005a aVar, C29760r rVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(rVar, "$watchListSymbol");
            C24006a m = aVar.f62312h;
            if (m != null) {
                m.mo60987y(rVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m77446l(C24005a aVar, int i, C29760r rVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(rVar, "$watchListSymbol");
            aVar.f62311g.mo60973Qj(i);
            C24006a m = aVar.f62312h;
            if (m != null) {
                m.mo60986s(rVar);
            }
        }

        /* renamed from: j */
        public final void mo61005j(C29760r rVar, int i) {
            int i2;
            C41536l.m120489i(rVar, "watchListSymbol");
            C28763y0 y0Var = this.f62313d;
            C24005a aVar = this.f62314e;
            y0Var.f73545h.setText(rVar.mo69883f());
            y0Var.f73545h.setTitle(rVar.mo69880d());
            y0Var.f73544g.setText(rVar.mo69879c());
            y0Var.f73544g.setTitle(C28786c.m88250f(rVar.mo69878b()));
            y0Var.f73544g.setHorizontalGravity(8388613);
            ((C2394j) ((C2394j) C2379b.m9210t(aVar.f62310f).mo7757y(rVar.mo69877a()).mo7223d0(C32290b1.m95123m(C0767a.m2895e(aVar.f62310f, C25185e.icons_16_payment_transfer_transfer_treasury), C32335t0.m95357b()))).mo7222d()).mo7718L0(y0Var.f73542e);
            TwoLineReverseTextItem twoLineReverseTextItem = this.f62313d.f73544g;
            BigDecimal b = rVar.mo69878b();
            BigDecimal valueOf = BigDecimal.valueOf(0);
            C41536l.m120488h(valueOf, "valueOf(this.toLong())");
            if (b.compareTo(valueOf) < 0) {
                i2 = C25183c.f64646h;
            } else {
                i2 = C25183c.f64651m;
            }
            twoLineReverseTextItem.setTitleColorRes(i2);
            int i3 = C24008a.f62315a[rVar.mo69881e().ordinal()];
            if (i3 == 1) {
                y0Var.f73543f.setImageDrawable(aVar.f62310f.getDrawable(C25185e.f64660o));
            } else if (i3 == 2) {
                y0Var.f73543f.setImageDrawable(aVar.f62310f.getDrawable(C25185e.f64659n));
            }
            this.f62313d.mo3946b().setOnClickListener(new C29774h(aVar, rVar));
            y0Var.f73543f.setOnClickListener(new C29775i(aVar, i, rVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24005a(Context context, C29767a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "viewModel");
        this.f62310f = context;
        this.f62311g = aVar;
    }

    /* renamed from: n */
    public void onBindViewHolder(C24007b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo61005j((C29760r) g, i);
    }

    /* renamed from: o */
    public C24007b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28763y0 d = C28763y0.m88187d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C24007b(this, d);
    }

    /* renamed from: p */
    public final void mo61003p(C24006a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f62312h = aVar;
    }

    /* renamed from: q */
    public final void mo61004q() {
        C29767a aVar = this.f62311g;
        List f = mo6026f();
        C41536l.m120488h(f, "currentList");
        aVar.mo60981vp(f);
        notifyItemChanged(this.f62311g.mo60971Ai());
    }
}

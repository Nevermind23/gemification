package g20;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.C19875m;
import g91.C32303f;
import g91.C32314k;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import l50.C25840t;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p366bk.C10320i;
import p366bk.C10322k;
import p380ck.C10463g;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: g20.e0 */
public final class C20602e0 extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final ExpandableItemView f55659d;

    /* renamed from: e */
    private final LayerView f55660e;

    /* renamed from: f */
    private final AppCompatImageView f55661f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19875m f55662g = new C19875m();

    /* renamed from: h */
    private View f55663h;

    /* renamed from: i */
    private TextView f55664i;

    /* renamed from: j */
    private View f55665j;

    /* renamed from: k */
    private C25840t f55666k;

    /* renamed from: l */
    private C43075l f55667l;

    /* renamed from: m */
    private C43075l f55668m;

    /* renamed from: n */
    private boolean f55669n;

    /* renamed from: g20.e0$a */
    static final class C20603a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C20602e0 f55670d;

        /* renamed from: e */
        final /* synthetic */ View f55671e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20603a(C20602e0 e0Var, View view) {
            super(2);
            this.f55670d = e0Var;
            this.f55671e = view;
        }

        /* renamed from: a */
        public final void mo49149a(View view, int i) {
            C41536l.m120489i(view, "recyclerView");
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setAdapter(this.f55670d.f55662g);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f55671e.getContext(), 0, false));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo49149a((View) obj, ((Number) obj2).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: g20.e0$b */
    static final class C20604b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20602e0 f55672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20604b(C20602e0 e0Var) {
            super(1);
            this.f55672d = e0Var;
        }

        /* renamed from: a */
        public final void mo49150a(View view) {
            C41536l.m120489i(view, "it");
            this.f55672d.m66863C();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49150a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20602e0(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.expandable_item_remaining_amount);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.…le_item_remaining_amount)");
        ExpandableItemView expandableItemView = (ExpandableItemView) findViewById;
        this.f55659d = expandableItemView;
        View findViewById2 = expandableItemView.findViewById(C10322k.hide_container);
        C41536l.m120488h(findViewById2, "expandableItemView.findV…ById(R.id.hide_container)");
        LayerView layerView = (LayerView) findViewById2;
        this.f55660e = layerView;
        View findViewById3 = expandableItemView.findViewById(C10322k.hideIV);
        C41536l.m120488h(findViewById3, "expandableItemView.findViewById(R.id.hideIV)");
        this.f55661f = (AppCompatImageView) findViewById3;
        expandableItemView.setOnBindItem(new C20603a(this, view));
        expandableItemView.setScrollToTopWhenExpanded(true);
        expandableItemView.setAnimateChanges(false);
        View findViewById4 = expandableItemView.findViewById(C10322k.remaining_amount_overall_text);
        C41536l.m120488h(findViewById4, "expandableItemView.findV…ning_amount_overall_text)");
        this.f55664i = (TextView) findViewById4;
        View findViewById5 = expandableItemView.findViewById(C10322k.remaining_amount_expandable_item_view);
        C41536l.m120488h(findViewById5, "expandableItemView.findV…unt_expandable_item_view)");
        this.f55663h = findViewById5;
        View findViewById6 = expandableItemView.findViewById(C10322k.mask_amount_layout);
        C41536l.m120488h(findViewById6, "expandableItemView.findV…(R.id.mask_amount_layout)");
        this.f55665j = findViewById6;
        this.f55663h.setOnClickListener(new C20598c0(this));
        layerView.setOnClickListener(new C20600d0(this));
    }

    /* renamed from: A */
    private final void m66861A(C25840t tVar) {
        int i;
        View view = this.f55665j;
        if (this.f55669n) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        TextView textView = this.f55664i;
        String p = m66871p(tVar.mo64608c().mo64557c().mo64482a().doubleValue());
        String a = C32314k.m95245a(tVar.mo64608c().mo64557c().mo64483b());
        textView.setText(p + " " + a);
    }

    /* renamed from: B */
    private final void m66862B() {
        this.f55661f.setImageResource(m66870o());
        this.f55662g.mo48189j(this.f55669n);
        m66863C();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m66863C() {
        C25840t tVar = this.f55666k;
        if (tVar != null) {
            m66861A(tVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66866j(C20602e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.f55659d.mo53648w();
        e0Var.m66876u();
        e0Var.m66873r();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m66867k(C20602e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.m66878y();
        e0Var.m66877w();
    }

    /* renamed from: o */
    private final int m66870o() {
        if (this.f55669n) {
            return C10320i.icons_16_system_eye_off_outline;
        }
        return C10320i.f28697qa;
    }

    /* renamed from: p */
    private final String m66871p(double d) {
        if (this.f55669n) {
            return "";
        }
        return C32303f.m95204o(d);
    }

    /* renamed from: q */
    private final void m66872q(boolean z) {
        if (m66874s(z)) {
            ExpandableItemView.m69434g(this.f55659d, false, 1, (Object) null);
        } else if (m66875t(z)) {
            ExpandableItemView.m69436j(this.f55659d, false, 1, (Object) null);
        }
    }

    /* renamed from: r */
    private final void m66873r() {
        String str;
        C10463g F = C36546y.m108282F();
        if (this.f55659d.mo53636m()) {
            str = "expand";
        } else {
            str = "collapse";
        }
        F.mo27152s("home", str, "click_total_available_amount");
    }

    /* renamed from: s */
    private final boolean m66874s(boolean z) {
        return z && this.f55659d.mo53636m();
    }

    /* renamed from: t */
    private final boolean m66875t(boolean z) {
        return !z && !this.f55659d.mo53636m();
    }

    /* renamed from: u */
    private final void m66876u() {
        C43075l lVar = this.f55667l;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(!this.f55659d.mo53636m()));
        }
    }

    /* renamed from: w */
    private final void m66877w() {
        C43075l lVar = this.f55668m;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(this.f55669n));
        }
    }

    /* renamed from: y */
    private final void m66878y() {
        this.f55669n = !this.f55669n;
        m66862B();
    }

    /* renamed from: z */
    private final void m66879z(boolean z) {
        this.f55669n = z;
        m66862B();
    }

    /* renamed from: n */
    public final void mo49146n(C25840t tVar) {
        C41536l.m120489i(tVar, "data");
        this.f55666k = tVar;
        this.f55659d.setOnBindHeader(new C20604b(this));
        this.f55662g.mo48188i(tVar.mo64608c().mo64556b(), this.f55669n);
        ExpandableItemView.m69446y(this.f55659d, 1, false, 2, (Object) null);
        m66872q(tVar.mo64609d());
        m66879z(tVar.mo64610e());
    }

    /* renamed from: v */
    public final void mo49147v(C43075l lVar) {
        C41536l.m120489i(lVar, "expandableChanged");
        this.f55667l = lVar;
    }

    /* renamed from: x */
    public final void mo49148x(C43075l lVar) {
        C41536l.m120489i(lVar, "hiddenChanged");
        this.f55668m = lVar;
    }
}

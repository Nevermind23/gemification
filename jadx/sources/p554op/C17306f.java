package p554op;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.accordion.CheckBoxAccordionView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p356ao.C10109a;
import p356ao.C10111c;
import p356ao.C10113e;
import p356ao.C10118j;
import p413eo.C12745g0;
import p413eo.C12747h0;
import p413eo.C12751j0;
import p413eo.C12753k0;
import p554op.C17298c;
import p615tg.C17963d;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: op.f */
public final class C17306f extends C1819o {

    /* renamed from: op.f$a */
    public static final class C17307a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12747h0 f48617d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17307a(C12747h0 h0Var) {
            super(h0Var.mo3946b());
            C41536l.m120489i(h0Var, "binding");
            this.f48617d = h0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final View m60661j(CheckBoxAccordionView checkBoxAccordionView, C17298c.C17299a aVar, int i) {
            C41536l.m120489i(checkBoxAccordionView, "$this_with");
            C41536l.m120489i(aVar, "$benef");
            TextView textView = new TextView(checkBoxAccordionView.getContext());
            textView.setText(C32343x.m95388F(aVar.mo44693b(), new Object[0]));
            textView.setTypeface(C0808h.m3033h(textView.getContext(), C10113e.f27920a));
            Context context = textView.getContext();
            C41536l.m120488h(context, "context");
            textView.setTextColor(C18368l.m62755d(context, C10109a.f27893c));
            int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(C10111c.f27910b);
            Resources resources = textView.getContext().getResources();
            int i2 = C10111c.f27909a;
            textView.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(i2), textView.getContext().getResources().getDimensionPixelSize(i2), textView.getContext().getResources().getDimensionPixelSize(i2));
            return textView;
        }

        /* renamed from: i */
        public final void mo44721i(C17298c.C17299a aVar) {
            C41536l.m120489i(aVar, "benef");
            CheckBoxAccordionView checkBoxAccordionView = this.f48617d.f37742e;
            checkBoxAccordionView.setTitle(C32343x.m95388F(aVar.mo44695d(), new Object[0]));
            checkBoxAccordionView.setSubTitle(C32343x.m95388F(aVar.mo44694c(), new Object[0]));
            checkBoxAccordionView.setCheckBoxVisible(false);
            checkBoxAccordionView.setIconVisible(false);
            Context context = checkBoxAccordionView.getContext();
            C41536l.m120488h(context, "context");
            checkBoxAccordionView.setDividerColor(C18368l.m62755d(context, C10109a.f27892b));
            Context context2 = checkBoxAccordionView.getContext();
            C41536l.m120488h(context2, "context");
            checkBoxAccordionView.setSubtitleColor(C18368l.m62755d(context2, C10109a.f27891a));
            checkBoxAccordionView.setOnCreateViewListener(new C17305e(checkBoxAccordionView, aVar));
            checkBoxAccordionView.mo34609m(1);
        }

        /* renamed from: k */
        public final C12747h0 mo44722k() {
            return this.f48617d;
        }
    }

    /* renamed from: op.f$b */
    public static final class C17308b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12745g0 f48618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17308b(C12745g0 g0Var) {
            super(g0Var.mo3946b());
            C41536l.m120489i(g0Var, "binding");
            this.f48618d = g0Var;
        }

        /* renamed from: h */
        public final void mo44723h(C17298c.C17300b bVar) {
            Image.Url url;
            C41536l.m120489i(bVar, "benef");
            this.f48618d.f37737i.setText(C32343x.m95388F(bVar.mo44701d(), new Object[0]));
            this.f48618d.f37734f.setText(C32343x.m95388F(bVar.mo44700c(), new Object[0]));
            AppCompatImageView appCompatImageView = this.f48618d.f37735g;
            C41536l.m120488h(appCompatImageView, "binding.icon");
            String b = bVar.mo44699b();
            if (b != null) {
                url = new Image.Url(b, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            } else {
                url = null;
            }
            C18368l.m62746A(appCompatImageView, url, (C43075l) null, 2, (Object) null);
        }
    }

    /* renamed from: op.f$c */
    public static final class C17309c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12751j0 f48619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17309c(C12751j0 j0Var) {
            super(j0Var.mo3946b());
            C41536l.m120489i(j0Var, "binding");
            this.f48619d = j0Var;
        }

        /* renamed from: h */
        public final void mo44724h(C17298c.C17301c cVar) {
            C41536l.m120489i(cVar, "benef");
            TwoLineReverseTextItem twoLineReverseTextItem = this.f48619d.f37760e;
            twoLineReverseTextItem.setTitle(C32343x.m95388F(cVar.mo44705b(), new Object[0]));
            twoLineReverseTextItem.setText(C32343x.m95388F(cVar.mo44706c(), new Object[0]));
            Context context = twoLineReverseTextItem.getContext();
            C41536l.m120488h(context, "context");
            twoLineReverseTextItem.setTitleColorInt(C18368l.m62755d(context, C10109a.f27891a));
            Context context2 = twoLineReverseTextItem.getContext();
            C41536l.m120488h(context2, "context");
            twoLineReverseTextItem.setTextColorInt(C18368l.m62755d(context2, C10109a.f27893c));
        }

        /* renamed from: i */
        public final C12751j0 mo44725i() {
            return this.f48619d;
        }
    }

    /* renamed from: op.f$d */
    public static final class C17310d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12753k0 f48620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17310d(C12753k0 k0Var) {
            super(k0Var.mo3946b());
            C41536l.m120489i(k0Var, "binding");
            this.f48620d = k0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m60668j(C17298c.C17302d dVar, View view) {
            C41536l.m120489i(dVar, "$benef");
            C32303f.m95184D(dVar.mo44710b(), view.getContext());
        }

        /* renamed from: i */
        public final void mo44726i(C17298c.C17302d dVar) {
            C41536l.m120489i(dVar, "benef");
            this.f48620d.f37770i.setText(C32343x.m95388F(dVar.mo44712d(), new Object[0]));
            this.f48620d.f37769h.setText(C32343x.m95388F(dVar.mo44711c(), new Object[0]));
            this.f48620d.f37769h.setOnClickListener(new C17311g(dVar));
        }

        /* renamed from: k */
        public final C12753k0 mo44727k() {
            return this.f48620d;
        }
    }

    public C17306f() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    private final void m60659k(boolean z, LayerView layerView) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        if (z) {
            i = C10118j.LayerRadiusBottom12Shadow0;
        } else {
            i = C10118j.f27980a;
        }
        layerView.setLayerStyle(i);
        ViewGroup.LayoutParams layoutParams = layerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (z) {
            i2 = layerView.getContext().getResources().getDimensionPixelSize(C10111c.f27909a);
        } else {
            i2 = 0;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, i2);
        }
    }

    public int getItemViewType(int i) {
        return ((C17298c) mo6026f().get(i)).mo44692a();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        boolean z;
        C41536l.m120489i(f0Var, "holder");
        C17298c cVar = (C17298c) mo6026f().get(i);
        if (i == getItemCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        View rootView = f0Var.itemView.getRootView();
        C41536l.m120487g(rootView, "null cannot be cast to non-null type ge.bog.designsystem.components.layersandshadows.LayerView");
        m60659k(z, (LayerView) rootView);
        if (f0Var instanceof C17307a) {
            C17307a aVar = (C17307a) f0Var;
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageBenefitViewType.Accord");
            aVar.mo44721i((C17298c.C17299a) cVar);
            aVar.mo44722k().f37742e.setDividerVisible(!z);
        } else if (f0Var instanceof C17309c) {
            C17309c cVar2 = (C17309c) f0Var;
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageBenefitViewType.Info");
            cVar2.mo44724h((C17298c.C17301c) cVar);
            View view = cVar2.mo44725i().f37762g;
            C41536l.m120488h(view, "holder.binding.divider");
            C32343x.m95483r1(view, !z, false, 2, (Object) null);
        } else if (f0Var instanceof C17308b) {
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageBenefitViewType.BecomeSolo");
            ((C17308b) f0Var).mo44723h((C17298c.C17300b) cVar);
        } else if (f0Var instanceof C17310d) {
            C17310d dVar = (C17310d) f0Var;
            C41536l.m120487g(cVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageBenefitViewType.InfoLink");
            dVar.mo44726i((C17298c.C17302d) cVar);
            View view2 = dVar.mo44727k().f37767f;
            C41536l.m120488h(view2, "holder.binding.divider");
            C32343x.m95483r1(view2, !z, false, 2, (Object) null);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C17298c.C17303e.ACCORDION.ordinal()) {
            C12747h0 d = C12747h0.m48383d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C17307a(d);
        } else if (i == C17298c.C17303e.INFO.ordinal()) {
            C12751j0 d2 = C12751j0.m48399d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(LayoutInflater.f….context), parent, false)");
            return new C17309c(d2);
        } else if (i == C17298c.C17303e.BECOMESOLO.ordinal()) {
            C12745g0 d3 = C12745g0.m48374d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …  false\n                )");
            return new C17308b(d3);
        } else if (i == C17298c.C17303e.INFOLINK.ordinal()) {
            C12753k0 d4 = C12753k0.m48407d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …, false\n                )");
            return new C17310d(d4);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}

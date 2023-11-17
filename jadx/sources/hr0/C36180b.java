package hr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import br0.C31179e;
import br0.C31180f;
import g91.C32343x;
import jr0.C36783a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import xq0.C39836b;

/* renamed from: hr0.b */
public final class C36180b extends C1819o {

    /* renamed from: f */
    private final C36181a f87372f;

    /* renamed from: hr0.b$a */
    public interface C36181a {
        /* renamed from: a */
        void mo73680a(C36783a aVar, boolean z);
    }

    /* renamed from: hr0.b$b */
    public static abstract class C36182b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final View f87373d;

        /* renamed from: e */
        private final C36181a f87374e;

        /* renamed from: hr0.b$b$a */
        public static final class C36183a extends C36182b {

            /* renamed from: f */
            private final C31180f f87375f;

            /* renamed from: g */
            private final C36181a f87376g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C36183a(br0.C31180f r3, hr0.C36180b.C36181a r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    java.lang.String r0 = "selectionListener"
                    kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r4, r1)
                    r2.f87375f = r3
                    r2.f87376g = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: hr0.C36180b.C36182b.C36183a.<init>(br0.f, hr0.b$a):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: p */
            public static final void m107610p(C36183a aVar, C36783a aVar2, CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(aVar, "this$0");
                C41536l.m120489i(aVar2, "$item");
                C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
                aVar.f87376g.mo73680a(aVar2, z);
            }

            /* access modifiers changed from: protected */
            /* renamed from: j */
            public void mo88941j(C36783a aVar) {
                C41536l.m120489i(aVar, "item");
                this.f87375f.f77476e.setOnCheckedStateChangeListener(new C36186d(this, aVar));
            }

            /* access modifiers changed from: protected */
            /* renamed from: k */
            public void mo88942k(C36783a aVar) {
                C41536l.m120489i(aVar, "item");
                mo88945n(aVar.mo89664d());
                this.f87375f.f77477f.setTitle(C32343x.m95388F(aVar.mo89661a(), new Object[0]));
                this.f87375f.f77477f.setText(C32343x.m95388F(aVar.mo89663c(), new Object[0]));
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public boolean mo88944m() {
                return this.f87375f.f77476e.isChecked();
            }

            /* access modifiers changed from: protected */
            /* renamed from: n */
            public void mo88945n(boolean z) {
                this.f87375f.f77476e.setChecked(z);
            }
        }

        /* renamed from: hr0.b$b$b */
        public static final class C36184b extends C36182b {

            /* renamed from: f */
            private final C31179e f87377f;

            /* renamed from: g */
            private final C36181a f87378g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C36184b(br0.C31179e r3, hr0.C36180b.C36181a r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    java.lang.String r0 = "selectionListener"
                    kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r4, r1)
                    r2.f87377f = r3
                    r2.f87378g = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: hr0.C36180b.C36182b.C36184b.<init>(br0.e, hr0.b$a):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: p */
            public static final void m107616p(C36184b bVar, C36783a aVar, CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(bVar, "this$0");
                C41536l.m120489i(aVar, "$item");
                C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
                bVar.f87378g.mo73680a(aVar, z);
            }

            /* access modifiers changed from: protected */
            /* renamed from: j */
            public void mo88941j(C36783a aVar) {
                C41536l.m120489i(aVar, "item");
                this.f87377f.f77473e.setOnCheckedStateChangeListener(new C36187e(this, aVar));
            }

            /* access modifiers changed from: protected */
            /* renamed from: k */
            public void mo88942k(C36783a aVar) {
                C41536l.m120489i(aVar, "item");
                mo88945n(aVar.mo89664d());
                ThreeLineTextItem threeLineTextItem = this.f87377f.f77474f;
                threeLineTextItem.setTitle(aVar.mo89663c());
                threeLineTextItem.setText(aVar.mo89661a());
                threeLineTextItem.setSubtitle(aVar.mo89662b());
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public boolean mo88944m() {
                return this.f87377f.f77473e.isChecked();
            }

            /* access modifiers changed from: protected */
            /* renamed from: n */
            public void mo88945n(boolean z) {
                this.f87377f.f77473e.setChecked(z);
            }
        }

        public /* synthetic */ C36182b(View view, C36181a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m107603i(C36182b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            bVar.mo88945n(!bVar.mo88944m());
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public abstract void mo88941j(C36783a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public abstract void mo88942k(C36783a aVar);

        /* renamed from: l */
        public final void mo88943l(C36783a aVar) {
            C41536l.m120489i(aVar, "item");
            mo88942k(aVar);
            mo88941j(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract boolean mo88944m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo88945n(boolean z);

        private C36182b(View view, C36181a aVar) {
            super(view);
            this.f87373d = view;
            this.f87374e = aVar;
            view.setOnClickListener(new C36185c(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36180b(C36181a aVar) {
        super(C36179a.f87371a);
        C41536l.m120489i(aVar, "selectionListener");
        this.f87372f = aVar;
    }

    public int getItemViewType(int i) {
        if (((C36783a) mo6027g(i)) instanceof C36783a.C36784a) {
            return C39836b.item_property_not_chosen_yet;
        }
        return C39836b.item_property;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36182b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo88943l((C36783a) g);
    }

    /* renamed from: l */
    public C36182b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C39836b.item_property_not_chosen_yet) {
            C31180f d = C31180f.m92727d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C36182b.C36183a(d, this.f87372f);
        }
        C31179e d2 = C31179e.m92723d(from, viewGroup, false);
        C41536l.m120488h(d2, "inflate(inflater, parent, false)");
        return new C36182b.C36184b(d2, this.f87372f);
    }
}

package zx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import dy0.C31622e;
import fx0.C32022b;
import g91.C32343x;
import jx0.C36814c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail;
import ue1.C43075l;

/* renamed from: zx0.b */
public final class C40268b extends C1819o {

    /* renamed from: i */
    public static final C40269a f95711i = new C40269a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final int f95712j = C32343x.m95422W(C32022b.f78826b);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final int f95713k = C32343x.m95422W(C32022b.f78827c);

    /* renamed from: f */
    private final C43075l f95714f;

    /* renamed from: g */
    private boolean f95715g = true;

    /* renamed from: h */
    private Long f95716h;

    /* renamed from: zx0.b$a */
    public static final class C40269a {
        private C40269a() {
        }

        public /* synthetic */ C40269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zx0.b$b */
    public static final class C40270b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36814c0 f95717d;

        /* renamed from: e */
        private final C43075l f95718e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40270b(C36814c0 c0Var, C43075l lVar) {
            super(c0Var.mo3946b());
            C41536l.m120489i(c0Var, "binding");
            this.f95717d = c0Var;
            this.f95718e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m116669j(C31622e eVar, Long l, C40270b bVar, View view) {
            C43075l lVar;
            C41536l.m120489i(eVar, "$item");
            C41536l.m120489i(bVar, "this$0");
            long d = eVar.mo72050d();
            if ((l == null || d != l.longValue()) && (lVar = bVar.f95718e) != null) {
                lVar.invoke(Long.valueOf(eVar.mo72050d()));
            }
        }

        /* renamed from: k */
        private final void m116670k(int i) {
            int i2;
            int i3;
            FrameLayout c = this.f95717d.mo3946b();
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition == 0) {
                i2 = C40268b.f95712j;
                i3 = C40268b.f95713k;
            } else {
                if (bindingAdapterPosition == i) {
                    i3 = C40268b.f95712j;
                } else {
                    i3 = C40268b.f95713k;
                }
                i2 = 0;
            }
            C41536l.m120488h(c, "updateMargins$lambda$3");
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.C1752q qVar = (RecyclerView.C1752q) layoutParams;
                qVar.setMargins(i2, 0, i3, 0);
                c.setLayoutParams(qVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }

        /* renamed from: i */
        public final void mo94295i(C31622e eVar, Long l, boolean z, int i) {
            ChipThumbnail.C13236a aVar;
            float f;
            C41536l.m120489i(eVar, "item");
            ChipThumbnail chipThumbnail = this.f95717d.f88815e;
            chipThumbnail.setTitle(eVar.mo72049c());
            chipThumbnail.setDescription(eVar.mo72047a());
            chipThumbnail.mo35203k(eVar.mo72048b(), true);
            long d = eVar.mo72050d();
            if (l != null && l.longValue() == d) {
                aVar = ChipThumbnail.C13236a.ACTIVE;
            } else {
                aVar = ChipThumbnail.C13236a.ENABLE;
            }
            chipThumbnail.setStateType(aVar);
            m116670k(i);
            FrameLayout c = this.f95717d.mo3946b();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            c.setAlpha(f);
            this.f95717d.mo3946b().setOnClickListener(new C40271c(eVar, l, this));
        }
    }

    public C40268b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        this.f95714f = lVar;
    }

    /* renamed from: m */
    public final Long mo94290m() {
        return this.f95716h;
    }

    /* renamed from: n */
    public void onBindViewHolder(C40270b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        C31622e eVar = (C31622e) mo6027g(i);
        C41536l.m120488h(eVar, "template");
        bVar.mo94295i(eVar, this.f95716h, this.f95715g, getItemCount() - 1);
    }

    /* renamed from: o */
    public C40270b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36814c0 d = C36814c0.m109070d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C40270b(d, this.f95714f);
    }

    /* renamed from: p */
    public final void mo94293p(boolean z) {
        if (this.f95715g != z) {
            this.f95715g = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: q */
    public final void mo94294q(Long l) {
        if (!C41536l.m120484d(this.f95716h, l)) {
            this.f95716h = l;
            notifyDataSetChanged();
        }
    }
}

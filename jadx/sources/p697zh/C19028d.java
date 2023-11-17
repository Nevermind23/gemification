package p697zh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.depositheader.DepositHeaderView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C9947k;
import p601sg.C17779d;
import p642vh.C18338b0;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: zh.d */
public final class C19028d extends RecyclerView.C1736h {

    /* renamed from: d */
    private C18338b0 f53157d = C18338b0.C18346e.f51796d;

    /* renamed from: e */
    private DepositHeaderView.C13293b f53158e = DepositHeaderView.C13293b.CLEAR;

    /* renamed from: f */
    private List f53159f = C41341q.m119907j();

    /* renamed from: zh.d$a */
    public final class C19029a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9947k f53160d;

        /* renamed from: e */
        private final int f53161e;

        /* renamed from: f */
        private final int f53162f;

        /* renamed from: g */
        final /* synthetic */ C19028d f53163g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19029a(C19028d dVar, C9947k kVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
            this.f53163g = dVar;
            this.f53160d = kVar;
            this.f53161e = kVar.mo3946b().getResources().getDimensionPixelSize(C17779d.f49642K1);
            this.f53162f = kVar.mo3946b().getResources().getDimensionPixelSize(C17779d.f49645S1);
        }

        /* renamed from: i */
        private final C19025c m64309i(C19024b bVar, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            Context context = this.f53160d.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            C19025c cVar = new C19025c(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            cVar.setText(bVar.mo47203a());
            cVar.setType(bVar.mo47204b());
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, this.f53162f, 0, 0);
                }
            }
            return cVar;
        }

        /* renamed from: h */
        public final ViewGroup.MarginLayoutParams mo47220h(C19023a aVar) {
            int i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            C41536l.m120489i(aVar, "depositDetails");
            C9947k kVar = this.f53160d;
            C19028d dVar = this.f53163g;
            ImageView imageView = kVar.f27180g;
            C41536l.m120488h(imageView, "depositHeaderImage");
            C18368l.m62746A(imageView, aVar.mo47199f(), (C43075l) null, 2, (Object) null);
            kVar.f27181h.setText(aVar.mo47195c());
            TextBadgeView textBadgeView = kVar.f27183j;
            if (aVar.mo47200g()) {
                i = 0;
            } else {
                i = 8;
            }
            textBadgeView.setVisibility(i);
            kVar.f27179f.removeAllViews();
            List b = aVar.mo47194b();
            if (b != null) {
                int i2 = 0;
                for (Object next : b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C41341q.m119917t();
                    }
                    kVar.f27179f.addView(m64309i((C19024b) next, i2));
                    i2 = i3;
                }
            }
            ViewGroup.LayoutParams layoutParams = kVar.mo3946b().getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams == null) {
                return null;
            }
            if (dVar.mo47214f() == DepositHeaderView.C13293b.CLEAR) {
                marginLayoutParams.setMargins(0, 0, 0, 0);
            } else {
                int i4 = this.f53161e;
                marginLayoutParams.setMargins(i4, 0, i4, 0);
            }
            return marginLayoutParams;
        }
    }

    /* renamed from: f */
    public final DepositHeaderView.C13293b mo47214f() {
        return this.f53158e;
    }

    /* renamed from: g */
    public void onBindViewHolder(C19029a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        if (!this.f53159f.isEmpty()) {
            aVar.mo47220h((C19023a) this.f53159f.get(this.f53157d.mo46117b().mo46119a(this.f53159f.size(), i)));
        }
    }

    public int getItemCount() {
        return this.f53157d.mo46117b().mo46120b(this.f53159f.size());
    }

    /* renamed from: h */
    public C19029a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9947k d = C9947k.m36483d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19029a(this, d);
    }

    /* renamed from: i */
    public final void mo47217i(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f53157d = b0Var;
    }

    /* renamed from: j */
    public final void mo47218j(DepositHeaderView.C13293b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f53158e = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public final void mo47219k(List list) {
        C41536l.m120489i(list, "deposits");
        this.f53159f = list;
        notifyDataSetChanged();
    }
}

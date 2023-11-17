package s71;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0836a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31281a;
import c71.C31283c;
import c71.C31287g;
import g71.C32121n;
import g91.C32343x;
import j71.C36753f;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: s71.b */
public final class C38456b extends C1819o {

    /* renamed from: f */
    private C43075l f92110f;

    /* renamed from: g */
    private int f92111g = -1;

    /* renamed from: h */
    private final SimpleDateFormat f92112h = new SimpleDateFormat("dd.MM.yyyy");

    /* renamed from: s71.b$a */
    public static final class C38457a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C32121n f92113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38457a(C32121n nVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            this.f92113d = nVar;
        }

        /* renamed from: h */
        public final C32121n mo92017h() {
            return this.f92113d;
        }
    }

    public C38456b() {
        super(C37599g.f90345a.mo90787d());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m112888m(C38456b bVar, int i, View view) {
        C41536l.m120489i(bVar, "this$0");
        C43075l lVar = bVar.f92110f;
        if (lVar == null) {
            C41536l.m120506z("transportCardPassDeviceSelected");
            lVar = null;
        }
        lVar.invoke(Integer.valueOf(i));
    }

    /* renamed from: l */
    public void onBindViewHolder(C38457a aVar, int i) {
        boolean z;
        C41536l.m120489i(aVar, "holder");
        C32121n h = aVar.mo92017h();
        C36753f fVar = (C36753f) mo6027g(i);
        TextView textView = h.f79065i;
        C41536l.m120488h(textView, "tcPassDeviceTitle");
        C32343x.m95483r1(textView, !fVar.mo89618e(), false, 2, (Object) null);
        BogImageView bogImageView = h.f79063g;
        C41536l.m120488h(bogImageView, "tcPassDeviceIsSelectedIcon");
        if (i == this.f92111g) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(bogImageView, z, false, 2, (Object) null);
        if (fVar.mo89618e()) {
            h.f79064h.setText(h.mo3946b().getContext().getString(C31287g.tc_plastic_card));
            Drawable drawable = h.mo3946b().getContext().getDrawable(C31283c.ic_card);
            C41536l.m120486f(drawable);
            Context context = h.mo3946b().getContext();
            C41536l.m120488h(context, "root.context");
            C0836a.m3152n(drawable, C18368l.m62755d(context, C31281a.f77690a));
            h.f79062f.setImageDrawable(drawable);
        } else {
            h.f79065i.setText(h.mo3946b().getContext().getString(C31287g.tc_added_to_wallet, new Object[]{this.f92112h.format(((C36753f) mo6027g(i)).mo89616c())}));
            h.f79064h.setText(((C36753f) mo6027g(i)).mo89615b());
            h.f79062f.setImageDrawable(h.mo3946b().getContext().getDrawable(C31283c.ic_tc_device));
        }
        h.mo3946b().setOnClickListener(new C38455a(this, i));
    }

    /* renamed from: n */
    public C38457a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C32121n d = C32121n.m94619d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C38457a(d);
    }

    /* renamed from: o */
    public final void mo92015o(C43075l lVar) {
        C41536l.m120489i(lVar, "transportCardPassDeviceSelected");
        this.f92110f = lVar;
    }

    /* renamed from: p */
    public final void mo92016p(int i) {
        int i2 = this.f92111g;
        this.f92111g = i;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        if (i != -1) {
            notifyItemChanged(i);
        }
    }
}

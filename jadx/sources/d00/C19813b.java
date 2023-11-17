package d00;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.C1305j;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import e00.C20120b;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p615tg.C17963d;
import p642vh.C18368l;
import p90.C27300f6;
import ue1.C43075l;

/* renamed from: d00.b */
public final class C19813b extends C1819o {

    /* renamed from: f */
    private C19814a f54189f;

    /* renamed from: d00.b$a */
    public interface C19814a {
        /* renamed from: a */
        void mo47659a(C20120b bVar);
    }

    /* renamed from: d00.b$b */
    public static final class C19815b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27300f6 f54190d;

        /* renamed from: e */
        private C19814a f54191e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19815b(C27300f6 f6Var) {
            super(f6Var.mo3946b());
            C41536l.m120489i(f6Var, "binding");
            this.f54190d = f6Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m65596j(C19815b bVar, C20120b bVar2, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "$data");
            C19814a aVar = bVar.f54191e;
            if (aVar != null) {
                aVar.mo47659a(bVar2);
            }
        }

        /* renamed from: i */
        public final void mo48114i(C20120b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "data");
            Context context = this.f54190d.mo3946b().getContext();
            AppCompatImageView appCompatImageView = this.f54190d.f68731e;
            C41536l.m120488h(appCompatImageView, "binding.image");
            C18368l.m62746A(appCompatImageView, bVar.mo48546b().mo48542c(), (C43075l) null, 2, (Object) null);
            AppCompatImageView appCompatImageView2 = this.f54190d.f68731e;
            Color f = bVar.mo48546b().mo48544f();
            C41536l.m120488h(context, "context");
            C1305j.m4529c(appCompatImageView2, ColorStateList.valueOf(f.mo35260a(context)));
            this.f54190d.f68732f.setBackgroundColor(bVar.mo48546b().mo48541b().mo35260a(context));
            this.f54190d.f68735i.setText(bVar.mo48545a());
            TextBadgeView textBadgeView = this.f54190d.f68733g;
            C41536l.m120488h(textBadgeView, "binding.newBadge");
            C32343x.m95483r1(textBadgeView, bVar.mo48546b().mo48543e(), false, 2, (Object) null);
            View view = this.f54190d.f68734h;
            C41536l.m120488h(view, "binding.separator");
            if (getBindingAdapterPosition() > 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            this.f54190d.mo3946b().setOnClickListener(new C19816c(this, bVar));
        }

        /* renamed from: k */
        public final void mo48115k(C19814a aVar) {
            this.f54191e = aVar;
        }
    }

    public C19813b() {
        super(C17963d.f51158a.mo45633d());
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m65590n(C19813b bVar, C20120b bVar2) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bVar2, "productType");
        C19814a aVar = bVar.f54189f;
        if (aVar != null) {
            aVar.mo47659a(bVar2);
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C19815b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo48114i((C20120b) g);
    }

    /* renamed from: m */
    public C19815b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27300f6 d = C27300f6.m84506d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        C19815b bVar = new C19815b(d);
        bVar.mo48115k(new C19812a(this));
        return bVar;
    }

    /* renamed from: o */
    public final void mo48113o(C19814a aVar) {
        this.f54189f = aVar;
    }
}

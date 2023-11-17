package p554op;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p356ao.C10110b;
import p366bk.C10316e;
import p413eo.C12755l0;
import p615tg.C17963d;
import p642vh.C18368l;

/* renamed from: op.a */
public final class C17294a extends C1819o {

    /* renamed from: f */
    public static final C17295a f48582f = new C17295a((DefaultConstructorMarker) null);

    /* renamed from: op.a$a */
    public static final class C17295a {
        private C17295a() {
        }

        public /* synthetic */ C17295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: op.a$b */
    public static final class C17296b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12755l0 f48583d;

        /* renamed from: e */
        private final C17306f f48584e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17296b(C12755l0 l0Var) {
            super(l0Var.mo3946b());
            C41536l.m120489i(l0Var, "binding");
            this.f48583d = l0Var;
            C17306f fVar = new C17306f();
            this.f48584e = fVar;
            l0Var.f37780g.setAdapter(fVar);
        }

        /* renamed from: h */
        public final void mo44687h(C17304d dVar) {
            C41536l.m120489i(dVar, "data");
            this.f48583d.f37778e.setTitle(C32343x.m95388F("packages.compare.benefits.list.header", new Object[0]));
            this.f48584e.mo6029i(dVar.mo44716a());
            if (dVar.mo44717b()) {
                EmptyWidget emptyWidget = this.f48583d.f37778e;
                emptyWidget.setBackgroundColor(C0767a.m2893c(emptyWidget.getContext(), C10110b.color_brand_solo_background_layer));
                this.f48583d.f37778e.setTitleTextColor(new Color.Resource(C10110b.f27906o));
                return;
            }
            EmptyWidget emptyWidget2 = this.f48583d.f37778e;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            emptyWidget2.setBackgroundColor(C18368l.m62755d(context, C10316e.f28608k));
            this.f48583d.f37778e.setTitleTextColor(new Color.Attribute(C10316e.f28609l));
        }
    }

    public C17294a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C17296b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo44687h((C17304d) obj);
    }

    /* renamed from: l */
    public C17296b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12755l0 d = C12755l0.m48415d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C17296b(d);
    }
}

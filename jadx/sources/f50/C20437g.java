package f50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import f50.C20432f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: f50.g */
public final class C20437g extends C20427a {

    /* renamed from: h */
    public static final C20438a f55416h = new C20438a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final TextView f55417f;

    /* renamed from: g */
    private final FrameLayout f55418g;

    /* renamed from: f50.g$a */
    public static final class C20438a {
        private C20438a() {
        }

        public /* synthetic */ C20438a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20437g mo48942a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transaction_list_date_header, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C20437g(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20437g(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.f28826da);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.date)");
        this.f55417f = (TextView) findViewById;
        View findViewById2 = view.findViewById(C10322k.title_container);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.title_container)");
        this.f55418g = (FrameLayout) findViewById2;
    }

    /* renamed from: j */
    private final void m66601j(boolean z) {
        this.f55418g.setVisibility(z ? 0 : 8);
    }

    /* renamed from: i */
    public final void mo48941i(C20432f.C20434b.C20435a aVar) {
        C41536l.m120489i(aVar, "item");
        this.f55417f.setText(aVar.mo48922a());
        m66601j(aVar.mo48923b());
    }
}

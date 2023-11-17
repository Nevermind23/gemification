package k60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: k60.b */
public final class C25670b extends C20742c {

    /* renamed from: e */
    public static final C25671a f65391e = new C25671a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final BogTextView f65392d;

    /* renamed from: k60.b$a */
    public static final class C25671a {
        private C25671a() {
        }

        public /* synthetic */ C25671a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25670b mo64175a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_template_provider_header, viewGroup, false);
            C41536l.m120488h(inflate, "v");
            return new C25670b(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25670b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.f28741Hf);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.header_text)");
        BogTextView bogTextView = (BogTextView) findViewById;
        this.f65392d = bogTextView;
        bogTextView.setText(view.getContext().getString(C10328q.zk_card_choice_header));
    }
}

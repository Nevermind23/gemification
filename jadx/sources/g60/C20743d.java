package g60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f60.C20440b;
import f60.C20444f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: g60.d */
public final class C20743d extends C20742c {

    /* renamed from: d */
    public static final C20744a f55937d = new C20744a((DefaultConstructorMarker) null);

    /* renamed from: g60.d$a */
    public static final class C20744a {
        private C20744a() {
        }

        public /* synthetic */ C20744a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20743d mo49285a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_template_provider_header, viewGroup, false);
            C41536l.m120488h(inflate, "v");
            return new C20743d(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20743d(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    /* renamed from: h */
    public void onBind(C20440b bVar) {
        String str;
        C41536l.m120489i(bVar, "data");
        BogTextView bogTextView = (BogTextView) this.itemView.findViewById(C10322k.f28741Hf);
        if (bVar.mo48943a() == C20444f.C20445a.TemplateHeader) {
            str = this.itemView.getContext().getString(C10328q.header_text_templates);
        } else {
            str = this.itemView.getContext().getString(C10328q.header_text_providers);
        }
        bogTextView.setText(str);
    }
}

package g60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f60.C20440b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;

/* renamed from: g60.g */
public final class C20749g extends C20742c {

    /* renamed from: d */
    public static final C20750a f55944d = new C20750a((DefaultConstructorMarker) null);

    /* renamed from: g60.g$a */
    public static final class C20750a {
        private C20750a() {
        }

        public /* synthetic */ C20750a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20749g mo49292a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_template_provider_separator, viewGroup, false);
            C41536l.m120488h(inflate, "v");
            return new C20749g(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20749g(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    /* renamed from: h */
    public void onBind(C20440b bVar) {
        C41536l.m120489i(bVar, "data");
    }
}

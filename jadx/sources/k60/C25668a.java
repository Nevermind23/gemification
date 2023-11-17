package k60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;

/* renamed from: k60.a */
public final class C25668a extends C20742c {

    /* renamed from: d */
    public static final C25669a f65390d = new C25669a((DefaultConstructorMarker) null);

    /* renamed from: k60.a$a */
    public static final class C25669a {
        private C25669a() {
        }

        public /* synthetic */ C25669a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25668a mo64174a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_zk_header_subtitle, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…_subtitle, parent, false)");
            return new C25668a(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25668a(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    public void onBind(Object obj) {
        C41536l.m120489i(obj, "data");
    }
}

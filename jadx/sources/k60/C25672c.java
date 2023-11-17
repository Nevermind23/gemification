package k60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;

/* renamed from: k60.c */
public final class C25672c extends C20742c {

    /* renamed from: d */
    public static final C25673a f65393d = new C25673a((DefaultConstructorMarker) null);

    /* renamed from: k60.c$a */
    public static final class C25673a {
        private C25673a() {
        }

        public /* synthetic */ C25673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25672c mo64176a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_zk_cards_list_rates_header, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…es_header, parent, false)");
            return new C25672c(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25672c(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }
}

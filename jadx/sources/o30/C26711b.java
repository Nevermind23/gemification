package o30;

import android.view.ViewGroup;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;

/* renamed from: o30.b */
public class C26711b implements C26719g {

    /* renamed from: a */
    public static final C26712a f67333a = new C26712a((DefaultConstructorMarker) null);

    /* renamed from: o30.b$a */
    public static final class C26712a {
        private C26712a() {
        }

        public /* synthetic */ C26712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public C26710a mo65921a(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == -1) {
            return new C26710a(C32343x.m95473o0(viewGroup, C10324m.item_circular_view, false, 2, (Object) null));
        }
        throw new IllegalArgumentException("Unsupported viewType for BaseCircularViewHolderFactory");
    }
}

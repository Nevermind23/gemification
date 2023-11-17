package v30;

import android.view.ViewGroup;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o30.C26710a;
import o30.C26711b;
import p366bk.C10324m;

/* renamed from: v30.d */
public final class C28987d extends C26711b {

    /* renamed from: b */
    public static final C28988a f73929b = new C28988a((DefaultConstructorMarker) null);

    /* renamed from: v30.d$a */
    public static final class C28988a {
        private C28988a() {
        }

        public /* synthetic */ C28988a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public C26710a mo65921a(ViewGroup viewGroup, int i) {
        C26710a aVar;
        C41536l.m120489i(viewGroup, "parent");
        if (i == 5) {
            aVar = new C28984a(C32343x.m95473o0(viewGroup, C10324m.item_circular_view_car_template, false, 2, (Object) null));
        } else if (i == 6) {
            aVar = new C28985b(C32343x.m95473o0(viewGroup, C10324m.item_circular_view_house_group_template, false, 2, (Object) null));
        } else if (i != 7) {
            return super.mo65921a(viewGroup, i);
        } else {
            aVar = new C28989e(C32343x.m95473o0(viewGroup, C10324m.item_circular_view_total_debt, false, 2, (Object) null));
        }
        return aVar;
    }
}

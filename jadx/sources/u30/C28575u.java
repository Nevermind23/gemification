package u30;

import android.view.View;
import android.view.ViewGroup;
import g91.C32343x;
import he1.C41224m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r30.C27906g;
import ue1.C43064a;

/* renamed from: u30.u */
public class C28575u extends C28567n {

    /* renamed from: e */
    public static final C28576a f72527e = new C28576a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final List f72528d = new ArrayList();

    /* renamed from: u30.u$a */
    public static final class C28576a {
        private C28576a() {
        }

        public /* synthetic */ C28576a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28575u mo68312a(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            return new C28575u(C32343x.m95473o0(viewGroup, i, false, 2, (Object) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28575u(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m87545k(C43064a aVar, View view) {
        C41536l.m120489i(aVar, "$clickListener");
        aVar.invoke();
    }

    /* renamed from: i */
    public final void mo68311i(int i, C43064a aVar) {
        C41536l.m120489i(aVar, "clickListener");
        this.f72528d.add(new C41224m(Integer.valueOf(i), aVar));
    }

    /* renamed from: j */
    public void onBind(C27906g gVar) {
        C41536l.m120489i(gVar, "item");
        for (C41224m mVar : this.f72528d) {
            this.itemView.findViewById(((Number) mVar.mo95675a()).intValue()).setOnClickListener(new C28574t((C43064a) mVar.mo95676b()));
        }
    }
}

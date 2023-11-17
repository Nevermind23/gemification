package g60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f60.C20440b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: g60.b */
public final class C20740b extends C20742c {

    /* renamed from: e */
    public static final C20741a f55935e = new C20741a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43064a f55936d;

    /* renamed from: g60.b$a */
    public static final class C20741a {
        private C20741a() {
        }

        public /* synthetic */ C20741a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20740b mo49283a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_templates_providers_add_template, viewGroup, false);
            C41536l.m120488h(inflate, "v");
            return new C20740b(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20740b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m67158j(C20740b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C43064a aVar = bVar.f55936d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public void onBind(C20440b bVar) {
        C41536l.m120489i(bVar, "data");
        this.itemView.setOnClickListener(new C20739a(this));
    }

    /* renamed from: k */
    public final void mo49282k(C43064a aVar) {
        this.f55936d = aVar;
    }
}

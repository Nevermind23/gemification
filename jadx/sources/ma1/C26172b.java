package ma1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10214s;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la1.C25866a;
import p341ge.bog.designsystem.components.list.C13364a;
import p349ah.C9860d;
import ua1.C28624a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ma1.b */
public final class C26172b extends C9860d {

    /* renamed from: F */
    public static final C26173a f66375F = new C26173a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C43075l f66376B;

    /* renamed from: C */
    private C28624a f66377C;

    /* renamed from: D */
    private final C41217g f66378D = C41219i.m119470b(new C26177d(this));

    /* renamed from: E */
    private final C41217g f66379E = C41219i.m119470b(new C26174b(this));

    /* renamed from: ma1.b$a */
    public static final class C26173a {
        private C26173a() {
        }

        public /* synthetic */ C26173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26172b mo65208a(String str, C43075l lVar) {
            C41536l.m120489i(str, "requestKey");
            C41536l.m120489i(lVar, "mapper");
            C26172b bVar = new C26172b(lVar);
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_REQUEST_KEY", str)));
            return bVar;
        }
    }

    /* renamed from: ma1.b$b */
    static final class C26174b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C26172b f66380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26174b(C26172b bVar) {
            super(0);
            this.f66380d = bVar;
        }

        /* renamed from: b */
        public final C25866a invoke() {
            return new C25866a(this.f66380d.f66376B);
        }
    }

    /* renamed from: ma1.b$c */
    static final class C26175c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26172b f66381d;

        /* renamed from: ma1.b$c$a */
        static final class C26176a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26172b f66382d;

            /* renamed from: e */
            final /* synthetic */ String f66383e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26176a(C26172b bVar, String str) {
                super(1);
                this.f66382d = bVar;
                this.f66383e = str;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(C40440x.m117139M((CharSequence) this.f66382d.f66376B.invoke(obj), this.f66383e, false, 2, (Object) null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26175c(C26172b bVar) {
            super(1);
            this.f66381d = bVar;
        }

        /* renamed from: a */
        public final void mo65210a(String str) {
            C41536l.m120489i(str, "changed");
            this.f66381d.m81971i2().mo64655m(new C26176a(this.f66381d, str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65210a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ma1.b$d */
    static final class C26177d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C26172b f66384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26177d(C26172b bVar) {
            super(0);
            this.f66384d = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("ARG_REQUEST_KEY");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ma1.b r0 = r2.f66384d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "ARG_REQUEST_KEY"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = "SELECTOR_REQUEST_KEY"
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma1.C26172b.C26177d.invoke():java.lang.String");
        }
    }

    public C26172b(C43075l lVar) {
        C41536l.m120489i(lVar, "mapper");
        this.f66376B = lVar;
    }

    /* renamed from: g2 */
    private final void m81969g2() {
        m81971i2().mo64659q(new C26171a(this));
        m81972j2().f72642e.setOnTextChangeListener(new C26175c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m81970h2(C26172b bVar, Object obj) {
        C41536l.m120489i(bVar, "this$0");
        C1533o.m5445b(bVar, bVar.m81973k2(), C0908e.m3336b(C41233s.m119492a("SELECTOR_RESULT_KEY", obj)));
        bVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C25866a m81971i2() {
        return (C25866a) this.f66379E.getValue();
    }

    /* renamed from: j2 */
    private final C28624a m81972j2() {
        C28624a aVar = this.f66377C;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: k2 */
    private final String m81973k2() {
        return (String) this.f66378D.getValue();
    }

    /* renamed from: m2 */
    private final void m81974m2() {
        m81972j2().f72643f.setAdapter(m81971i2());
        RecyclerView recyclerView = m81972j2().f72643f;
        Drawable e = C0767a.m2895e(requireContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, false));
            m81969g2();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f66377C = C28624a.m87591d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final void mo65207l2(List list) {
        C41536l.m120489i(list, "data");
        m81971i2().mo64658p(list);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f66377C = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m81974m2();
    }
}

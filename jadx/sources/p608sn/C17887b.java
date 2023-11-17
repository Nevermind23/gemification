package p608sn;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p482jn.C16251d;
import ue1.C43075l;

/* renamed from: sn.b */
public final class C17887b extends C1819o {

    /* renamed from: g */
    public static final C17890c f50912g = new C17890c((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final C17889b f50913h = new C17889b();

    /* renamed from: f */
    private C43075l f50914f;

    /* renamed from: sn.b$a */
    public static final class C17888a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16251d f50915d;

        /* renamed from: e */
        private final C43075l f50916e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17888a(C16251d dVar, C43075l lVar) {
            super(dVar.mo3946b());
            C41536l.m120489i(dVar, "binding");
            this.f50915d = dVar;
            this.f50916e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m61694j(C17888a aVar, C14391a aVar2, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(aVar2, "$data");
            C43075l lVar = aVar.f50916e;
            if (lVar != null) {
                lVar.invoke(aVar2);
            }
        }

        /* renamed from: i */
        public final void mo45569i(C14391a aVar) {
            boolean z;
            String f;
            C41536l.m120489i(aVar, "data");
            View view = this.f50915d.f46048i;
            C41536l.m120488h(view, "binding.separatorView");
            C32343x.m95483r1(view, aVar.mo40253f(), false, 2, (Object) null);
            TextView textView = this.f50915d.f46044e;
            C41536l.m120488h(textView, "binding.activeText");
            C32343x.m95483r1(textView, aVar.mo40250d(), false, 2, (Object) null);
            this.f50915d.f46044e.setText(C34646b.m101752f(aVar.mo40254g().mo40180a(), (Context) null, 1, (Object) null));
            this.f50915d.f46050k.setText(C34646b.m101752f(aVar.mo40254g().mo40185g(), (Context) null, 1, (Object) null));
            if (aVar.mo40251e()) {
                this.f50915d.f46046g.setColorFilter(C0767a.m2893c(this.itemView.getContext(), aVar.mo40254g().mo40184f()));
                this.f50915d.f46046g.setImageResource(aVar.mo40254g().mo40183e());
                this.f50915d.f46047h.setBackgroundResource(aVar.mo40254g().mo40182d());
            } else {
                this.f50915d.f46046g.setColorFilter((ColorFilter) null);
                this.f50915d.f46047h.setBackgroundResource(aVar.mo40254g().mo40183e());
            }
            this.itemView.setOnClickListener(new C17886a(this, aVar));
            TextView textView2 = this.f50915d.f46049j;
            C41536l.m120488h(textView2, "binding.subtitleCaption");
            if (aVar.mo40254g().mo40181b() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView2, z, false, 2, (Object) null);
            StringSource b = aVar.mo40254g().mo40181b();
            if (b != null && (f = C34646b.m101752f(b, (Context) null, 1, (Object) null)) != null) {
                this.f50915d.f46049j.setText(f);
            }
        }
    }

    /* renamed from: sn.b$b */
    public static final class C17889b extends C1796h.C1802f {
        C17889b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C14391a aVar, C14391a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return C41536l.m120484d(aVar, aVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C14391a aVar, C14391a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return C41536l.m120484d(aVar.mo40254g(), aVar2.mo40254g());
        }
    }

    /* renamed from: sn.b$c */
    public static final class C17890c {
        private C17890c() {
        }

        public /* synthetic */ C17890c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: sn.b$d */
    static final class C17891d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17887b f50917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17891d(C17887b bVar) {
            super(1);
            this.f50917d = bVar;
        }

        /* renamed from: a */
        public final void mo45572a(C14391a aVar) {
            C41536l.m120489i(aVar, "it");
            C43075l k = this.f50917d.mo45565k();
            if (k != null) {
                k.invoke(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45572a((C14391a) obj);
            return C41238w.f97225a;
        }
    }

    public C17887b() {
        super(f50913h);
    }

    /* renamed from: k */
    public final C43075l mo45565k() {
        return this.f50914f;
    }

    /* renamed from: l */
    public void onBindViewHolder(C17888a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45569i((C14391a) g);
    }

    /* renamed from: m */
    public C17888a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16251d d = C16251d.m57940d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C17888a(d, new C17891d(this));
    }

    /* renamed from: n */
    public final void mo45568n(C43075l lVar) {
        this.f50914f = lVar;
    }
}

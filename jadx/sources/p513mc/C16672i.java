package p513mc;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p541oc.C17152f;
import p555pc.C17337b;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import p692zc.C19004f;
import ue1.C43079p;

/* renamed from: mc.i */
public final class C16672i extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f46869d;

    /* renamed from: e */
    private final C43079p f46870e;

    /* renamed from: f */
    private final C18877a f46871f;

    /* renamed from: mc.i$a */
    public static final class C16673a extends RecyclerView.C1734f0 {

        /* renamed from: e */
        public static final C16674a f46872e = new C16674a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final C17152f f46873d;

        /* renamed from: mc.i$a$a */
        public static final class C16674a {
            private C16674a() {
            }

            public /* synthetic */ C16674a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C16673a mo43805a(ViewGroup viewGroup) {
                C41536l.m120489i(viewGroup, "parent");
                C17152f d = C17152f.m60250d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
                return new C16673a(d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16673a(C17152f fVar) {
            super(fVar.mo3946b());
            C41536l.m120489i(fVar, "binding");
            this.f46873d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m59000k(C43079p pVar, int i, View view) {
            C41536l.m120489i(pVar, "$callback");
            pVar.invoke(Integer.valueOf(i), 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final boolean m59001l(C43079p pVar, int i, View view) {
            C41536l.m120489i(pVar, "$callback");
            pVar.invoke(Integer.valueOf(i), 1);
            return true;
        }

        /* renamed from: j */
        public final void mo43804j(int i, C43079p pVar, C18877a aVar) {
            C41536l.m120489i(pVar, "callback");
            C41536l.m120489i(aVar, "identomatConfig");
            TextView textView = this.f46873d.f48014h;
            C19004f d = aVar.mo46864d();
            Context context = this.f46873d.f48014h.getContext();
            C17337b bVar = C17337b.f48646a;
            textView.setText(d.mo47124d(context, bVar.mo44748b(i)));
            C18999c e = aVar.mo46867g().mo47140e();
            TextView textView2 = this.f46873d.f48014h;
            C41536l.m120488h(textView2, "binding.nameView");
            e.mo47079g(textView2, 1);
            C19002e.C19003a aVar2 = C19002e.f53052q;
            RelativeLayout c = this.f46873d.mo3946b();
            C41536l.m120488h(c, "binding.root");
            aVar2.mo47120f(c, aVar.mo46861a().mo47092a().mo33033a());
            RelativeLayout relativeLayout = this.f46873d.f48012f;
            C41536l.m120488h(relativeLayout, "binding.iconPanel");
            aVar2.mo47120f(relativeLayout, aVar.mo46861a().mo47096e().mo33033a());
            this.f46873d.f48014h.setTextColor(aVar.mo46861a().mo47104m().mo33033a());
            Drawable drawable = this.f46873d.f48011e.getDrawable();
            if (Build.VERSION.SDK_INT >= 29) {
                if (drawable != null) {
                    C16664c.m58987a();
                    drawable.setColorFilter(C16663b.m58986a(aVar.mo46861a().mo47096e().mo33033a(), BlendMode.SRC_ATOP));
                }
            } else if (drawable != null) {
                drawable.setColorFilter(aVar.mo46861a().mo47096e().mo33033a(), PorterDuff.Mode.SRC_ATOP);
            }
            this.f46873d.f48013g.setImageResource(bVar.mo44747a(i));
            this.f46873d.mo3946b().setOnClickListener(new C16670g(pVar, i));
            this.f46873d.mo3946b().setOnLongClickListener(new C16671h(pVar, i));
        }
    }

    public C16672i(List list, C43079p pVar, C18877a aVar) {
        C41536l.m120489i(list, "uploadTypes");
        C41536l.m120489i(pVar, "callback");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f46869d = list;
        this.f46870e = pVar;
        this.f46871f = aVar;
    }

    /* renamed from: f */
    public void onBindViewHolder(C16673a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo43804j(((Number) this.f46869d.get(i)).intValue(), this.f46870e, this.f46871f);
    }

    /* renamed from: g */
    public C16673a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return C16673a.f46872e.mo43805a(viewGroup);
    }

    public int getItemCount() {
        return this.f46869d.size();
    }
}

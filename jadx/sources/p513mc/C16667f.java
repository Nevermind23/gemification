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
import p555pc.C17336a;
import p678yc.C18877a;
import p692zc.C18999c;
import p692zc.C19002e;
import p692zc.C19004f;
import ue1.C43079p;

/* renamed from: mc.f */
public final class C16667f extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f46860d;

    /* renamed from: e */
    private final C43079p f46861e;

    /* renamed from: f */
    private final C18877a f46862f;

    /* renamed from: mc.f$a */
    public static final class C16668a extends RecyclerView.C1734f0 {

        /* renamed from: e */
        public static final C16669a f46863e = new C16669a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final C17152f f46864d;

        /* renamed from: mc.f$a$a */
        public static final class C16669a {
            private C16669a() {
            }

            public /* synthetic */ C16669a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C16668a mo43799a(ViewGroup viewGroup) {
                C41536l.m120489i(viewGroup, "parent");
                C17152f d = C17152f.m60250d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
                return new C16668a(d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16668a(C17152f fVar) {
            super(fVar.mo3946b());
            C41536l.m120489i(fVar, "binding");
            this.f46864d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m58992k(C43079p pVar, int i, View view) {
            C41536l.m120489i(pVar, "$callback");
            pVar.invoke(Integer.valueOf(i), 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final boolean m58993l(C43079p pVar, int i, View view) {
            C41536l.m120489i(pVar, "$callback");
            pVar.invoke(Integer.valueOf(i), 1);
            return true;
        }

        /* renamed from: j */
        public final void mo43798j(int i, C43079p pVar, C18877a aVar) {
            C41536l.m120489i(pVar, "callback");
            C41536l.m120489i(aVar, "identomatConfig");
            TextView textView = this.f46864d.f48014h;
            C19004f d = aVar.mo46864d();
            Context context = this.f46864d.f48014h.getContext();
            C17336a aVar2 = C17336a.f48645a;
            textView.setText(d.mo47124d(context, aVar2.mo44744c(i)));
            C18999c e = aVar.mo46867g().mo47140e();
            TextView textView2 = this.f46864d.f48014h;
            C41536l.m120488h(textView2, "binding.nameView");
            e.mo47079g(textView2, 1);
            C19002e.C19003a aVar3 = C19002e.f53052q;
            RelativeLayout c = this.f46864d.mo3946b();
            C41536l.m120488h(c, "binding.root");
            aVar3.mo47120f(c, aVar.mo46861a().mo47092a().mo33033a());
            RelativeLayout relativeLayout = this.f46864d.f48012f;
            C41536l.m120488h(relativeLayout, "binding.iconPanel");
            aVar3.mo47120f(relativeLayout, aVar.mo46861a().mo47096e().mo33033a());
            this.f46864d.f48014h.setTextColor(aVar.mo46861a().mo47104m().mo33033a());
            this.f46864d.f48013g.setImageResource(aVar2.mo44743b(i));
            Drawable drawable = this.f46864d.f48011e.getDrawable();
            if (Build.VERSION.SDK_INT >= 29) {
                if (drawable != null) {
                    C16664c.m58987a();
                    drawable.setColorFilter(C16663b.m58986a(aVar.mo46861a().mo47096e().mo33033a(), BlendMode.SRC_ATOP));
                }
            } else if (drawable != null) {
                drawable.setColorFilter(aVar.mo46861a().mo47096e().mo33033a(), PorterDuff.Mode.SRC_ATOP);
            }
            this.f46864d.mo3946b().setOnClickListener(new C16665d(pVar, i));
            this.f46864d.mo3946b().setOnLongClickListener(new C16666e(pVar, i));
        }
    }

    public C16667f(List list, C43079p pVar, C18877a aVar) {
        C41536l.m120489i(list, "documents");
        C41536l.m120489i(pVar, "callback");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f46860d = list;
        this.f46861e = pVar;
        this.f46862f = aVar;
    }

    /* renamed from: f */
    public void onBindViewHolder(C16668a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo43798j(((Number) this.f46860d.get(i)).intValue(), this.f46861e, this.f46862f);
    }

    /* renamed from: g */
    public C16668a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return C16668a.f46863e.mo43799a(viewGroup);
    }

    public int getItemCount() {
        return this.f46860d.size();
    }
}

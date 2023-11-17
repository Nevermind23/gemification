package p436gj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9955l;
import p601sg.C17777b;
import p601sg.C17780e;
import p642vh.C18368l;

/* renamed from: gj.b */
public final class C15281b extends RecyclerView.C1736h {

    /* renamed from: g */
    public static final C15282a f43660g = new C15282a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List f43661d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C15280a f43662e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f43663f = true;

    /* renamed from: gj.b$a */
    public static final class C15282a {
        private C15282a() {
        }

        public /* synthetic */ C15282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: gj.b$b */
    public final class C15283b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9955l f43664d;

        /* renamed from: e */
        final /* synthetic */ C15281b f43665e;

        /* renamed from: gj.b$b$a */
        public /* synthetic */ class C15284a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f43666a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    gj.e[] r0 = p436gj.C15287e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gj.e r1 = p436gj.C15287e.FILLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gj.e r1 = p436gj.C15287e.EMPTY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f43666a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p436gj.C15281b.C15283b.C15284a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15283b(C15281b bVar, C9955l lVar) {
            super(lVar.mo3946b());
            C41536l.m120489i(lVar, "binding");
            this.f43665e = bVar;
            this.f43664d = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m55677j(C15281b bVar, int i, C15283b bVar2, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "this$1");
            if (bVar.f43663f) {
                C15280a g = bVar.f43662e;
                if (g != null) {
                    g.mo35632a(i);
                }
                bVar2.m55678k(i);
            }
        }

        /* renamed from: k */
        private final void m55678k(int i) {
            C15287e eVar;
            int size = this.f43665e.f43661d.size();
            for (int i2 = 0; i2 < size; i2++) {
                List h = this.f43665e.f43661d;
                if (i2 < i) {
                    eVar = C15287e.FILLED;
                } else {
                    eVar = C15287e.EMPTY;
                }
                h.set(i2, eVar);
            }
            this.f43665e.notifyDataSetChanged();
        }

        /* renamed from: i */
        public final void mo42366i(int i, C15287e eVar) {
            C41536l.m120489i(eVar, "starState");
            AppCompatImageView appCompatImageView = this.f43664d.f27220e;
            C15281b bVar = this.f43665e;
            int i2 = C15284a.f43666a[eVar.ordinal()];
            if (i2 == 1) {
                appCompatImageView.setImageDrawable(C0767a.m2895e(appCompatImageView.getContext(), C17780e.f49658T));
                Context context = appCompatImageView.getContext();
                C41536l.m120488h(context, "context");
                appCompatImageView.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(context, C17777b.f49603w)));
            } else if (i2 == 2) {
                appCompatImageView.setImageDrawable(C0767a.m2895e(appCompatImageView.getContext(), C17780e.f49659U));
                Context context2 = appCompatImageView.getContext();
                C41536l.m120488h(context2, "context");
                appCompatImageView.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(context2, C17777b.color_invert_component_tr_50)));
            }
            appCompatImageView.setOnClickListener(new C15285c(bVar, i, this));
        }
    }

    public C15281b() {
        List nCopies = Collections.nCopies(5, C15287e.EMPTY);
        C41536l.m120488h(nCopies, "nCopies(STAR_COUNT, StarState.EMPTY)");
        this.f43661d = C41358y.m119991B0(nCopies);
    }

    public int getItemCount() {
        return this.f43661d.size();
    }

    /* renamed from: i */
    public void onBindViewHolder(C15283b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        int i2 = i + 1;
        Object obj = this.f43661d.get(i);
        C41536l.m120488h(obj, "stars[position]");
        bVar.mo42366i(i2, (C15287e) obj);
    }

    /* renamed from: j */
    public C15283b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9955l d = C9955l.m36511d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C15283b(this, d);
    }

    /* renamed from: k */
    public final void mo42364k(boolean z) {
        this.f43663f = z;
    }

    /* renamed from: l */
    public final void mo42365l(C15280a aVar) {
        this.f43662e = aVar;
    }
}

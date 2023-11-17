package a91;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;

/* renamed from: a91.h */
public abstract class C30889h extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HashSet f76953d = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C30893d f76954e;

    /* renamed from: a91.h$a */
    class C30890a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C30892c f76955d;

        C30890a(C30892c cVar) {
            this.f76955d = cVar;
        }

        public void onClick(View view) {
            this.f76955d.f76959d.flipImage();
        }
    }

    /* renamed from: a91.h$b */
    class C30891b implements FlipImageViewContainer.FlipListener {

        /* renamed from: a */
        final /* synthetic */ C30892c f76957a;

        C30891b(C30892c cVar) {
            this.f76957a = cVar;
        }

        public void onFlip(boolean z) {
            int adapterPosition = this.f76957a.getAdapterPosition();
            if (z) {
                C30889h.this.f76953d.add(Integer.valueOf(adapterPosition));
            } else {
                C30889h.this.f76953d.remove(Integer.valueOf(adapterPosition));
            }
            C30889h.this.mo71090l(adapterPosition, z);
            if (C30889h.this.f76954e != null) {
                C30889h.this.f76954e.mo71095a(z);
            }
        }
    }

    /* renamed from: a91.h$c */
    public static abstract class C30892c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        FlipImageViewContainer f76959d;

        public C30892c(View view) {
            super(view);
            this.f76959d = (FlipImageViewContainer) view.findViewById(mo71094h());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public abstract int mo71094h();
    }

    /* renamed from: a91.h$d */
    public interface C30893d {
        /* renamed from: a */
        void mo71095a(boolean z);
    }

    /* renamed from: h */
    public ArrayList mo71086h() {
        return new ArrayList(this.f76953d);
    }

    /* renamed from: i */
    public boolean mo71087i() {
        return !this.f76953d.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo71088j(C30892c cVar, int i);

    /* renamed from: k */
    public final void onBindViewHolder(C30892c cVar, int i) {
        cVar.f76959d.setFlipped(this.f76953d.contains(Integer.valueOf(i)));
        cVar.f76959d.setOnClickListener(new C30890a(cVar));
        cVar.f76959d.setFlipListener(new C30891b(cVar));
        mo71088j(cVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo71090l(int i, boolean z);

    /* renamed from: m */
    public void mo71091m(C30893d dVar) {
        this.f76954e = dVar;
    }

    /* renamed from: n */
    public void mo71092n(ArrayList arrayList) {
        this.f76953d.clear();
        this.f76953d.addAll(arrayList);
    }
}

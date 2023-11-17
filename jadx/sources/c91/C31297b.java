package c91;

import a91.C30865a;
import a91.C30871b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;

/* renamed from: c91.b */
public final class C31297b extends C31302e implements C30871b.C30875d {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C30871b f77722w;

    /* renamed from: x */
    private ArrayList f77723x = new ArrayList();

    /* renamed from: c91.b$a */
    public static final class C31298a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ C31297b f77724d;

        C31298a(C31297b bVar) {
            this.f77724d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m92927b(C31297b bVar) {
            C41536l.m120489i(bVar, "this$0");
            C30871b i2 = bVar.f77722w;
            if (i2 == null) {
                C41536l.m120506z("productsRecyclerAdapter");
                i2 = null;
            }
            i2.mo71052A();
        }

        public void onGlobalLayout() {
            C30865a.C30870e eVar;
            RecyclerView.C1747p layoutManager = this.f77724d.f77889l.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int n2 = linearLayoutManager.mo5219n2();
            int q2 = linearLayoutManager.mo5223q2();
            if (n2 <= q2) {
                int i = 0;
                while (true) {
                    RecyclerView.C1734f0 e0 = this.f77724d.f77889l.mo5320e0(n2);
                    View view = null;
                    if (e0 instanceof C30865a.C30870e) {
                        eVar = (C30865a.C30870e) e0;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        view = eVar.f89287d;
                    }
                    if (view != null) {
                        eVar.f89287d.setAlpha(Utils.FLOAT_EPSILON);
                        eVar.f89287d.setScaleX(0.95f);
                        eVar.f89287d.setScaleY(0.95f);
                        ViewPropertyAnimator scaleY = eVar.f89287d.animate().setStartDelay((long) (i * 150)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        C41536l.m120488h(scaleY, "holder.itemView.animate(…   .scaleX(1f).scaleY(1f)");
                        if (n2 == q2) {
                            scaleY.withEndAction(new C31296a(this.f77724d));
                        }
                        i++;
                    }
                    if (n2 == q2) {
                        break;
                    }
                    n2++;
                }
            }
            C32355x0.m95523n(this.f77724d.f77889l, this);
        }
    }

    /* renamed from: j2 */
    private final void m92920j2() {
        this.f77889l.getViewTreeObserver().addOnGlobalLayoutListener(new C31298a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        int i;
        C30871b bVar = new C30871b(this.f77889l, this.mClient);
        this.f77722w = bVar;
        bVar.mo71058z(this.f77723x);
        String z1 = mo71611z1();
        C41536l.m120488h(z1, "inputValue");
        Integer j = C40438v.m117098j(z1);
        if (j != null) {
            i = j.intValue();
        } else {
            i = -1;
        }
        C30871b bVar2 = this.f77722w;
        if (bVar2 == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar2 = null;
        }
        bVar2.mo71054C(i);
        C30871b bVar3 = this.f77722w;
        if (bVar3 != null) {
            return bVar3;
        }
        C41536l.m120506z("productsRecyclerAdapter");
        return null;
    }

    /* renamed from: g */
    public void mo67192g(int i, int i2, boolean z) {
        if (z) {
            this.f77883f.mo87965p3(true);
            mo71717U1(String.valueOf(i));
            return;
        }
        this.f77883f.mo87965p3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71543g2() {
        super.mo71543g2();
        C30871b bVar = this.f77722w;
        if (bVar == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar = null;
        }
        bVar.mo71053B(this);
        m92920j2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo67194j1() {
    }

    /* renamed from: k2 */
    public final void mo71544k2(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "accountLovs");
        this.f77723x = arrayList;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        this.f77890m.setVisibility(8);
        this.f77885h.setBackgroundColor(0);
        this.f77892o.setPadding(0, 0, 0, 0);
    }
}

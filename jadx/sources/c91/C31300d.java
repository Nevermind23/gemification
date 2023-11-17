package c91;

import a91.C30871b;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;

/* renamed from: c91.d */
public final class C31300d<T extends AdvancedWizardActivity> extends C31310i<T> implements C30871b.C30875d {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C30871b f77726x;

    /* renamed from: y */
    private ArrayList f77727y;

    /* renamed from: c91.d$a */
    public static final class C31301a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ C31300d f77728d;

        C31301a(C31300d dVar) {
            this.f77728d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m92936b(C31300d dVar) {
            C41536l.m120489i(dVar, "this$0");
            C30871b i2 = dVar.f77726x;
            if (i2 == null) {
                C41536l.m120506z("productsRecyclerAdapter");
                i2 = null;
            }
            i2.mo71052A();
        }

        public void onGlobalLayout() {
            C30871b.C30876e eVar;
            RecyclerView.C1747p layoutManager = this.f77728d.f77889l.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int n2 = linearLayoutManager.mo5219n2();
            int q2 = linearLayoutManager.mo5223q2();
            if (n2 <= q2) {
                int i = 0;
                while (true) {
                    RecyclerView.C1734f0 e0 = this.f77728d.f77889l.mo5320e0(n2);
                    View view = null;
                    if (e0 instanceof C30871b.C30876e) {
                        eVar = (C30871b.C30876e) e0;
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
                        C41536l.m120488h(scaleY, "holder.itemView.animate(…1f).scaleX(1f).scaleY(1f)");
                        if (n2 == q2) {
                            scaleY.withEndAction(new C31299c(this.f77728d));
                        }
                        i++;
                    }
                    if (n2 == q2) {
                        break;
                    }
                    n2++;
                }
            }
            C32355x0.m95523n(this.f77728d.f77889l, this);
        }
    }

    /* renamed from: j2 */
    private final void m92929j2() {
        this.f77889l.getViewTreeObserver().addOnGlobalLayoutListener(new C31301a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        C30871b bVar = new C30871b(this.f77889l, this.mClient);
        this.f77726x = bVar;
        ArrayList arrayList = this.f77727y;
        if (arrayList != null) {
            bVar.mo71058z(arrayList);
        }
        C30871b bVar2 = this.f77726x;
        if (bVar2 == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar2 = null;
        }
        String value = mo71707D1().getValue();
        C41536l.m120488h(value, "wizardObject.value");
        bVar2.mo71054C(Integer.parseInt(value));
        C30871b bVar3 = this.f77726x;
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
        this.f77890m.setVisibility(8);
        this.f77885h.setBackgroundColor(0);
        this.f77892o.setPadding(0, 0, 0, 0);
        C30871b bVar = this.f77726x;
        if (bVar == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar = null;
        }
        bVar.mo71053B(this);
        m92929j2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo67194j1() {
    }

    /* renamed from: k2 */
    public final void mo71547k2(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "accountLovs");
        this.f77727y = arrayList;
    }
}

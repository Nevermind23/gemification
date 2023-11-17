package c91;

import a91.C30884f;
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

/* renamed from: c91.k */
public final class C31312k<T extends AdvancedWizardActivity> extends C31310i<T> {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C30884f f77744x;

    /* renamed from: y */
    private ArrayList f77745y;

    /* renamed from: c91.k$a */
    public static final class C31313a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        final /* synthetic */ C31312k f77746d;

        C31313a(C31312k kVar) {
            this.f77746d = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m92970b(C31312k kVar) {
            C41536l.m120489i(kVar, "this$0");
            C30884f i2 = kVar.f77744x;
            if (i2 == null) {
                C41536l.m120506z("recyclerAdapter");
                i2 = null;
            }
            i2.mo71081p();
        }

        public void onGlobalLayout() {
            C30884f.C30885a aVar;
            RecyclerView.C1747p layoutManager = this.f77746d.f77889l.getLayoutManager();
            C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int n2 = linearLayoutManager.mo5219n2();
            int q2 = linearLayoutManager.mo5223q2();
            if (n2 <= q2) {
                int i = 0;
                while (true) {
                    RecyclerView.C1734f0 e0 = this.f77746d.f77889l.mo5320e0(n2);
                    View view = null;
                    if (e0 instanceof C30884f.C30885a) {
                        aVar = (C30884f.C30885a) e0;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        view = aVar.f89287d;
                    }
                    if (view != null) {
                        aVar.f89287d.setAlpha(Utils.FLOAT_EPSILON);
                        aVar.f89287d.setScaleX(0.95f);
                        aVar.f89287d.setScaleY(0.95f);
                        ViewPropertyAnimator scaleY = aVar.f89287d.animate().setStartDelay((long) (i * 150)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                        C41536l.m120488h(scaleY, "holder.itemView.animate(…1f).scaleX(1f).scaleY(1f)");
                        if (n2 == q2) {
                            scaleY.withEndAction(new C31311j(this.f77746d));
                        }
                        i++;
                    }
                    if (n2 == q2) {
                        break;
                    }
                    n2++;
                }
            }
            C32355x0.m95523n(this.f77746d.f77889l, this);
        }
    }

    /* renamed from: k2 */
    private final void m92963k2() {
        this.f77889l.getViewTreeObserver().addOnGlobalLayoutListener(new C31313a(this));
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        super.mo48298Z0(i);
        this.f77883f.mo87965p3(true);
        mo71717U1(String.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        C30884f fVar = new C30884f();
        this.f77744x = fVar;
        ArrayList arrayList = this.f77745y;
        if (arrayList != null) {
            fVar.mo71077l(arrayList);
        }
        C30884f fVar2 = this.f77744x;
        if (fVar2 == null) {
            C41536l.m120506z("recyclerAdapter");
            fVar2 = null;
        }
        String value = mo71707D1().getValue();
        C41536l.m120488h(value, "wizardObject.value");
        fVar2.mo71082q(Integer.parseInt(value));
        C30884f fVar3 = this.f77744x;
        if (fVar3 != null) {
            return fVar3;
        }
        C41536l.m120506z("recyclerAdapter");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71543g2() {
        super.mo71543g2();
        this.f77890m.setVisibility(8);
        this.f77885h.setBackgroundColor(0);
        this.f77892o.setPadding(0, 0, 0, 0);
        C30884f fVar = this.f77744x;
        if (fVar == null) {
            C41536l.m120506z("recyclerAdapter");
            fVar = null;
        }
        fVar.mo71080o(this);
        m92963k2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo67194j1() {
    }

    /* renamed from: j2 */
    public final void mo71569j2(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "deposits");
        this.f77745y = arrayList;
    }
}

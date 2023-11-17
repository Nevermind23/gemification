package p060e1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0820l;
import java.util.ArrayList;
import java.util.Iterator;
import p060e1.C5936i0;

/* renamed from: e1.n0 */
public class C5968n0 extends C5936i0 {

    /* renamed from: M */
    private ArrayList f18664M = new ArrayList();

    /* renamed from: N */
    private boolean f18665N = true;

    /* renamed from: O */
    int f18666O;

    /* renamed from: P */
    boolean f18667P = false;

    /* renamed from: Q */
    private int f18668Q = 0;

    /* renamed from: e1.n0$a */
    class C5969a extends C5955k0 {

        /* renamed from: d */
        final /* synthetic */ C5936i0 f18669d;

        C5969a(C5936i0 i0Var) {
            this.f18669d = i0Var;
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            this.f18669d.mo19348o0();
            i0Var.mo19343k0(this);
        }
    }

    /* renamed from: e1.n0$b */
    static class C5970b extends C5955k0 {

        /* renamed from: d */
        C5968n0 f18671d;

        C5970b(C5968n0 n0Var) {
            this.f18671d = n0Var;
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            C5968n0 n0Var = this.f18671d;
            int i = n0Var.f18666O - 1;
            n0Var.f18666O = i;
            if (i == 0) {
                n0Var.f18667P = false;
                n0Var.mo19354t();
            }
            i0Var.mo19343k0(this);
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
            C5968n0 n0Var = this.f18671d;
            if (!n0Var.f18667P) {
                n0Var.mo19362y0();
                this.f18671d.f18667P = true;
            }
        }
    }

    public C5968n0() {
    }

    /* renamed from: G0 */
    private void m23943G0(C5936i0 i0Var) {
        this.f18664M.add(i0Var);
        i0Var.f18599u = this;
    }

    /* renamed from: P0 */
    private void m23944P0() {
        C5970b bVar = new C5970b(this);
        Iterator it = this.f18664M.iterator();
        while (it.hasNext()) {
            ((C5936i0) it.next()).mo19333a(bVar);
        }
        this.f18666O = this.f18664M.size();
    }

    /* renamed from: A */
    public C5936i0 mo19313A(int i, boolean z) {
        for (int i2 = 0; i2 < this.f18664M.size(); i2++) {
            ((C5936i0) this.f18664M.get(i2)).mo19313A(i, z);
        }
        return super.mo19313A(i, z);
    }

    /* renamed from: A0 */
    public C5968n0 mo19333a(C5936i0.C5943g gVar) {
        return (C5968n0) super.mo19333a(gVar);
    }

    /* renamed from: B */
    public C5936i0 mo19314B(Class cls, boolean z) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19314B(cls, z);
        }
        return super.mo19314B(cls, z);
    }

    /* renamed from: B0 */
    public C5968n0 mo19334b(int i) {
        for (int i2 = 0; i2 < this.f18664M.size(); i2++) {
            ((C5936i0) this.f18664M.get(i2)).mo19334b(i);
        }
        return (C5968n0) super.mo19334b(i);
    }

    /* renamed from: C */
    public C5936i0 mo19315C(String str, boolean z) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19315C(str, z);
        }
        return super.mo19315C(str, z);
    }

    /* renamed from: C0 */
    public C5968n0 mo19335c(View view) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19335c(view);
        }
        return (C5968n0) super.mo19335c(view);
    }

    /* renamed from: D0 */
    public C5968n0 mo19338d(Class cls) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19338d(cls);
        }
        return (C5968n0) super.mo19338d(cls);
    }

    /* renamed from: E0 */
    public C5968n0 mo19339e(String str) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19339e(str);
        }
        return (C5968n0) super.mo19339e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo19316F(ViewGroup viewGroup) {
        super.mo19316F(viewGroup);
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19316F(viewGroup);
        }
    }

    /* renamed from: F0 */
    public C5968n0 mo19402F0(C5936i0 i0Var) {
        m23943G0(i0Var);
        long j = this.f18584f;
        if (j >= 0) {
            i0Var.mo19350p0(j);
        }
        if ((this.f18668Q & 1) != 0) {
            i0Var.mo19355t0(mo19320J());
        }
        if ((this.f18668Q & 2) != 0) {
            i0Var.mo19360w0(mo19324N());
        }
        if ((this.f18668Q & 4) != 0) {
            i0Var.mo19359v0(mo19323M());
        }
        if ((this.f18668Q & 8) != 0) {
            i0Var.mo19352r0(mo19319I());
        }
        return this;
    }

    /* renamed from: H0 */
    public C5936i0 mo19403H0(int i) {
        if (i < 0 || i >= this.f18664M.size()) {
            return null;
        }
        return (C5936i0) this.f18664M.get(i);
    }

    /* renamed from: I0 */
    public int mo19404I0() {
        return this.f18664M.size();
    }

    /* renamed from: J0 */
    public C5968n0 mo19343k0(C5936i0.C5943g gVar) {
        return (C5968n0) super.mo19343k0(gVar);
    }

    /* renamed from: K0 */
    public C5968n0 mo19344l0(View view) {
        for (int i = 0; i < this.f18664M.size(); i++) {
            ((C5936i0) this.f18664M.get(i)).mo19344l0(view);
        }
        return (C5968n0) super.mo19344l0(view);
    }

    /* renamed from: L0 */
    public C5968n0 mo19350p0(long j) {
        ArrayList arrayList;
        super.mo19350p0(j);
        if (this.f18584f >= 0 && (arrayList = this.f18664M) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C5936i0) this.f18664M.get(i)).mo19350p0(j);
            }
        }
        return this;
    }

    /* renamed from: M0 */
    public C5968n0 mo19355t0(TimeInterpolator timeInterpolator) {
        this.f18668Q |= 1;
        ArrayList arrayList = this.f18664M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C5936i0) this.f18664M.get(i)).mo19355t0(timeInterpolator);
            }
        }
        return (C5968n0) super.mo19355t0(timeInterpolator);
    }

    /* renamed from: N0 */
    public C5968n0 mo19409N0(int i) {
        if (i == 0) {
            this.f18665N = true;
        } else if (i == 1) {
            this.f18665N = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: O0 */
    public C5968n0 mo19361x0(long j) {
        return (C5968n0) super.mo19361x0(j);
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).cancel();
        }
    }

    /* renamed from: i0 */
    public void mo19340i0(View view) {
        super.mo19340i0(view);
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19340i0(view);
        }
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        if (mo19332Z(q0Var.f18719b)) {
            Iterator it = this.f18664M.iterator();
            while (it.hasNext()) {
                C5936i0 i0Var = (C5936i0) it.next();
                if (i0Var.mo19332Z(q0Var.f18719b)) {
                    i0Var.mo16526k(q0Var);
                    q0Var.f18720c.add(i0Var);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19345m(C5989q0 q0Var) {
        super.mo19345m(q0Var);
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19345m(q0Var);
        }
    }

    /* renamed from: m0 */
    public void mo19346m0(View view) {
        super.mo19346m0(view);
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19346m0(view);
        }
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        if (mo19332Z(q0Var.f18719b)) {
            Iterator it = this.f18664M.iterator();
            while (it.hasNext()) {
                C5936i0 i0Var = (C5936i0) it.next();
                if (i0Var.mo19332Z(q0Var.f18719b)) {
                    i0Var.mo16527n(q0Var);
                    q0Var.f18720c.add(i0Var);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo19348o0() {
        if (this.f18664M.isEmpty()) {
            mo19362y0();
            mo19354t();
            return;
        }
        m23944P0();
        if (!this.f18665N) {
            for (int i = 1; i < this.f18664M.size(); i++) {
                ((C5936i0) this.f18664M.get(i - 1)).mo19333a(new C5969a((C5936i0) this.f18664M.get(i)));
            }
            C5936i0 i0Var = (C5936i0) this.f18664M.get(0);
            if (i0Var != null) {
                i0Var.mo19348o0();
                return;
            }
            return;
        }
        Iterator it = this.f18664M.iterator();
        while (it.hasNext()) {
            ((C5936i0) it.next()).mo19348o0();
        }
    }

    /* renamed from: q */
    public C5936i0 clone() {
        C5968n0 n0Var = (C5968n0) super.clone();
        n0Var.f18664M = new ArrayList();
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            n0Var.m23943G0(((C5936i0) this.f18664M.get(i)).clone());
        }
        return n0Var;
    }

    /* renamed from: r0 */
    public void mo19352r0(C5936i0.C5942f fVar) {
        super.mo19352r0(fVar);
        this.f18668Q |= 8;
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19352r0(fVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo19353s(ViewGroup viewGroup, C5992r0 r0Var, C5992r0 r0Var2, ArrayList arrayList, ArrayList arrayList2) {
        long P = mo19325P();
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            C5936i0 i0Var = (C5936i0) this.f18664M.get(i);
            if (P > 0 && (this.f18665N || i == 0)) {
                long P2 = i0Var.mo19325P();
                if (P2 > 0) {
                    i0Var.mo19361x0(P2 + P);
                } else {
                    i0Var.mo19361x0(P);
                }
            }
            i0Var.mo19353s(viewGroup, r0Var, r0Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: v0 */
    public void mo19359v0(C6011z zVar) {
        super.mo19359v0(zVar);
        this.f18668Q |= 4;
        if (this.f18664M != null) {
            for (int i = 0; i < this.f18664M.size(); i++) {
                ((C5936i0) this.f18664M.get(i)).mo19359v0(zVar);
            }
        }
    }

    /* renamed from: w0 */
    public void mo19360w0(C5963m0 m0Var) {
        super.mo19360w0(m0Var);
        this.f18668Q |= 2;
        int size = this.f18664M.size();
        for (int i = 0; i < size; i++) {
            ((C5936i0) this.f18664M.get(i)).mo19360w0(m0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public String mo19363z0(String str) {
        String z0 = super.mo19363z0(str);
        for (int i = 0; i < this.f18664M.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(z0);
            sb.append("\n");
            sb.append(((C5936i0) this.f18664M.get(i)).mo19363z0(str + "  "));
            z0 = sb.toString();
        }
        return z0;
    }

    public C5968n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18560i);
        mo19409N0(C0820l.m3068k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}

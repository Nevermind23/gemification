package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0315n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0286b implements C0313m {

    /* renamed from: d */
    protected Context f1518d;

    /* renamed from: e */
    protected Context f1519e;

    /* renamed from: f */
    protected C0297g f1520f;

    /* renamed from: g */
    protected LayoutInflater f1521g;

    /* renamed from: h */
    protected LayoutInflater f1522h;

    /* renamed from: i */
    private C0313m.C0314a f1523i;

    /* renamed from: j */
    private int f1524j;

    /* renamed from: k */
    private int f1525k;

    /* renamed from: l */
    protected C0315n f1526l;

    /* renamed from: m */
    private int f1527m;

    public C0286b(Context context, int i, int i2) {
        this.f1518d = context;
        this.f1521g = LayoutInflater.from(context);
        this.f1524j = i;
        this.f1525k = i2;
    }

    /* renamed from: a */
    public int mo900a() {
        return this.f1527m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo901b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1526l).addView(view, i);
    }

    /* renamed from: c */
    public void mo902c(C0297g gVar, boolean z) {
        C0313m.C0314a aVar = this.f1523i;
        if (aVar != null) {
            aVar.mo519c(gVar, z);
        }
    }

    /* renamed from: d */
    public abstract void mo903d(C0301i iVar, C0315n.C0316a aVar);

    /* renamed from: e */
    public boolean mo904e(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: f */
    public void mo905f(C0313m.C0314a aVar) {
        this.f1523i = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo906h(androidx.appcompat.view.menu.C0322r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f1523i
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f1520f
        L_0x0009:
            boolean r2 = r0.mo520d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0286b.mo906h(androidx.appcompat.view.menu.r):boolean");
    }

    /* renamed from: j */
    public void mo907j(boolean z) {
        C0301i iVar;
        ViewGroup viewGroup = (ViewGroup) this.f1526l;
        if (viewGroup != null) {
            C0297g gVar = this.f1520f;
            int i = 0;
            if (gVar != null) {
                gVar.mo1037t();
                ArrayList G = this.f1520f.mo973G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0301i iVar2 = (C0301i) G.get(i3);
                    if (mo916t(i2, iVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C0315n.C0316a) {
                            iVar = ((C0315n.C0316a) childAt).getItemData();
                        } else {
                            iVar = null;
                        }
                        View q = mo913q(iVar2, childAt, viewGroup);
                        if (iVar2 != iVar) {
                            q.setPressed(false);
                            q.jumpDrawablesToCurrentState();
                        }
                        if (q != childAt) {
                            mo901b(q, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo911o(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: l */
    public boolean mo908l(C0297g gVar, C0301i iVar) {
        return false;
    }

    /* renamed from: m */
    public void mo909m(Context context, C0297g gVar) {
        this.f1519e = context;
        this.f1522h = LayoutInflater.from(context);
        this.f1520f = gVar;
    }

    /* renamed from: n */
    public C0315n.C0316a mo910n(ViewGroup viewGroup) {
        return (C0315n.C0316a) this.f1521g.inflate(this.f1525k, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo911o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public C0313m.C0314a mo912p() {
        return this.f1523i;
    }

    /* renamed from: q */
    public View mo913q(C0301i iVar, View view, ViewGroup viewGroup) {
        C0315n.C0316a aVar;
        if (view instanceof C0315n.C0316a) {
            aVar = (C0315n.C0316a) view;
        } else {
            aVar = mo910n(viewGroup);
        }
        mo903d(iVar, aVar);
        return (View) aVar;
    }

    /* renamed from: r */
    public C0315n mo914r(ViewGroup viewGroup) {
        if (this.f1526l == null) {
            C0315n nVar = (C0315n) this.f1521g.inflate(this.f1524j, viewGroup, false);
            this.f1526l = nVar;
            nVar.mo826a(this.f1520f);
            mo907j(true);
        }
        return this.f1526l;
    }

    /* renamed from: s */
    public void mo915s(int i) {
        this.f1527m = i;
    }

    /* renamed from: t */
    public abstract boolean mo916t(int i, C0301i iVar);
}

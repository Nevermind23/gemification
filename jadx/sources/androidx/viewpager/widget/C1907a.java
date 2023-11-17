package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
public abstract class C1907a {

    /* renamed from: a */
    private final DataSetObservable f5762a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f5763b;

    /* renamed from: a */
    public abstract void mo4594a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: b */
    public void mo6556b(View view) {
    }

    /* renamed from: c */
    public void mo4595c(ViewGroup viewGroup) {
        mo6556b(viewGroup);
    }

    /* renamed from: d */
    public abstract int mo6557d();

    /* renamed from: e */
    public int mo6558e(Object obj) {
        return -1;
    }

    /* renamed from: f */
    public CharSequence mo6559f(int i) {
        return null;
    }

    /* renamed from: g */
    public float mo6560g(int i) {
        return 1.0f;
    }

    /* renamed from: h */
    public abstract Object mo4596h(ViewGroup viewGroup, int i);

    /* renamed from: i */
    public abstract boolean mo4597i(View view, Object obj);

    /* renamed from: j */
    public void mo6561j() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f5763b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f5762a.notifyChanged();
    }

    /* renamed from: k */
    public void mo6562k(DataSetObserver dataSetObserver) {
        this.f5762a.registerObserver(dataSetObserver);
    }

    /* renamed from: l */
    public void mo4598l(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: m */
    public Parcelable mo4599m() {
        return null;
    }

    /* renamed from: n */
    public void mo6563n(View view, int i, Object obj) {
    }

    /* renamed from: o */
    public void mo4600o(ViewGroup viewGroup, int i, Object obj) {
        mo6563n(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6564p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f5763b = dataSetObserver;
        }
    }

    /* renamed from: q */
    public void mo6565q(View view) {
    }

    /* renamed from: r */
    public void mo4601r(ViewGroup viewGroup) {
        mo6565q(viewGroup);
    }

    /* renamed from: s */
    public void mo6566s(DataSetObserver dataSetObserver) {
        this.f5762a.unregisterObserver(dataSetObserver);
    }
}

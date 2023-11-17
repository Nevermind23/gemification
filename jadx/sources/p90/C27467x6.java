package p90;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p366bk.C10322k;

/* renamed from: p90.x6 */
public class C27467x6 extends C27458w6 {

    /* renamed from: C */
    private static final SparseIntArray f70235C;

    /* renamed from: A */
    private final CardView f70236A;

    /* renamed from: B */
    private long f70237B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f70235C = sparseIntArray;
        sparseIntArray.put(C10322k.banner_bg_image, 1);
        sparseIntArray.put(C10322k.dismiss_banner_image, 2);
    }

    public C27467x6(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 3, (ViewDataBinding.C1353i) null, f70235C));
    }

    /* renamed from: D */
    public void mo66768D() {
        synchronized (this) {
            this.f70237B = 1;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3947k() {
        synchronized (this) {
            this.f70237B = 0;
        }
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f70237B != 0) {
                return true;
            }
            return false;
        }
    }

    private C27467x6(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[1], objArr[2]);
        this.f70237B = -1;
        CardView cardView = objArr[0];
        this.f70236A = cardView;
        cardView.setTag((Object) null);
        mo3945A(view);
        mo66768D();
    }
}

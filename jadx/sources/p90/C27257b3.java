package p90;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import p366bk.C10322k;

/* renamed from: p90.b3 */
public class C27257b3 extends C27247a3 {

    /* renamed from: J */
    private static final SparseIntArray f68376J;

    /* renamed from: I */
    private long f68377I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f68376J = sparseIntArray;
        sparseIntArray.put(C10322k.negativeMargin, 1);
        sparseIntArray.put(C10322k.message_dialog_gift_image, 2);
        sparseIntArray.put(C10322k.message_dialog_congratulation, 3);
        sparseIntArray.put(C10322k.message_dialog_text, 4);
        sparseIntArray.put(C10322k.plus_gift_message_close, 5);
        sparseIntArray.put(C10322k.gdTop, 6);
        sparseIntArray.put(C10322k.gdBot, 7);
        sparseIntArray.put(C10322k.gdStart, 8);
        sparseIntArray.put(C10322k.gdEnd, 9);
    }

    public C27257b3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 10, (ViewDataBinding.C1353i) null, f68376J));
    }

    /* renamed from: B */
    public void mo66547B() {
        synchronized (this) {
            this.f68377I = 1;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3947k() {
        synchronized (this) {
            this.f68377I = 0;
        }
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f68377I != 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C27257b3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[0], objArr[7], objArr[9], objArr[8], objArr[6], objArr[3], objArr[2], objArr[4], objArr[1], objArr[5]);
        this.f68377I = -1;
        this.f68306y.setTag((Object) null);
        mo3945A(view);
        mo66547B();
    }
}

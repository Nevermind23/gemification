package p053d7;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: d7.g */
public abstract class C5848g extends C5845d implements C5849h {
    public C5848g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo19065k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo19068O0((Status) C5846e.m23522a(parcel, Status.CREATOR));
        return true;
    }
}

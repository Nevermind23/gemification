package p156l6;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p066e7.C6038b;
import p066e7.C6039c;

/* renamed from: l6.e */
public interface C6937e extends IInterface {

    /* renamed from: l6.e$a */
    public static abstract class C6938a extends C6038b implements C6937e {
        public C6938a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        /* renamed from: A2 */
        public final boolean mo19530A2(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            mo12793D1((Status) C6039c.m24165a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: D1 */
    void mo12793D1(Status status);
}

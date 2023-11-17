package p299w6;

import android.os.IBinder;
import android.os.IInterface;
import p092g7.C6251b;

/* renamed from: w6.b */
public interface C8859b extends IInterface {

    /* renamed from: w6.b$a */
    public static abstract class C8860a extends C6251b implements C8859b {
        public C8860a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: x */
        public static C8859b m32974x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C8859b) {
                return (C8859b) queryLocalInterface;
            }
            return new C8872n(iBinder);
        }
    }
}

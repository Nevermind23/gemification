package p323y5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: y5.a */
public interface C9061a extends IInterface {

    /* renamed from: y5.a$a */
    public static abstract class C9062a extends Binder implements C9061a {

        /* renamed from: y5.a$a$a */
        private static class C9063a implements C9061a {

            /* renamed from: b */
            private IBinder f25244b;

            C9063a(IBinder iBinder) {
                this.f25244b = iBinder;
            }

            public IBinder asBinder() {
                return this.f25244b;
            }

            /* renamed from: h0 */
            public Bundle mo24581h0(Bundle bundle) {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25244b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: k */
        public static C9061a m33547k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C9061a)) {
                return new C9063a(iBinder);
            }
            return (C9061a) queryLocalInterface;
        }
    }

    /* renamed from: h0 */
    Bundle mo24581h0(Bundle bundle);
}

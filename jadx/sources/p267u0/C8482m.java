package p267u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p267u0.C8479l;

/* renamed from: u0.m */
public interface C8482m extends IInterface {

    /* renamed from: u0.m$a */
    public static abstract class C8483a extends Binder implements C8482m {

        /* renamed from: u0.m$a$a */
        private static class C8484a implements C8482m {

            /* renamed from: b */
            private IBinder f24098b;

            C8484a(IBinder iBinder) {
                this.f24098b = iBinder;
            }

            /* renamed from: W0 */
            public void mo6105W0(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f24098b.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: Z */
            public int mo6106Z(C8479l lVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(lVar);
                    obtain.writeString(str);
                    this.f24098b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f24098b;
            }
        }

        public C8483a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: k */
        public static C8482m m31774k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C8482m)) {
                return new C8484a(iBinder);
            }
            return (C8482m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i != 1598968902) {
                if (i == 1) {
                    int Z = mo6106Z(C8479l.C8480a.m31769k(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(Z);
                } else if (i == 2) {
                    mo6107f0(C8479l.C8480a.m31769k(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo6105W0(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: W0 */
    void mo6105W0(int i, String[] strArr);

    /* renamed from: Z */
    int mo6106Z(C8479l lVar, String str);

    /* renamed from: f0 */
    void mo6107f0(C8479l lVar, int i);
}

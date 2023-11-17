package p267u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u0.l */
public interface C8479l extends IInterface {

    /* renamed from: u0.l$a */
    public static abstract class C8480a extends Binder implements C8479l {

        /* renamed from: u0.l$a$a */
        private static class C8481a implements C8479l {

            /* renamed from: b */
            private IBinder f24097b;

            C8481a(IBinder iBinder) {
                this.f24097b = iBinder;
            }

            /* renamed from: P */
            public void mo23749P(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f24097b.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f24097b;
            }
        }

        public C8480a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: k */
        public static C8479l m31769k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C8479l)) {
                return new C8481a(iBinder);
            }
            return (C8479l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo23749P(parcel.createStringArray());
                return true;
            }
        }
    }

    /* renamed from: P */
    void mo23749P(String[] strArr);
}

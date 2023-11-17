package p341ge.bog.mobilebank.model.payment;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentServiceConfigInput$$Parcelable */
public class PaymentServiceConfigInput$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentServiceConfigInput$$Parcelable> CREATOR = new Parcelable.Creator<PaymentServiceConfigInput$$Parcelable>() {
        public PaymentServiceConfigInput$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentServiceConfigInput$$Parcelable(PaymentServiceConfigInput$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentServiceConfigInput$$Parcelable[] newArray(int i) {
            return new PaymentServiceConfigInput$$Parcelable[i];
        }
    };
    private PaymentServiceConfigInput paymentServiceConfigInput$$0;

    public PaymentServiceConfigInput$$Parcelable(PaymentServiceConfigInput paymentServiceConfigInput) {
        this.paymentServiceConfigInput$$0 = paymentServiceConfigInput;
    }

    public static PaymentServiceConfigInput read(Parcel parcel, C42027a aVar) {
        Boolean bool;
        Boolean bool2;
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr;
        Boolean bool3;
        Boolean bool4;
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentServiceConfigInput paymentServiceConfigInput = new PaymentServiceConfigInput();
            aVar.mo97501f(g, paymentServiceConfigInput);
            boolean z4 = false;
            Integer num2 = null;
            if (parcel.readInt() < 0) {
                bool = null;
            } else {
                if (parcel.readInt() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            }
            paymentServiceConfigInput.inputOptionBundle = bool;
            if (parcel.readInt() < 0) {
                bool2 = null;
            } else {
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bool2 = Boolean.valueOf(z2);
            }
            paymentServiceConfigInput.submit = bool2;
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                paymentsServiceConfigInputOptionArr = null;
            } else {
                paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    paymentsServiceConfigInputOptionArr[i] = PaymentsServiceConfigInputOption$$Parcelable.read(parcel, aVar);
                }
            }
            paymentServiceConfigInput.inputOption = paymentsServiceConfigInputOptionArr;
            paymentServiceConfigInput.type = parcel.readString();
            paymentServiceConfigInput.inputName = parcel.readString();
            if (parcel.readInt() < 0) {
                bool3 = null;
            } else {
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bool3 = Boolean.valueOf(z);
            }
            paymentServiceConfigInput.isNumeric = bool3;
            if (parcel.readInt() < 0) {
                bool4 = null;
            } else {
                if (parcel.readInt() == 1) {
                    z4 = true;
                }
                bool4 = Boolean.valueOf(z4);
            }
            paymentServiceConfigInput.enable = bool4;
            if (parcel.readInt() < 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            paymentServiceConfigInput.width = num;
            paymentServiceConfigInput.name = parcel.readString();
            paymentServiceConfigInput.f81346id = parcel.readString();
            paymentServiceConfigInput.value = parcel.readString();
            paymentServiceConfigInput.manualValue = parcel.readString();
            if (parcel.readInt() >= 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            paymentServiceConfigInput.maxLength = num2;
            aVar.mo97501f(readInt, paymentServiceConfigInput);
            return paymentServiceConfigInput;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentServiceConfigInput) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentServiceConfigInput paymentServiceConfigInput, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentServiceConfigInput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentServiceConfigInput));
        if (paymentServiceConfigInput.inputOptionBundle == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentServiceConfigInput.inputOptionBundle.booleanValue() ? 1 : 0);
        }
        if (paymentServiceConfigInput.submit == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentServiceConfigInput.submit.booleanValue() ? 1 : 0);
        }
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = paymentServiceConfigInput.inputOption;
        if (paymentsServiceConfigInputOptionArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(paymentsServiceConfigInputOptionArr.length);
            for (PaymentsServiceConfigInputOption write : paymentServiceConfigInput.inputOption) {
                PaymentsServiceConfigInputOption$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeString(paymentServiceConfigInput.type);
        parcel.writeString(paymentServiceConfigInput.inputName);
        if (paymentServiceConfigInput.isNumeric == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentServiceConfigInput.isNumeric.booleanValue() ? 1 : 0);
        }
        if (paymentServiceConfigInput.enable == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentServiceConfigInput.enable.booleanValue() ? 1 : 0);
        }
        if (paymentServiceConfigInput.width == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(paymentServiceConfigInput.width.intValue());
        }
        parcel.writeString(paymentServiceConfigInput.name);
        parcel.writeString(paymentServiceConfigInput.f81346id);
        parcel.writeString(paymentServiceConfigInput.value);
        parcel.writeString(paymentServiceConfigInput.manualValue);
        if (paymentServiceConfigInput.maxLength == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(paymentServiceConfigInput.maxLength.intValue());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentServiceConfigInput$$0, parcel, i, new C42027a());
    }

    public PaymentServiceConfigInput getParcel() {
        return this.paymentServiceConfigInput$$0;
    }
}

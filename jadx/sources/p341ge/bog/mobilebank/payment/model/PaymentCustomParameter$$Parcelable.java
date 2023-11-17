package p341ge.bog.mobilebank.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption$$Parcelable;

/* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomParameter$$Parcelable */
public class PaymentCustomParameter$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentCustomParameter$$Parcelable> CREATOR = new C33623a();
    private PaymentCustomParameter paymentCustomParameter$$0;

    /* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomParameter$$Parcelable$a */
    class C33623a implements Parcelable.Creator {
        C33623a() {
        }

        /* renamed from: a */
        public PaymentCustomParameter$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentCustomParameter$$Parcelable(PaymentCustomParameter$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public PaymentCustomParameter$$Parcelable[] newArray(int i) {
            return new PaymentCustomParameter$$Parcelable[i];
        }
    }

    public PaymentCustomParameter$$Parcelable(PaymentCustomParameter paymentCustomParameter) {
        this.paymentCustomParameter$$0 = paymentCustomParameter;
    }

    public static PaymentCustomParameter read(Parcel parcel, C42027a aVar) {
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter();
            aVar.mo97501f(g, paymentCustomParameter);
            paymentCustomParameter.inputIndexInRawConfig = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z5 = false;
            if (readInt2 < 0) {
                paymentsServiceConfigInputOptionArr = null;
            } else {
                PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr2 = new PaymentsServiceConfigInputOption[readInt2];
                for (int i = 0; i < readInt2; i++) {
                    paymentsServiceConfigInputOptionArr2[i] = PaymentsServiceConfigInputOption$$Parcelable.read(parcel, aVar);
                }
                paymentsServiceConfigInputOptionArr = paymentsServiceConfigInputOptionArr2;
            }
            paymentCustomParameter.inputOptions = paymentsServiceConfigInputOptionArr;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            paymentCustomParameter.isDebtVerifiable = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            paymentCustomParameter.notNeededForDebtVerify = z2;
            paymentCustomParameter.valueToDisplayInForm = parcel.readString();
            paymentCustomParameter.logoUrl = parcel.readString();
            paymentCustomParameter.valueToDisplay = parcel.readString();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            paymentCustomParameter.visibleInWizard = z3;
            paymentCustomParameter.rowNum = parcel.readInt();
            paymentCustomParameter.name = parcel.readString();
            paymentCustomParameter.style = ConfigParamStyle$$Parcelable.read(parcel, aVar);
            paymentCustomParameter.f81945id = parcel.readString();
            paymentCustomParameter.value = parcel.readString();
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            paymentCustomParameter.isMandatory = z4;
            if (parcel.readInt() == 1) {
                z5 = true;
            }
            paymentCustomParameter.visibleInForm = z5;
            aVar.mo97501f(readInt, paymentCustomParameter);
            return paymentCustomParameter;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentCustomParameter) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentCustomParameter paymentCustomParameter, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentCustomParameter);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentCustomParameter));
        parcel.writeInt(paymentCustomParameter.inputIndexInRawConfig);
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = paymentCustomParameter.inputOptions;
        if (paymentsServiceConfigInputOptionArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(paymentsServiceConfigInputOptionArr.length);
            for (PaymentsServiceConfigInputOption write : paymentCustomParameter.inputOptions) {
                PaymentsServiceConfigInputOption$$Parcelable.write(write, parcel, i, aVar);
            }
        }
        parcel.writeInt(paymentCustomParameter.isDebtVerifiable ? 1 : 0);
        parcel.writeInt(paymentCustomParameter.notNeededForDebtVerify ? 1 : 0);
        parcel.writeString(paymentCustomParameter.valueToDisplayInForm);
        parcel.writeString(paymentCustomParameter.logoUrl);
        parcel.writeString(paymentCustomParameter.valueToDisplay);
        parcel.writeInt(paymentCustomParameter.visibleInWizard ? 1 : 0);
        parcel.writeInt(paymentCustomParameter.rowNum);
        parcel.writeString(paymentCustomParameter.name);
        ConfigParamStyle$$Parcelable.write(paymentCustomParameter.style, parcel, i, aVar);
        parcel.writeString(paymentCustomParameter.f81945id);
        parcel.writeString(paymentCustomParameter.value);
        parcel.writeInt(paymentCustomParameter.isMandatory ? 1 : 0);
        parcel.writeInt(paymentCustomParameter.visibleInForm ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentCustomParameter$$0, parcel, i, new C42027a());
    }

    public PaymentCustomParameter getParcel() {
        return this.paymentCustomParameter$$0;
    }
}

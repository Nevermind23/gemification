package p341ge.bog.mobilebank.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails$$Parcelable */
public class LimitLoanDecisionDetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<LimitLoanDecisionDetails$$Parcelable> CREATOR = new Parcelable.Creator<LimitLoanDecisionDetails$$Parcelable>() {
        public LimitLoanDecisionDetails$$Parcelable createFromParcel(Parcel parcel) {
            return new LimitLoanDecisionDetails$$Parcelable(LimitLoanDecisionDetails$$Parcelable.read(parcel, new C42027a()));
        }

        public LimitLoanDecisionDetails$$Parcelable[] newArray(int i) {
            return new LimitLoanDecisionDetails$$Parcelable[i];
        }
    };
    private LimitLoanDecisionDetails limitLoanDecisionDetails$$0;

    public LimitLoanDecisionDetails$$Parcelable(LimitLoanDecisionDetails limitLoanDecisionDetails) {
        this.limitLoanDecisionDetails$$0 = limitLoanDecisionDetails;
    }

    public static LimitLoanDecisionDetails read(Parcel parcel, C42027a aVar) {
        Double d;
        Double d2;
        Integer num;
        Double d3;
        Double d4;
        Integer num2;
        Double d5;
        Double d6;
        Integer num3;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            LimitLoanDecisionDetails limitLoanDecisionDetails = new LimitLoanDecisionDetails();
            aVar.mo97501f(g, limitLoanDecisionDetails);
            limitLoanDecisionDetails.comisMin = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.insIncFlag = parcel.readString();
            limitLoanDecisionDetails.rfncAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.insIncAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.loanMaturity = parcel.readLong();
            limitLoanDecisionDetails.maxLoanAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.pmtAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.loanIrr = parcel.readDouble();
            limitLoanDecisionDetails.accessType = parcel.readString();
            limitLoanDecisionDetails.withdrawalAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.penaltyFeeValue = parcel.readString();
            limitLoanDecisionDetails.conditionRate = parcel.readString();
            limitLoanDecisionDetails.conditionDays = parcel.readInt();
            limitLoanDecisionDetails.decisionNo = parcel.readLong();
            Double d7 = null;
            if (parcel.readInt() < 0) {
                d = null;
            } else {
                d = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.downPayment = d;
            limitLoanDecisionDetails.penaltyOne = parcel.readDouble();
            limitLoanDecisionDetails.insLifeAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.decisionScheme = parcel.readString();
            limitLoanDecisionDetails.minLoanAmount = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() < 0) {
                d2 = null;
            } else {
                d2 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.forgiveIntAmount = d2;
            limitLoanDecisionDetails.drawAmount2 = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.penaltyPri = parcel.readDouble();
            limitLoanDecisionDetails.keepAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.drawAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.loanCcy = parcel.readString();
            limitLoanDecisionDetails.penaltyPre = parcel.readDouble();
            if (parcel.readInt() < 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            limitLoanDecisionDetails.maxTerm = num;
            if (parcel.readInt() < 0) {
                d3 = null;
            } else {
                d3 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.fullPaymentAmount = d3;
            limitLoanDecisionDetails.comisRate = parcel.readDouble();
            limitLoanDecisionDetails.penaltyInt = parcel.readDouble();
            if (parcel.readInt() < 0) {
                d4 = null;
            } else {
                d4 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.forgiveOdiAmount = d4;
            limitLoanDecisionDetails.loanAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.conditionDate = parcel.readString();
            limitLoanDecisionDetails.loanIrr2 = parcel.readString();
            limitLoanDecisionDetails.comisAmount = (BigDecimal) parcel.readSerializable();
            limitLoanDecisionDetails.loanTerm = parcel.readInt();
            limitLoanDecisionDetails.loanIrr4 = parcel.readString();
            limitLoanDecisionDetails.loanIrr3 = parcel.readString();
            limitLoanDecisionDetails.firstPayDate = parcel.readLong();
            if (parcel.readInt() < 0) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(parcel.readInt());
            }
            limitLoanDecisionDetails.minTerm = num2;
            if (parcel.readInt() < 0) {
                d5 = null;
            } else {
                d5 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.rqstDownPayment = d5;
            if (parcel.readInt() < 0) {
                d6 = null;
            } else {
                d6 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.penaltyFee = d6;
            if (parcel.readInt() < 0) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(parcel.readInt());
            }
            limitLoanDecisionDetails.payDay = num3;
            limitLoanDecisionDetails.operationType = parcel.readString();
            if (parcel.readInt() >= 0) {
                d7 = Double.valueOf(parcel.readDouble());
            }
            limitLoanDecisionDetails.forgiveFeeAmount = d7;
            limitLoanDecisionDetails.paymentCount = parcel.readInt();
            limitLoanDecisionDetails.loanRate = parcel.readDouble();
            aVar.mo97501f(readInt, limitLoanDecisionDetails);
            return limitLoanDecisionDetails;
        } else if (!aVar.mo97499d(readInt)) {
            return (LimitLoanDecisionDetails) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(LimitLoanDecisionDetails limitLoanDecisionDetails, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(limitLoanDecisionDetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(limitLoanDecisionDetails));
        parcel.writeSerializable(limitLoanDecisionDetails.comisMin);
        parcel.writeString(limitLoanDecisionDetails.insIncFlag);
        parcel.writeSerializable(limitLoanDecisionDetails.rfncAmount);
        parcel.writeSerializable(limitLoanDecisionDetails.insIncAmount);
        parcel.writeLong(limitLoanDecisionDetails.loanMaturity);
        parcel.writeSerializable(limitLoanDecisionDetails.maxLoanAmount);
        parcel.writeSerializable(limitLoanDecisionDetails.pmtAmount);
        parcel.writeDouble(limitLoanDecisionDetails.loanIrr);
        parcel.writeString(limitLoanDecisionDetails.accessType);
        parcel.writeSerializable(limitLoanDecisionDetails.withdrawalAmount);
        parcel.writeString(limitLoanDecisionDetails.penaltyFeeValue);
        parcel.writeString(limitLoanDecisionDetails.conditionRate);
        parcel.writeInt(limitLoanDecisionDetails.conditionDays);
        parcel.writeLong(limitLoanDecisionDetails.decisionNo);
        if (limitLoanDecisionDetails.downPayment == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.downPayment.doubleValue());
        }
        parcel.writeDouble(limitLoanDecisionDetails.penaltyOne);
        parcel.writeSerializable(limitLoanDecisionDetails.insLifeAmount);
        parcel.writeString(limitLoanDecisionDetails.decisionScheme);
        parcel.writeSerializable(limitLoanDecisionDetails.minLoanAmount);
        if (limitLoanDecisionDetails.forgiveIntAmount == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.forgiveIntAmount.doubleValue());
        }
        parcel.writeSerializable(limitLoanDecisionDetails.drawAmount2);
        parcel.writeDouble(limitLoanDecisionDetails.penaltyPri);
        parcel.writeSerializable(limitLoanDecisionDetails.keepAmount);
        parcel.writeSerializable(limitLoanDecisionDetails.drawAmount);
        parcel.writeString(limitLoanDecisionDetails.loanCcy);
        parcel.writeDouble(limitLoanDecisionDetails.penaltyPre);
        if (limitLoanDecisionDetails.maxTerm == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(limitLoanDecisionDetails.maxTerm.intValue());
        }
        if (limitLoanDecisionDetails.fullPaymentAmount == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.fullPaymentAmount.doubleValue());
        }
        parcel.writeDouble(limitLoanDecisionDetails.comisRate);
        parcel.writeDouble(limitLoanDecisionDetails.penaltyInt);
        if (limitLoanDecisionDetails.forgiveOdiAmount == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.forgiveOdiAmount.doubleValue());
        }
        parcel.writeSerializable(limitLoanDecisionDetails.loanAmount);
        parcel.writeString(limitLoanDecisionDetails.conditionDate);
        parcel.writeString(limitLoanDecisionDetails.loanIrr2);
        parcel.writeSerializable(limitLoanDecisionDetails.comisAmount);
        parcel.writeInt(limitLoanDecisionDetails.loanTerm);
        parcel.writeString(limitLoanDecisionDetails.loanIrr4);
        parcel.writeString(limitLoanDecisionDetails.loanIrr3);
        parcel.writeLong(limitLoanDecisionDetails.firstPayDate);
        if (limitLoanDecisionDetails.minTerm == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(limitLoanDecisionDetails.minTerm.intValue());
        }
        if (limitLoanDecisionDetails.rqstDownPayment == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.rqstDownPayment.doubleValue());
        }
        if (limitLoanDecisionDetails.penaltyFee == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.penaltyFee.doubleValue());
        }
        if (limitLoanDecisionDetails.payDay == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(limitLoanDecisionDetails.payDay.intValue());
        }
        parcel.writeString(limitLoanDecisionDetails.operationType);
        if (limitLoanDecisionDetails.forgiveFeeAmount == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(limitLoanDecisionDetails.forgiveFeeAmount.doubleValue());
        }
        parcel.writeInt(limitLoanDecisionDetails.paymentCount);
        parcel.writeDouble(limitLoanDecisionDetails.loanRate);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.limitLoanDecisionDetails$$0, parcel, i, new C42027a());
    }

    public LimitLoanDecisionDetails getParcel() {
        return this.limitLoanDecisionDetails$$0;
    }
}

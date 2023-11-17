package p341ge.bog.mobilebank.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* renamed from: ge.bog.mobilebank.model.offers.ScheduleInfo */
public class ScheduleInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Parcelable.Creator<ScheduleInfo>() {
        public ScheduleInfo createFromParcel(Parcel parcel) {
            return new ScheduleInfo(parcel);
        }

        public ScheduleInfo[] newArray(int i) {
            return new ScheduleInfo[i];
        }
    };
    private String ccy;
    private String comAmount;
    private String insAmount;
    private String intAmount;
    private String outAmount;
    private String payDate;
    private String priAmount;
    private String sumAmount;

    protected ScheduleInfo(Parcel parcel) {
        this.outAmount = parcel.readString();
        this.intAmount = parcel.readString();
        this.comAmount = parcel.readString();
        this.ccy = parcel.readString();
        this.insAmount = parcel.readString();
        this.priAmount = parcel.readString();
        this.sumAmount = parcel.readString();
        this.payDate = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getComAmount() {
        return this.comAmount;
    }

    public String getInsAmount() {
        return this.insAmount;
    }

    public String getIntAmount() {
        return this.intAmount;
    }

    public String getOutAmount() {
        return this.outAmount;
    }

    public String getPayDate() {
        return this.payDate;
    }

    public String getPriAmount() {
        return this.priAmount;
    }

    public String getSumAmount() {
        return this.sumAmount;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.outAmount);
        parcel.writeString(this.intAmount);
        parcel.writeString(this.comAmount);
        parcel.writeString(this.ccy);
        parcel.writeString(this.insAmount);
        parcel.writeString(this.priAmount);
        parcel.writeString(this.sumAmount);
        parcel.writeString(this.payDate);
    }
}

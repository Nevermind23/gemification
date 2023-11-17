package p341ge.bog.mobilebank.model.foreigntransfer;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.foreigntransfer.ReportingCode$$Parcelable */
public class ReportingCode$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<ReportingCode$$Parcelable> CREATOR = new Parcelable.Creator<ReportingCode$$Parcelable>() {
        public ReportingCode$$Parcelable createFromParcel(Parcel parcel) {
            return new ReportingCode$$Parcelable(ReportingCode$$Parcelable.read(parcel, new C42027a()));
        }

        public ReportingCode$$Parcelable[] newArray(int i) {
            return new ReportingCode$$Parcelable[i];
        }
    };
    private ReportingCode reportingCode$$0;

    public ReportingCode$$Parcelable(ReportingCode reportingCode) {
        this.reportingCode$$0 = reportingCode;
    }

    public static ReportingCode read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            ReportingCode reportingCode = new ReportingCode();
            aVar.mo97501f(g, reportingCode);
            reportingCode.setDescriptionEn(parcel.readString());
            reportingCode.setCountryCode(parcel.readString());
            reportingCode.setDescription(parcel.readString());
            reportingCode.setId(parcel.readLong());
            reportingCode.setReportingCode(parcel.readString());
            reportingCode.setDescriptionGe(parcel.readString());
            aVar.mo97501f(readInt, reportingCode);
            return reportingCode;
        } else if (!aVar.mo97499d(readInt)) {
            return (ReportingCode) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ReportingCode reportingCode, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(reportingCode);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(reportingCode));
        parcel.writeString(reportingCode.getDescriptionEn());
        parcel.writeString(reportingCode.getCountryCode());
        parcel.writeString(reportingCode.getDescription());
        parcel.writeLong(reportingCode.getId());
        parcel.writeString(reportingCode.getReportingCode());
        parcel.writeString(reportingCode.getDescriptionGe());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.reportingCode$$0, parcel, i, new C42027a());
    }

    public ReportingCode getParcel() {
        return this.reportingCode$$0;
    }
}

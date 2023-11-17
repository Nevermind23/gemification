package p341ge.bog.mobilebank.transfers.foreign;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.transfers.foreign.FileAttachment$$Parcelable */
public class FileAttachment$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<FileAttachment$$Parcelable> CREATOR = new C34931a();
    private FileAttachment fileAttachment$$0;

    /* renamed from: ge.bog.mobilebank.transfers.foreign.FileAttachment$$Parcelable$a */
    class C34931a implements Parcelable.Creator {
        C34931a() {
        }

        /* renamed from: a */
        public FileAttachment$$Parcelable createFromParcel(Parcel parcel) {
            return new FileAttachment$$Parcelable(FileAttachment$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public FileAttachment$$Parcelable[] newArray(int i) {
            return new FileAttachment$$Parcelable[i];
        }
    }

    public FileAttachment$$Parcelable(FileAttachment fileAttachment) {
        this.fileAttachment$$0 = fileAttachment;
    }

    public static FileAttachment read(Parcel parcel, C42027a aVar) {
        Integer num;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            String readString = parcel.readString();
            if (parcel.readInt() < 0) {
                num = null;
            } else {
                num = Integer.valueOf(parcel.readInt());
            }
            FileAttachment fileAttachment = new FileAttachment(readString, num);
            aVar.mo97501f(g, fileAttachment);
            aVar.mo97501f(readInt, fileAttachment);
            return fileAttachment;
        } else if (!aVar.mo97499d(readInt)) {
            return (FileAttachment) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(FileAttachment fileAttachment, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(fileAttachment);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(fileAttachment));
        parcel.writeString(fileAttachment.getFileName());
        if (fileAttachment.getAttachmentId() == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(fileAttachment.getAttachmentId().intValue());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.fileAttachment$$0, parcel, i, new C42027a());
    }

    public FileAttachment getParcel() {
        return this.fileAttachment$$0;
    }
}

package p341ge.bog.mobilebank.p975ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.ui.model.DocumentType$$Parcelable */
public class DocumentType$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DocumentType$$Parcelable> CREATOR = new C35688a();
    private DocumentType documentType$$0;

    /* renamed from: ge.bog.mobilebank.ui.model.DocumentType$$Parcelable$a */
    class C35688a implements Parcelable.Creator {
        C35688a() {
        }

        /* renamed from: a */
        public DocumentType$$Parcelable createFromParcel(Parcel parcel) {
            return new DocumentType$$Parcelable(DocumentType$$Parcelable.read(parcel, new C42027a()));
        }

        /* renamed from: b */
        public DocumentType$$Parcelable[] newArray(int i) {
            return new DocumentType$$Parcelable[i];
        }
    }

    public DocumentType$$Parcelable(DocumentType documentType) {
        this.documentType$$0 = documentType;
    }

    public static DocumentType read(Parcel parcel, C42027a aVar) {
        ArrayList<String> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DocumentType documentType = new DocumentType();
            aVar.mo97501f(g, documentType);
            documentType.orderNo = parcel.readInt();
            documentType.docType = parcel.readString();
            documentType.selfieExplanationImageURL = parcel.readString();
            documentType.dctKey = parcel.readString();
            documentType.backFaceBodyTextDctKey = parcel.readString();
            documentType.frontFaceExplanationImageURL = parcel.readString();
            documentType.backFaceExplanationImageURL = parcel.readString();
            documentType.docType2 = parcel.readString();
            documentType.selfieBodyTextDctKey = parcel.readString();
            documentType.frontFaceHeaderTextDctKey = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<String> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(parcel.readString());
                }
                arrayList = arrayList2;
            }
            documentType.processFlow = arrayList;
            documentType.backFaceHeaderTextDctKey = parcel.readString();
            documentType.f86274id = parcel.readLong();
            documentType.selfieHeaderTextDctKey = parcel.readString();
            documentType.frontFaceBodyTextDctKey = parcel.readString();
            aVar.mo97501f(readInt, documentType);
            return documentType;
        } else if (!aVar.mo97499d(readInt)) {
            return (DocumentType) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DocumentType documentType, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(documentType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(documentType));
        parcel.writeInt(documentType.orderNo);
        parcel.writeString(documentType.docType);
        parcel.writeString(documentType.selfieExplanationImageURL);
        parcel.writeString(documentType.dctKey);
        parcel.writeString(documentType.backFaceBodyTextDctKey);
        parcel.writeString(documentType.frontFaceExplanationImageURL);
        parcel.writeString(documentType.backFaceExplanationImageURL);
        parcel.writeString(documentType.docType2);
        parcel.writeString(documentType.selfieBodyTextDctKey);
        parcel.writeString(documentType.frontFaceHeaderTextDctKey);
        ArrayList<String> arrayList = documentType.processFlow;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<String> it = documentType.processFlow.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
        parcel.writeString(documentType.backFaceHeaderTextDctKey);
        parcel.writeLong(documentType.f86274id);
        parcel.writeString(documentType.selfieHeaderTextDctKey);
        parcel.writeString(documentType.frontFaceBodyTextDctKey);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.documentType$$0, parcel, i, new C42027a());
    }

    public DocumentType getParcel() {
        return this.documentType$$0;
    }
}

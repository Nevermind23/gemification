package p341ge.bog.mobilebank.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.template.TemplateGroupComment$$Parcelable */
public class TemplateGroupComment$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TemplateGroupComment$$Parcelable> CREATOR = new Parcelable.Creator<TemplateGroupComment$$Parcelable>() {
        public TemplateGroupComment$$Parcelable createFromParcel(Parcel parcel) {
            return new TemplateGroupComment$$Parcelable(TemplateGroupComment$$Parcelable.read(parcel, new C42027a()));
        }

        public TemplateGroupComment$$Parcelable[] newArray(int i) {
            return new TemplateGroupComment$$Parcelable[i];
        }
    };
    private TemplateGroupComment templateGroupComment$$0;

    public TemplateGroupComment$$Parcelable(TemplateGroupComment templateGroupComment) {
        this.templateGroupComment$$0 = templateGroupComment;
    }

    public static TemplateGroupComment read(Parcel parcel, C42027a aVar) {
        Long l;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TemplateGroupComment templateGroupComment = new TemplateGroupComment();
            aVar.mo97501f(g, templateGroupComment);
            templateGroupComment.langCode = parcel.readString();
            templateGroupComment.commentType = parcel.readString();
            templateGroupComment.comment = parcel.readString();
            if (parcel.readInt() < 0) {
                l = null;
            } else {
                l = Long.valueOf(parcel.readLong());
            }
            templateGroupComment.f81380id = l;
            aVar.mo97501f(readInt, templateGroupComment);
            return templateGroupComment;
        } else if (!aVar.mo97499d(readInt)) {
            return (TemplateGroupComment) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TemplateGroupComment templateGroupComment, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(templateGroupComment);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(templateGroupComment));
        parcel.writeString(templateGroupComment.langCode);
        parcel.writeString(templateGroupComment.commentType);
        parcel.writeString(templateGroupComment.comment);
        if (templateGroupComment.f81380id == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(templateGroupComment.f81380id.longValue());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.templateGroupComment$$0, parcel, i, new C42027a());
    }

    public TemplateGroupComment getParcel() {
        return this.templateGroupComment$$0;
    }
}

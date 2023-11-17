package je1;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: je1.h */
public final class C41422h implements Externalizable {

    /* renamed from: f */
    public static final C41423a f97488f = new C41423a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    private Collection f97489d;

    /* renamed from: e */
    private final int f97490e;

    /* renamed from: je1.h$a */
    public static final class C41423a {
        private C41423a() {
        }

        public /* synthetic */ C41423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41422h(Collection collection, int i) {
        C41536l.m120489i(collection, "collection");
        this.f97489d = collection;
        this.f97490e = i;
    }

    private final Object readResolve() {
        return this.f97489d;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection collection;
        C41536l.m120489i(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List d = C41339p.m119899d(readInt);
                    while (i < readInt) {
                        d.add(objectInput.readObject());
                        i++;
                    }
                    collection = C41339p.m119896a(d);
                } else if (b == 1) {
                    Set c = C41355w0.m119980c(readInt);
                    while (i < readInt) {
                        c.add(objectInput.readObject());
                        i++;
                    }
                    collection = C41355w0.m119978a(c);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + '.');
                }
                this.f97489d = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C41536l.m120489i(objectOutput, "output");
        objectOutput.writeByte(this.f97490e);
        objectOutput.writeInt(this.f97489d.size());
        for (Object writeObject : this.f97489d) {
            objectOutput.writeObject(writeObject);
        }
    }
}

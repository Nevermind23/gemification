package je1;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: je1.i */
final class C41424i implements Externalizable {

    /* renamed from: e */
    public static final C41425a f97491e = new C41425a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    private Map f97492d;

    /* renamed from: je1.i$a */
    public static final class C41425a {
        private C41425a() {
        }

        public /* synthetic */ C41425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41424i(Map map) {
        C41536l.m120489i(map, "map");
        this.f97492d = map;
    }

    private final Object readResolve() {
        return this.f97492d;
    }

    public void readExternal(ObjectInput objectInput) {
        C41536l.m120489i(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map e = C41342q0.m119920e(readInt);
                for (int i = 0; i < readInt; i++) {
                    e.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f97492d = C41342q0.m119918c(e);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C41536l.m120489i(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f97492d.size());
        for (Map.Entry entry : this.f97492d.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}

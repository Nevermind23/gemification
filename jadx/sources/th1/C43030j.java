package th1;

import android.os.Parcel;
import java.util.Map;
import org.parceler.C42041g;

/* renamed from: th1.j */
public abstract class C43030j implements C42041g {
    /* renamed from: c */
    public abstract Map mo101615c();

    /* renamed from: d */
    public Map mo88107a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        Map c = mo101615c();
        for (int i = 0; i < readInt; i++) {
            c.put(mo97402e(parcel), mo97404g(parcel));
        }
        return c;
    }

    /* renamed from: e */
    public abstract Object mo97402e(Parcel parcel);

    /* renamed from: f */
    public abstract void mo97403f(Object obj, Parcel parcel);

    /* renamed from: g */
    public abstract Object mo97404g(Parcel parcel);

    /* renamed from: h */
    public abstract void mo97405h(Object obj, Parcel parcel);

    /* renamed from: i */
    public void mo88108b(Map map, Parcel parcel) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            mo97403f(entry.getKey(), parcel);
            mo97405h(entry.getValue(), parcel);
        }
    }
}

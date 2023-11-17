package p111i0;

import android.content.Context;
import androidx.work.C2068l;
import androidx.work.C2099z;
import androidx.work.WorkerParameters;
import ge1.C41084a;
import java.util.Map;

/* renamed from: i0.a */
public final class C6502a extends C2099z {

    /* renamed from: b */
    private final Map f19841b;

    C6502a(Map map) {
        this.f19841b = map;
    }

    /* renamed from: a */
    public C2068l mo6995a(Context context, String str, WorkerParameters workerParameters) {
        C41084a aVar = (C41084a) this.f19841b.get(str);
        if (aVar == null) {
            return null;
        }
        return ((C6503b) aVar.get()).mo20442a(context, workerParameters);
    }
}

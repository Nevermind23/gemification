package p372cc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p358bc.C10222a;

/* renamed from: cc.b */
final class C10383b {

    /* renamed from: a */
    private final Map f29566a = new HashMap();

    C10383b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo27008a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry entry : this.f29566a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C10222a.m37297b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27009b(int i) {
        Integer num = (Integer) this.f29566a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f29566a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}

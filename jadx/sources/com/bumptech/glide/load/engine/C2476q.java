package com.bumptech.glide.load.engine;

import androidx.core.util.C1005e;
import com.bumptech.glide.load.data.C2417e;
import com.bumptech.glide.load.engine.C2455i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p089g4.C6223k;
import p166m3.C7088h;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.engine.q */
public class C2476q {

    /* renamed from: a */
    private final Class f7860a;

    /* renamed from: b */
    private final C1005e f7861b;

    /* renamed from: c */
    private final List f7862c;

    /* renamed from: d */
    private final String f7863d;

    public C2476q(Class cls, Class cls2, Class cls3, List list, C1005e eVar) {
        this.f7860a = cls;
        this.f7861b = eVar;
        this.f7862c = (List) C6223k.m24729c(list);
        this.f7863d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C7430c m9574b(C2417e eVar, C7088h hVar, int i, int i2, C2455i.C2456a aVar, List list) {
        List list2 = list;
        int size = this.f7862c.size();
        C7430c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cVar = ((C2455i) this.f7862c.get(i3)).mo7900a(eVar, i, i2, hVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f7863d, (List) new ArrayList(list2));
    }

    /* renamed from: a */
    public C7430c mo7953a(C2417e eVar, C7088h hVar, int i, int i2, C2455i.C2456a aVar) {
        List list = (List) C6223k.m24730d(this.f7861b.mo3440b());
        try {
            return m9574b(eVar, hVar, i, i2, aVar, list);
        } finally {
            this.f7861b.mo3439a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f7862c.toArray()) + '}';
    }
}

package z10;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: z10.f */
public final class C30139f {

    /* renamed from: a */
    private final int f76000a;

    /* renamed from: b */
    private final View f76001b;

    /* renamed from: c */
    private final List f76002c;

    /* renamed from: d */
    private final ArrayList f76003d;

    public C30139f(int i, View view, List list, ArrayList arrayList) {
        C41536l.m120489i(view, "view");
        C41536l.m120489i(list, "cities");
        C41536l.m120489i(arrayList, "wizardObjects");
        this.f76000a = i;
        this.f76001b = view;
        this.f76002c = list;
        this.f76003d = arrayList;
    }

    /* renamed from: a */
    public final List mo70485a() {
        return this.f76002c;
    }

    /* renamed from: b */
    public final int mo70486b() {
        return this.f76000a;
    }

    /* renamed from: c */
    public final View mo70487c() {
        return this.f76001b;
    }

    /* renamed from: d */
    public final ArrayList mo70488d() {
        return this.f76003d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30139f)) {
            return false;
        }
        C30139f fVar = (C30139f) obj;
        return this.f76000a == fVar.f76000a && C41536l.m120484d(this.f76001b, fVar.f76001b) && C41536l.m120484d(this.f76002c, fVar.f76002c) && C41536l.m120484d(this.f76003d, fVar.f76003d);
    }

    public int hashCode() {
        return (((((this.f76000a * 31) + this.f76001b.hashCode()) * 31) + this.f76002c.hashCode()) * 31) + this.f76003d.hashCode();
    }

    public String toString() {
        int i = this.f76000a;
        View view = this.f76001b;
        List list = this.f76002c;
        ArrayList arrayList = this.f76003d;
        return "WizardOptions(position=" + i + ", view=" + view + ", cities=" + list + ", wizardObjects=" + arrayList + ")";
    }
}

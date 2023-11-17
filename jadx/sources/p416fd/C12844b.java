package p416fd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fd.b */
public class C12844b {

    /* renamed from: a */
    protected C5764m f37967a;

    /* renamed from: b */
    protected C12862q f37968b;

    /* renamed from: c */
    private final int f37969c = 2;

    public C12844b(C5764m mVar, C12862q qVar) {
        this.f37967a = mVar;
        this.f37968b = qVar;
    }

    /* renamed from: f */
    public static List m48621f(List list, C12862q qVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qVar.mo33542f((C5766o) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C5751a mo33498a() {
        return this.f37967a.mo18893b();
    }

    /* renamed from: b */
    public Bitmap mo33499b() {
        return this.f37968b.mo33538b((Rect) null, 2);
    }

    /* renamed from: c */
    public byte[] mo33500c() {
        return this.f37967a.mo18894c();
    }

    /* renamed from: d */
    public Map mo33501d() {
        return this.f37967a.mo18895d();
    }

    /* renamed from: e */
    public String mo33502e() {
        return this.f37967a.mo18897f();
    }

    public String toString() {
        return this.f37967a.mo18897f();
    }
}

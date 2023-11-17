package p543oe;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oe.c */
public class C17182c implements Cloneable {

    /* renamed from: d */
    private boolean f48216d = false;

    /* renamed from: e */
    private int f48217e = -1;

    /* renamed from: f */
    private List f48218f = new ArrayList();

    /* renamed from: a */
    public List mo44604a() {
        return this.f48218f;
    }

    /* renamed from: b */
    public int mo44605b() {
        return this.f48217e;
    }

    /* renamed from: c */
    public boolean mo44606c() {
        return this.f48216d;
    }

    public Object clone() {
        C17182c cVar = (C17182c) super.clone();
        cVar.f48218f = new ArrayList();
        for (C17180a clone : this.f48218f) {
            cVar.f48218f.add((C17180a) clone.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public void mo44608d(boolean z) {
        this.f48216d = z;
    }

    /* renamed from: e */
    public void mo44609e(int i) {
        this.f48217e = i;
    }
}

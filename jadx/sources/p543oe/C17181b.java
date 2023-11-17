package p543oe;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oe.b */
public class C17181b implements Cloneable {

    /* renamed from: d */
    private String f48213d;

    /* renamed from: e */
    private List f48214e;

    /* renamed from: f */
    private StringBuffer f48215f;

    public C17181b(String str) {
        this.f48213d = str;
        m60374d();
    }

    /* renamed from: d */
    private void m60374d() {
        this.f48214e = new ArrayList();
        this.f48215f = new StringBuffer();
    }

    /* renamed from: a */
    public String mo44600a() {
        return this.f48213d;
    }

    /* renamed from: b */
    public StringBuffer mo44601b() {
        return this.f48215f;
    }

    /* renamed from: c */
    public List mo44602c() {
        return this.f48214e;
    }

    public Object clone() {
        C17181b bVar = (C17181b) super.clone();
        bVar.f48214e = new ArrayList();
        for (C17182c clone : this.f48214e) {
            bVar.f48214e.add((C17182c) clone.clone());
        }
        return bVar;
    }
}

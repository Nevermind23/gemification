package qg1;

import org.java_websocket.exceptions.InvalidFrameException;
import rg1.C42378f;

/* renamed from: qg1.a */
public class C42352a implements C42353b {
    /* renamed from: a */
    public void mo97783a() {
    }

    /* renamed from: b */
    public C42353b mo97784b() {
        return new C42352a();
    }

    /* renamed from: c */
    public boolean mo97785c(String str) {
        return true;
    }

    /* renamed from: d */
    public void mo97786d(C42378f fVar) {
        if (fVar.mo97833a() || fVar.mo97834b() || fVar.mo97836d()) {
            throw new InvalidFrameException("bad rsv RSV1: " + fVar.mo97833a() + " RSV2: " + fVar.mo97834b() + " RSV3: " + fVar.mo97836d());
        }
    }

    /* renamed from: e */
    public void mo97787e(C42378f fVar) {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    /* renamed from: f */
    public String mo97789f() {
        return "";
    }

    /* renamed from: g */
    public boolean mo97790g(String str) {
        return true;
    }

    /* renamed from: h */
    public void mo97791h(C42378f fVar) {
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* renamed from: i */
    public String mo97793i() {
        return "";
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

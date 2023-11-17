package p029bb;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;
import p012ab.C0097a;
import p012ab.C0098b;

/* renamed from: bb.g */
public class C2209g implements C0097a {

    /* renamed from: a */
    private final LatLng f6428a;

    /* renamed from: b */
    private final Collection f6429b = new LinkedHashSet();

    public C2209g(LatLng latLng) {
        this.f6428a = latLng;
    }

    /* renamed from: a */
    public int mo164a() {
        return this.f6429b.size();
    }

    /* renamed from: b */
    public boolean mo7141b(C0098b bVar) {
        return this.f6429b.add(bVar);
    }

    /* renamed from: c */
    public boolean mo7142c(C0098b bVar) {
        return this.f6429b.remove(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2209g)) {
            return false;
        }
        C2209g gVar = (C2209g) obj;
        if (!gVar.f6428a.equals(this.f6428a) || !gVar.f6429b.equals(this.f6429b)) {
            return false;
        }
        return true;
    }

    public LatLng getPosition() {
        return this.f6428a;
    }

    public int hashCode() {
        return this.f6428a.hashCode() + this.f6429b.hashCode();
    }

    /* renamed from: n3 */
    public Collection mo166n3() {
        return this.f6429b;
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f6428a + ", mItems.size=" + this.f6429b.size() + '}';
    }
}

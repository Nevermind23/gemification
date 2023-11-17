package p416fd;

import com.google.zxing.C5754d;
import com.google.zxing.C5759i;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: fd.j */
public class C12854j implements C12849g {

    /* renamed from: a */
    private Collection f37989a;

    /* renamed from: b */
    private Map f37990b;

    /* renamed from: c */
    private String f37991c;

    /* renamed from: d */
    private int f37992d;

    public C12854j() {
    }

    /* renamed from: a */
    public C12848f mo33511a(Map map) {
        EnumMap enumMap = new EnumMap(C5754d.class);
        enumMap.putAll(map);
        Map map2 = this.f37990b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection collection = this.f37989a;
        if (collection != null) {
            enumMap.put(C5754d.POSSIBLE_FORMATS, collection);
        }
        String str = this.f37991c;
        if (str != null) {
            enumMap.put(C5754d.CHARACTER_SET, str);
        }
        C5759i iVar = new C5759i();
        iVar.mo18890f(enumMap);
        int i = this.f37992d;
        if (i == 0) {
            return new C12848f(iVar);
        }
        if (i == 1) {
            return new C12855k(iVar);
        }
        if (i != 2) {
            return new C12848f(iVar);
        }
        return new C12856l(iVar);
    }

    public C12854j(Collection collection) {
        this.f37989a = collection;
    }

    public C12854j(Collection collection, Map map, String str, int i) {
        this.f37989a = collection;
        this.f37990b = map;
        this.f37991c = str;
        this.f37992d = i;
    }
}

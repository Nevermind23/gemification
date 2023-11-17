package p205p3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p089g4.C6224l;

/* renamed from: p3.o */
public class C7692o implements C7689l {

    /* renamed from: d */
    private static final Bitmap.Config[] f22354d;

    /* renamed from: e */
    private static final Bitmap.Config[] f22355e;

    /* renamed from: f */
    private static final Bitmap.Config[] f22356f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f22357g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f22358h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C7695c f22359a = new C7695c();

    /* renamed from: b */
    private final C7679g f22360b = new C7679g();

    /* renamed from: c */
    private final Map f22361c = new HashMap();

    /* renamed from: p3.o$a */
    static /* synthetic */ class C7693a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22362a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22362a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p205p3.C7692o.C7693a.<clinit>():void");
        }
    }

    /* renamed from: p3.o$b */
    static final class C7694b implements C7690m {

        /* renamed from: a */
        private final C7695c f22363a;

        /* renamed from: b */
        int f22364b;

        /* renamed from: c */
        private Bitmap.Config f22365c;

        public C7694b(C7695c cVar) {
            this.f22363a = cVar;
        }

        /* renamed from: a */
        public void mo22408a() {
            this.f22363a.mo22392c(this);
        }

        /* renamed from: b */
        public void mo22425b(int i, Bitmap.Config config) {
            this.f22364b = i;
            this.f22365c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7694b)) {
                return false;
            }
            C7694b bVar = (C7694b) obj;
            if (this.f22364b != bVar.f22364b || !C6224l.m24735d(this.f22365c, bVar.f22365c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f22364b * 31;
            Bitmap.Config config = this.f22365c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return C7692o.m29221h(this.f22364b, this.f22365c);
        }
    }

    /* renamed from: p3.o$c */
    static class C7695c extends C7675c {
        C7695c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7694b mo22390a() {
            return new C7694b(this);
        }

        /* renamed from: e */
        public C7694b mo22430e(int i, Bitmap.Config config) {
            C7694b bVar = (C7694b) mo22391b();
            bVar.mo22425b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f22354d = configArr;
        f22355e = configArr;
    }

    /* renamed from: f */
    private void m29219f(Integer num, Bitmap bitmap) {
        NavigableMap j = m29223j(bitmap.getConfig());
        Integer num2 = (Integer) j.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo22418a(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: g */
    private C7694b m29220g(int i, Bitmap.Config config) {
        C7694b e = this.f22359a.mo22430e(i, config);
        Bitmap.Config[] i2 = m29222i(config);
        int length = i2.length;
        int i3 = 0;
        while (i3 < length) {
            Bitmap.Config config2 = i2[i3];
            Integer num = (Integer) m29223j(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i3++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f22359a.mo22392c(e);
                return this.f22359a.mo22430e(num.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: h */
    static String m29221h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m29222i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f22355e;
        }
        int i = C7693a.f22362a[config.ordinal()];
        if (i == 1) {
            return f22354d;
        }
        if (i == 2) {
            return f22356f;
        }
        if (i == 3) {
            return f22357g;
        }
        if (i == 4) {
            return f22358h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: j */
    private NavigableMap m29223j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f22361c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22361c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo22418a(Bitmap bitmap) {
        return m29221h(C6224l.m24739h(bitmap), bitmap.getConfig());
    }

    /* renamed from: b */
    public String mo22419b(int i, int i2, Bitmap.Config config) {
        return m29221h(C6224l.m24738g(i, i2, config), config);
    }

    /* renamed from: c */
    public void mo22420c(Bitmap bitmap) {
        C7694b e = this.f22359a.mo22430e(C6224l.m24739h(bitmap), bitmap.getConfig());
        this.f22360b.mo22400d(e, bitmap);
        NavigableMap j = m29223j(bitmap.getConfig());
        Integer num = (Integer) j.get(Integer.valueOf(e.f22364b));
        Integer valueOf = Integer.valueOf(e.f22364b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: d */
    public Bitmap mo22421d(int i, int i2, Bitmap.Config config) {
        C7694b g = m29220g(C6224l.m24738g(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f22360b.mo22399a(g);
        if (bitmap != null) {
            m29219f(Integer.valueOf(g.f22364b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: e */
    public int mo22422e(Bitmap bitmap) {
        return C6224l.m24739h(bitmap);
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f22360b.mo22401f();
        if (bitmap != null) {
            m29219f(Integer.valueOf(C6224l.m24739h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f22360b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f22361c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f22361c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}

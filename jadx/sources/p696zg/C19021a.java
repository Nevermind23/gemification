package p696zg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17779d;
import p642vh.C18382u;

/* renamed from: zg.a */
public enum C19021a {
    OVAL(0, new C18382u.C18383a(r10), (int) null, true, 4, (boolean) null),
    OVAL_ICON(1, new C18382u.C18383a(r10), (int) null, false, 12, (boolean) null),
    ILLUSTRATION(2, new C18382u.C18383a(C17779d.action_card_icon_width_illustration), new C18382u.C18383a(C17779d.action_card_icon_height_illustration), false, 8, (boolean) null),
    THUMBNAIL_16_9(3, new C18382u.C18383a(C17779d.action_card_icon_width_thumbnail_16_9), new C18382u.C18383a(C17779d.action_card_icon_height_thumbnail_16_9), false, 8, (boolean) null),
    THUMBNAIL_4_3(4, new C18382u.C18383a(C17779d.action_card_icon_width_thumbnail_4_3), new C18382u.C18383a(C17779d.action_card_icon_height_thumbnail_4_3), false, 8, (boolean) null),
    THUMBNAIL_4_3_BIG(5, new C18382u.C18383a(C17779d.action_card_icon_width_thumbnail_4_3_big), new C18382u.C18383a(C17779d.action_card_icon_height_thumbnail_4_3_big), false, 8, (boolean) null);
    

    /* renamed from: h */
    public static final C19022a f53127h = null;

    /* renamed from: d */
    private final int f53135d;

    /* renamed from: e */
    private final C18382u f53136e;

    /* renamed from: f */
    private final C18382u f53137f;

    /* renamed from: g */
    private final boolean f53138g;

    /* renamed from: zg.a$a */
    public static final class C19022a {
        private C19022a() {
        }

        public /* synthetic */ C19022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19021a mo47192a(int i) {
            C19021a aVar;
            boolean z;
            C19021a[] values = C19021a.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i2];
                if (aVar.mo47188b() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (aVar == null) {
                return C19021a.ILLUSTRATION;
            }
            return aVar;
        }
    }

    static {
        f53127h = new C19022a((DefaultConstructorMarker) null);
    }

    private C19021a(int i, C18382u uVar, C18382u uVar2, boolean z) {
        this.f53135d = i;
        this.f53136e = uVar;
        this.f53137f = uVar2;
        this.f53138g = z;
    }

    /* renamed from: b */
    public final int mo47188b() {
        return this.f53135d;
    }

    /* renamed from: c */
    public final C18382u mo47189c() {
        return this.f53137f;
    }

    /* renamed from: e */
    public final C18382u mo47190e() {
        return this.f53136e;
    }

    /* renamed from: f */
    public final boolean mo47191f() {
        return this.f53138g;
    }
}

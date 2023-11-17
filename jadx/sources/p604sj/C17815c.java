package p604sj;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17779d;

/* renamed from: sj.c */
public abstract class C17815c {

    /* renamed from: a */
    public static final C17816a f50700a = new C17816a((DefaultConstructorMarker) null);

    /* renamed from: sj.c$a */
    public static final class C17816a {
        private C17816a() {
        }

        public /* synthetic */ C17816a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17815c mo45405a(int i) {
            if (i == 0) {
                return C17819c.f50704b;
            }
            if (i != 1) {
                return null;
            }
            return C17817b.f50701b;
        }
    }

    /* renamed from: sj.c$b */
    public static final class C17817b extends C17815c {

        /* renamed from: b */
        public static final C17817b f50701b = new C17817b();

        /* renamed from: c */
        private static C17813b f50702c = C17813b.SMALL;

        /* renamed from: sj.c$b$a */
        public /* synthetic */ class C17818a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f50703a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    sj.b[] r0 = p604sj.C17813b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    sj.b r1 = p604sj.C17813b.SMALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    sj.b r1 = p604sj.C17813b.BIG     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    sj.b r1 = p604sj.C17813b.EXTRA_LARGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f50703a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p604sj.C17815c.C17817b.C17818a.<clinit>():void");
            }
        }

        private C17817b() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C17812a mo45402a() {
            int i = C17818a.f50703a[mo45403b().ordinal()];
            if (i == 1) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_icon_small, C17779d.size_thumbnail_icon_badge_icon_small);
            }
            if (i == 2) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_icon_big, C17779d.size_thumbnail_icon_badge_icon_big);
            }
            if (i == 3) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_icon_extra_large, C17779d.size_thumbnail_icon_badge_icon_extra_large);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: b */
        public C17813b mo45403b() {
            return f50702c;
        }

        /* renamed from: c */
        public void mo45404c(C17813b bVar) {
            C41536l.m120489i(bVar, "<set-?>");
            f50702c = bVar;
        }
    }

    /* renamed from: sj.c$c */
    public static final class C17819c extends C17815c {

        /* renamed from: b */
        public static final C17819c f50704b = new C17819c();

        /* renamed from: c */
        private static C17813b f50705c = C17813b.SMALL;

        /* renamed from: sj.c$c$a */
        public /* synthetic */ class C17820a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f50706a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    sj.b[] r0 = p604sj.C17813b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    sj.b r1 = p604sj.C17813b.SMALL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    sj.b r1 = p604sj.C17813b.BIG     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    sj.b r1 = p604sj.C17813b.EXTRA_LARGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f50706a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p604sj.C17815c.C17819c.C17820a.<clinit>():void");
            }
        }

        private C17819c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C17812a mo45402a() {
            int i = C17820a.f50706a[mo45403b().ordinal()];
            if (i == 1) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_thumbnail_small, C17779d.size_thumbnail_icon_badge_thumbnail_small);
            }
            if (i == 2) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_thumbnail_big, C17779d.size_thumbnail_icon_badge_thumbnail_big);
            }
            if (i == 3) {
                return new C17812a(C17779d.size_thumbnail_icon_badge_container_thumbnail_extra_large, C17779d.size_thumbnail_icon_badge_thumbnail_extra_large);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: b */
        public C17813b mo45403b() {
            return f50705c;
        }

        /* renamed from: c */
        public void mo45404c(C17813b bVar) {
            C41536l.m120489i(bVar, "<set-?>");
            f50705c = bVar;
        }
    }

    private C17815c() {
    }

    public /* synthetic */ C17815c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract C17812a mo45402a();

    /* renamed from: b */
    public abstract C17813b mo45403b();

    /* renamed from: c */
    public abstract void mo45404c(C17813b bVar);
}
